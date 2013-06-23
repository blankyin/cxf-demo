package com.blankyin.handler;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.ws.security.WSPasswordCallback;

public class ServerPasswordCallback implements CallbackHandler {

	@Override
	public void handle(Callback[] callbacks) throws IOException,
			UnsupportedCallbackException {
		System.out.println("WSS4j ServerPasswordCallback start ......");

		WSPasswordCallback pc = (WSPasswordCallback) callbacks[0];
		String identifier = pc.getIdentifier();
		String password = pc.getPassword(); // 注意：此处password返回为空

		/**
		 * 可以根据identifier到数据库查询对应的密码，然后调用pc.setPassword(XXXX)传入查询到的密码:<br>
		 * 即：pc.setPassword(db.getPassword(identifier))<br>
		 * WSS4j会验证传入的密码和数据库中的密码是否一致<br>
		 */
		if ("admin".equals(identifier)) {
			pc.setPassword("123456");
		} else {
			throw new SecurityException("验证失败");
		}

		System.out.println("WSS4j ServerPasswordCallback end ......");
	}

}
