package com.blankyin.handler;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.ws.security.WSPasswordCallback;

public class ClientPasswordCallback implements CallbackHandler {

	public void handle(Callback[] callbacks) throws IOException,
			UnsupportedCallbackException {
		System.out.println("WSS4j ClientPasswordCallback start ......");
		
		WSPasswordCallback pc = (WSPasswordCallback) callbacks[0];
		pc.setIdentifier("admin");
		pc.setPassword("123456");

		System.out.println("WSS4j ClientPasswordCallback end ......");
	}

}
