package com.hg.auth;

import org.springframework.stereotype.Component;

@Component
public class AuthHystrixClient implements AuthClient {

	@Override
	public String getMonitorMsg() {
		// TODO Auto-generated method stub
		return "getMonitorMsg failed ";
	}

}
