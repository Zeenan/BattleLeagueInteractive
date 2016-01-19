package com.joverius.battleleague.entities;

import java.util.List;

public class BaseEntity {
	
	protected Integer code;
	protected Integer status;
	protected List results;
	
	public BaseEntity() {
		
		super();
		
	}
	
	public BaseEntity(List results) {
		
		super();
		this.results = results;
		
	}
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public List getResults() {
		return results;
	}
	public void setResults(List results) {
		this.results = results;
	}

}
