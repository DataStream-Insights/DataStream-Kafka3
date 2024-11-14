package com.wnsud9771.service.filtering;

import org.springframework.stereotype.Service;

import com.wnsud9771.dto.filtering.ValueSuccessAndFailDTO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FilterOperationService {
	private final String fail = "fail";
	private final String success = "success";
	
	
	//--------------------------------(eqauls)------------------------------------------------------------------
	
	public ValueSuccessAndFailDTO operationEqauls(String logvalue, String filtervalue) {
		if(logvalue == filtervalue) {
			ValueSuccessAndFailDTO dto = new ValueSuccessAndFailDTO();
			String data = logvalue + "=" + filtervalue;
			dto.setValue(data);
			dto.setSuccessorfail(success);
			return dto;
		}
		else{
			ValueSuccessAndFailDTO dto = new ValueSuccessAndFailDTO();
			String data = logvalue + "!=" + filtervalue;
			dto.setValue(data);
			dto.setSuccessorfail(fail);
			return dto;
		}

	}
	
	
	
	//------------------------------------------------------------------------------------------------------------------------
	
	
	
	
	
	
	
	//------------------------------------(not_equals)-----------------------------------------------------------
	
	public void operationNotEquals() {
		
	}

	//------------------------------------------------------------------------------------------------------------------------
	
	
	
	
	
	
	//------------------------------------(greater_than) 보다 큰---------------------------------------------------------
	
	public void operationGreaterThan() {
		
	}
	//------------------------------------------------------------------------------------------------------------------------
	
	
	
	
	
	
	//------------------------------------(less_than) 보다 작은 ---------------------------------------------------------
	
	public void operationLessThan() {
		
	}

	//------------------------------------------------------------------------------------------------------------------------
	
	
	
	
	
	
	//------------------------------------(greater_equals) 보다 크거나 같은---------------------------------------------------------
	public void operationGreaterEquals() {
		
	}
	
	//------------------------------------------------------------------------------------------------------------------------
	
	
	
	
	
	//------------------------------------(less_equals )보다 작거나 같은---------------------------------------------------------
	
	public void opertaionLessEquals() {
		
	}

	//------------------------------------------------------------------------------------------------------------------------
}
