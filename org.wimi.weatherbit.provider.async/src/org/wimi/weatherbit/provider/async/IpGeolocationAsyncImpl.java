package org.wimi.weatherbit.provider.async;

import java.util.Map;

import org.osgi.service.async.Async;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.log.LogService;
import org.osgi.util.promise.Promise;
import org.wimi.weatherbit.api.IpGeolocation;
import org.wimi.weatherbit.api.IpGeolocationAsync;
import org.wimi.weatherbit.api.model.GeoIPObj;

@Component(name = "org.wimi.weatherbit.provider.async")
public class IpGeolocationAsyncImpl implements IpGeolocationAsync {

	@Reference
	private LogService logService;

	@Reference
	IpGeolocation geolocation;

	@Reference
	Async async;

	private IpGeolocation mediateGeolocation;

	@Activate
	void activate(Map<String, String> props) {
		mediateGeolocation = async.mediate(geolocation, IpGeolocation.class);
	}

	@Deactivate
	void deactivate() {
	}

	@Override
	public Promise<GeoIPObj> getGeolocation(String ip, String key, String paramCallback, String exclude,
			String format) {
		Promise<GeoIPObj> call = async.call(mediateGeolocation.getGeolocation(ip, key, paramCallback, exclude, format));
		return call;
	}

}
