package org.wimi.weatherbit.api.model;

import java.math.BigDecimal;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EnergyObs  {
  
  @ApiModelProperty(example = "10.0", value = "Cooling degree days - base 18 degrees (C)")
 /**
   * Cooling degree days - base 18 degrees (C)  
  **/
  private BigDecimal cdd = null;

  @ApiModelProperty(example = "Raleigh", value = "City name (closest)")
 /**
   * City name (closest)  
  **/
  private String cityName = null;

  @ApiModelProperty(example = "42", value = "Average cloud cover (%)")
 /**
   * Average cloud cover (%)  
  **/
  private Integer clouds = null;

  @ApiModelProperty(example = "US", value = "Country abbreviation")
 /**
   * Country abbreviation  
  **/
  private String countryCode = null;

  @ApiModelProperty(example = "12.0", value = "Average dew point temperature - Default (C)")
 /**
   * Average dew point temperature - Default (C)  
  **/
  private BigDecimal dewpt = null;

  @ApiModelProperty(example = "450.4", value = "Average direct component of solar insolation (W/m^2)")
 /**
   * Average direct component of solar insolation (W/m^2)  
  **/
  private BigDecimal dhi = null;

  @ApiModelProperty(example = "120.0", value = "Heating degree days - base 18 degrees (C)")
 /**
   * Heating degree days - base 18 degrees (C)  
  **/
  private BigDecimal hdd = null;

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

  @ApiModelProperty(example = "2.0", value = "Total precipitation in period - Default (mm)")
 /**
   * Total precipitation in period - Default (mm)  
  **/
  private BigDecimal precip = null;

  @ApiModelProperty(example = "75", value = "Average Relative humidity (%)")
 /**
   * Average Relative humidity (%)  
  **/
  private Integer rh = null;

  @ApiModelProperty(example = "10.0", value = "Total snowfall in period - Default (mm)")
 /**
   * Total snowfall in period - Default (mm)  
  **/
  private BigDecimal snow = null;

  @ApiModelProperty(example = "NC", value = "State abbreviation")
 /**
   * State abbreviation  
  **/
  private String stateCode = null;

  @ApiModelProperty(example = "12345-999999", value = "Source Station ID")
 /**
   * Source Station ID  
  **/
  private String stationId = null;

  @ApiModelProperty(example = "4.5", value = "Average number of daily sun hours - # hours where Solar Insolation > 1000 W/m^2")
 /**
   * Average number of daily sun hours - # hours where Solar Insolation > 1000 W/m^2  
  **/
  private BigDecimal sunHours = null;

  @ApiModelProperty(example = "13.85", value = "Average temperature - Default (C)")
 /**
   * Average temperature - Default (C)  
  **/
  private BigDecimal temp = null;

  @ApiModelProperty(example = "America/New_York", value = "Local IANA time zone")
 /**
   * Local IANA time zone  
  **/
  private String timezone = null;

  @ApiModelProperty(example = "125", value = "Average wind direction (Degrees)")
 /**
   * Average wind direction (Degrees)  
  **/
  private Integer windDir = null;

  @ApiModelProperty(example = "5.85", value = "Average wind speed - Default (m/s)")
 /**
   * Average wind speed - Default (m/s)  
  **/
  private BigDecimal windSpeed = null;
 /**
   * Cooling degree days - base 18 degrees (C)
   * @return cdd
  **/
  @JsonProperty("cdd")
  public BigDecimal getCdd() {
    return cdd;
  }

  public void setCdd(BigDecimal cdd) {
    this.cdd = cdd;
  }

  public EnergyObs cdd(BigDecimal cdd) {
    this.cdd = cdd;
    return this;
  }

 /**
   * City name (closest)
   * @return cityName
  **/
  @JsonProperty("city_name")
  public String getCityName() {
    return cityName;
  }

  public void setCityName(String cityName) {
    this.cityName = cityName;
  }

  public EnergyObs cityName(String cityName) {
    this.cityName = cityName;
    return this;
  }

 /**
   * Average cloud cover (%)
   * @return clouds
  **/
  @JsonProperty("clouds")
  public Integer getClouds() {
    return clouds;
  }

  public void setClouds(Integer clouds) {
    this.clouds = clouds;
  }

  public EnergyObs clouds(Integer clouds) {
    this.clouds = clouds;
    return this;
  }

 /**
   * Country abbreviation
   * @return countryCode
  **/
  @JsonProperty("country_code")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public EnergyObs countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

 /**
   * Average dew point temperature - Default (C)
   * @return dewpt
  **/
  @JsonProperty("dewpt")
  public BigDecimal getDewpt() {
    return dewpt;
  }

  public void setDewpt(BigDecimal dewpt) {
    this.dewpt = dewpt;
  }

  public EnergyObs dewpt(BigDecimal dewpt) {
    this.dewpt = dewpt;
    return this;
  }

 /**
   * Average direct component of solar insolation (W/m^2)
   * @return dhi
  **/
  @JsonProperty("dhi")
  public BigDecimal getDhi() {
    return dhi;
  }

  public void setDhi(BigDecimal dhi) {
    this.dhi = dhi;
  }

  public EnergyObs dhi(BigDecimal dhi) {
    this.dhi = dhi;
    return this;
  }

 /**
   * Heating degree days - base 18 degrees (C)
   * @return hdd
  **/
  @JsonProperty("hdd")
  public BigDecimal getHdd() {
    return hdd;
  }

  public void setHdd(BigDecimal hdd) {
    this.hdd = hdd;
  }

  public EnergyObs hdd(BigDecimal hdd) {
    this.hdd = hdd;
    return this;
  }

 /**
   * Latitude
   * @return lat
  **/
  @JsonProperty("lat")
  public String getLat() {
    return lat;
  }

  public void setLat(String lat) {
    this.lat = lat;
  }

  public EnergyObs lat(String lat) {
    this.lat = lat;
    return this;
  }

 /**
   * Longitude
   * @return lon
  **/
  @JsonProperty("lon")
  public String getLon() {
    return lon;
  }

  public void setLon(String lon) {
    this.lon = lon;
  }

  public EnergyObs lon(String lon) {
    this.lon = lon;
    return this;
  }

 /**
   * Total precipitation in period - Default (mm)
   * @return precip
  **/
  @JsonProperty("precip")
  public BigDecimal getPrecip() {
    return precip;
  }

  public void setPrecip(BigDecimal precip) {
    this.precip = precip;
  }

  public EnergyObs precip(BigDecimal precip) {
    this.precip = precip;
    return this;
  }

 /**
   * Average Relative humidity (%)
   * @return rh
  **/
  @JsonProperty("rh")
  public Integer getRh() {
    return rh;
  }

  public void setRh(Integer rh) {
    this.rh = rh;
  }

  public EnergyObs rh(Integer rh) {
    this.rh = rh;
    return this;
  }

 /**
   * Total snowfall in period - Default (mm)
   * @return snow
  **/
  @JsonProperty("snow")
  public BigDecimal getSnow() {
    return snow;
  }

  public void setSnow(BigDecimal snow) {
    this.snow = snow;
  }

  public EnergyObs snow(BigDecimal snow) {
    this.snow = snow;
    return this;
  }

 /**
   * State abbreviation
   * @return stateCode
  **/
  @JsonProperty("state_code")
  public String getStateCode() {
    return stateCode;
  }

  public void setStateCode(String stateCode) {
    this.stateCode = stateCode;
  }

  public EnergyObs stateCode(String stateCode) {
    this.stateCode = stateCode;
    return this;
  }

 /**
   * Source Station ID
   * @return stationId
  **/
  @JsonProperty("station_id")
  public String getStationId() {
    return stationId;
  }

  public void setStationId(String stationId) {
    this.stationId = stationId;
  }

  public EnergyObs stationId(String stationId) {
    this.stationId = stationId;
    return this;
  }

 /**
   * Average number of daily sun hours - # hours where Solar Insolation &gt; 1000 W/m^2
   * @return sunHours
  **/
  @JsonProperty("sun_hours")
  public BigDecimal getSunHours() {
    return sunHours;
  }

  public void setSunHours(BigDecimal sunHours) {
    this.sunHours = sunHours;
  }

  public EnergyObs sunHours(BigDecimal sunHours) {
    this.sunHours = sunHours;
    return this;
  }

 /**
   * Average temperature - Default (C)
   * @return temp
  **/
  @JsonProperty("temp")
  public BigDecimal getTemp() {
    return temp;
  }

  public void setTemp(BigDecimal temp) {
    this.temp = temp;
  }

  public EnergyObs temp(BigDecimal temp) {
    this.temp = temp;
    return this;
  }

 /**
   * Local IANA time zone
   * @return timezone
  **/
  @JsonProperty("timezone")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public EnergyObs timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

 /**
   * Average wind direction (Degrees)
   * @return windDir
  **/
  @JsonProperty("wind_dir")
  public Integer getWindDir() {
    return windDir;
  }

  public void setWindDir(Integer windDir) {
    this.windDir = windDir;
  }

  public EnergyObs windDir(Integer windDir) {
    this.windDir = windDir;
    return this;
  }

 /**
   * Average wind speed - Default (m/s)
   * @return windSpeed
  **/
  @JsonProperty("wind_speed")
  public BigDecimal getWindSpeed() {
    return windSpeed;
  }

  public void setWindSpeed(BigDecimal windSpeed) {
    this.windSpeed = windSpeed;
  }

  public EnergyObs windSpeed(BigDecimal windSpeed) {
    this.windSpeed = windSpeed;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnergyObs {\n");
    
    sb.append("    cdd: ").append(toIndentedString(cdd)).append("\n");
    sb.append("    cityName: ").append(toIndentedString(cityName)).append("\n");
    sb.append("    clouds: ").append(toIndentedString(clouds)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    dewpt: ").append(toIndentedString(dewpt)).append("\n");
    sb.append("    dhi: ").append(toIndentedString(dhi)).append("\n");
    sb.append("    hdd: ").append(toIndentedString(hdd)).append("\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    lon: ").append(toIndentedString(lon)).append("\n");
    sb.append("    precip: ").append(toIndentedString(precip)).append("\n");
    sb.append("    rh: ").append(toIndentedString(rh)).append("\n");
    sb.append("    snow: ").append(toIndentedString(snow)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
    sb.append("    stationId: ").append(toIndentedString(stationId)).append("\n");
    sb.append("    sunHours: ").append(toIndentedString(sunHours)).append("\n");
    sb.append("    temp: ").append(toIndentedString(temp)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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

