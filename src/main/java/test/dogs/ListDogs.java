package test.dogs;

import org.junit.Assert;
import org.junit.Test;

import core.BaseTest;

public class ListDogs extends BaseTest {
	
	@Test
	public void index() {
		//chamando rota
		get("dogs");
		
		//validando retornos
		Assert.assertEquals(200, getStatusCode());
		Assert.assertTrue(getBody(), true);
	}
}
