package test.cats;

import org.junit.Assert;
import org.junit.Test;

import core.BaseTest;

public class ListCats extends BaseTest {
	
	@Test
	public void index() {
		//chamando rota
		get("cats");
		
		//validando retornos
		Assert.assertEquals(200, getStatusCode());
		Assert.assertTrue(getBody(), true);
	}
}
