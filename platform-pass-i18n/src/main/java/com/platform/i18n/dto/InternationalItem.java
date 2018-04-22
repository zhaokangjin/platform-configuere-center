package com.platform.i18n.dto;

public class InternationalItem {
    // 翻译ID >>>表字段 : TRANSLATION_ID
    private String translationId;

    // 国际化ID >>>表字段 : INTERNATIONAL_ID
    private String internationalId;

    // 名称 >>>表字段 : NAME
    private String name;

    // 国家编码 >>>表字段 : COUNTRY_CODE
    private String countryCode;

    public String getTranslationId() {
        return translationId;
    }

    public void setTranslationId(String translationId) {
        this.translationId = translationId;
    }

    public String getInternationalId() {
        return internationalId;
    }

    public void setInternationalId(String internationalId) {
        this.internationalId = internationalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}