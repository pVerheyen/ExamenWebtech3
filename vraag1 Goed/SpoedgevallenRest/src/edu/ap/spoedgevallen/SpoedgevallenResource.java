package edu.ap.spoedgevallen;

import java.util.ArrayList;

import org.json.JSONObject;
import org.json.JSONArray;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

import edu.ap.jdbc.JDBConnection;
import edu.ap.xml.XMLParser;

public class SpoedgevallenResource extends ServerResource {
	@Get("html")
	public String getSpoedgevallen() {
		XMLParser parser = new XMLParser();
		return parser.getSpoedgevallen();
	}
	
	@Post("txt")
	public String addSpoedgevallen(String Spoedgevallen) {
		XMLParser parser = new XMLParser();
		return parser.addSpoedgevallen(Spoedgevallen);
	}


}