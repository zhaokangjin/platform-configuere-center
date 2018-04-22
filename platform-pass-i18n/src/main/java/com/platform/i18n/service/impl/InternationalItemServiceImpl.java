package com.platform.i18n.service.impl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.platform.i18n.dto.InternationalItem;
import com.platform.i18n.dto.InternationalItemExample;
import com.platform.i18n.persistence.InternationalItemMapper;
import com.platform.i18n.service.InternationalItemService;
@Service
@Transactional
public class InternationalItemServiceImpl implements InternationalItemService{
	@Resource
	InternationalItemMapper internationalItemMapper;

	@Override
	public long countByExample(InternationalItemExample example) {
		InternationalItemExample examples =new InternationalItemExample();

		return 0;
	}

	@Override
	public int deleteByExample(InternationalItemExample example) {
		
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(String translationId) {
		
		return 0;
	}

	@Override
	public int insert(InternationalItemExample record) {
		
		return 0;
	}

	@Override
	public int insertSelective(InternationalItemExample record) {
		
		return 0;
	}

	@Override
	public List selectByExample(InternationalItemExample example) {
		
		return null;
	}

	@Override
	public InternationalItem selectByPrimaryKey(String translationId) {
		
		return null;
	}

	@Override
	public int updateByExampleSelective(InternationalItemExample example) {
		
		return 0;
	}

	@Override
	public int updateByExample(InternationalItemExample example) {
		
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(InternationalItemExample record) {
		
		return 0;
	}

	@Override
	public int updateByPrimaryKey(InternationalItemExample record) {
		
		return 0;
	}
}
