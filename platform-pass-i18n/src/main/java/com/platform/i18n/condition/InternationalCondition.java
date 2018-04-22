package com.platform.i18n.condition;

import entry.condition.BaseCondition;

public class InternationalCondition extends BaseCondition{
	private static final long serialVersionUID = -1793332415252170868L;

    // 国际化ID >>>表字段 : INTERNATIONAL_ID
    private String internationalId;

    // 国际化键 >>>表字段 : INTERNATIONAL_KEY
    private String internationalKey;

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

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}
	
}
