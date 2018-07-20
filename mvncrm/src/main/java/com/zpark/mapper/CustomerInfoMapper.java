package com.zpark.mapper;

import com.zpark.pojo.CustomerInfo;
import com.zpark.pojo.CustomerInfoExample;
import com.zpark.utils.Part;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerInfoMapper {
    int countByExample(CustomerInfoExample example);

    int deleteByExample(CustomerInfoExample example);

    int deleteByPrimaryKey(Integer customerId);

    int insert(CustomerInfo record);

    int insertSelective(CustomerInfo record);

    List<CustomerInfo> selectByExample(CustomerInfoExample example);

    CustomerInfo selectByPrimaryKey(Integer customerId);

    int updateByExampleSelective(@Param("record") CustomerInfo record, @Param("example") CustomerInfoExample example);

    int updateByExample(@Param("record") CustomerInfo record, @Param("example") CustomerInfoExample example);

    int updateByPrimaryKeySelective(CustomerInfo record);

    int updateByPrimaryKey(CustomerInfo record);

	List<CustomerInfo> list();

	List<CustomerInfo> list2(HashMap<String, Object> queryMap);

	long countByCodition(HashMap<String, Object> queryMap);

	List<CustomerInfo> getByCondition(HashMap<String, Object> queryMap);

	CustomerInfo getById(Integer id);

	List<Part> getPart();
}