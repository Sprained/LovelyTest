package test.ongs;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import core.BaseTest;

public class Ongs extends BaseTest {
	
	Map<String, String> body = new HashMap<String, String>();
	
	@After
	public void end() {
		body.clear();
	}
	
	@Test
	public void create() {
		
		//Body json
		body.put("email", "testeong@gmail.com");
		body.put("password", "teste123");
		body.put("name", "Teste");
		body.put("address", "Rua Teste");
		body.put("number", "4241");
		body.put("ddd", "81");
		body.put("phone", "888888888");
		body.put("cpf", "11111111111");
		setBody(body, "ongs");
		
		//validando retorno
		Assert.assertEquals(200, getStatusCode());
		Assert.assertEquals("Cadastro realizado com sucesso!", getBody());
	}

}
