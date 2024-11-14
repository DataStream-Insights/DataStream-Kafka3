package com.wnsud9771.service.mybatis;

import org.springframework.stereotype.Service;

import com.wnsud9771.dto.CampaignIdFormatIdDTO;
import com.wnsud9771.dto.FormatIdFilterIdDTO;
import com.wnsud9771.mapper.UserMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MybatisService {
	private final UserMapper userMapper;
	
	public void failfilterTopic(FormatIdFilterIdDTO dto) {
		String formatid = dto.getFormatId();
		String filterid = dto.getFilterId();
		userMapper.save(formatid, filterid);
	}
}
