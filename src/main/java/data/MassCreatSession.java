package data;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import core.BaseTest;

public class MassCreatSession extends BaseTest {
	
	Map<String, String> body = new HashMap<String, String>();
	
	@Test
	public void massCreateSessionUser() {
		//Body json
		body.put("email", "testeemail@gmail.com");
		body.put("password", "teste123");
		body.put("name", "Teste2");
		body.put("address", "Rua Teste2");
		body.put("number", "4241");
		body.put("ddd", "81");
		body.put("phone", "999999999");
		setBody(body, "users");
	}

}
