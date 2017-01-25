package edu.ap.rest;

import org.json.JSONArray;
import org.json.JSONObject;
import org.restlet.resource.ClientResource;

public class QuotesClient {

    // http://hc.apache.org/
     public static void main(String[] args) {
           
    	 try {
 	       	ClientResource resource = new ClientResource("http://localhost:8181/quote");
 	       	// Post a new registration
 	       	String registration = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>";
 	       	registration += "<registration date=\"16/08/2016 14:00:00\" name=\"klok\" birthdate=\"04/07/1996\" nurse=\"jos\" diagnose=\"Malaria\" id=\"15\"></registration>";
 	   		resource.post(registration);
 	   		// get the response
 	       	System.out.println(resource.getResponseEntity().getText());
 	       	
 	       	// Post a new registration
 	       	registration = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>";
 	       	registration += "<registration date=\"14/08/2016 14:00:00\" name=\"bad\" birthdate=\"04/07/1996\" nurse=\"jos\" diagnose=\"Malaria\" id=\"15\"></registration>";
 	   		resource.post(registration);
 	   		// get the response
 	       	System.out.println(resource.getResponseEntity().getText());
 	       }
 	       catch (Exception e) {
 	           System.out.println("In main : " + e.getMessage());
 	       }
     }
        }
