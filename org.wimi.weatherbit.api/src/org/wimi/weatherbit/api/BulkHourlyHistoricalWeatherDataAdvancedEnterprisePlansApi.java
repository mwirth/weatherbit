package org.wimi.weatherbit.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.wimi.weatherbit.api.model.Error;
import org.wimi.weatherbit.api.model.History;

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
public interface BulkHourlyHistoricalWeatherDataAdvancedEnterprisePlansApi
{

	/**
	 * Returns Historical Observations - Given a City ID. (1 Year/call limit) Returns Historical Observations - Given a City ID.
	 */
	@GET
	@Path("/bulk/history/hourly?city_id={city_id}")
	@Produces({ "application/json" })
	@ApiOperation(value = "Returns Historical Observations - Given a City ID. (1 Year/call limit)", tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "An Historical Data Object.", response = History.class),
		@ApiResponse(code = 0, message = "No Data.", response = Error.class) })
	public History bulkHistoryHourlycityIdcityIdGet(@PathParam("city_id") String cityId,
		@QueryParam("start_date") String startDate, @QueryParam("end_date") String endDate, @QueryParam("key") String key,
		@QueryParam("units") String units, @QueryParam("lang") String lang, @QueryParam("callback") String paramCallback);

	/**
	 * Returns Historical Observations - Given City and/or State, Country. (1 Year/call limit) Returns Historical Observations -
	 * Given a city in the format of City,ST or City. The state, and country parameters can be provided to make the search more
	 * accurate.
	 */
	@GET
	@Path("/bulk/history/hourly?city={city}&country={country}")
	@Produces({ "application/json" })
	@ApiOperation(value = "Returns Historical Observations - Given City and/or State, Country. (1 Year/call limit)", tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "An Historical Data Object.", response = History.class),
		@ApiResponse(code = 0, message = "No Data.", response = Error.class) })
	public History bulkHistoryHourlycitycitycountrycountryGet(@PathParam("city") String city,
		@PathParam("country") String country, @QueryParam("start_date") String startDate, @QueryParam("end_date") String endDate,
		@QueryParam("key") String key, @QueryParam("state") String state, @QueryParam("units") String units,
		@QueryParam("lang") String lang, @QueryParam("callback") String paramCallback);

	/**
	 * Returns Historical Observations - Given IP Address, or auto. (1 Year/call limit) Returns Historical Observations - Given IP
	 * Address, or auto.
	 */
	@GET
	@Path("/bulk/history/hourly?ip={ip}")
	@Produces({ "application/json" })
	@ApiOperation(value = "Returns Historical Observations - Given IP Address, or auto. (1 Year/call limit)", tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "An Historical Data Object.", response = History.class),
		@ApiResponse(code = 0, message = "No Data.", response = Error.class) })
	public History bulkHistoryHourlyipipGet(@PathParam("ip") String ip, @QueryParam("start_date") String startDate,
		@QueryParam("end_date") String endDate, @QueryParam("key") String key, @QueryParam("units") String units,
		@QueryParam("lang") String lang, @QueryParam("callback") String paramCallback);

	/**
	 * Returns Historical Observations - Given a lat/lon. (1 Year/call limit) Returns Historical Observations - Given a lat, and
	 * lon.
	 */
	@GET
	@Path("/bulk/history/hourly?lat={lat}&lon={lon}")
	@Produces({ "application/json" })
	@ApiOperation(value = "Returns Historical Observations - Given a lat/lon. (1 Year/call limit)", tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "An Historical Data Object.", response = History.class),
		@ApiResponse(code = 0, message = "No Data.", response = Error.class) })
	public History bulkHistoryHourlylatlatlonlonGet(@PathParam("lat") Double lat, @PathParam("lon") Double lon,
		@QueryParam("start_date") String startDate, @QueryParam("end_date") String endDate, @QueryParam("key") String key,
		@QueryParam("units") String units, @QueryParam("lang") String lang, @QueryParam("callback") String paramCallback);

	/**
	 * Returns Historical Observations - Given a Postal Code. (1 Year/call limit) Returns Historical Observations - Given a Postal
	 * Code.
	 */
	@GET
	@Path("/bulk/history/hourly?postal_code={postal_code}")
	@Produces({ "application/json" })
	@ApiOperation(value = "Returns Historical Observations - Given a Postal Code. (1 Year/call limit)", tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "An Historical Data Object.", response = History.class),
		@ApiResponse(code = 0, message = "No Data.", response = Error.class) })
	public History bulkHistoryHourlypostalCodepostalCodeGet(@PathParam("postal_code") String postalCode,
		@QueryParam("start_date") String startDate, @QueryParam("end_date") String endDate, @QueryParam("key") String key,
		@QueryParam("country") String country, @QueryParam("units") String units, @QueryParam("lang") String lang,
		@QueryParam("callback") String paramCallback);

	/**
	 * Returns Historical Observations - Given a station ID. (1 Year/call limit) Returns Historical Observations - Given a station
	 * ID.
	 */
	@GET
	@Path("/bulk/history/hourly?station={station}")
	@Produces({ "application/json" })
	@ApiOperation(value = "Returns Historical Observations - Given a station ID. (1 Year/call limit)", tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "An Historical Data Object.", response = History.class),
		@ApiResponse(code = 0, message = "No Data.", response = Error.class) })
	public History bulkHistoryHourlystationstationGet(@PathParam("station") String station,
		@QueryParam("start_date") String startDate, @QueryParam("end_date") String endDate, @QueryParam("key") String key,
		@QueryParam("units") String units, @QueryParam("lang") String lang, @QueryParam("callback") String paramCallback);
}
