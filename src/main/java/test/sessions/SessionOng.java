package test.sessions;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import core.BaseTest;

public class SessionOng extends BaseTest {
	Map<String, String> body = new HashMap<String, String>();
	
	@After
	public void end() {
		body.clear();
	}

	@Test
	public void creatSession() {
		
		//Body json
		body.put("email", "testeong@gmail.com");
		body.put("password", "teste123");
		setBody(body, "session");
		
		//validando retorno
		Assert.assertEquals(200, getStatusCode());
	}
}
