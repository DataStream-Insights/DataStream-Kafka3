package com.wnsud9771.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import com.wnsud9771.dto.FormatIdDTO;

@Mapper
public interface UserMapper {
	@Insert("INSERT INTO filter_record (format_id, filter_id) VALUES (#{formatId}, #{filterId})")
	void save(String formatId, String filterId);

}
