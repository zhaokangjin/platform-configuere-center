package com.platform.i18n.dto;

public class Timezone {
    // 国家编码 >>>表字段 : COUNTRY_CODE
    private String countryCode;

    // 时区 >>>表字段 : TIMEZONE
    private String timezone;

    // 国家名称 >>>表字段 : COUNTRY_NAME
    private String countryName;

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}