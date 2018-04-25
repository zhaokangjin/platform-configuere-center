package com.platform.i18n.service;

import java.util.List;

import com.platform.i18n.dto.InternationalItem;
import com.platform.i18n.dto.InternationalItemExample;

public interface InternationalItemService{
	public long countByExample(InternationalItemExample example);

	public int deleteByExample(InternationalItemExample example);

	public int deleteByPrimaryKey(String translationId);

	public int insert(InternationalItem record);

	public int insertSelective(InternationalItemExample record);

	public List<InternationalItem> selectByExample(InternationalItemExample example);

	public InternationalItem selectByPrimaryKey(String translationId);

	public int updateByExampleSelective(InternationalItemExample example);

	public int updateByExample(InternationalItemExample example);

	public int updateByPrimaryKeySelective(InternationalItemExample record);

	public int updateByPrimaryKey(InternationalItemExample record);
}
