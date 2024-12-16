package RestAssuredLearning;


import RestAssuredLearning.ResponsePOJO.getSingleUserResponse;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class GetSingleUserDataApiTest {

    getSingleUserResponse getsingleuserresponse;

    @Test
    public void getSingleUser() {
        RestAssured.baseURI = "https://reqres.in";
        Response response = RestAssured.given()
                .when()
                .get("/api/users/2").then().log().all().extract().response();

        int statuscode = response.getStatusCode();
        System.out.println("Status Code : " + statuscode);

        getsingleuserresponse = response.as(getSingleUserResponse.class);
        System.out.println(getsingleuserresponse.getData().getFirst_name());
        System.out.println(getsingleuserresponse.getData().getId());
        System.out.println(getsingleuserresponse.getData().getLast_name());
        System.out.println(getsingleuserresponse.getData().getEmail());


    }
}