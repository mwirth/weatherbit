package org.wimi.weatherbit.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public class GeoIPObj {

	@ApiModelProperty(example = "919", value = "Area Code")
	/**
	 * Area Code
	 **/
	private String areaCode = null;

	@ApiModelProperty(example = "1", value = "Character encoding")
	/**
	 * Character encoding
	 **/
	private String charset = null;

	@ApiModelProperty(example = "Raleigh", value = "City Name")
	/**
	 * City Name
	 **/
	private String city = null;

	@ApiModelProperty(example = "US", value = "Country Abbreviation")
	/**
	 * Country Abbreviation
	 **/
	private String continentCode = null;

	@ApiModelProperty(example = "US", value = "Country Code (Short)")
	/**
	 * Country Code (Short)
	 **/
	private String countryCode = null;

	@ApiModelProperty(example = "US", value = "Country")
	/**
	 * Country
	 **/
	private String country = null;

	@ApiModelProperty(example = "USA", value = "Country Code (Long)")
	/**
	 * Country Code (Long)
	 **/
	private String countryCode3 = null;

	@ApiModelProperty(example = "560", value = "Longitude")
	/**
	 * Longitude
	 **/
	private String dmaCode = null;

	@ApiModelProperty(example = "192.168.1.102", value = "IP Address")
	/**
	 * IP Address
	 **/
	private String ip = null;

	@ApiModelProperty(example = "35.811", value = "State Abbreviation")
	/**
	 * State Abbreviation
	 **/
	private String latitude = null;

	@ApiModelProperty(example = "-78.64", value = "City Name")
	/**
	 * City Name
	 **/
	private String longitude = null;

	@ApiModelProperty(example = "560", value = "Longitude")
	/**
	 * Longitude
	 **/
	private String metroCode = null;

	@ApiModelProperty(example = "-4", value = "UTC Offset (deprecated)")
	/**
	 * UTC Offset (deprecated)
	 **/
	private String offset = null;

	@ApiModelProperty(example = "AS11426 Time Warner Cable Internet LLC", value = "Organization Name")
	/**
	 * Organization Name
	 **/
	private String organization = null;

	@ApiModelProperty(example = "27601", value = "Postal Code")
	/**
	 * Postal Code
	 **/
	private String postalCode = null;

	@ApiModelProperty(example = "NC", value = "Latitude")
	/**
	 * Latitude
	 **/
	private String region = null;

	@ApiModelProperty(example = "NC", value = "Latitude")
	/**
	 * Latitude
	 **/
	private String region_code = null;

	@ApiModelProperty(example = "America/New_York", value = "Local IANA time zone")
	/**
	 * Local IANA time zone
	 **/
	private String timezone = null;

	/**
	 * Area Code
	 *
	 * @return areaCode
	 **/
	@JsonProperty("area_code")
	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public GeoIPObj areaCode(String areaCode) {
		this.areaCode = areaCode;
		return this;
	}

	/**
	 * Character encoding
	 *
	 * @return charset
	 **/
	@JsonProperty("charset")
	public String getCharset() {
		return charset;
	}

	public void setCharset(String charset) {
		this.charset = charset;
	}

	public GeoIPObj charset(String charset) {
		this.charset = charset;
		return this;
	}

	/**
	 * City Name
	 *
	 * @return city
	 **/
	@JsonProperty("city")
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public GeoIPObj city(String city) {
		this.city = city;
		return this;
	}

	/**
	 * Country Abbreviation
	 *
	 * @return continentCode
	 **/
	@JsonProperty("continent_code")
	public String getContinentCode() {
		return continentCode;
	}

	public void setContinentCode(String continentCode) {
		this.continentCode = continentCode;
	}

	public GeoIPObj continentCode(String continentCode) {
		this.continentCode = continentCode;
		return this;
	}

	/**
	 * Country Code (Short)
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

	/**
	 * Country
	 *
	 * @return countryCode
	 **/
	@JsonProperty("country")
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public GeoIPObj country(String country) {
		this.country = country;
		return this;
	}

	/**
	 * Country Code (Long)
	 *
	 * @return countryCode3
	 **/
	@JsonProperty("country_code3")
	public String getCountryCode3() {
		return countryCode3;
	}

	public void setCountryCode3(String countryCode3) {
		this.countryCode3 = countryCode3;
	}

	public GeoIPObj countryCode3(String countryCode3) {
		this.countryCode3 = countryCode3;
		return this;
	}

	/**
	 * Longitude
	 *
	 * @return dmaCode
	 **/
	@JsonProperty("dma_code")
	public String getDmaCode() {
		return dmaCode;
	}

	public void setDmaCode(String dmaCode) {
		this.dmaCode = dmaCode;
	}

	public GeoIPObj dmaCode(String dmaCode) {
		this.dmaCode = dmaCode;
		return this;
	}

	/**
	 * IP Address
	 *
	 * @return ip
	 **/
	@JsonProperty("ip")
	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public GeoIPObj ip(String ip) {
		this.ip = ip;
		return this;
	}

	/**
	 * State Abbreviation
	 *
	 * @return latitude
	 **/
	@JsonProperty("latitude")
	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public GeoIPObj latitude(String latitude) {
		this.latitude = latitude;
		return this;
	}

	/**
	 * City Name
	 *
	 * @return longitude
	 **/
	@JsonProperty("longitude")
	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public GeoIPObj longitude(String longitude) {
		this.longitude = longitude;
		return this;
	}

	/**
	 * Longitude
	 *
	 * @return metroCode
	 **/
	@JsonProperty("metro_code")
	public String getMetroCode() {
		return metroCode;
	}

	public void setMetroCode(String metroCode) {
		this.metroCode = metroCode;
	}

	public GeoIPObj metroCode(String metroCode) {
		this.metroCode = metroCode;
		return this;
	}

	/**
	 * UTC Offset (deprecated)
	 *
	 * @return offset
	 **/
	@JsonProperty("offset")
	public String getOffset() {
		return offset;
	}

	public void setOffset(String offset) {
		this.offset = offset;
	}

	public GeoIPObj offset(String offset) {
		this.offset = offset;
		return this;
	}

	/**
	 * Organization Name
	 *
	 * @return organization
	 **/
	@JsonProperty("organization")
	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public GeoIPObj organization(String organization) {
		this.organization = organization;
		return this;
	}

	/**
	 * Postal Code
	 *
	 * @return postalCode
	 **/
	@JsonProperty("postal_code")
	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public GeoIPObj postalCode(String postalCode) {
		this.postalCode = postalCode;
		return this;
	}

	/**
	 * Latitude
	 *
	 * @return region
	 **/
	@JsonProperty("region")
	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public GeoIPObj region(String region) {
		this.region = region;
		return this;
	}

	/**
	 * @return region_code
	 **/
	@JsonProperty("region_code")
	public String getRegionCode() {
		return region;
	}

	public void setRegionCode(String regionCode) {
		this.region_code = regionCode;
	}

	public GeoIPObj regionCode(String regionCode) {
		this.region_code = regionCode;
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

	public GeoIPObj timezone(String timezone) {
		this.timezone = timezone;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GeoIPObj {\n");

		sb.append("    areaCode: ").append(toIndentedString(areaCode)).append("\n");
		sb.append("    charset: ").append(toIndentedString(charset)).append("\n");
		sb.append("    city: ").append(toIndentedString(city)).append("\n");
		sb.append("    continentCode: ").append(toIndentedString(continentCode)).append("\n");
		sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
		sb.append("    countryCode3: ").append(toIndentedString(countryCode3)).append("\n");
		sb.append("    dmaCode: ").append(toIndentedString(dmaCode)).append("\n");
		sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
		sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
		sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
		sb.append("    metroCode: ").append(toIndentedString(metroCode)).append("\n");
		sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
		sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
		sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
		sb.append("    region: ").append(toIndentedString(region)).append("\n");
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
