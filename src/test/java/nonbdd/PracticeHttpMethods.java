package nonbdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PracticeHttpMethods {
	@Test(enabled = false)	
	public void getAllEmployees() {
		
		RestAssured.baseURI="https://dummy.restapiexample.com/";
		RequestSpecification requestSpecification= RestAssured.given();
		Response response=requestSpecification.request(Method.GET,"api/v1/employees");
		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusLine());
	
	}
	@Test(enabled=false)
	public void postDetail() {
		
		RestAssured.baseURI="https://dummy.restapiexample.com/";
		RequestSpecification requestSpecification=RestAssured.
				given().header("Content-Type","application/json")
				.body("{\r\n"
					    +" \"id\": \"39\",\r\n"

    +" \"employee_name\": \"Amal\",\r\n"
    +" \"employee_salary\": \"40000\",\r\n"

   +"\"employee_age\": \"25\",\r\n"
   +"\"employee_image\": \"\",\r\n"

   +"\r\n"
+"}");
		Response response=requestSpecification.request(Method.POST, "api/v1/create");
		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusLine());
		
	}
	@Test(enabled = false)
	public void updateDetails() {
		
		RestAssured.baseURI="https://dummy.restapiexample.com/";
		RequestSpecification requestSpecification=RestAssured.given().header("Content-Type","application/json")
				.body("{\r\n"
						+" \"id\": \"23\",\r\n"

    +" \"employee_name\": \"Aaron\",\r\n"
    +" \"employee_salary\": \"45000\",\r\n"

   +"\"employee_age\": \"26\",\r\n"
   +"\"employee_image\": \"\",\r\n"
				+	"}");
		
		Response response=requestSpecification.request(Method.PUT,"public/api/v1/update/21");
		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusLine());
		
	}
	
	@Test(enabled=false)
	public void getAllDetails() {
		RestAssured.baseURI="https://dummy.restapiexample.com/";
		RequestSpecification requestSpecification=RestAssured.given();
		
		Response response=requestSpecification.request(Method.DELETE,"public/api/v1/delete/2");
		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusLine());
	}
	@Test
	public void getAEmployee() {
		RestAssured.baseURI="https://dummy.restapiexample.com/";
		RequestSpecification reqSpecification=RestAssured.given();
		Response response=reqSpecification.request(Method.GET,"api/v1/employee/1");
		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusLine());
	}

}

