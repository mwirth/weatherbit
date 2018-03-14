package org.wimi.weatherbit.consumer.gogo.command;

import org.apache.felix.service.command.Descriptor;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.log.LogService;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
import org.wimi.weatherbit.api.CurrentWeather;
import org.wimi.weatherbit.api.IpGeolocation;
import org.wimi.weatherbit.api.IpGeolocationAsync;
import org.wimi.weatherbit.api.model.CurrentObsGroup;
import org.wimi.weatherbit.api.model.GeoIPObj;

import osgi.enroute.debug.api.Debug;

@Designate(ocd = WeatherbitCommands.Config.class, factory = true)
@Component(//
		service = WeatherbitCommands.class, //
		property = { //
				Debug.COMMAND_SCOPE + "=weather", //
				Debug.COMMAND_FUNCTION + "=currentObservationByStationId", //
				Debug.COMMAND_FUNCTION + "=ipGeolocation", //
				Debug.COMMAND_FUNCTION + "=ipGeolocationAsync" //
		}, name = "org.wimi.weatherbit.consumer.gogo.commands")
public class WeatherbitCommands {

	@ObjectClassDefinition
	@interface Config {
		String key() default "";
	}

	private String key;

	@Reference
	private LogService logService;

	@Reference
	private CurrentWeather currentWeather;

	@Reference
	private IpGeolocation ipGeolocation;

	@Reference
	private IpGeolocationAsync ipGeolocationAsync;

	@Activate
	void activate(Config config) {
		logService.log(LogService.LOG_DEBUG, "activate");
		this.key = config.key();
	}

	@Deactivate
	void deactivate() {
		logService.log(LogService.LOG_DEBUG, "deactivate");
	}

	/**
	 * Returns a Current Observation - Given a station ID.
	 *
	 * @param station
	 * @param key
	 * @param units
	 * @param lang
	 * @param paramCallback
	 * @return
	 */
	public CurrentObsGroup currentObservationByStationId(String station, String key, String units, String lang,
			String paramCallback) {
		try {
			CurrentObsGroup currentstationstationGet = currentWeather.currentstationstationGet(station, key, units,
					lang, paramCallback);
			return currentstationstationGet;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * Returns a geolocation object. Given an IP address. If no IP supplied, will
	 * use request IP address.
	 *
	 * @param ip
	 * @param key
	 * @param paramCallback
	 * @param exclude
	 * @param format
	 * @return
	 */
	@Descriptor("Returns a geolocation object. Given an IP address. If no IP supplied, will use request IP address.")
	public GeoIPObj ipGeolocation( //
			@Descriptor("the ip") String ip, //
			@Descriptor("your key") String key, //
			@Descriptor("paramCallback") String paramCallback, //
			@Descriptor("exclude") String exclude, //
			@Descriptor("format") String format) {
		try {
			GeoIPObj ipipipGet = ipGeolocation.getGeolocation(ip, key, paramCallback, exclude, format);
			return ipipipGet;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public GeoIPObj ipGeolocation(String ip, String paramCallback, String exclude, String format) {
		try {
			GeoIPObj ipipipGet = ipGeolocation.getGeolocation(ip, key, paramCallback, exclude, format);
			return ipipipGet;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public GeoIPObj ipGeolocationAsync(String ip, String key, String paramCallback, String exclude, String format) {
		try {
			ipGeolocationAsync.getGeolocation(ip, key, paramCallback, exclude, format).then(p -> {
				System.out.println(p.getValue());
				return null;
			}, p -> p.getFailure().printStackTrace());

			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}
}
