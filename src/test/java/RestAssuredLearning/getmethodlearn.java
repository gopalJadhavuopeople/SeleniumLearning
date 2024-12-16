package RestAssuredLearning;


import api.com.models.Post;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;


import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import static org.hamcrest.Matchers.*;
public class getmethodlearn {

   @Test
    public void getmethodtest() throws JsonProcessingException {

       // Setting the base URI for the API
       RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

       // Making a GET request to the endpoint '/posts'
               Response response = RestAssured.given()
               .when()
               .get("/posts/1").then().log().all().extract().response();

               //assert status code
       Assert.assertEquals(response.getStatusCode(),200);

       //Deserialise and vaidate field

       ObjectMapper mapper = new ObjectMapper();
       String jsonResponse = response.asString();

       Post postObj = mapper.readValue(jsonResponse,Post.class);

       Assert.assertEquals(postObj.getId(),1);
       Assert.assertEquals(postObj.getUserId(),1);
       Assert.assertEquals(postObj.getTitle(),"sunt aut facere repellat provident occaecati excepturi optio reprehenderit");
       Assert.assertEquals(postObj.getBody(),"quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto");


















   }
}
