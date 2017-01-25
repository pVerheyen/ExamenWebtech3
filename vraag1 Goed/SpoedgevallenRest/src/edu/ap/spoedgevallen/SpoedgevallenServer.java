package edu.ap.spoedgevallen;

import org.restlet.*;
import org.restlet.data.Protocol;


public class SpoedgevallenServer {

	public static void main(String[] args) {
		
		try {
			// Create a new Component.
		    Component component = new Component();

		    // Add a new HTTP server listening on port 8181.
		    component.getServers().add(Protocol.HTTP, 8181);

		    // Attach the sample application.
		    component.getDefaultHost().attach("/spoedgevallen", SpoedgevallenResource.class);
		    
			component.start();
		} 
	    catch(Exception e) {
			System.out.println(e.getMessage());
	    }
	}
}
