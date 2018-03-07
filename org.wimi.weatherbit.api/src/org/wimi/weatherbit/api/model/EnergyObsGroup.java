package org.wimi.weatherbit.api.model;

import java.util.ArrayList;
import java.util.List;
import org.wimi.weatherbit.api.model.EnergyObs;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EnergyObsGroup  {
  
  @ApiModelProperty(example = "1", value = "Count of found observations")
 /**
   * Count of found observations  
  **/
  private Integer count = null;

  @ApiModelProperty(value = "")
  private List<EnergyObs> data = null;

  @ApiModelProperty(example = "2017-01-30", value = "End Date")
 /**
   * End Date  
  **/
  private Integer endDate = null;

  @ApiModelProperty(example = "2017-01-01", value = "Start Date")
 /**
   * Start Date  
  **/
  private Integer startDate = null;
 /**
   * Count of found observations
   * @return count
  **/
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public EnergyObsGroup count(Integer count) {
    this.count = count;
    return this;
  }

 /**
   * Get data
   * @return data
  **/
  @JsonProperty("data")
  public List<EnergyObs> getData() {
    return data;
  }

  public void setData(List<EnergyObs> data) {
    this.data = data;
  }

  public EnergyObsGroup data(List<EnergyObs> data) {
    this.data = data;
    return this;
  }

  public EnergyObsGroup addDataItem(EnergyObs dataItem) {
    this.data.add(dataItem);
    return this;
  }

 /**
   * End Date
   * @return endDate
  **/
  @JsonProperty("end_date")
  public Integer getEndDate() {
    return endDate;
  }

  public void setEndDate(Integer endDate) {
    this.endDate = endDate;
  }

  public EnergyObsGroup endDate(Integer endDate) {
    this.endDate = endDate;
    return this;
  }

 /**
   * Start Date
   * @return startDate
  **/
  @JsonProperty("start_date")
  public Integer getStartDate() {
    return startDate;
  }

  public void setStartDate(Integer startDate) {
    this.startDate = startDate;
  }

  public EnergyObsGroup startDate(Integer startDate) {
    this.startDate = startDate;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnergyObsGroup {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

