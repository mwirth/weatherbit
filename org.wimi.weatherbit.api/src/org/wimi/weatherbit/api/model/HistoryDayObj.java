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

public class HistoryDayObj  {
  
  @ApiModelProperty(example = "2015-01-03", value = "Date in format \"YYYY-MM-DD\". All datetime is in (UTC)")
 /**
   * Date in format \"YYYY-MM-DD\". All datetime is in (UTC)  
  **/
  private String datetime = null;

  @ApiModelProperty(example = "-1.5", value = "Average dewpoint - Default (C)")
 /**
   * Average dewpoint - Default (C)  
  **/
  private BigDecimal dewpt = null;

  @ApiModelProperty(example = "125", value = "Average direct solar insolation (W/m^2)")
 /**
   * Average direct solar insolation (W/m^2)  
  **/
  private Integer dhi = null;

  @ApiModelProperty(example = "1.5", value = "Max Temperature - Default (C)")
 /**
   * Max Temperature - Default (C)  
  **/
  private BigDecimal maxTemp = null;

  @ApiModelProperty(example = "1.501970816E9", value = "Time of Max Temperature - Unix Timestamp")
 /**
   * Time of Max Temperature - Unix Timestamp  
  **/
  private BigDecimal maxTempTs = null;

  @ApiModelProperty(example = "6", value = "Max UV Index (1-11+)")
 /**
   * Max UV Index (1-11+)  
  **/
  private Integer maxUv = null;

  @ApiModelProperty(example = "325", value = "Direction of wind at time of max wind - (Degrees)")
 /**
   * Direction of wind at time of max wind - (Degrees)  
  **/
  private Integer maxWindDir = null;

  @ApiModelProperty(example = "19.98", value = "Average Wind Speed - Default (m/s)")
 /**
   * Average Wind Speed - Default (m/s)  
  **/
  private BigDecimal maxWindSpd = null;

  @ApiModelProperty(example = "1.501970516E9", value = "Time of max wind - Unix Timestamp")
 /**
   * Time of max wind - Unix Timestamp  
  **/
  private BigDecimal maxWindSpdTs = null;

  @ApiModelProperty(example = "11.7", value = "Min Temperature - Default (C)")
 /**
   * Min Temperature - Default (C)  
  **/
  private BigDecimal minTemp = null;

  @ApiModelProperty(example = "1.501970516E9", value = "Time of Max Temperature - Unix Timestamp")
 /**
   * Time of Max Temperature - Unix Timestamp  
  **/
  private BigDecimal minTempTs = null;

  @ApiModelProperty(example = "3.0", value = "Liquid equivalent precipitation - Default (mm)")
 /**
   * Liquid equivalent precipitation - Default (mm)  
  **/
  private BigDecimal precip = null;

  @ApiModelProperty(example = "885.1", value = "Average pressure (mb)")
 /**
   * Average pressure (mb)  
  **/
  private BigDecimal pres = null;

  @ApiModelProperty(example = "85", value = "Average relative humidity as a percentage (%)")
 /**
   * Average relative humidity as a percentage (%)  
  **/
  private Integer rh = null;

  @ApiModelProperty(example = "1020.1", value = "Average Sea level pressure (mb)")
 /**
   * Average Sea level pressure (mb)  
  **/
  private BigDecimal slp = null;

  @ApiModelProperty(example = "30.0", value = "Snowfall - Default (mm)")
 /**
   * Snowfall - Default (mm)  
  **/
  private BigDecimal snow = null;

  @ApiModelProperty(example = "4500", value = "Total/Cumulative direct solar insolation (W/m^2)")
 /**
   * Total/Cumulative direct solar insolation (W/m^2)  
  **/
  private Integer tDhi = null;

  @ApiModelProperty(example = "1.0", value = "Average Temperature - Default (C)")
 /**
   * Average Temperature - Default (C)  
  **/
  private BigDecimal temp = null;

  @ApiModelProperty(example = "1.501970516E9", value = "Unix Timestamp of datetime (Midnight UTC)")
 /**
   * Unix Timestamp of datetime (Midnight UTC)  
  **/
  private BigDecimal ts = null;

  @ApiModelProperty(example = "325", value = "Average Wind direction - (Degrees)")
 /**
   * Average Wind direction - (Degrees)  
  **/
  private Integer windDir = null;

  @ApiModelProperty(example = "14.98", value = "Average Wind Speed - Default (m/s)")
 /**
   * Average Wind Speed - Default (m/s)  
  **/
  private BigDecimal windSpd = null;
 /**
   * Date in format \&quot;YYYY-MM-DD\&quot;. All datetime is in (UTC)
   * @return datetime
  **/
  @JsonProperty("datetime")
  public String getDatetime() {
    return datetime;
  }

