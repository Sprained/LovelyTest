package core;


import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Map;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;

import org.json.simple.JSONObject;
import org.junit.Before;
import org.openqa.selenium.json.Json;

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
	
	//solicitação das rotas get
	public void get(String route) {
		response = request.get(route);
	}
	
	//solicitação rota post
	public void post(String route) {
		response = request.post(route);
	}
	
	//solicitação das rotas de delete
	public void delete(String route) {
		response = request.delete(route);
	}
	
	//setar valores do body json para mandar pra rota
	public void setBody(Map<String, String> map, String route) {
		json.putAll(map);
		request.body(json.toJSONString());
		post(route);
	}
	
	//up de imagem
	/*public void setImg(String route, String path) {
		BufferedImage imagem;
		imagem = ImageIO.read(new File(path));
		request.multiPart(path);
		post(route + "/-M8Qa6Hq5Gjd9BrF_7bl");
	}*/
	
	//recuperar body json de retorno
	public String getBody() {
		return response.getBody().asString().replace("\"", "");
	}
	
	
	//recuperar status code de retorno
	public int getStatusCode() {
		return response.getStatusCode();
	}
	
}
