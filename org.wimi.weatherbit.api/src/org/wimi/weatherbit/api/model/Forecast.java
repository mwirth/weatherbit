package org.wimi.weatherbit.api.model;

import java.math.BigDecimal;
import org.wimi.weatherbit.api.model.ForecastWeather;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Forecast  {
  
  @ApiModelProperty(example = "4.0", value = "Apparent Maximum daily Temperature - Default (C)")
 /**
   * Apparent Maximum daily Temperature - Default (C)  
  **/
  private BigDecimal appMaxTemp = null;

  @ApiModelProperty(example = "-2.0", value = "Apparent Minimum daily Temperature - Default (C)")
 /**
   * Apparent Minimum daily Temperature - Default (C)  
  **/
  private BigDecimal appMinTemp = null;

  @ApiModelProperty(example = "100", value = "Cloud cover as a percentage (%)")
 /**
   * Cloud cover as a percentage (%)  
  **/
  private Integer clouds = null;

  @ApiModelProperty(example = "2017-02-06", value = "(UTC) Date in format \"YYYY-MM-DD\"")
 /**
   * (UTC) Date in format \"YYYY-MM-DD\"  
  **/
  private String datetime = null;

  @ApiModelProperty(example = "1.0", value = "Dewpoint (Average) - Default (C)")
 /**
   * Dewpoint (Average) - Default (C)  
  **/
  private BigDecimal dewpt = null;

  @ApiModelProperty(example = "655.0", value = "Max direct component of solar insolation (W/m^2)")
 /**
   * Max direct component of solar insolation (W/m^2)  
  **/
  private BigDecimal maxDhi = null;

  @ApiModelProperty(example = "1.5", value = "Maximum daily Temperature - Default (C)")
 /**
   * Maximum daily Temperature - Default (C)  
  **/
  private BigDecimal maxTemp = null;

  @ApiModelProperty(example = "-1.23", value = "Minimum daily Temperature - Default (C)")
 /**
   * Minimum daily Temperature - Default (C)  
  **/
  private BigDecimal minTemp = null;

  @ApiModelProperty(example = "n", value = "Part of the day (d = day, n = night)")
 /**
   * Part of the day (d = day, n = night)  
  **/
  private String pod = null;

  @ApiModelProperty(example = "75.0", value = "Chance of Precipitation as a percentage (%)")
 /**
   * Chance of Precipitation as a percentage (%)  
  **/
  private BigDecimal pop = null;

  @ApiModelProperty(example = "1.1", value = "Accumulated precipitation since last forecast point. Default (mm)")
 /**
   * Accumulated precipitation since last forecast point. Default (mm)  
  **/
  private BigDecimal precip = null;

  @ApiModelProperty(example = "1005.0", value = "Pressure (mb)")
 /**
   * Pressure (mb)  
  **/
  private BigDecimal pres = null;

  @ApiModelProperty(example = "95", value = "Relative Humidity as a percentage (%)")
 /**
   * Relative Humidity as a percentage (%)  
  **/
  private Integer rh = null;

  @ApiModelProperty(example = "1012.89", value = "Mean Sea level pressure (mb)")
 /**
   * Mean Sea level pressure (mb)  
  **/
  private BigDecimal slp = null;

  @ApiModelProperty(example = "10.45", value = "Accumulated snowfall since last forecast point. Default (mm)")
 /**
   * Accumulated snowfall since last forecast point. Default (mm)  
  **/
  private BigDecimal snow = null;

  @ApiModelProperty(example = "1.0", value = "Temperature (Average) - Default (C)")
 /**
   * Temperature (Average) - Default (C)  
  **/
  private BigDecimal temp = null;

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

  @ApiModelProperty(example = "3.0", value = "Average Visibility default (KM)")
 /**
   * Average Visibility default (KM)  
  **/
  private BigDecimal vis = null;

  @ApiModelProperty(value = "")
  private ForecastWeather weather = null;

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

  @ApiModelProperty(example = "105", value = "Wind direction")
 /**
   * Wind direction  
  **/
  private Integer windDir = null;

  @ApiModelProperty(example = "13.85", value = "Wind Speed (default m/s)")
 /**
   * Wind Speed (default m/s)  
  **/
  private BigDecimal windSpd = null;
 /**
   * Apparent Maximum daily Temperature - Default (C)
   * @return appMaxTemp
  **/
  @JsonProperty("app_max_temp")
  public BigDecimal getAppMaxTemp() {
    return appMaxTemp;
  }

  public void setAppMaxTemp(BigDecimal appMaxTemp) {
    this.appMaxTemp = appMaxTemp;
  }

  public Forecast appMaxTemp(BigDecimal appMaxTemp) {
    this.appMaxTemp = appMaxTemp;
    return this;
  }

 /**
   * Apparent Minimum daily Temperature - Default (C)
   * @return appMinTemp
  **/
  @JsonProperty("app_min_temp")
  public BigDecimal getAppMinTemp() {
    return appMinTemp;
  }

  public void setAppMinTemp(BigDecimal appMinTemp) {
    this.appMinTemp = appMinTemp;
  }

  public Forecast appMinTemp(BigDecimal appMinTemp) {
    this.appMinTemp = appMinTemp;
    return this;
  }

 /**
   * Cloud cover as a percentage (%)
   * @return clouds
  **/
  @JsonProperty("clouds")
  public Integer getClouds() {
    return clouds;
  }

  public void setClouds(Integer clouds) {
    this.clouds = clouds;
  }

  public Forecast clouds(Integer clouds) {
    this.clouds = clouds;
    return this;
  }

 /**
   * (UTC) Date in format \&quot;YYYY-MM-DD\&quot;
   * @return datetime
  **/
  @JsonProperty("datetime")
  public String getDatetime() {
    return datetime;
  }

  public void setDatetime(String datetime) {
    this.datetime = datetime;
  }

  public Forecast datetime(String datetime) {
    this.datetime = datetime;
    return this;
  }

 /**
   * Dewpoint (Average) - Default (C)
   * @return dewpt
  **/
  @JsonProperty("dewpt")
  public BigDecimal getDewpt() {
    return dewpt;
  }

  public void setDewpt(BigDecimal dewpt) {
    this.dewpt = dewpt;
  }

  public Forecast dewpt(BigDecimal dewpt) {
    this.dewpt = dewpt;
    return this;
  }

 /**
   * Max direct component of solar insolation (W/m^2)
   * @return maxDhi
  **/
  @JsonProperty("max_dhi")
  public BigDecimal getMaxDhi() {
    return maxDhi;
  }

  public void setMaxDhi(BigDecimal maxDhi) {
    this.maxDhi = maxDhi;
  }

  public Forecast maxDhi(BigDecimal maxDhi) {
    this.maxDhi = maxDhi;
    return this;
  }

 /**
   * Maximum daily Temperature - Default (C)
   * @return maxTemp
  **/
  @JsonProperty("max_temp")
  public BigDecimal getMaxTemp() {
    return maxTemp;
  }

  public void setMaxTemp(BigDecimal maxTemp) {
    this.maxTemp = maxTemp;
  }

  public Forecast maxTemp(BigDecimal maxTemp) {
    this.maxTemp = maxTemp;
    return this;
  }

 /**
   * Minimum daily Temperature - Default (C)
   * @return minTemp
  **/
  @JsonProperty("min_temp")
  public BigDecimal getMinTemp() {
    return minTemp;
  }

  public void setMinTemp(BigDecimal minTemp) {
    this.minTemp = minTemp;
  }

  public Forecast minTemp(BigDecimal minTemp) {
    this.minTemp = minTemp;
    return this;
  }

 /**
   * Part of the day (d &#x3D; day, n &#x3D; night)
   * @return pod
  **/
  @JsonProperty("pod")
  public String getPod() {
    return pod;
  }

  public void setPod(String pod) {
    this.pod = pod;
  }

  public Forecast pod(String pod) {
    this.pod = pod;
    return this;
  }

 /**
   * Chance of Precipitation as a percentage (%)
   * @return pop
  **/
  @JsonProperty("pop")
  public BigDecimal getPop() {
    return pop;
  }

  public void setPop(BigDecimal pop) {
    this.pop = pop;
  }

  public Forecast pop(BigDecimal pop) {
    this.pop = pop;
    return this;
  }

 /**
   * Accumulated precipitation since last forecast point. Default (mm)
   * @return precip
  **/
  @JsonProperty("precip")
  public BigDecimal getPrecip() {
    return precip;
  }

  public void setPrecip(BigDecimal precip) {
    this.precip = precip;
  }

  public Forecast precip(BigDecimal precip) {
    this.precip = precip;
    return this;
  }

 /**
   * Pressure (mb)
   * @return pres
  **/
  @JsonProperty("pres")
  public BigDecimal getPres() {
    return pres;
  }

  public void setPres(BigDecimal pres) {
    this.pres = pres;
  }

  public Forecast pres(BigDecimal pres) {
    this.pres = pres;
    return this;
  }

 /**
   * Relative Humidity as a percentage (%)
   * @return rh
  **/
  @JsonProperty("rh")
  public Integer getRh() {
    return rh;
  }

  public void setRh(Integer rh) {
    this.rh = rh;
  }

  public Forecast rh(Integer rh) {
    this.rh = rh;
    return this;
  }

 /**
   * Mean Sea level pressure (mb)
   * @return slp
  **/
  @JsonProperty("slp")
  public BigDecimal getSlp() {
    return slp;
  }

  public void setSlp(BigDecimal slp) {
    this.slp = slp;
  }

  public Forecast slp(BigDecimal slp) {
    this.slp = slp;
    return this;
  }

 /**
   * Accumulated snowfall since last forecast point. Default (mm)
   * @return snow
  **/
  @JsonProperty("snow")
  public BigDecimal getSnow() {
    return snow;
  }

  public void setSnow(BigDecimal snow) {
    this.snow = snow;
  }

  public Forecast snow(BigDecimal snow) {
    this.snow = snow;
    return this;
  }

 /**
   * Temperature (Average) - Default (C)
   * @return temp
  **/
  @JsonProperty("temp")
  public BigDecimal getTemp() {
    return temp;
  }

  public void setTemp(BigDecimal temp) {
    this.temp = temp;
  }

  public Forecast temp(BigDecimal temp) {
    this.temp = temp;
    return this;
  }

 /**
   * Unix Timestamp
   * @return ts
  **/
  @JsonProperty("ts")
  public BigDecimal getTs() {
    return ts;
  }

  public void setTs(BigDecimal ts) {
    this.ts = ts;
  }

  public Forecast ts(BigDecimal ts) {
    this.ts = ts;
    return this;
  }

 /**
   * UV Index
   * @return uv
  **/
  @JsonProperty("uv")
  public BigDecimal getUv() {
    return uv;
  }

  public void setUv(BigDecimal uv) {
    this.uv = uv;
  }

  public Forecast uv(BigDecimal uv) {
    this.uv = uv;
    return this;
  }

 /**
   * Average Visibility default (KM)
   * @return vis
  **/
  @JsonProperty("vis")
  public BigDecimal getVis() {
    return vis;
  }

  public void setVis(BigDecimal vis) {
    this.vis = vis;
  }

  public Forecast vis(BigDecimal vis) {
    this.vis = vis;
    return this;
  }

 /**
   * Get weather
   * @return weather
  **/
  @JsonProperty("weather")
  public ForecastWeather getWeather() {
    return weather;
  }

  public void setWeather(ForecastWeather weather) {
    this.weather = weather;
  }

  public Forecast weather(ForecastWeather weather) {
    this.weather = weather;
    return this;
  }

 /**
   * Cardinal wind direction
   * @return windCdir
  **/
  @JsonProperty("wind_cdir")
  public String getWindCdir() {
    return windCdir;
  }

  public void setWindCdir(String windCdir) {
    this.windCdir = windCdir;
  }

  public Forecast windCdir(String windCdir) {
    this.windCdir = windCdir;
    return this;
  }

 /**
   * Cardinal wind direction (text)
   * @return windCdirFull
  **/
  @JsonProperty("wind_cdir_full")
  public String getWindCdirFull() {
    return windCdirFull;
  }

  public void setWindCdirFull(String windCdirFull) {
    this.windCdirFull = windCdirFull;
  }

  public Forecast windCdirFull(String windCdirFull) {
    this.windCdirFull = windCdirFull;
    return this;
  }

 /**
   * Wind direction
   * @return windDir
  **/
  @JsonProperty("wind_dir")
  public Integer getWindDir() {
    return windDir;
  }

  public void setWindDir(Integer windDir) {
    this.windDir = windDir;
  }

  public Forecast windDir(Integer windDir) {
    this.windDir = windDir;
    return this;
  }

 /**
   * Wind Speed (default m/s)
   * @return windSpd
  **/
  @JsonProperty("wind_spd")
  public BigDecimal getWindSpd() {
    return windSpd;
  }

  public void setWindSpd(BigDecimal windSpd) {
    this.windSpd = windSpd;
  }

  public Forecast windSpd(BigDecimal windSpd) {
    this.windSpd = windSpd;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Forecast {\n");
    
    sb.append("    appMaxTemp: ").append(toIndentedString(appMaxTemp)).append("\n");
    sb.append("    appMinTemp: ").append(toIndentedString(appMinTemp)).append("\n");
    sb.append("    clouds: ").append(toIndentedString(clouds)).append("\n");
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
    sb.append("    dewpt: ").append(toIndentedString(dewpt)).append("\n");
    sb.append("    maxDhi: ").append(toIndentedString(maxDhi)).append("\n");
    sb.append("    maxTemp: ").append(toIndentedString(maxTemp)).append("\n");
    sb.append("    minTemp: ").append(toIndentedString(minTemp)).append("\n");
    sb.append("    pod: ").append(toIndentedString(pod)).append("\n");
    sb.append("    pop: ").append(toIndentedString(pop)).append("\n");
    sb.append("    precip: ").append(toIndentedString(precip)).append("\n");
    sb.append("    pres: ").append(toIndentedString(pres)).append("\n");
    sb.append("    rh: ").append(toIndentedString(rh)).append("\n");
    sb.append("    slp: ").append(toIndentedString(slp)).append("\n");
    sb.append("    snow: ").append(toIndentedString(snow)).append("\n");
    sb.append("    temp: ").append(toIndentedString(temp)).append("\n");
    sb.append("    ts: ").append(toIndentedString(ts)).append("\n");
    sb.append("    uv: ").append(toIndentedString(uv)).append("\n");
    sb.append("    vis: ").append(toIndentedString(vis)).append("\n");
    sb.append("    weather: ").append(toIndentedString(weather)).append("\n");
    sb.append("    windCdir: ").append(toIndentedString(windCdir)).append("\n");
    sb.append("    windCdirFull: ").append(toIndentedString(windCdirFull)).append("\n");
    sb.append("    windDir: ").append(toIndentedString(windDir)).append("\n");
    sb.append("    windSpd: ").append(toIndentedString(windSpd)).append("\n");
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

