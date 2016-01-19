package com.joverius.battleleague.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.joverius.battleleague.entities.BaseEntity;

public class RestResponseAssembler {
	
	public static ResponseEntity<BaseEntity> getResponse(BaseEntity baseEntity) {
		
		ResponseEntity<BaseEntity> response = null;
        HttpStatus http_status = null;
        
        if (baseEntity != null) {
        	
        	if (baseEntity.getCode() != null) {
        		http_status = HttpStatus.valueOf(baseEntity.getCode());
        	}
        	else {
        		http_status = HttpStatus.OK;
        	}
        	
        	if (baseEntity.getResults().isEmpty()) {
        		
        	}
        	
        	response = new ResponseEntity<BaseEntity>(baseEntity, http_status);
        	
        }	
		return response;
		
	}

}
