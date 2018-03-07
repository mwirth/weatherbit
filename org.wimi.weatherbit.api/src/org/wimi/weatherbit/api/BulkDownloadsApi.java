package org.wimi.weatherbit.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

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
public interface BulkDownloadsApi
{

	/**
	 * Download pre-generated bulk datasets **(Advanced/Advanced+/Enterprise plans only)** Downloads bulk data files - OPTIONS:
	 * (forecast16d.json.gz - 16 day forecasts for cities &gt; 1000 population, current.json.gz - Current observations for cities
	 * &gt; 1000 population).
	 */
	@GET
	@Path("/bulk/{file}")
	@Produces({ "application/json" })
	@ApiOperation(value = "Download pre-generated bulk datasets", tags = {})
	@ApiResponses(value = { @ApiResponse(code = 0, message = "No Data.", response = Error.class) })
	public Error bulkFileGet(@PathParam("file") String file, @QueryParam("key") String key);
}
