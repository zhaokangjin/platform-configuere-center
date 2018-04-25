package com.platform.i18n.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.alibaba.fastjson.JSON;
import com.platform.i18n.condition.InternationalCondition;

import entry.condition.Distinct;
import entry.condition.Page;
import entry.condition.Sorts;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@WebAppConfiguration
public class InternationalItemControllerTest {
	@Resource
	InternationalItemController internationalItemController;

	@Test
	public void test() {
		InternationalCondition internationalCondition = new InternationalCondition();
		List<String> distinctFields = new ArrayList<String>();
		distinctFields.add("internationalKey");
		distinctFields.add("remarks");
		distinctFields.add("internationalId");
		distinctFields.add("module");
		Distinct distinct = new Distinct(true, distinctFields);
		Page page = new Page(1, 15);
		Map<String, Boolean> fieldMap = new HashMap<String, Boolean>();
		fieldMap.put("module", true);
		Sorts sorts = new Sorts(fieldMap);
		// QueryCondition queryCondition=new
		// QueryCondition("internationalKey","button","=");
		internationalCondition.setDistinct(distinct);
		internationalCondition.setPage(page);
		internationalCondition.setSorts(sorts);
		// internationalCondition.setQueryCondition(queryCondition);
		internationalItemController.selectByExample(internationalCondition);
	}

	@Test
	public void insert() {
		internationalItemController.insert();
	}
}
