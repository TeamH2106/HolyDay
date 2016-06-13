package com.javaclasses;

import java.sql.*;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

import java.net.URI;
import java.net.URISyntaxException;

// import static spark.Spark.*;
// import spark.template.freemarker.FreeMarkerEngine;
// import spark.ModelAndView;
// import static spark.Spark.get;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.heroku.sdk.jdbc.DatabaseUrl;
// import static javax.measure.unit.SI.KILOGRAM;
// import javax.measure.quantity.Mass;
// import org.jscience.physics.model.RelativisticModel;
// import org.jscience.physics.amount.Amount;

@Controller
@EnableAutoConfiguration
public class MainClass {

  @RequestMapping("/")
  @ResponseBody
  public String home() {
        return "HELLO2 , HEROKU!!!! ";
  }

  public static void main(String[] args) {
    SpringApplication.run(MainClass.class, args);

  //   port(Integer.valueOf(System.getenv("PORT")));
  //   staticFileLocation("/public");

  //   get("/hello", (req, res) -> "Hello World!!");

  //   get("/", (request, response) -> {
  //           Map<String, Object> attributes = new HashMap<>();
  //           attributes.put("message", "Hello World!");

            // return new ModelAndView(attributes, "hometest_w.html");
  //       }, new FreeMarkerEngine());

  //   get("/db", (req, res) -> {
  //     Connection connection = null;
  //     Map<String, Object> attributes = new HashMap<>();
  //     try {
  //       connection = DatabaseUrl.extract().getConnection();

  //       Statement stmt = connection.createStatement();
  //       stmt.executeUpdate("CREATE TABLE IF NOT EXISTS ticks (tick timestamp)");
  //       stmt.executeUpdate("INSERT INTO ticks VALUES (now())");
  //       ResultSet rs = stmt.executeQuery("SELECT tick FROM ticks");

  //       ArrayList<String> output = new ArrayList<String>();
  //       while (rs.next()) {
  //         output.add( "Read from DB: " + rs.getTimestamp("tick"));
  //       }

  //       attributes.put("results", output);
  //       return new ModelAndView(attributes, "db.ftl");
  //     } catch (Exception e) {
  //       attributes.put("message", "There was an error: " + e);
  //       return new ModelAndView(attributes, "error.ftl");
  //     } finally {
  //       if (connection != null) try{connection.close();} catch(SQLException e){}
  //     }
  //   }, new FreeMarkerEngine());

  }

}
