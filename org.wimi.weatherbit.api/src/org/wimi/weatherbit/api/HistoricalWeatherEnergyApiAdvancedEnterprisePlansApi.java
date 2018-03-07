package org.wimi.weatherbit.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.wimi.weatherbit.api.model.EnergyObsGroup;
import org.wimi.weatherbit.api.model.Error;

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
public interface HistoricalWeatherEnergyApiAdvancedEnterprisePlansApi
{

	/**
	 * Returns multiple locations given a bounding box. Returns aggregate energy specific historical weather fields, over a
	 * specified time period. Supply a bounding box ex: lat1&#x3D;40&amp;lon1&#x3D;-78&amp;lat2&#x3D;38&amp;lon2&#x3D;-80. This
	 * API will return UP TO 150 stations, aggregated by the specified time period start_date to end_date.
	 */
	@GET
	@Path("/history/energy/bbox?lat1={lat1}&lon1={lon1}&lat2={lat2}&lon2={lon2}")
	@Produces({ "application/json" })
	@ApiOperation(value = "Returns multiple locations given a bounding box. ", tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "An Energy Data Object.", response = EnergyObsGroup.class),
		@ApiResponse(code = 0, message = "No Data.", response = Error.class) })
	public EnergyObsGroup historyEnergyBboxlat1lat1lon1lon1lat2lat2lon2lon2Get(@PathParam("lat1") Double lat1,
		@PathParam("lon1") Double lon1, @PathParam("lat2") Double lat2, @PathParam("lon2") Double lon2,
		@QueryParam("start_date") String startDate, @QueryParam("end_date") String endDate, @QueryParam("key") String key,
		@QueryParam("units") String units, @QueryParam("callback") String paramCallback);

	/**
	 * Returns Energy API response - Given a single lat/lon. Returns aggregate energy specific historical weather fields, over a
	 * specified time period.
	 */
	@GET
	@Path("/history/energy?lat={lat}&lon={lon}")
	@Produces({ "application/json" })
	@ApiOperation(value = "Returns Energy API response  - Given a single lat/lon. ", tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "An Energy Data Object.", response = EnergyObsGroup.class),
		@ApiResponse(code = 0, message = "No Data.", response = Error.class) })
	public EnergyObsGroup historyEnergylatlatlonlonGet(@PathParam("lat") Double lat, @PathParam("lon") Double lon,
		@QueryParam("start_date") String startDate, @QueryParam("end_date") String endDate, @QueryParam("key") String key,
		@QueryParam("units") String units, @QueryParam("callback") String paramCallback);
}
