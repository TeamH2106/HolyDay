package com.javaclasses;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sforce.soap.partner.Connector;
import com.sforce.soap.partner.PartnerConnection;
import com.sforce.ws.ConnectorConfig;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@EnableAutoConfiguration
public class MainClass {
	static PartnerConnection connection;
  @RequestMapping("/")
  @ResponseBody
  public String home() {
        
        final String USERNAME = "wendyjin0628@gmail.com";
        final String PASSWORD = "hidetoshi7";
        
        ConnectorConfig config = new ConnectorConfig();

        config.setUsername(USERNAME);
        config.setPassword(PASSWORD);
        //config.setTraceMessage(true);
        try {

           connection = Connector.newConnection(config);

          // display some current settings
          System.out.println("Auth EndPoint: "+config.getAuthEndpoint());
          System.out.println("Service EndPoint: "+config.getServiceEndpoint());
          System.out.println("Username: "+config.getUsername());
          System.out.println("SessionId: "+config.getSessionId());
        }
        catch(Exception e){
        	e.printStackTrace();
        }
        
        return "hometest_w ";
  }
  
  @RequestMapping("/hello")
  public String hello(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
      model.addAttribute("name", name);
      return "hello";
  }

  public static void main(String[] args) {
    SpringApplication.run(MainClass.class, args);

  }

}
