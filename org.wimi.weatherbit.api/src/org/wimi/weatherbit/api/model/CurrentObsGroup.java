package org.wimi.weatherbit.api.model;

import java.util.ArrayList;
import java.util.List;
import org.wimi.weatherbit.api.model.CurrentObs;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CurrentObsGroup  {
  
  @ApiModelProperty(example = "1", value = "Count of found observations")
 /**
   * Count of found observations  
  **/
  private Integer count = null;

  @ApiModelProperty(value = "")
  private List<CurrentObs> data = null;
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

  public CurrentObsGroup count(Integer count) {
    this.count = count;
    return this;
  }

 /**
   * Get data
   * @return data
  **/
  @JsonProperty("data")
  public List<CurrentObs> getData() {
    return data;
  }

  public void setData(List<CurrentObs> data) {
    this.data = data;
  }

  public CurrentObsGroup data(List<CurrentObs> data) {
    this.data = data;
    return this;
  }

  public CurrentObsGroup addDataItem(CurrentObs dataItem) {
    this.data.add(dataItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentObsGroup {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

