package org.wimi.weatherbit.api.model;

import java.math.BigDecimal;
import org.wimi.weatherbit.api.model.ForecastHourWeather;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ForecastHour  {
  
  @ApiModelProperty(example = "4.5", value = "Apparent Temperature - Default (C)")
 /**
   * Apparent Temperature - Default (C)  
  **/
  private BigDecimal appTemp = null;

  @ApiModelProperty(example = "100", value = "Cloud cover as a percentage (%)")
 /**
   * Cloud cover as a percentage (%)  
  **/
  private Integer clouds = null;

  @ApiModelProperty(example = "2017-02-06:02", value = "(UTC) Date in format \"YYYY-MM-DD:HH\"")
 /**
   * (UTC) Date in format \"YYYY-MM-DD:HH\"  
  **/
  private String datetime = null;

  @ApiModelProperty(example = "-4.0", value = "Dewpoint - Default (C)")
 /**
   * Dewpoint - Default (C)  
  **/
  private BigDecimal dewpt = null;

  @ApiModelProperty(example = "500.0", value = "Direct component of solar radiation (W/m^2)")
 /**
   * Direct component of solar radiation (W/m^2)  
  **/
  private BigDecimal dhi = null;

  @ApiModelProperty(example = "d", value = "Part of day (d = day, n = night)")
 /**
   * Part of day (d = day, n = night)  
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

  @ApiModelProperty(example = "14.5", value = "Accumulated precipitation since last forecast point. Default (mm)")
 /**
   * Accumulated precipitation since last forecast point. Default (mm)  
  **/
  private BigDecimal precip6h = null;

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

  @ApiModelProperty(example = "140.87", value = "6 hour accumulated snowfall. Default (mm)")
 /**
   * 6 hour accumulated snowfall. Default (mm)  
  **/
  private BigDecimal snow6h = null;

  @ApiModelProperty(example = "-1.5", value = "Temperature - Default (C)")
 /**
   * Temperature - Default (C)  
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

  @ApiModelProperty(example = "1.0", value = "Visibility - Default (KM)")
 /**
   * Visibility - Default (KM)  
  **/
  private BigDecimal vis = null;

  @ApiModelProperty(value = "")
  private ForecastHourWeather weather = null;

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

  @ApiModelProperty(example = "13.85", value = "Wind Speed - Default (m/s)")
 /**
   * Wind Speed - Default (m/s)  
  **/
  private BigDecimal windSpd = null;
 /**
   * Apparent Temperature - Default (C)
   * @return appTemp
  **/
  @JsonProperty("app_temp")
  public BigDecimal getAppTemp() {
    return appTemp;
  }

  public void setAppTemp(BigDecimal appTemp) {
    this.appTemp = appTemp;
  }

  public ForecastHour appTemp(BigDecimal appTemp) {
    this.appTemp = appTemp;
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

  public ForecastHour clouds(Integer clouds) {
    this.clouds = clouds;
    return this;
  }

 /**
   * (UTC) Date in format \&quot;YYYY-MM-DD:HH\&quot;
   * @return datetime
  **/
  @JsonProperty("datetime")
  public String getDatetime() {
    return datetime;
  }

  public void setDatetime(String datetime) {
    this.datetime = datetime;
  }

  public ForecastHour datetime(String datetime) {
    this.datetime = datetime;
    return this;
  }

 /**
   * Dewpoint - Default (C)
   * @return dewpt
  **/
  @JsonProperty("dewpt")
  public BigDecimal getDewpt() {
    return dewpt;
  }

  public void setDewpt(BigDecimal dewpt) {
    this.dewpt = dewpt;
  }

  public ForecastHour dewpt(BigDecimal dewpt) {
    this.dewpt = dewpt;
    return this;
  }

 /**
   * Direct component of solar radiation (W/m^2)
   * @return dhi
  **/
  @JsonProperty("dhi")
  public BigDecimal getDhi() {
    return dhi;
  }

  public void setDhi(BigDecimal dhi) {
    this.dhi = dhi;
  }

  public ForecastHour dhi(BigDecimal dhi) {
    this.dhi = dhi;
    return this;
  }

 /**
   * Part of day (d &#x3D; day, n &#x3D; night)
   * @return pod
  **/
  @JsonProperty("pod")
  public String getPod() {
    return pod;
  }

  public void setPod(String pod) {
    this.pod = pod;
  }

  public ForecastHour pod(String pod) {
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

  public ForecastHour pop(BigDecimal pop) {
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

  public ForecastHour precip(BigDecimal precip) {
    this.precip = precip;
    return this;
  }

 /**
   * Accumulated precipitation since last forecast point. Default (mm)
   * @return precip6h
  **/
  @JsonProperty("precip6h")
  public BigDecimal getPrecip6h() {
    return precip6h;
  }

  public void setPrecip6h(BigDecimal precip6h) {
    this.precip6h = precip6h;
  }

  public ForecastHour precip6h(BigDecimal precip6h) {
    this.precip6h = precip6h;
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

  public ForecastHour pres(BigDecimal pres) {
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

  public ForecastHour rh(Integer rh) {
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

  public ForecastHour slp(BigDecimal slp) {
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

  public ForecastHour snow(BigDecimal snow) {
    this.snow = snow;
    return this;
  }

 /**
   * 6 hour accumulated snowfall. Default (mm)
   * @return snow6h
  **/
  @JsonProperty("snow6h")
  public BigDecimal getSnow6h() {
    return snow6h;
  }

  public void setSnow6h(BigDecimal snow6h) {
    this.snow6h = snow6h;
  }

  public ForecastHour snow6h(BigDecimal snow6h) {
    this.snow6h = snow6h;
    return this;
  }

 /**
   * Temperature - Default (C)
   * @return temp
  **/
  @JsonProperty("temp")
  public BigDecimal getTemp() {
    return temp;
  }

  public void setTemp(BigDecimal temp) {
    this.temp = temp;
  }

  public ForecastHour temp(BigDecimal temp) {
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

  public ForecastHour ts(BigDecimal ts) {
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

  public ForecastHour uv(BigDecimal uv) {
    this.uv = uv;
    return this;
  }

 /**
   * Visibility - Default (KM)
   * @return vis
  **/
  @JsonProperty("vis")
  public BigDecimal getVis() {
    return vis;
  }

  public void setVis(BigDecimal vis) {
    this.vis = vis;
  }

  public ForecastHour vis(BigDecimal vis) {
    this.vis = vis;
    return this;
  }

 /**
   * Get weather
   * @return weather
  **/
  @JsonProperty("weather")
  public ForecastHourWeather getWeather() {
    return weather;
  }

  public void setWeather(ForecastHourWeather weather) {
    this.weather = weather;
  }

  public ForecastHour weather(ForecastHourWeather weather) {
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

  public ForecastHour windCdir(String windCdir) {
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

  public ForecastHour windCdirFull(String windCdirFull) {
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

  public ForecastHour windDir(Integer windDir) {
    this.windDir = windDir;
    return this;
  }

 /**
   * Wind Speed - Default (m/s)
   * @return windSpd
  **/
  @JsonProperty("wind_spd")
  public BigDecimal getWindSpd() {
    return windSpd;
  }

  public void setWindSpd(BigDecimal windSpd) {
    this.windSpd = windSpd;
  }

  public ForecastHour windSpd(BigDecimal windSpd) {
    this.windSpd = windSpd;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForecastHour {\n");
    
    sb.append("    appTemp: ").append(toIndentedString(appTemp)).append("\n");
    sb.append("    clouds: ").append(toIndentedString(clouds)).append("\n");
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
    sb.append("    dewpt: ").append(toIndentedString(dewpt)).append("\n");
    sb.append("    dhi: ").append(toIndentedString(dhi)).append("\n");
    sb.append("    pod: ").append(toIndentedString(pod)).append("\n");
    sb.append("    pop: ").append(toIndentedString(pop)).append("\n");
    sb.append("    precip: ").append(toIndentedString(precip)).append("\n");
    sb.append("    precip6h: ").append(toIndentedString(precip6h)).append("\n");
    sb.append("    pres: ").append(toIndentedString(pres)).append("\n");
    sb.append("    rh: ").append(toIndentedString(rh)).append("\n");
    sb.append("    slp: ").append(toIndentedString(slp)).append("\n");
    sb.append("    snow: ").append(toIndentedString(snow)).append("\n");
    sb.append("    snow6h: ").append(toIndentedString(snow6h)).append("\n");
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

