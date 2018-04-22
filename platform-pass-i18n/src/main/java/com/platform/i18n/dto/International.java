package com.platform.i18n.dto;

public class International {
    // 国际化ID >>>表字段 : INTERNATIONAL_ID
    private String internationalId;

    // 国际化键 >>>表字段 : INTERNATIONAL_KEY
    private String internationalKey;

    // 备注 >>>表字段 : REMARKS
    private String remarks;

    // 模块—国际化分类 >>>表字段 : MODULE
    private String module;

    public String getInternationalId() {
        return internationalId;
    }

    public void setInternationalId(String internationalId) {
        this.internationalId = internationalId;
    }

    public String getInternationalKey() {
        return internationalKey;
    }

    public void setInternationalKey(String internationalKey) {
        this.internationalKey = internationalKey;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }
}