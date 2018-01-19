package aiss.model.resource;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.restlet.representation.Representation;
import org.restlet.resource.ClientResource;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import aiss.model.ebay.EbaySearch;

public class EbayResources {
	
	
	public EbayResources(){
		
	}
	
	public EbaySearch getEbayProducts(String name, String page) throws UnsupportedEncodingException{
		String name2 = URLEncoder.encode(name, "UTF-8");
		String page2 = URLEncoder.encode(page, "UTF-8");
		String url = "https://svcs.ebay.com/services/search/FindingService/v1?SECURITY"
				+ "-APPNAME=AdrinCan-dfg-PRD-709141381-35de4f48&OPERATION-NAME=findItems"
				+ "ByKeywords&SERVICE-VERSION=1.0.0&RESPONSE-DATA-FORMAT=JSON"
				+ "&REST-PAYLOAD&keywords="+name2+"&pagination"
				+ "Input.entriesPerPage=10&paginationInput.pageNumber="+page2+"&GLOBAL-ID=EBAY-US&siteid=0";
		
		//para consumir el servicio desde el servidor
		ClientResource cr = new ClientResource(url);
		System.out.println();
		String json=cr.get(String.class);
		
		ObjectMapper om=new  ObjectMapper();
		
		EbaySearch es=null;
		try {
			es = om.readValue(json, EbaySearch.class);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return es;
	}
}
