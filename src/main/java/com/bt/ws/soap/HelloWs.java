package com.bt.ws.soap;

import org.apache.cxf.feature.Features;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
@Features(features="org.apache.cxf.feature.LoggingFeature")
public class HelloWs {
	
@WebMethod
	public String hello() {
		
		return "Hello";
	}
}
