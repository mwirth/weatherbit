package org.wimi.weatherbit.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.wimi.weatherbit.api.model.Error;
import org.wimi.weatherbit.api.model.HistoryDay;

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
public interface BulkDailyHistoricalWeatherDataAdvancedEnterprisePlansApi
{

	/**
	 * Returns Historical Observations - Given a City ID Returns Historical Observations - Given a City ID.
	 */
	@GET
	@Path("/bulk/history/daily?city_id={city_id}")
	@Produces({ "application/json" })
	@ApiOperation(value = "Returns Historical Observations - Given a City ID", tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "An Historical Day Data Object.", response = HistoryDay.class),
		@ApiResponse(code = 0, message = "No Data.", response = Error.class) })
	public HistoryDay bulkHistoryDailycityIdcityIdGet(@PathParam("city_id") String cityId,
		@QueryParam("start_date") String startDate, @QueryParam("end_date") String endDate, @QueryParam("key") String key,
		@QueryParam("units") String units, @QueryParam("lang") String lang, @QueryParam("callback") String paramCallback);

	/**
	 * Returns Historical Observations - Given City and/or State, Country. Returns Historical Observations - Given a city in the
	 * format of City,ST or City. The state, and country parameters can be provided to make the search more accurate.
	 */
	@GET
	@Path("/bulk/history/daily?city={city}&country={country}")
	@Produces({ "application/json" })
	@ApiOperation(value = "Returns Historical Observations - Given City and/or State, Country.", tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "An Historical Day Data Object.", response = HistoryDay.class),
		@ApiResponse(code = 0, message = "No Data.", response = Error.class) })
	public HistoryDay bulkHistoryDailycitycitycountrycountryGet(@PathParam("city") String city,
		@PathParam("country") String country, @QueryParam("start_date") String startDate, @QueryParam("end_date") String endDate,
		@QueryParam("key") String key, @QueryParam("state") String state, @QueryParam("units") String units,
		@QueryParam("lang") String lang, @QueryParam("callback") String paramCallback);

	/**
	 * Returns Historical Observations - Given IP Address, or auto. Returns Historical Observations - Given IP Address, or auto.
	 */
	@GET
	@Path("/bulk/history/daily?ip={ip}")
	@Produces({ "application/json" })
	@ApiOperation(value = "Returns Historical Observations - Given IP Address, or auto.", tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "An Historical Day Data Object.", response = HistoryDay.class),
		@ApiResponse(code = 0, message = "No Data.", response = Error.class) })
	public HistoryDay bulkHistoryDailyipipGet(@PathParam("ip") String ip, @QueryParam("start_date") String startDate,
		@QueryParam("end_date") String endDate, @QueryParam("key") String key, @QueryParam("units") String units,
		@QueryParam("lang") String lang, @QueryParam("callback") String paramCallback);

	/**
	 * Returns Historical Observations - Given a lat/lon. Returns Historical Observations - Given a lat, and lon.
	 */
	@GET
	@Path("/bulk/history/daily?lat={lat}&lon={lon}")
	@Produces({ "application/json" })
	@ApiOperation(value = "Returns Historical Observations - Given a lat/lon.", tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "An Historical Day Data Object.", response = HistoryDay.class),
		@ApiResponse(code = 0, message = "No Data.", response = Error.class) })
	public HistoryDay bulkHistoryDailylatlatlonlonGet(@PathParam("lat") Double lat, @PathParam("lon") Double lon,
		@QueryParam("start_date") String startDate, @QueryParam("end_date") String endDate, @QueryParam("key") String key,
		@QueryParam("units") String units, @QueryParam("lang") String lang, @QueryParam("callback") String paramCallback);

	/**
	 * Returns Historical Observations - Given a Postal Code Returns Historical Observations - Given a Postal Code.
	 */
	@GET
	@Path("/bulk/history/daily?postal_code={postal_code}")
	@Produces({ "application/json" })
	@ApiOperation(value = "Returns Historical Observations - Given a Postal Code", tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "An Historical Day Data Object.", response = HistoryDay.class),
		@ApiResponse(code = 0, message = "No Data.", response = Error.class) })
	public HistoryDay bulkHistoryDailypostalCodepostalCodeGet(@PathParam("postal_code") String postalCode,
		@QueryParam("start_date") String startDate, @QueryParam("end_date") String endDate, @QueryParam("key") String key,
		@QueryParam("country") String country, @QueryParam("units") String units, @QueryParam("lang") String lang,
		@QueryParam("callback") String paramCallback);

	/**
	 * Returns Historical Observations - Given a station ID. Returns Historical Observations - Given a station ID.
	 */
	@GET
	@Path("/bulk/history/daily?station={station}")
	@Produces({ "application/json" })
	@ApiOperation(value = "Returns Historical Observations - Given a station ID.", tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "An Historical Day Data Object.", response = HistoryDay.class),
		@ApiResponse(code = 0, message = "No Data.", response = Error.class) })
	public HistoryDay bulkHistoryDailystationstationGet(@PathParam("station") String station,
		@QueryParam("start_date") String startDate, @QueryParam("end_date") String endDate, @QueryParam("key") String key,
		@QueryParam("units") String units, @QueryParam("lang") String lang, @QueryParam("callback") String paramCallback);
}
