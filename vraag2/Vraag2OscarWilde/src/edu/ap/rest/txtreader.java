package edu.ap.rest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class txtreader {
	public String everything;

	public String getText() throws IOException{
		
		String iets = "/Users/pieterjan/Desktop/oscar_wilde.txt";
		
		BufferedReader br = new BufferedReader(new FileReader(iets));
		try {
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();

		    while (line != null) {
		        sb.append("<p>"+line + "</p>");
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		    }
		    everything = sb.toString();
		    return everything;
		} finally {
		    br.close();
		}
	}
	public String getTextwithSearch(String woord) throws IOException{
		String text = getText();
		StringBuilder sb = new StringBuilder();

		if(text.contains(woord)){
			String[] quotes = text.split(".");
			for(int i=0; i<quotes.length; i++){
				if(quotes[i].contains(woord)){
					sb.append(quotes[i].toString());
				}
			}
		}
		
		
		
		return sb.toString();
	}
	
}
