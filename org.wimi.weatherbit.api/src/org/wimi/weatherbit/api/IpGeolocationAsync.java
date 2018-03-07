package org.wimi.weatherbit.api;

import org.osgi.util.promise.Promise;
import org.wimi.weatherbit.api.model.GeoIPObj;

public interface IpGeolocationAsync {

	/**
	 * Returns an Geolocation object asynchronous. Returns a geolocation object.
	 * Given an IP address. If no IP supplied, will use request IP address.
	 */
	public Promise<GeoIPObj> getGeolocation(String ip, String key, String paramCallback, String exclude, String format);
}
