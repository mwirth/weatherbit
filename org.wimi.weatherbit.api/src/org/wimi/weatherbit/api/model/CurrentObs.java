package org.wimi.weatherbit.api.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public class CurrentObs {

	@ApiModelProperty(example = "14.85", value = "Apparent temperature - Default (C)")
	/**
	 * Apparent temperature - Default (C)
	 **/
	private BigDecimal appTemp = null;

	@ApiModelProperty(example = "Raleigh", value = "City name (closest)")
	/**
	 * City name (closest)
	 **/
	private String cityName = null;

	@ApiModelProperty(example = "42", value = "Cloud cover (%)")
	/**
	 * Cloud cover (%)
	 **/
	private Integer clouds = null;

	@ApiModelProperty(example = "US", value = "Country abbreviation")
	/**
	 * Country abbreviation
	 **/
	private String countryCode = null;

	@ApiModelProperty(example = "2017-03-15:13", value = "Cycle Hour (UTC) of observation")
	/**
	 * Cycle Hour (UTC) of observation
	 **/
	private String datetime = null;

	@ApiModelProperty(example = "12.0", value = "Dew point temperature - Default (C)")
	/**
	 * Dew point temperature - Default (C)
	 **/
	private BigDecimal dewpt = null;

	@ApiModelProperty(example = "450.4", value = "Direct component of solar insolation (W/m^2)")
	/**
	 * Direct component of solar insolation (W/m^2)
	 **/
	private BigDecimal dhi = null;

	@ApiModelProperty(example = "37.0", value = "Current solar elevation angle (Degrees)")
	/**
	 * Current solar elevation angle (Degrees)
	 **/
	private BigDecimal elevAngle = null;

	@ApiModelProperty(example = "45.0", value = "Current solar hour angle (Degrees)")
	/**
	 * Current solar hour angle (Degrees)
	 **/
	private BigDecimal hourAngle = null;

	@ApiModelProperty(example = "38.00", value = "Latitude")
	/**
	 * Latitude
	 **/
	private String lat = null;

	@ApiModelProperty(example = "-78.25", value = "Longitude")
	/**
	 * Longitude
	 **/
	private String lon = null;

	@ApiModelProperty(example = "2017-03-15 13:11", value = "Full time (UTC) of observation (YYYY-MM-DD HH:MM)")
	/**
	 * Full time (UTC) of observation (YYYY-MM-DD HH:MM)
	 **/
	private String obTime = null;

	@ApiModelProperty(value = "Part of the day (d = day, n = night)")
	/**
	 * Part of the day (d = day, n = night)
	 **/
	private String pod = null;

	@ApiModelProperty(example = "2.0", value = "Precipitation in last hour - Default (mm)")
	/**
	 * Precipitation in last hour - Default (mm)
	 **/
	private BigDecimal precip = null;

	@ApiModelProperty(example = "1010.0", value = "Pressure (mb)")
	/**
	 * Pressure (mb)
	 **/
	private BigDecimal pres = null;

	@ApiModelProperty(example = "75", value = "Relative humidity (%)")
	/**
	 * Relative humidity (%)
	 **/
	private Integer rh = null;

	@ApiModelProperty(example = "1013.12", value = "Mean sea level pressure in millibars (mb)")
	/**
	 * Mean sea level pressure in millibars (mb)
	 **/
	private BigDecimal slp = null;

	@ApiModelProperty(example = "10.0", value = "Snowfall in last hour - Default (mm)")
	/**
	 * Snowfall in last hour - Default (mm)
	 **/
	private BigDecimal snow = null;

	@ApiModelProperty(example = "NC", value = "State abbreviation")
	/**
	 * State abbreviation
	 **/
	private String stateCode = null;

	@ApiModelProperty(example = "KRDU", value = "Source Station ID")
	/**
	 * Source Station ID
	 **/
	private String station = null;

	@ApiModelProperty(example = "06:22", value = "Time (UTC) of Sunrise (HH:MM)")
	/**
	 * Time (UTC) of Sunrise (HH:MM)
	 **/
	private String sunrise = null;

	@ApiModelProperty(example = "19:34", value = "Time (UTC) of Sunset (HH:MM)")
	/**
	 * Time (UTC) of Sunset (HH:MM)
	 **/
	private String sunset = null;

	@ApiModelProperty(example = "13.85", value = "Temperature - Default (C)")
	/**
	 * Temperature - Default (C)
	 **/
	private BigDecimal temp = null;

	@ApiModelProperty(example = "America/New_York", value = "Local IANA time zone")
	/**
	 * Local IANA time zone
	 **/
	private String timezone = null;

	@ApiModelProperty(example = "1.4909904E9", value = "Unix Timestamp")
	/**
	 * Unix Timestamp
	 **/
	private BigDecimal ts = null;

	@ApiModelProperty(example = "6.5", value = "UV Index")
	/**
	 * UV Index
	 **/
	private BigDecimal uv = null;

	@ApiModelProperty(example = "10000", value = "Visibility - Default (M)")
	/**
	 * Visibility - Default (M)
	 **/
	private String vis = null;

	@ApiModelProperty(value = "")
	private CurrentObsWeather weather = null;

	@ApiModelProperty(example = "ENE", value = "Cardinal wind direction")
	/**
	 * Cardinal wind direction
	 **/
	private String windCdir = null;

	@ApiModelProperty(example = "East-North-East", value = "Cardinal wind direction (text)")
	/**
	 * Cardinal wind direction (text)
	 **/
	private String windCdirFull = null;

	@ApiModelProperty(example = "125", value = "Wind direction (Degrees)")
	/**
	 * Wind direction (Degrees)
	 **/
	private Integer windDir = null;

	@ApiModelProperty(example = "125", value = "Wind ? ")
	/**
	 * Wind ?
	 **/
	private Integer windSpd = null;

	@ApiModelProperty(example = "125", value = "Wind ? ")
	/**
	 * Wind ?
	 **/
	private Integer h_angle = null;

	@ApiModelProperty(example = "125", value = "Wind ? ")
	/**
	 * Wind ?
	 **/
	private Integer ghi = null;

	@ApiModelProperty(example = "125", value = "Wind ? ")
	/**
	 * Wind ?
	 **/
	private Integer dni = null;

	@ApiModelProperty(example = "5.85", value = "Wind speed - Default (m/s)")
	/**
	 * Wind speed - Default (m/s)
	 **/
	private BigDecimal windSpeed = null;

	/**
	 * Apparent temperature - Default (C)
	 *
	 * @return appTemp
	 **/
	@JsonProperty("app_temp")
	public BigDecimal getAppTemp() {
		return appTemp;
	}

	public void setAppTemp(BigDecimal appTemp) {
		this.appTemp = appTemp;
	}

	public CurrentObs appTemp(BigDecimal appTemp) {
		this.appTemp = appTemp;
		return this;
	}

	/**
	 * City name (closest)
	 *
	 * @return cityName
	 **/
	@JsonProperty("city_name")
	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public CurrentObs cityName(String cityName) {
		this.cityName = cityName;
		return this;
	}

	/**
	 * Cloud cover (%)
	 *
	 * @return clouds
	 **/
	@JsonProperty("clouds")
	public Integer getClouds() {
		return clouds;
	}

	public void setClouds(Integer clouds) {
		this.clouds = clouds;
	}

	public CurrentObs clouds(Integer clouds) {
		this.clouds = clouds;
		return this;
	}

	/**
	 * Country abbreviation
	 *
	 * @return countryCode
	 **/
	@JsonProperty("country_code")
	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public CurrentObs countryCode(String countryCode) {
		this.countryCode = countryCode;
		return this;
	}

	/**
	 * Cycle Hour (UTC) of observation
	 *
	 * @return datetime
	 **/
	@JsonProperty("datetime")
	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

	public CurrentObs datetime(String datetime) {
		this.datetime = datetime;
		return this;
	}

	/**
	 * Dew point temperature - Default (C)
	 *
	 * @return dewpt
	 **/
	@JsonProperty("dewpt")
	public BigDecimal getDewpt() {
		return dewpt;
	}

	public void setDewpt(BigDecimal dewpt) {
		this.dewpt = dewpt;
	}

	public CurrentObs dewpt(BigDecimal dewpt) {
		this.dewpt = dewpt;
		return this;
	}

	/**
	 * Direct component of solar insolation (W/m^2)
	 *
	 * @return dhi
	 **/
	@JsonProperty("dhi")
	public BigDecimal getDhi() {
		return dhi;
	}

	public void setDhi(BigDecimal dhi) {
		this.dhi = dhi;
	}

	public CurrentObs dhi(BigDecimal dhi) {
		this.dhi = dhi;
		return this;
	}

	/**
	 * Current solar elevation angle (Degrees)
	 *
	 * @return elevAngle
	 **/
	@JsonProperty("elev_angle")
	public BigDecimal getElevAngle() {
		return elevAngle;
	}

	public void setElevAngle(BigDecimal elevAngle) {
		this.elevAngle = elevAngle;
	}

	public CurrentObs elevAngle(BigDecimal elevAngle) {
		this.elevAngle = elevAngle;
		return this;
	}

	/**
	 * Current solar hour angle (Degrees)
	 *
	 * @return hourAngle
	 **/
	@JsonProperty("hour_angle")
	public BigDecimal getHourAngle() {
		return hourAngle;
	}

	public void setHourAngle(BigDecimal hourAngle) {
		this.hourAngle = hourAngle;
	}

	public CurrentObs hourAngle(BigDecimal hourAngle) {
		this.hourAngle = hourAngle;
		return this;
	}

	/**
	 * Latitude
	 *
	 * @return lat
	 **/
	@JsonProperty("lat")
	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public CurrentObs lat(String lat) {
		this.lat = lat;
		return this;
	}

	/**
	 * Longitude
	 *
	 * @return lon
	 **/
	@JsonProperty("lon")
	public String getLon() {
		return lon;
	}

	public void setLon(String lon) {
		this.lon = lon;
	}

	public CurrentObs lon(String lon) {
		this.lon = lon;
		return this;
	}

	/**
	 * Full time (UTC) of observation (YYYY-MM-DD HH:MM)
	 *
	 * @return obTime
	 **/
	@JsonProperty("ob_time")
	public String getObTime() {
		return obTime;
	}

	public void setObTime(String obTime) {
		this.obTime = obTime;
	}

	public CurrentObs obTime(String obTime) {
		this.obTime = obTime;
		return this;
	}

	/**
	 * Part of the day (d &#x3D; day, n &#x3D; night)
	 *
	 * @return pod
	 **/
	@JsonProperty("pod")
	public String getPod() {
		return pod;
	}

	public void setPod(String pod) {
		this.pod = pod;
	}

	public CurrentObs pod(String pod) {
		this.pod = pod;
		return this;
	}

	/**
	 * Precipitation in last hour - Default (mm)
	 *
	 * @return precip
	 **/
	@JsonProperty("precip")
	public BigDecimal getPrecip() {
		return precip;
	}

	public void setPrecip(BigDecimal precip) {
		this.precip = precip;
	}

	public CurrentObs precip(BigDecimal precip) {
		this.precip = precip;
		return this;
	}

	/**
	 * Pressure (mb)
	 *
	 * @return pres
	 **/
	@JsonProperty("pres")
	public BigDecimal getPres() {
		return pres;
	}

	public void setPres(BigDecimal pres) {
		this.pres = pres;
	}

	public CurrentObs pres(BigDecimal pres) {
		this.pres = pres;
		return this;
	}

	/**
	 * Relative humidity (%)
	 *
	 * @return rh
	 **/
	@JsonProperty("rh")
	public Integer getRh() {
		return rh;
	}

	public void setRh(Integer rh) {
		this.rh = rh;
	}

	public CurrentObs rh(Integer rh) {
		this.rh = rh;
		return this;
	}

	/**
	 * Mean sea level pressure in millibars (mb)
	 *
	 * @return slp
	 **/
	@JsonProperty("slp")
	public BigDecimal getSlp() {
		return slp;
	}

	public void setSlp(BigDecimal slp) {
		this.slp = slp;
	}

	public CurrentObs slp(BigDecimal slp) {
		this.slp = slp;
		return this;
	}

	/**
	 * Snowfall in last hour - Default (mm)
	 *
	 * @return snow
	 **/
	@JsonProperty("snow")
	public BigDecimal getSnow() {
		return snow;
	}

	public void setSnow(BigDecimal snow) {
		this.snow = snow;
	}

	public CurrentObs snow(BigDecimal snow) {
		this.snow = snow;
		return this;
	}

	/**
	 * State abbreviation
	 *
	 * @return stateCode
	 **/
	@JsonProperty("state_code")
	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public CurrentObs stateCode(String stateCode) {
		this.stateCode = stateCode;
		return this;
	}

	/**
	 * Source Station ID
	 *
	 * @return station
	 **/
	@JsonProperty("station")
	public String getStation() {
		return station;
	}

	public void setStation(String station) {
		this.station = station;
	}

	public CurrentObs station(String station) {
		this.station = station;
		return this;
	}

	/**
	 * Time (UTC) of Sunrise (HH:MM)
	 *
	 * @return sunrise
	 **/
	@JsonProperty("sunrise")
	public String getSunrise() {
		return sunrise;
	}

	public void setSunrise(String sunrise) {
		this.sunrise = sunrise;
	}

	public CurrentObs sunrise(String sunrise) {
		this.sunrise = sunrise;
		return this;
	}

	/**
	 * Time (UTC) of Sunset (HH:MM)
	 *
	 * @return sunset
	 **/
	@JsonProperty("sunset")
	public String getSunset() {
		return sunset;
	}

	public void setSunset(String sunset) {
		this.sunset = sunset;
	}

	public CurrentObs sunset(String sunset) {
		this.sunset = sunset;
		return this;
	}

	/**
	 * Temperature - Default (C)
	 *
	 * @return temp
	 **/
	@JsonProperty("temp")
	public BigDecimal getTemp() {
		return temp;
	}

	public void setTemp(BigDecimal temp) {
		this.temp = temp;
	}

	public CurrentObs temp(BigDecimal temp) {
		this.temp = temp;
		return this;
	}

	/**
	 * Local IANA time zone
	 *
	 * @return timezone
	 **/
	@JsonProperty("timezone")
	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public CurrentObs timezone(String timezone) {
		this.timezone = timezone;
		return this;
	}

	/**
	 * Unix Timestamp
	 *
	 * @return ts
	 **/
	@JsonProperty("ts")
	public BigDecimal getTs() {
		return ts;
	}

	public void setTs(BigDecimal ts) {
		this.ts = ts;
	}

	public CurrentObs ts(BigDecimal ts) {
		this.ts = ts;
		return this;
	}

	/**
	 * UV Index
	 *
	 * @return uv
	 **/
	@JsonProperty("uv")
	public BigDecimal getUv() {
		return uv;
	}

	public void setUv(BigDecimal uv) {
		this.uv = uv;
	}

	public CurrentObs uv(BigDecimal uv) {
		this.uv = uv;
		return this;
	}

	/**
	 * Visibility - Default (M)
	 *
	 * @return vis
	 **/
	@JsonProperty("vis")
	public String getVis() {
		return vis;
	}

	public void setVis(String vis) {
		this.vis = vis;
	}

	public CurrentObs vis(String vis) {
		this.vis = vis;
		return this;
	}

	/**
	 * Get weather
	 *
	 * @return weather
	 **/
	@JsonProperty("weather")
	public CurrentObsWeather getWeather() {
		return weather;
	}

	public void setWeather(CurrentObsWeather weather) {
		this.weather = weather;
	}

	public CurrentObs weather(CurrentObsWeather weather) {
		this.weather = weather;
		return this;
	}

	/**
	 * Cardinal wind direction
	 *
	 * @return windCdir
	 **/
	@JsonProperty("wind_cdir")
	public String getWindCdir() {
		return windCdir;
	}

	public void setWindCdir(String windCdir) {
		this.windCdir = windCdir;
	}

	public CurrentObs windCdir(String windCdir) {
		this.windCdir = windCdir;
		return this;
	}

	/**
	 * Cardinal wind direction (text)
	 *
	 * @return windCdirFull
	 **/
	@JsonProperty("wind_cdir_full")
	public String getWindCdirFull() {
		return windCdirFull;
	}

	public void setWindCdirFull(String windCdirFull) {
		this.windCdirFull = windCdirFull;
	}

	public CurrentObs windCdirFull(String windCdirFull) {
		this.windCdirFull = windCdirFull;
		return this;
	}

	/**
	 * Wind direction (Degrees)
	 *
	 * @return windDir
	 **/
	@JsonProperty("wind_spd")
	public Integer getWindSpd() {
		return windSpd;
	}

	public void setWindSpd(Integer windSpd) {
		this.windSpd = windSpd;
	}

	public CurrentObs windSpd(Integer windSpd) {
		this.windSpd = windSpd;
		return this;
	}

	@JsonProperty("h_angle")
	public Integer getHAngel() {
		return h_angle;
	}

	public void setHAngel(Integer hAngel) {
		this.h_angle = hAngel;
	}

	public CurrentObs hAngel(Integer hAngel) {
		this.h_angle = hAngel;
		return this;
	}

	@JsonProperty("ghi")
	public Integer getGhi() {
		return ghi;
	}

	public void setGhi(Integer Ghi) {
		this.ghi = Ghi;
	}

	public CurrentObs Ghi(Integer Ghi) {
		this.ghi = Ghi;
		return this;
	}

	@JsonProperty("dni")
	public Integer getDni() {
		return dni;
	}

	public void setdni(Integer dni) {
		this.dni = dni;
	}

	public CurrentObs dni(Integer dni) {
		this.dni = dni;
		return this;
	}

	/**
	 * Wind direction (Degrees)
	 *
	 * @return windDir
	 **/
	@JsonProperty("wind_dir")
	public Integer getWindDir() {
		return windDir;
	}

	public void setWindDir(Integer windDir) {
		this.windDir = windDir;
	}

	public CurrentObs windDir(Integer windDir) {
		this.windDir = windDir;
		return this;
	}

	/**
	 * Wind speed - Default (m/s)
	 *
	 * @return windSpeed
	 **/
	@JsonProperty("wind_speed")
	public BigDecimal getWindSpeed() {
		return windSpeed;
	}

	public void setWindSpeed(BigDecimal windSpeed) {
		this.windSpeed = windSpeed;
	}

	public CurrentObs windSpeed(BigDecimal windSpeed) {
		this.windSpeed = windSpeed;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CurrentObs {\n");

		sb.append("    appTemp: ").append(toIndentedString(appTemp)).append("\n");
		sb.append("    cityName: ").append(toIndentedString(cityName)).append("\n");
		sb.append("    clouds: ").append(toIndentedString(clouds)).append("\n");
		sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
		sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
		sb.append("    dewpt: ").append(toIndentedString(dewpt)).append("\n");
		sb.append("    dhi: ").append(toIndentedString(dhi)).append("\n");
		sb.append("    elevAngle: ").append(toIndentedString(elevAngle)).append("\n");
		sb.append("    hourAngle: ").append(toIndentedString(hourAngle)).append("\n");
		sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
		sb.append("    lon: ").append(toIndentedString(lon)).append("\n");
		sb.append("    obTime: ").append(toIndentedString(obTime)).append("\n");
		sb.append("    pod: ").append(toIndentedString(pod)).append("\n");
		sb.append("    precip: ").append(toIndentedString(precip)).append("\n");
		sb.append("    pres: ").append(toIndentedString(pres)).append("\n");
		sb.append("    rh: ").append(toIndentedString(rh)).append("\n");
		sb.append("    slp: ").append(toIndentedString(slp)).append("\n");
		sb.append("    snow: ").append(toIndentedString(snow)).append("\n");
		sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
		sb.append("    station: ").append(toIndentedString(station)).append("\n");
		sb.append("    sunrise: ").append(toIndentedString(sunrise)).append("\n");
		sb.append("    sunset: ").append(toIndentedString(sunset)).append("\n");
		sb.append("    temp: ").append(toIndentedString(temp)).append("\n");
		sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
		sb.append("    ts: ").append(toIndentedString(ts)).append("\n");
		sb.append("    uv: ").append(toIndentedString(uv)).append("\n");
		sb.append("    vis: ").append(toIndentedString(vis)).append("\n");
		sb.append("    weather: ").append(toIndentedString(weather)).append("\n");
		sb.append("    windCdir: ").append(toIndentedString(windCdir)).append("\n");
		sb.append("    windCdirFull: ").append(toIndentedString(windCdirFull)).append("\n");
		sb.append("    windDir: ").append(toIndentedString(windDir)).append("\n");
		sb.append("    windSpeed: ").append(toIndentedString(windSpeed)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private static String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
