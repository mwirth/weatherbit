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
public interface Class48HourHourlyForecastApi
{

	/**
	 * Returns a 48 hour (hourly) forecast - Given a City ID. **(REQUIRED: Developer Plan or Higher)** Returns an hourly forecast,
	 * where each point represents a one hour period. Every point has a datetime string in the format \&quot;YYYY-MM-DD:HH\&quot;.
	 * Time is UTC.
	 */
	@GET
	@Path("/forecast/hourly?city_id={city_id}")
	@Produces({ "application/json" })
	@ApiOperation(value = "Returns a 48 hour (hourly) forecast - Given a City ID.", tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "A forecast object.", response = ForecastHourly.class),
		@ApiResponse(code = 0, message = "No Data.", response = Error.class) })
	public ForecastHourly forecastHourlycityIdcityIdGet(@PathParam("city_id") Integer cityId, @QueryParam("key") String key,
		@QueryParam("units") String units, @QueryParam("lang") String lang, @QueryParam("callback") String paramCallback,
		@QueryParam("hours") Integer hours);

	/**
	 * Returns an 48 hour (hourly forecast) - Given City and/or State, Country. **(REQUIRED: Developer Plan or Higher)** Returns
	 * an hourly forecast, where each point represents a one hour period. Every point has a datetime string in the format
	 * \&quot;YYYY-MM-DD:HH\&quot;. Time is UTC. Accepts a city in the format of City,ST or City. The state, and country
	 * parameters can be provided to make the search more accurate.
	 */
	@GET
	@Path("/forecast/hourly?city={city}&country={country}")
	@Produces({ "application/json" })
	@ApiOperation(value = "Returns an 48 hour (hourly forecast) - Given City and/or State, Country.", tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "A forecast object.", response = ForecastHourly.class),
		@ApiResponse(code = 0, message = "No Data.", response = Error.class) })
	public ForecastHourly forecastHourlycitycitycountrycountryGet(@PathParam("city") String city,
		@PathParam("country") String country, @QueryParam("key") String key, @QueryParam("state") String state,
		@QueryParam("units") String units, @QueryParam("lang") String lang, @QueryParam("callback") String paramCallback,
		@QueryParam("hours") Integer hours);

	/**
	 * Returns a hourly forecast - Given an IP Address, or ip&#x3D;auto for automatic IP lookup. **(REQUIRED: Developer Plan or
	 * Higher)** Returns an hourly forecast, where each point represents a one hour period. Every point has a datetime string in
	 * the format \&quot;YYYY-MM-DD:HH\&quot;. Time is UTC.
	 */
	@GET
	@Path("/forecast/hourly?ip={ip}")
	@Produces({ "application/json" })
	@ApiOperation(value = "Returns a hourly forecast - Given an IP Address, or ip=auto for automatic IP lookup.", tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "A forecast object.", response = ForecastHourly.class),
		@ApiResponse(code = 0, message = "No Data.", response = Error.class) })
	public ForecastHourly forecastHourlyipipGet(@PathParam("ip") String ip, @QueryParam("key") String key,
		@QueryParam("days") BigDecimal days, @QueryParam("units") String units, @QueryParam("lang") String lang,
		@QueryParam("callback") String paramCallback, @QueryParam("hours") Integer hours);

	/**
	 * Returns 48 hour (hourly) forecast - Given a lat/lon. **(REQUIRED: Developer Plan or Higher)** Returns an hourly forecast,
	 * where each point represents a one hour period. Every point has a datetime string in the format \&quot;YYYY-MM-DD:HH\&quot;.
	 * Time is UTC.
	 */
	@GET
	@Path("/forecast/hourly?lat={lat}&lon={lon}")
	@Produces({ "application/json" })
	@ApiOperation(value = "Returns 48 hour (hourly) forecast - Given a lat/lon.", tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "A forecast object.", response = ForecastHourly.class),
		@ApiResponse(code = 0, message = "No Data.", response = Error.class) })
	public ForecastHourly forecastHourlylatlatlonlonGet(@PathParam("lat") Double lat, @PathParam("lon") Double lon,
		@QueryParam("key") String key, @QueryParam("units") String units, @QueryParam("lang") String lang,
		@QueryParam("callback") String paramCallback, @QueryParam("hours") Integer hours);

	/**
	 * Returns a 48 hour (hourly) forecast - Given a Postal Code. **(REQUIRED: Developer Plan or Higher)** Returns an hourly
	 * forecast, where each point represents a one hour period. Every point has a datetime string in the format
	 * \&quot;YYYY-MM-DD:HH\&quot;. Time is UTC.
	 */
	@GET
	@Path("/forecast/hourly?postal_code={postal_code}")
	@Produces({ "application/json" })
	@ApiOperation(value = "Returns a 48 hour (hourly) forecast - Given a Postal Code.", tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "A forecast object.", response = ForecastHourly.class),
		@ApiResponse(code = 0, message = "No Data.", response = Error.class) })
	public ForecastHourly forecastHourlypostalCodepostalCodeGet(@PathParam("postal_code") Integer postalCode,
		@QueryParam("key") String key, @QueryParam("country") String country, @QueryParam("units") String units,
		@QueryParam("lang") String lang, @QueryParam("callback") String paramCallback, @QueryParam("hours") Integer hours);
}
