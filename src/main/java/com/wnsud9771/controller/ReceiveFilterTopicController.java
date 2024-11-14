package com.wnsud9771.controller;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wnsud9771.dto.CampaignIdFormatIdFilterIdDTO;
import com.wnsud9771.dto.FormatIdFilterIdDTO;
import com.wnsud9771.event.FilterCreatedEvent;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/topics") 
@RequiredArgsConstructor 
@Slf4j
public class ReceiveFilterTopicController {
	private final ApplicationEventPublisher eventPublisher;
	
	@PostMapping("/filtering")
	public ResponseEntity<CampaignIdFormatIdFilterIdDTO> receiveUserFromFirstService(@RequestBody CampaignIdFormatIdFilterIdDTO dto) {
		log.info("받은 포맷 id : {}", dto.getFormatId());
		log.info("받은 필터링 id : {}", dto.getFilterId());
		log.info("받은 캠페인 id : {}", dto.getCampaignId());
		
		
		eventPublisher.publishEvent(new FilterCreatedEvent(this, dto));
		//createFormatTopicService.createTopicAndSendLog(formatIdDTO.getFormatId());
		
		return ResponseEntity.ok(dto);
	}
}
