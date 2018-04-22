package com.platform.i18n.persistence;

import com.platform.i18n.dto.International;
import com.platform.i18n.dto.InternationalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InternationalMapper {
    long countByExample(InternationalExample example);

    int deleteByExample(InternationalExample example);

    int deleteByPrimaryKey(String internationalId);

    int insert(International record);

    int insertSelective(International record);

    List<International> selectByExample(InternationalExample example);

    International selectByPrimaryKey(String internationalId);

    int updateByExampleSelective(@Param("record") International record, @Param("example") InternationalExample example);

    int updateByExample(@Param("record") International record, @Param("example") InternationalExample example);

    int updateByPrimaryKeySelective(International record);

    int updateByPrimaryKey(International record);
}