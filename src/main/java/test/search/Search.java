package test.search;

import org.junit.Assert;
import org.junit.Test;

import core.BaseTest;

public class Search extends BaseTest {
	
	@Test
	public void index() {
		//chamando rota
		get("search");
		
		//validando retornos
		Assert.assertEquals(200, getStatusCode());
		Assert.assertTrue(getBody(), true);
	}
}
