package com.wnsud9771.dto.filtering;

import lombok.Data;

@Data
public class FilterConditionDTO {
	private String andOr;
	private String operation;
	private String path;
	private String value;
}
