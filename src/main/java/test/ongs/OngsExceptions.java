package test.ongs;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import core.BaseTest;

public class OngsExceptions extends BaseTest{

	Map<String, String> body = new HashMap<String, String>();
	
	@Test
	public void invalidEmail() {
		//Body json
		body.put("email", "testeonggmail.com");
		body.put("password", "teste123");
		body.put("name", "Teste");
		body.put("address", "Rua Teste");
		body.put("number", "4241");
		body.put("ddd", "81");
		body.put("phone", "888888888");
		body.put("cpf", "11111111111");
		setBody(body, "ongs");
		
		Assert.assertEquals(400, getStatusCode());
		Assert.assertEquals("Email informado é invalido!", getBody());
	}
	
	@Test
	public void existingEmail() {
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
		Assert.assertEquals(400, getStatusCode());
		Assert.assertEquals("Já existe uma conta com esse email!", getBody());
	}
	
	@Test
	public void weakPassword() {
		//Body json
		body.put("email", "testeong@gmail.com");
		body.put("password", "tes");
		body.put("name", "Teste");
		body.put("address", "Rua Teste");
		body.put("number", "4241");
		body.put("ddd", "81");
		body.put("phone", "888888888");
		body.put("cpf", "11111111111");
		setBody(body, "ongs");
		
		//validando retorno
		Assert.assertEquals(400, getStatusCode());
		Assert.assertEquals("Senha muito fraca!", getBody());
	}
}
