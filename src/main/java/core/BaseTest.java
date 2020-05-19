package core;


import java.util.Map;

import org.json.simple.JSONObject;
import org.junit.Before;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseTest {
	private static RequestSpecification request;
	private JSONObject json = new JSONObject();
	private Response response;
	
	@Before
	public void initialize() {
		RestAssured.baseURI = "http://localhost:3333";
		request = RestAssured.given();
		request.header("Content-Type", "application/json");
	}
	
	//setar valores do body json para mandar pra rota
	public void setBody(Map<String, String> map, String route) {
		json.putAll(map);
		request.body(json.toJSONString());
		response = request.post(route);
	}
	
	//recuperar body json de retorno
	public String getBody() {
		return response.getBody().asString().replace("\"", "");
	}
	
	
	//recuperar status code de retorno
	public int getStatusCode() {
		return response.getStatusCode();
	}
	
}
