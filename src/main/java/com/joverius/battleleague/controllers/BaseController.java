package com.joverius.battleleague.controllers;

import java.util.Properties;

public class BaseController {
	
	private static Properties apiProperties;
	private static Properties systemProperties;
	
	public static Properties getApiProperties() {
        return apiProperties;
    }

    public static Properties getSystemProperties() {
        return systemProperties;
    }
	
	

}
