package org.wimi.weatherbit.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.wimi.weatherbit.api.model.Error;
import org.wimi.weatherbit.api.model.GeoIPObj;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * Weatherbit.io - Weather
 * <p>
 * This is the documentation for the Weatherbit API. The base URL for the API is
 * [http://api.weatherbit.io/v2.0/](http://api.weatherbit.io/v2.0/) or
 * [https://api.weatherbit.io/v2.0/](http://api.weatherbit.io/v2.0/). Below is
 * the Swagger UI documentation for the API. All API requests require the `key`
 * parameter. An Example for a 5 day forecast for London, UK would be
 * `http://api.weatherbit.io/v2.0/forecast/3hourly?city=London`&`country=UK`
 */
@Path("/")
@Api(value = "/", description = "")
public interface IpGeolocation {

	/**
	 * Returns an Geolocation object. Returns a geolocation object. Given an IP
	 * address. If no IP supplied, will use request IP address.
	 */
	@GET
	@Path("/ip")
	@Produces({ "application/json" })
	@ApiOperation(value = "Returns an Geolocation object.", tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "A geolocation object.", response = GeoIPObj.class),
			@ApiResponse(code = 0, message = "No Data.", response = Error.class) })
	public GeoIPObj getGeolocation(@QueryParam("ip") String ip, @QueryParam("key") String key,
			@QueryParam("callback") String paramCallback, @QueryParam("exclude") String exclude,
			@QueryParam("format") String format);
}
