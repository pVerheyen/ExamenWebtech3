package edu.ap.spoedgevallen;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

public class SpoedgevallenApplication extends Application {

	@Override
	public synchronized Restlet createInboundRoot() {

	       Router router = new Router(getContext());
	       
	       router.attach("/spoedgeval", SpoedgevallenResource.class);

	       return router;
	   }

}