  public void setDatetime(String datetime) {
    this.datetime = datetime;
  }

  public HistoryDayObj datetime(String datetime) {
    this.datetime = datetime;
    return this;
  }

 /**
   * Average dewpoint - Default (C)
   * @return dewpt
  **/
  @JsonProperty("dewpt")
  public BigDecimal getDewpt() {
    return dewpt;
  }

  public void setDewpt(BigDecimal dewpt) {
    this.dewpt = dewpt;
  }

  public HistoryDayObj dewpt(BigDecimal dewpt) {
    this.dewpt = dewpt;
    return this;
  }

 /**
   * Average direct solar insolation (W/m^2)
   * @return dhi
  **/
  @JsonProperty("dhi")
  public Integer getDhi() {
    return dhi;
  }

  public void setDhi(Integer dhi) {
    this.dhi = dhi;
  }

  public HistoryDayObj dhi(Integer dhi) {
    this.dhi = dhi;
    return this;
  }

 /**
   * Max Temperature - Default (C)
   * @return maxTemp
  **/
  @JsonProperty("max_temp")
  public BigDecimal getMaxTemp() {
    return maxTemp;
  }

  public void setMaxTemp(BigDecimal maxTemp) {
    this.maxTemp = maxTemp;
  }

  public HistoryDayObj maxTemp(BigDecimal maxTemp) {
    this.maxTemp = maxTemp;
    return this;
  }

 /**
   * Time of Max Temperature - Unix Timestamp
   * @return maxTempTs
  **/
  @JsonProperty("max_temp_ts")
  public BigDecimal getMaxTempTs() {
    return maxTempTs;
  }

  public void setMaxTempTs(BigDecimal maxTempTs) {
    this.maxTempTs = maxTempTs;
  }

  public HistoryDayObj maxTempTs(BigDecimal maxTempTs) {
    this.maxTempTs = maxTempTs;
    return this;
  }

 /**
   * Max UV Index (1-11+)
   * @return maxUv
  **/
  @JsonProperty("max_uv")
  public Integer getMaxUv() {
    return maxUv;
  }

  public void setMaxUv(Integer maxUv) {
    this.maxUv = maxUv;
  }

  public HistoryDayObj maxUv(Integer maxUv) {
    this.maxUv = maxUv;
    return this;
  }

 /**
   * Direction of wind at time of max wind - (Degrees)
   * @return maxWindDir
  **/
  @JsonProperty("max_wind_dir")
  public Integer getMaxWindDir() {
    return maxWindDir;
  }

  public void setMaxWindDir(Integer maxWindDir) {
    this.maxWindDir = maxWindDir;
  }

  public HistoryDayObj maxWindDir(Integer maxWindDir) {
    this.maxWindDir = maxWindDir;
    return this;
  }

 /**
   * Average Wind Speed - Default (m/s)
   * @return maxWindSpd
  **/
  @JsonProperty("max_wind_spd")
  public BigDecimal getMaxWindSpd() {
    return maxWindSpd;
  }

  public void setMaxWindSpd(BigDecimal maxWindSpd) {
    this.maxWindSpd = maxWindSpd;
  }

  public HistoryDayObj maxWindSpd(BigDecimal maxWindSpd) {
    this.maxWindSpd = maxWindSpd;
    return this;
  }

 /**
   * Time of max wind - Unix Timestamp
   * @return maxWindSpdTs
  **/
  @JsonProperty("max_wind_spd_ts")
  public BigDecimal getMaxWindSpdTs() {
    return maxWindSpdTs;
  }

  public void setMaxWindSpdTs(BigDecimal maxWindSpdTs) {
    this.maxWindSpdTs = maxWindSpdTs;
  }

  public HistoryDayObj maxWindSpdTs(BigDecimal maxWindSpdTs) {
    this.maxWindSpdTs = maxWindSpdTs;
    return this;
  }

 /**
   * Min Temperature - Default (C)
   * @return minTemp
  **/
  @JsonProperty("min_temp")
  public BigDecimal getMinTemp() {
    return minTemp;
  }

  public void setMinTemp(BigDecimal minTemp) {
    this.minTemp = minTemp;
  }

  public HistoryDayObj minTemp(BigDecimal minTemp) {
    this.minTemp = minTemp;
    return this;
  }

 /**
   * Time of Max Temperature - Unix Timestamp
   * @return minTempTs
  **/
  @JsonProperty("min_temp_ts")
  public BigDecimal getMinTempTs() {
    return minTempTs;
  }

  public void setMinTempTs(BigDecimal minTempTs) {
    this.minTempTs = minTempTs;
  }

