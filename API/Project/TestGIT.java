
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;


public class TestGIT {
	
	String ssh_key;
	int id;
	// Declare request specification
	RequestSpecification requestSpec;
	final static String ROOT_URI = "https://api.github.com";
	@BeforeClass
	public void setUp() {
		requestSpec = new  RequestSpecBuilder()
			.setContentType(ContentType.JSON).addHeader("Authorization","token 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")
	        .setBaseUri(ROOT_URI).
			build();
		
		

	}
	
	@Test(priority=1)
	public void postMethod() {
	{
		ssh_key = "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQC57KXmTke5jvBTI277jJ8cl5dDcE6nA4W7fRlCh/lRdwOLzceY5ZMjHduEqUemIsm6wT3tNXBWsD7rp3ZjD3St6up4DTCEwfLKtoaTPYAxyWKBYHI6OAZNLlZ32peD1+1uAqV5DuYSbJZujYdsdpZ1DjbEAWgxSn7keAsKDQ0a8urhkASd4teYvXUF3J6jrs7hnl6S/4vGIzZs1GE5aQ1NbtyIOna5jG2j5YHQ9SzDmc0r8RQviPcOWPxCRDe88/pUAazdPbCa2P7JdXm7VOpT5OU1GRY6bP5STbWsRZZ5jnG2uyEddU5c1pUkgySf33UV+oGIuBYQ6z0ycQ5I1xBobmS8sjRjPXCfsLIqT6L4Z8wMVpqn6FHNa2o81477TN3J2Qh0ZqcA+loYwE/V2vXI3Uzalv5KqHuaaeUxjvBF2Cc/0sEBx/kt/K9777myS002fA7q6DOi12tUodqguaLGMTkibAej7F4m1FGry/7Qn5pF/6yFMLx+FllJWrcxB3U=";
		System.out.println(ssh_key);
		  String reqBody = "{\"title\": \"My_Key\",\"key\": \""+ssh_key+"\"}";
		  System.out.println(reqBody);
	    Response response = 
	        given().spec(requestSpec) // Use requestSpec
	        .body(reqBody)
	        .when().post(ROOT_URI+"/user/keys");
	 
	    // Print response
	    String body = response.getBody().asPrettyString();
	    System.out.println(body);
	 
	    // Assertion
	    response.then().statusCode(201);
	}
	}
	
	@Test(priority=2)
	public void bgetMethod() {
		Response response = 
		        given().spec(requestSpec)
		        .when().get(ROOT_URI+"/user/keys");
		
		String body = response.getBody().asPrettyString();
		System.out.println(body);
		
		id = response.then().extract().path("[0].id");
		System.out.println(id);
		response.then().statusCode(200);
		       
	}
	
	@Test(priority=3)
	public void cdeleteMethod() {
		Response response = 
		        given().spec(requestSpec)
		        .when()
		        .pathParam("keyId", id)
		        .delete(ROOT_URI+"/user/keys/{keyId}");
		
		
		String body = response.getBody().asPrettyString();
		System.out.println(body);
		
		response.then().statusCode(204);
		       
	}
}
