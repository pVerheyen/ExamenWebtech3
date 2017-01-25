package edu.ap.rest;

import java.io.IOException;
import java.util.ArrayList;

import org.json.JSONObject;
import org.json.JSONArray;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

import edu.ap.jdbc.JDBConnection;

public class QuotesResource extends ServerResource {

	@Get("html")
	public String getQuotes() throws IOException {
		txtreader txt = new txtreader();
		String iets = txt.getText();
		return "<h2>"+iets+"</h2>";
	}
	
}