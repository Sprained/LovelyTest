package test;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import core.BaseTest;

public class Users extends BaseTest{
	
	Map<String, String> body = new HashMap<String, String>();
	
	@After
	public void end() {
		body.clear();
	}
	
	@Test
	public void create() {
		
		//Body json
		body.put("email", "testeemail2@gmail.com");
		body.put("password", "teste123");
		body.put("name", "Teste2");
		body.put("address", "Rua Teste2");
		body.put("number", "4241");
		body.put("ddd", "81");
		body.put("phone", "999999999");
		setBody(body, "users");
		
		//validando retorno
		Assert.assertEquals(200, getStatusCode());
		Assert.assertEquals("Cadastro realizado com sucesso!", getBody());
	}
	
	@Test
	public void invalidEmail() {
		
		//Body json
		body.put("email", "testeemail2gmail.com");
		body.put("password", "teste123");
		body.put("name", "Teste2");
		body.put("address", "Rua Teste2");
		body.put("number", "4241");
		body.put("ddd", "81");
		body.put("phone", "999999999");
		setBody(body, "users");
		
		//validando retorno
		Assert.assertEquals(400, getStatusCode());
		Assert.assertEquals("Email informado é invalido!", getBody());
	}
	
	@Test
	public void existingEmail() {
		
		//Body json
		body.put("email", "testeemail2@gmail.com");
		body.put("password", "teste123");
		body.put("name", "Teste2");
		body.put("address", "Rua Teste2");
		body.put("number", "4241");
		body.put("ddd", "81");
		body.put("phone", "999999999");
		setBody(body, "users");
		
		//validando retorno
		Assert.assertEquals(400, getStatusCode());
		Assert.assertEquals("Já existe uma conta com esse email!", getBody());
	}
	
	@Test
	public void weakPassword() {
		
		//Body json
		body.put("email", "testeemail2@gmail.com");
		body.put("password", "tes");
		body.put("name", "Teste2");
		body.put("address", "Rua Teste2");
		body.put("number", "4241");
		body.put("ddd", "81");
		body.put("phone", "999999999");
		setBody(body, "users");
		
		//validando retorno
		Assert.assertEquals(400, getStatusCode());
		Assert.assertEquals("Senha muito fraca!", getBody());
	}

}
