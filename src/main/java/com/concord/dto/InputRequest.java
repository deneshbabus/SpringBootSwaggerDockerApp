	package com.concord.dto;

import java.util.List;

import javax.validation.constraints.NotNull;


public class InputRequest {
	
	@NotNull
	private List<String> nos;

	public List<String> getNos() {
		return nos;
	}

	public void setNos(List<String> nos) {
		this.nos = nos;
	}

	
	
	
	

}
