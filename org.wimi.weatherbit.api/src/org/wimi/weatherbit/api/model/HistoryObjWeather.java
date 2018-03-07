package org.wimi.weatherbit.api.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class HistoryObjWeather  {
  
  @ApiModelProperty(example = "601", value = "Weather Condition code")
 /**
   * Weather Condition code  
  **/
  private String code = null;

  @ApiModelProperty(example = "Light Snow", value = "Weather Condition description")
 /**
   * Weather Condition description  
  **/
  private String description = null;

  @ApiModelProperty(example = "s01n", value = "Icon code for forecast image display")
 /**
   * Icon code for forecast image display  
  **/
  private String icon = null;
 /**
   * Weather Condition code
   * @return code
  **/
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public HistoryObjWeather code(String code) {
    this.code = code;
    return this;
  }

 /**
   * Weather Condition description
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public HistoryObjWeather description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Icon code for forecast image display
   * @return icon
  **/
  @JsonProperty("icon")
  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public HistoryObjWeather icon(String icon) {
    this.icon = icon;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoryObjWeather {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
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

