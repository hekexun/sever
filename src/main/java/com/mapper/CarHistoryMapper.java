package com.mapper;

import org.apache.ibatis.annotations.Param;

import com.vo.req.LocationMsg.LocationInfo;

public interface CarHistoryMapper {

	int insertCarHistory(@Param(value = "locationInfo") LocationInfo locationInfo);
}
