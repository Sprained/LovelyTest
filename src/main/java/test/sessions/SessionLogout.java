package test.sessions;

import org.junit.Assert;
import org.junit.Test;

import core.BaseTest;

public class SessionLogout extends BaseTest{
	
	@Test
	public void logOut() {
		//fazendo logout
		delete("session");
		
		//validando retorno
		Assert.assertEquals(200, getStatusCode());
	}
}
