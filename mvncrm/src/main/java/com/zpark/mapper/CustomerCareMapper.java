package com.zpark.mapper;

import com.zpark.pojo.CustomerCare;
import com.zpark.pojo.CustomerCareExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerCareMapper {
    int countByExample(CustomerCareExample example);

    int deleteByExample(CustomerCareExample example);

    int deleteByPrimaryKey(Integer careId);

    int insert(CustomerCare record);

    int insertSelective(CustomerCare record);

    List<CustomerCare> selectByExample(CustomerCareExample example);

    CustomerCare selectByPrimaryKey(Integer careId);

    int updateByExampleSelective(@Param("record") CustomerCare record, @Param("example") CustomerCareExample example);

    int updateByExample(@Param("record") CustomerCare record, @Param("example") CustomerCareExample example);

    int updateByPrimaryKeySelective(CustomerCare record);

    int updateByPrimaryKey(CustomerCare record);

	List<CustomerCare> list();
}