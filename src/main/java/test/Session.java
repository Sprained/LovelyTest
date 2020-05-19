package test;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import core.BaseTest;

public class Session extends BaseTest{
	
	Map<String, String> body = new HashMap<String, String>();
	
	@After
	public void end() {
		body.clear();
	}

	@Test
	public void creatSession() {
		
		//Body json
		body.put("email", "testeemail@gmail.com");
		body.put("password", "teste123");
		setBody(body, "session");
		
		//validando retorno
		Assert.assertEquals(200, getStatusCode());
	}
	
}
