package test.middlewares;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import core.BaseTest;

public class OngMiddlewares extends BaseTest {
	
	Map<String, String> body = new HashMap<String, String>();
	
	@After
	public void end() {
		body.clear();
	}
	
	@Test
	public void userNotLogged() {
		//Body json
		body.put("name", "olokinho");
		body.put("race", "loko");
		body.put("age", "77");
		body.put("gender", "male");
		setBody(body, "dogs");
		
		//validando retorno
		Assert.assertEquals(400, getStatusCode());
		Assert.assertEquals("Usuario não é ong!", getBody());
	}
}
