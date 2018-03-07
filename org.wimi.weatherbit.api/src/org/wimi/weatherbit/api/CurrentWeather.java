package org.wimi.weatherbit.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.wimi.weatherbit.api.model.CurrentObsGroup;
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
 * [https://api.weatherbit.io/v2.0/](http://api.weatherbit.io/v2.0/). Below is
 * the Swagger UI documentation for the API. All API requests require the `key`
 * parameter. An Example for a 5 day forecast for London, UK would be
 * `http://api.weatherbit.io/v2.0/forecast/3hourly?city=London`&`country=UK`
 */
@Path("/")
@Api(value = "/", description = "")
public interface CurrentWeather {

	/**
	 * Returns a group of observations given a list of cities
	 * **(Advanced/Advanced+/Enterprise plans only)** Returns a group of Current
	 * Observations - Given a list of City IDs.
	 */
	@GET
	@Path("/current?cities={cities}")
	@Produces({ "application/json" })
	@ApiOperation(value = "Returns a group of observations given a list of cities", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "An Observation Group object.", response = CurrentObsGroup.class),
			@ApiResponse(code = 0, message = "No Data.", response = Error.class) })
	public CurrentObsGroup currentcitiescitiesGet(@PathParam("cities") String cities, @QueryParam("key") String key,
			@QueryParam("units") String units, @QueryParam("marine") String marine, @QueryParam("lang") String lang,
			@QueryParam("callback") String paramCallback);

	/**
	 * Returns a current observation by city id. Returns current weather observation
	 * - Given a City ID.
	 */
	@GET
	@Path("/current?city_id={city_id}")
	@Produces({ "application/json" })
	@ApiOperation(value = "Returns a current observation by city id.", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "An Observation Group object.", response = CurrentObsGroup.class),
			@ApiResponse(code = 0, message = "No Data.", response = Error.class) })
	public CurrentObsGroup currentcityIdcityIdGet(@PathParam("city_id") String cityId, @QueryParam("key") String key,
			@QueryParam("units") String units, @QueryParam("marine") String marine, @QueryParam("lang") String lang,
			@QueryParam("callback") String paramCallback);

	/**
	 * Returns a Current Observation - Given City and/or State, Country. Returns a
	 * Current Observation - Given a city in the format of City,ST or City. The
	 * state, and country parameters can be provided to make the search more
	 * accurate.
	 */
	@GET
	@Path("/current?city={city}&country={country}")
	@Produces({ "application/json" })
	@ApiOperation(value = "Returns a Current Observation - Given City and/or State, Country.", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "An Observation Group object.", response = CurrentObsGroup.class),
			@ApiResponse(code = 0, message = "No Data.", response = Error.class) })
	public CurrentObsGroup currentcitycitycountrycountryGet(@PathParam("city") String city,
			@PathParam("country") String country, @QueryParam("key") String key, @QueryParam("state") String state,
			@QueryParam("marine") String marine, @QueryParam("units") String units, @QueryParam("lang") String lang,
			@QueryParam("callback") String paramCallback);

	/**
	 * Returns a Current Observation - Given an IP address, or auto. Returns a
	 * Current Observation - Given an IP address, or auto.
	 */
	@GET
	@Path("/current?ip={ip}")
	@Produces({ "application/json" })
	@ApiOperation(value = "Returns a Current Observation - Given an IP address, or auto.", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "An Observation Group object.", response = CurrentObsGroup.class),
			@ApiResponse(code = 0, message = "No Data.", response = Error.class) })
	public CurrentObsGroup currentipipGet(@PathParam("ip") String ip, @QueryParam("key") String key,
			@QueryParam("marine") String marine, @QueryParam("units") String units, @QueryParam("lang") String lang,
			@QueryParam("callback") String paramCallback);

	/**
	 * Returns a Current Observation - Given a lat/lon. Returns a Current
	 * Observation - given a lat, and a lon.
	 */
	@GET
	@Path("/current?lat={lat}&lon={lon}")
	@Produces({ "application/json" })
	@ApiOperation(value = "Returns a Current Observation - Given a lat/lon.", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "An Observation Group object.", response = CurrentObsGroup.class),
			@ApiResponse(code = 0, message = "No Data.", response = Error.class) })
	public CurrentObsGroup currentlatlatlonlonGet(@PathParam("lat") Double lat, @PathParam("lon") Double lon,
			@QueryParam("key") String key, @QueryParam("marine") String marine, @QueryParam("units") String units,
			@QueryParam("lang") String lang, @QueryParam("callback") String paramCallback);

	/**
	 * Returns a current observation by postal code. Returns current weather
	 * observation - Given a Postal Code.
	 */
	@GET
	@Path("/current?postal_code={postal_code}")
	@Produces({ "application/json" })
	@ApiOperation(value = "Returns a current observation by postal code.", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "An Observation Group object.", response = CurrentObsGroup.class),
			@ApiResponse(code = 0, message = "No Data.", response = Error.class) })
	public CurrentObsGroup currentpostalCodepostalCodeGet(@PathParam("postal_code") String postalCode,
			@QueryParam("key") String key, @QueryParam("country") String country, @QueryParam("marine") String marine,
			@QueryParam("units") String units, @QueryParam("lang") String lang,
			@QueryParam("callback") String paramCallback);

	/**
	 * Returns a group of observations given a list of stations
	 * **(Advanced/Advanced+/Enterprise plans only)** Returns a group of Current
	 * Observations - Given a list of Station Call IDs.
	 */
	@GET
	@Path("/current?stations={stations}")
	@Produces({ "application/json" })
	@ApiOperation(value = "Returns a group of observations given a list of stations", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "An Observation Group object.", response = CurrentObsGroup.class),
			@ApiResponse(code = 0, message = "No Data.", response = Error.class) })
	public CurrentObsGroup currentstationsstationsGet(@PathParam("stations") String stations,
			@QueryParam("key") String key, @QueryParam("units") String units, @QueryParam("lang") String lang,
			@QueryParam("callback") String paramCallback);

	/**
	 * Returns a Current Observation. - Given a station ID. Returns a Current
	 * Observation - Given a station ID.
	 */
	@GET
	@Path("/current")
	@Produces({ "application/json" })
	@ApiOperation(value = "Returns a Current Observation. - Given a station ID.", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "An Observation Group object.", response = CurrentObsGroup.class),
			@ApiResponse(code = 0, message = "No Data.", response = Error.class) })
	public CurrentObsGroup currentstationstationGet(@QueryParam("station") String station,
			@QueryParam("key") String key, @QueryParam("units") String units, @QueryParam("lang") String lang,
			@QueryParam("callback") String paramCallback);
}
