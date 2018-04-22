package com.platform.i18n.persistence;

import com.platform.i18n.dto.InternationalItem;
import com.platform.i18n.dto.InternationalItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InternationalItemMapper {
    long countByExample(InternationalItemExample example);

    int deleteByExample(InternationalItemExample example);

    int deleteByPrimaryKey(String translationId);

    int insert(InternationalItem record);

    int insertSelective(InternationalItem record);

    List<InternationalItem> selectByExample(InternationalItemExample example);

    InternationalItem selectByPrimaryKey(String translationId);

    int updateByExampleSelective(@Param("record") InternationalItem record, @Param("example") InternationalItemExample example);

    int updateByExample(@Param("record") InternationalItem record, @Param("example") InternationalItemExample example);

    int updateByPrimaryKeySelective(InternationalItem record);

    int updateByPrimaryKey(InternationalItem record);
}