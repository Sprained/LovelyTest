package test.middlewares;

import org.junit.Assert;
import org.junit.Test;

import core.BaseTest;

public class AuthMiddleware extends BaseTest {

	@Test
	public void userNotLogged() {
		//requisitar rota
		get("dogs");
		
		//validando retorno
		Assert.assertEquals(400, getStatusCode());
		Assert.assertEquals("Usuario não logado!", getBody());
	}
}
