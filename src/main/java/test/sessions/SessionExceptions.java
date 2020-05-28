package test.sessions;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import core.BaseTest;

public class SessionExceptions extends BaseTest{
	
Map<String, String> body = new HashMap<String, String>();
	
	@After
	public void end() {
		body.clear();
	}

	@Test
	public void wrongEmail() {
		
		//Body json
		body.put("email", "testeemai@gmail.com");
		body.put("password", "teste123");
		setBody(body, "session");
		
		//validando retorno
		Assert.assertEquals(400, getStatusCode());
		Assert.assertEquals("Email não cadastrado!", getBody());
	}
	
	@Test
	public void wrongPassowrd() {
		
		//Body json
		body.put("email", "testeemail@gmail.com");
		body.put("password", "teste12");
		setBody(body, "session");
		
		//validando retorno
		Assert.assertEquals(400, getStatusCode());
		Assert.assertEquals("Email ou senha incorretos!", getBody());
	}
	
}