  public HistoryDayObj minTempTs(BigDecimal minTempTs) {
    this.minTempTs = minTempTs;
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

  public HistoryDayObj precip(BigDecimal precip) {
    this.precip = precip;
    return this;
  }

 /**
   * Average pressure (mb)
   * @return pres
  **/
  @JsonProperty("pres")
  public BigDecimal getPres() {
    return pres;
  }

  public void setPres(BigDecimal pres) {
    this.pres = pres;
  }

  public HistoryDayObj pres(BigDecimal pres) {
    this.pres = pres;
    return this;
  }

 /**
   * Average relative humidity as a percentage (%)
   * @return rh
  **/
  @JsonProperty("rh")
  public Integer getRh() {
    return rh;
  }

  public void setRh(Integer rh) {
    this.rh = rh;
  }

  public HistoryDayObj rh(Integer rh) {
    this.rh = rh;
    return this;
  }

 /**
   * Average Sea level pressure (mb)
   * @return slp
  **/
  @JsonProperty("slp")
  public BigDecimal getSlp() {
    return slp;
  }

  public void setSlp(BigDecimal slp) {
    this.slp = slp;
  }

  public HistoryDayObj slp(BigDecimal slp) {
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

  public HistoryDayObj snow(BigDecimal snow) {
    this.snow = snow;
    return this;
  }

 /**
   * Total/Cumulative direct solar insolation (W/m^2)
   * @return tDhi
  **/
  @JsonProperty("t_dhi")
  public Integer getTDhi() {
    return tDhi;
  }

  public void setTDhi(Integer tDhi) {
    this.tDhi = tDhi;
  }

  public HistoryDayObj tDhi(Integer tDhi) {
    this.tDhi = tDhi;
    return this;
  }

 /**
   * Average Temperature - Default (C)
   * @return temp
  **/
  @JsonProperty("temp")
  public BigDecimal getTemp() {
    return temp;
  }

  public void setTemp(BigDecimal temp) {
    this.temp = temp;
  }

  public HistoryDayObj temp(BigDecimal temp) {
    this.temp = temp;
    return this;
  }

 /**
   * Unix Timestamp of datetime (Midnight UTC)
   * @return ts
  **/
  @JsonProperty("ts")
  public BigDecimal getTs() {
    return ts;
  }

  public void setTs(BigDecimal ts) {
    this.ts = ts;
  }

  public HistoryDayObj ts(BigDecimal ts) {
    this.ts = ts;
    return this;
  }

 /**
   * Average Wind direction - (Degrees)
   * @return windDir
  **/
  @JsonProperty("wind_dir")
  public Integer getWindDir() {
    return windDir;
  }

  public void setWindDir(Integer windDir) {
    this.windDir = windDir;
  }

  public HistoryDayObj windDir(Integer windDir) {
    this.windDir = windDir;
    return this;
  }

 /**
   * Average Wind Speed - Default (m/s)
   * @return windSpd
  **/
  @JsonProperty("wind_spd")
  public BigDecimal getWindSpd() {
    return windSpd;
  }

  public void setWindSpd(BigDecimal windSpd) {
    this.windSpd = windSpd;
  }

  public HistoryDayObj windSpd(BigDecimal windSpd) {
    this.windSpd = windSpd;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoryDayObj {\n");
    
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
    sb.append("    dewpt: ").append(toIndentedString(dewpt)).append("\n");
    sb.append("    dhi: ").append(toIndentedString(dhi)).append("\n");
    sb.append("    maxTemp: ").append(toIndentedString(maxTemp)).append("\n");
    sb.append("    maxTempTs: ").append(toIndentedString(maxTempTs)).append("\n");
    sb.append("    maxUv: ").append(toIndentedString(maxUv)).append("\n");
    sb.append("    maxWindDir: ").append(toIndentedString(maxWindDir)).append("\n");
    sb.append("    maxWindSpd: ").append(toIndentedString(maxWindSpd)).append("\n");
    sb.append("    maxWindSpdTs: ").append(toIndentedString(maxWindSpdTs)).append("\n");
    sb.append("    minTemp: ").append(toIndentedString(minTemp)).append("\n");
    sb.append("    minTempTs: ").append(toIndentedString(minTempTs)).append("\n");
    sb.append("    precip: ").append(toIndentedString(precip)).append("\n");
    sb.append("    pres: ").append(toIndentedString(pres)).append("\n");
    sb.append("    rh: ").append(toIndentedString(rh)).append("\n");
    sb.append("    slp: ").append(toIndentedString(slp)).append("\n");
    sb.append("    snow: ").append(toIndentedString(snow)).append("\n");
    sb.append("    tDhi: ").append(toIndentedString(tDhi)).append("\n");
    sb.append("    temp: ").append(toIndentedString(temp)).append("\n");
    sb.append("    ts: ").append(toIndentedString(ts)).append("\n");
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

