package com.platform.i18n.persistence;

import com.platform.i18n.dto.Timezone;
import com.platform.i18n.dto.TimezoneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TimezoneMapper {
    long countByExample(TimezoneExample example);

    int deleteByExample(TimezoneExample example);

    int deleteByPrimaryKey(String countryCode);

    int insert(Timezone record);

    int insertSelective(Timezone record);

    List<Timezone> selectByExample(TimezoneExample example);

    Timezone selectByPrimaryKey(String countryCode);

    int updateByExampleSelective(@Param("record") Timezone record, @Param("example") TimezoneExample example);

    int updateByExample(@Param("record") Timezone record, @Param("example") TimezoneExample example);

    int updateByPrimaryKeySelective(Timezone record);

    int updateByPrimaryKey(Timezone record);
}