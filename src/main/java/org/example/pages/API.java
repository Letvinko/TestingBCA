package org.example.pages;

import io.restassured.response.Response;
import io.restassured.RestAssured;
import org.testng.Assert;

public class API {
    String ResponseAPI;

    public void hitAPI(String url, String request) {
        if(request.contains("Get user")){
            url = url + "/api/users/2";
        }
        Response response = RestAssured.get(url);
        setResponseAPI(response.getBody().asString());
    }

    public void validateResponse(String keyword){
        Assert.assertEquals(getResponseAPI().contains(keyword),true);
    }

    public String getResponseAPI() {
        return ResponseAPI;
    }

    public void setResponseAPI(String responseAPI) {
        ResponseAPI = responseAPI;
    }
}
