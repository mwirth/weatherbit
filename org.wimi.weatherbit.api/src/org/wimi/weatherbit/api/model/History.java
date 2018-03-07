package org.wimi.weatherbit.api.model;

import java.util.ArrayList;
import java.util.List;
import org.wimi.weatherbit.api.model.HistoryObj;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class History  {
  
  @ApiModelProperty(example = "Seattle", value = "City name (Closest)")
 /**
   * City name (Closest)  
  **/
  private String cityName = null;

  @ApiModelProperty(example = "US", value = "Country abbreviation")
 /**
   * Country abbreviation  
  **/
  private String countryCode = null;

  @ApiModelProperty(value = "")
  private List<HistoryObj> data = null;

  @ApiModelProperty(example = "47.61", value = "Latitude")
 /**
   * Latitude  
  **/
  private String lat = null;

  @ApiModelProperty(example = "-122.33", value = "Longitude")
 /**
   * Longitude  
  **/
  private String lon = null;

  @ApiModelProperty(example = "WA", value = "State abbreviation")
 /**
   * State abbreviation  
  **/
  private String stateCode = null;

  @ApiModelProperty(example = "America/New_York", value = "Local IANA time zone")
 /**
   * Local IANA time zone  
  **/
  private String timezone = null;
 /**
   * City name (Closest)
   * @return cityName
  **/
  @JsonProperty("city_name")
  public String getCityName() {
    return cityName;
  }

  public void setCityName(String cityName) {
    this.cityName = cityName;
  }

  public History cityName(String cityName) {
    this.cityName = cityName;
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

  public History countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

 /**
   * Get data
   * @return data
  **/
  @JsonProperty("data")
  public List<HistoryObj> getData() {
    return data;
  }

  public void setData(List<HistoryObj> data) {
    this.data = data;
  }

  public History data(List<HistoryObj> data) {
    this.data = data;
    return this;
  }

  public History addDataItem(HistoryObj dataItem) {
    this.data.add(dataItem);
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

  public History lat(String lat) {
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

  public History lon(String lon) {
    this.lon = lon;
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

  public History stateCode(String stateCode) {
    this.stateCode = stateCode;
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

  public History timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class History {\n");
    
    sb.append("    cityName: ").append(toIndentedString(cityName)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    lon: ").append(toIndentedString(lon)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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

