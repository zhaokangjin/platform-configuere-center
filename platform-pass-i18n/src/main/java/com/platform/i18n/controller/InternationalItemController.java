package com.platform.i18n.controller;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.platform.configure.ResourceReader;
import com.platform.configure.entry.Country;
import com.platform.configure.entry.TimeZone;
import com.platform.i18n.condition.InternationalCondition;
import com.platform.i18n.dto.InternationalItem;
import com.platform.i18n.dto.InternationalItemExample;
import com.platform.i18n.dto.InternationalItemExample.Criteria;
import com.platform.i18n.service.InternationalItemService;

import entry.condition.Distinct;
import entry.condition.Page;
import entry.condition.QueryCondition;
import entry.condition.Sorts;
import entry.result.ResultDto;
@RestController
@RequestMapping("internationalItem")
public class InternationalItemController {
	@Resource
	InternationalItemService internationalItemService;
	
	@RequestMapping(value="/countByExample",method={RequestMethod.POST,RequestMethod.GET})
	public ResultDto<InternationalItem> countByExample(@RequestBody Map<String,Object> paramMap) {
		return null;
	}
	@RequestMapping(value="/deleteByExample",method={RequestMethod.DELETE,RequestMethod.POST})
	public ResultDto<InternationalItem> deleteByExample() {
		return null;
	}
	@RequestMapping(value="/deleteByPrimaryKey",method={RequestMethod.DELETE,RequestMethod.POST})
	public ResultDto<InternationalItem> deleteByPrimaryKey(String translationId) {
		return null;
	}
	@RequestMapping(value="/insert",method={RequestMethod.POST})
	public ResultDto<InternationalItem> insert() {
		return null;
	}
	@RequestMapping(value="/insertSelective",method={RequestMethod.POST})
	public ResultDto<InternationalItem> insertSelective() {
		return null;
	}
	@RequestMapping(value="/selectByExample",method={RequestMethod.GET})
	public ResultDto<InternationalItem> selectByExample(InternationalCondition InternationalCondition) {
		List<Country> a=ResourceReader.countryGlobalList;
		List<TimeZone> b=ResourceReader.timeZoneGlobalList;
		InternationalItemExample internationalItemExample=new InternationalItemExample();
//		internationalItemExample=change(internationalItemExample,InternationalCondition);
		internationalItemService.selectByExample(internationalItemExample);
		return null;
	}
	@RequestMapping(value="/selectByPrimaryKey",method={RequestMethod.GET})
	public ResultDto<InternationalItem> selectByPrimaryKey(String translationId) {
		return null;
	}
	@RequestMapping(value="/updateByExampleSelective",method={RequestMethod.PUT,RequestMethod.POST})
	public ResultDto<InternationalItem> updateByExampleSelective() {
		return null;
	}
	@RequestMapping(value="/updateByExample",method={RequestMethod.PUT,RequestMethod.POST})
	public ResultDto<InternationalItem> updateByExample() {
		return null;
	}
	@RequestMapping(value="/updateByPrimaryKeySelective",method={RequestMethod.PUT,RequestMethod.POST})
	public ResultDto<InternationalItem> updateByPrimaryKeySelective() {
		return null;
	}
	@RequestMapping(value="/updateByPrimaryKey",method={RequestMethod.PUT,RequestMethod.POST})
	public ResultDto<InternationalItem> updateByPrimaryKey() {
		return null;
	}
}
