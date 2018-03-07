package org.wimi.weatherbit.api.model;

import java.math.BigDecimal;
import org.wimi.weatherbit.api.model.HistoryObjWeather;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class HistoryObj  {
  
  @ApiModelProperty(example = "2016-01-01:00", value = "Date in format \"YYYY-MM-DD:HH\". All datetime is in (UTC)")
 /**
   * Date in format \"YYYY-MM-DD:HH\". All datetime is in (UTC)  
  **/
  private String datetime = null;

  @ApiModelProperty(example = "-1.5", value = "Dew point (Default Celcius)")
 /**
   * Dew point (Default Celcius)  
  **/
  private Integer dewpt = null;

  @ApiModelProperty(example = "150.7", value = "Direct component of solar insolation (W/m^2)")
 /**
   * Direct component of solar insolation (W/m^2)  
  **/
  private BigDecimal dhi = null;

  @ApiModelProperty(example = "27", value = "Solar elevation angle (Degrees)")
 /**
   * Solar elevation angle (Degrees)  
  **/
  private Integer elevAngle = null;

  @ApiModelProperty(example = "4", value = "Solar hour angle (Degrees)")
 /**
   * Solar hour angle (Degrees)  
  **/
  private Integer hAngle = null;

  @ApiModelProperty(example = "n", value = "Part of the day (d = day, n = night)")
 /**
   * Part of the day (d = day, n = night)  
  **/
  private String pod = null;

  @ApiModelProperty(example = "3.0", value = "Liquid equivalent precipitation - Default (mm)")
 /**
   * Liquid equivalent precipitation - Default (mm)  
  **/
  private BigDecimal precip = null;

  @ApiModelProperty(example = "6.0", value = "Liquid equivalent precipitation in last 6 hours - Default (mm)")
 /**
   * Liquid equivalent precipitation in last 6 hours - Default (mm)  
  **/
  private BigDecimal precip6h = null;

  @ApiModelProperty(example = "845.0", value = "Pressure (mb)")
 /**
   * Pressure (mb)  
  **/
  private BigDecimal pres = null;

  @ApiModelProperty(example = "0.0", value = "Set to 0 measurement has not yet been quality controlled, and should not be considered an authoritative observation")
 /**
   * Set to 0 measurement has not yet been quality controlled, and should not be considered an authoritative observation  
  **/
  private BigDecimal qc = null;

  @ApiModelProperty(example = "85", value = "Relative Humidity as a percentage (%)")
 /**
   * Relative Humidity as a percentage (%)  
  **/
  private Integer rh = null;

  @ApiModelProperty(example = "1020.1", value = "Sea level pressure (mb)")
 /**
   * Sea level pressure (mb)  
  **/
  private BigDecimal slp = null;

  @ApiModelProperty(example = "30.0", value = "Snowfall - Default (mm)")
 /**
   * Snowfall - Default (mm)  
  **/
  private BigDecimal snow = null;

  @ApiModelProperty(example = "60.0", value = "Snowfall in last 6 hours - Default (mm)")
 /**
   * Snowfall in last 6 hours - Default (mm)  
  **/
  private BigDecimal snow6h = null;

  @ApiModelProperty(example = "-1.2", value = "Temperature (Default Celcius)")
 /**
   * Temperature (Default Celcius)  
  **/
  private BigDecimal temp = null;

  @ApiModelProperty(example = "1451606400", value = "Unix Timestamp (UTC)")
 /**
   * Unix Timestamp (UTC)  
  **/
  private String ts = null;

  @ApiModelProperty(example = "4", value = "UV Index (1-11+)")
 /**
   * UV Index (1-11+)  
  **/
  private Integer uv = null;

  @ApiModelProperty(value = "")
  private HistoryObjWeather weather = null;

  @ApiModelProperty(example = "325", value = "Wind direction (Degrees)")
 /**
   * Wind direction (Degrees)  
  **/
  private Integer windDir = null;

  @ApiModelProperty(example = "14.7", value = "Wind Speed (Default m/s)")
 /**
   * Wind Speed (Default m/s)  
  **/
  private BigDecimal windSpd = null;
 /**
   * Date in format \&quot;YYYY-MM-DD:HH\&quot;. All datetime is in (UTC)
   * @return datetime
  **/
  @JsonProperty("datetime")
  public String getDatetime() {
    return datetime;
  }

  public void setDatetime(String datetime) {
    this.datetime = datetime;
  }

  public HistoryObj datetime(String datetime) {
    this.datetime = datetime;
    return this;
  }

 /**
   * Dew point (Default Celcius)
   * @return dewpt
  **/
  @JsonProperty("dewpt")
  public Integer getDewpt() {
    return dewpt;
  }

  public void setDewpt(Integer dewpt) {
    this.dewpt = dewpt;
  }

  public HistoryObj dewpt(Integer dewpt) {
    this.dewpt = dewpt;
    return this;
  }

 /**
   * Direct component of solar insolation (W/m^2)
   * @return dhi
  **/
  @JsonProperty("dhi")
  public BigDecimal getDhi() {
    return dhi;
  }

  public void setDhi(BigDecimal dhi) {
    this.dhi = dhi;
  }

  public HistoryObj dhi(BigDecimal dhi) {
    this.dhi = dhi;
    return this;
  }

 /**
   * Solar elevation angle (Degrees)
   * @return elevAngle
  **/
  @JsonProperty("elev_angle")
  public Integer getElevAngle() {
    return elevAngle;
  }

  public void setElevAngle(Integer elevAngle) {
    this.elevAngle = elevAngle;
  }

  public HistoryObj elevAngle(Integer elevAngle) {
    this.elevAngle = elevAngle;
    return this;
  }

 /**
   * Solar hour angle (Degrees)
   * @return hAngle
  **/
  @JsonProperty("h_angle")
  public Integer getHAngle() {
    return hAngle;
  }

  public void setHAngle(Integer hAngle) {
    this.hAngle = hAngle;
  }

  public HistoryObj hAngle(Integer hAngle) {
    this.hAngle = hAngle;
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

  public HistoryObj pod(String pod) {
    this.pod = pod;
    return this;
  }

 /**
   * Liquid equivalent precipitation - Default (mm)
   * @return precip
  **/
  @JsonProperty("precip")
  public BigDecimal getPrecip() {
    return precip;
  }

  public void setPrecip(BigDecimal precip) {
    this.precip = precip;
  }

  public HistoryObj precip(BigDecimal precip) {
    this.precip = precip;
    return this;
  }

 /**
   * Liquid equivalent precipitation in last 6 hours - Default (mm)
   * @return precip6h
  **/
  @JsonProperty("precip6h")
  public BigDecimal getPrecip6h() {
    return precip6h;
  }

  public void setPrecip6h(BigDecimal precip6h) {
    this.precip6h = precip6h;
  }

  public HistoryObj precip6h(BigDecimal precip6h) {
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

  public HistoryObj pres(BigDecimal pres) {
    this.pres = pres;
    return this;
  }

 /**
   * Set to 0 measurement has not yet been quality controlled, and should not be considered an authoritative observation
   * @return qc
  **/
  @JsonProperty("qc")
  public BigDecimal getQc() {
    return qc;
  }

  public void setQc(BigDecimal qc) {
    this.qc = qc;
  }

  public HistoryObj qc(BigDecimal qc) {
    this.qc = qc;
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

  public HistoryObj rh(Integer rh) {
    this.rh = rh;
    return this;
  }

 /**
   * Sea level pressure (mb)
   * @return slp
  **/
  @JsonProperty("slp")
  public BigDecimal getSlp() {
    return slp;
  }

  public void setSlp(BigDecimal slp) {
    this.slp = slp;
  }

  public HistoryObj slp(BigDecimal slp) {
    this.slp = slp;
    return this;
  }

 /**
   * Snowfall - Default (mm)
   * @return snow
  **/
  @JsonProperty("snow")
  public BigDecimal getSnow() {
    return snow;
  }

  public void setSnow(BigDecimal snow) {
    this.snow = snow;
  }

  public HistoryObj snow(BigDecimal snow) {
    this.snow = snow;
    return this;
  }

 /**
   * Snowfall in last 6 hours - Default (mm)
   * @return snow6h
  **/
  @JsonProperty("snow6h")
  public BigDecimal getSnow6h() {
    return snow6h;
  }

  public void setSnow6h(BigDecimal snow6h) {
    this.snow6h = snow6h;
  }

  public HistoryObj snow6h(BigDecimal snow6h) {
    this.snow6h = snow6h;
    return this;
  }

 /**
   * Temperature (Default Celcius)
   * @return temp
  **/
  @JsonProperty("temp")
  public BigDecimal getTemp() {
    return temp;
  }

  public void setTemp(BigDecimal temp) {
    this.temp = temp;
  }

  public HistoryObj temp(BigDecimal temp) {
    this.temp = temp;
    return this;
  }

 /**
   * Unix Timestamp (UTC)
   * @return ts
  **/
  @JsonProperty("ts")
  public String getTs() {
    return ts;
  }

  public void setTs(String ts) {
    this.ts = ts;
  }

  public HistoryObj ts(String ts) {
    this.ts = ts;
    return this;
  }

 /**
   * UV Index (1-11+)
   * @return uv
  **/
  @JsonProperty("uv")
  public Integer getUv() {
    return uv;
  }

  public void setUv(Integer uv) {
    this.uv = uv;
  }

  public HistoryObj uv(Integer uv) {
    this.uv = uv;
    return this;
  }

 /**
   * Get weather
   * @return weather
  **/
  @JsonProperty("weather")
  public HistoryObjWeather getWeather() {
    return weather;
  }

  public void setWeather(HistoryObjWeather weather) {
    this.weather = weather;
  }

  public HistoryObj weather(HistoryObjWeather weather) {
    this.weather = weather;
    return this;
  }

 /**
   * Wind direction (Degrees)
   * @return windDir
  **/
  @JsonProperty("wind_dir")
  public Integer getWindDir() {
    return windDir;
  }

  public void setWindDir(Integer windDir) {
    this.windDir = windDir;
  }

  public HistoryObj windDir(Integer windDir) {
    this.windDir = windDir;
    return this;
  }

 /**
   * Wind Speed (Default m/s)
   * @return windSpd
  **/
  @JsonProperty("wind_spd")
  public BigDecimal getWindSpd() {
    return windSpd;
  }

  public void setWindSpd(BigDecimal windSpd) {
    this.windSpd = windSpd;
  }

  public HistoryObj windSpd(BigDecimal windSpd) {
    this.windSpd = windSpd;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoryObj {\n");
    
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
    sb.append("    dewpt: ").append(toIndentedString(dewpt)).append("\n");
    sb.append("    dhi: ").append(toIndentedString(dhi)).append("\n");
    sb.append("    elevAngle: ").append(toIndentedString(elevAngle)).append("\n");
    sb.append("    hAngle: ").append(toIndentedString(hAngle)).append("\n");
    sb.append("    pod: ").append(toIndentedString(pod)).append("\n");
    sb.append("    precip: ").append(toIndentedString(precip)).append("\n");
    sb.append("    precip6h: ").append(toIndentedString(precip6h)).append("\n");
    sb.append("    pres: ").append(toIndentedString(pres)).append("\n");
    sb.append("    qc: ").append(toIndentedString(qc)).append("\n");
    sb.append("    rh: ").append(toIndentedString(rh)).append("\n");
    sb.append("    slp: ").append(toIndentedString(slp)).append("\n");
    sb.append("    snow: ").append(toIndentedString(snow)).append("\n");
    sb.append("    snow6h: ").append(toIndentedString(snow6h)).append("\n");
    sb.append("    temp: ").append(toIndentedString(temp)).append("\n");
    sb.append("    ts: ").append(toIndentedString(ts)).append("\n");
    sb.append("    uv: ").append(toIndentedString(uv)).append("\n");
    sb.append("    weather: ").append(toIndentedString(weather)).append("\n");
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

