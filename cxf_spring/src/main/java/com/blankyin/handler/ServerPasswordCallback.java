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
		String password = pc.getPassword(); // ע�⣺�˴�password����Ϊ��

		/**
		 * ���Ը���identifier�����ݿ��ѯ��Ӧ�����룬Ȼ�����pc.setPassword(XXXX)�����ѯ��������:<br>
		 * ����pc.setPassword(db.getPassword(identifier))<br>
		 * WSS4j����֤�������������ݿ��е������Ƿ�һ��<br>
		 */
		if ("admin".equals(identifier)) {
			pc.setPassword("123456");
		} else {
			throw new SecurityException("��֤ʧ��");
		}

		System.out.println("WSS4j ServerPasswordCallback end ......");
	}

}
