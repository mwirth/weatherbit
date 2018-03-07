package org.wimi.weatherbit.api;

import java.math.BigDecimal;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.wimi.weatherbit.api.model.Error;
import org.wimi.weatherbit.api.model.ForecastHourly;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * Weatherbit.io - Weather
 * <p>
 * This is the documentation for the Weatherbit API. The base URL for the API is
 * [http://api.weatherbit.io/v2.0/](http://api.weatherbit.io/v2.0/) or
 * [https://api.weatherbit.io/v2.0/](http://api.weatherbit.io/v2.0/). Below is the Swagger UI documentation for the API. All API
 * requests require the `key` parameter. An Example for a 5 day forecast for London, UK would be
 * `http://api.weatherbit.io/v2.0/forecast/3hourly?city=London`&`country=UK`
 */
@Path("/")
@Api(value = "/", description = "")
public interface Class5Day3HourForecastApi
{

	/**
	 * Returns a 3-hourly forecast - Given a City ID. Returns a 3-hourly forecast, where each point represents a three hour
	 * period. Every point has a datetime string in the format \&quot;YYYY-MM-DD:HH\&quot;. Time is UTC.
	 */
	@GET
	@Path("/forecast/3hourly?city_id={city_id}")
	@Produces({ "application/json" })
	@ApiOperation(value = "Returns a 3-hourly forecast - Given a City ID.", tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "A forecast object.", response = ForecastHourly.class),
		@ApiResponse(code = 0, message = "No Data.", response = Error.class) })
	public ForecastHourly forecast3hourlycityIdcityIdGet(@PathParam("city_id") Integer cityId, @QueryParam("key") String key,
		@QueryParam("days") BigDecimal days, @QueryParam("units") String units, @QueryParam("lang") String lang,
		@QueryParam("callback") String paramCallback);

	/**
	 * Returns a 3-hourly forecast - Given City and/or State, Country. Returns a 3-hourly forecast, where each point represents a
	 * three hour period. Every point has a datetime string in the format \&quot;YYYY-MM-DD:HH\&quot;. Time is UTC.
	 */
	@GET
	@Path("/forecast/3hourly?city={city}&country={country}")
	@Produces({ "application/json" })
	@ApiOperation(value = "Returns a 3-hourly forecast - Given City and/or State, Country.", tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "A forecast object.", response = ForecastHourly.class),
		@ApiResponse(code = 0, message = "No Data.", response = Error.class) })
	public ForecastHourly forecast3hourlycitycitycountrycountryGet(@PathParam("city") String city,
		@PathParam("country") String country, @QueryParam("key") String key, @QueryParam("state") String state,
		@QueryParam("days") BigDecimal days, @QueryParam("units") String units, @QueryParam("lang") String lang,
		@QueryParam("callback") String paramCallback);

	/**
	 * Returns a 3hourly forecast - Given an IP Address, or ip&#x3D;auto for automatic IP lookup. Returns a 3-hourly forecast,
	 * where each point represents a three hour period. Every point has a datetime string in the format
	 * \&quot;YYYY-MM-DD:HH\&quot;. Time is UTC.
	 */
	@GET
	@Path("/forecast/3hourly?ip={ip}")
	@Produces({ "application/json" })
	@ApiOperation(value = "Returns a 3hourly forecast - Given an IP Address, or ip=auto for automatic IP lookup.", tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "A forecast object.", response = ForecastHourly.class),
		@ApiResponse(code = 0, message = "No Data.", response = Error.class) })
	public ForecastHourly forecast3hourlyipipGet(@PathParam("ip") String ip, @QueryParam("key") String key,
		@QueryParam("days") BigDecimal days, @QueryParam("units") String units, @QueryParam("lang") String lang,
		@QueryParam("callback") String paramCallback);

	/**
	 * Returns a 3-hourly forecast - Given a lat/lon. Returns a 3-hourly forecast, where each point represents a three hour
	 * period. Every point has a datetime string in the format \&quot;YYYY-MM-DD:HH\&quot;. Time is UTC.
	 */
	@GET
	@Path("/forecast/3hourly?lat={lat}&lon={lon}")
	@Produces({ "application/json" })
	@ApiOperation(value = "Returns a 3-hourly forecast - Given a lat/lon.", tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "A forecast object.", response = ForecastHourly.class),
		@ApiResponse(code = 0, message = "No Data.", response = Error.class) })
	public ForecastHourly forecast3hourlylatlatlonlonGet(@PathParam("lat") Double lat, @PathParam("lon") Double lon,
		@QueryParam("key") String key, @QueryParam("days") BigDecimal days, @QueryParam("units") String units,
		@QueryParam("lang") String lang, @QueryParam("callback") String paramCallback);

	/**
	 * Returns a 3-hourly forecast - Given a Postal Code. Returns a 3-hourly forecast, where each point represents a three hour
	 * period. Every point has a datetime string in the format \&quot;YYYY-MM-DD:HH\&quot;. Time is UTC.
	 */
	@GET
	@Path("/forecast/3hourly?postal_code={postal_code}")
	@Produces({ "application/json" })
	@ApiOperation(value = "Returns a 3-hourly forecast - Given a Postal Code.", tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "A forecast object.", response = ForecastHourly.class),
		@ApiResponse(code = 0, message = "No Data.", response = Error.class) })
	public ForecastHourly forecast3hourlypostalCodepostalCodeGet(@PathParam("postal_code") Integer postalCode,
		@QueryParam("key") String key, @QueryParam("country") String country, @QueryParam("days") BigDecimal days,
		@QueryParam("units") String units, @QueryParam("lang") String lang, @QueryParam("callback") String paramCallback);
}
