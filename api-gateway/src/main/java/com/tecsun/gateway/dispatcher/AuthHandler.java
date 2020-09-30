package com.tecsun.gateway.dispatcher;

import org.apache.servicecomb.core.Handler;
import org.apache.servicecomb.core.Invocation;
import org.apache.servicecomb.swagger.invocation.AsyncResponse;
import org.apache.servicecomb.swagger.invocation.exception.InvocationException;

/**
 * @类功能说明： 鉴权处理链
 * @类路径: com.tecsun.gateway.dispatcher
 * @公司名称：广东德生科技有限公司
 * @作者：chenjw
 * @创建时间：2020/9/30 10:00
 * @版本：V1.0
 */
public class AuthHandler implements Handler {
	@Override
	public void handle(Invocation invocation, AsyncResponse asyncResponse) throws Exception {

		if (invocation.getOperationMeta().getOperationPath().contains("login")) {
			// login：return session id, set cookie by javascript
			System.out.println("登录=============================");
			invocation.next(asyncResponse);
		} else {
			// check session
			String sessionId = invocation.getContext("session-id");
			if (sessionId == null) {
				throw new InvocationException(403, "", "session is not valid.");
			}
		}

//		if (invocation.getContext("session-id") == null){
//			//未登录情况
//			System.out.println("未登录==============================");
//			asyncResponse.complete(Response.failResp(new InvocationException(403, "", "session is not valid.")));
//			return;
//		}
//		//下个处理链
//		System.out.println("鉴权检验通过===========");
//		invocation.next(asyncResponse);
	}
}
