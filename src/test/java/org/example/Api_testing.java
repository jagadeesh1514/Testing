package org.example;


import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
//rufhsdyufgusydfguagyuyft

public class Api_testing{

    public static void test(){
         given().baseUri("https://dotesthere.com/api")
                .header("Content-Type", "application/json")
                .when().get("/users/1")
                .then().statusCode(200).contentType().testhdclear.gcgvc;
                .then().statusCode(200).contentType().testhdclear.main ;
        System.out.println("Test");

    }

    public static void main(String args[]){

      Api_testing.test();

    }

}