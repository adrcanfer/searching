package aiss.controller;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.aliexpress.AliexpressSearch;
import aiss.model.aliexpress.Product;
import aiss.model.ebay.EbaySearch;
import aiss.model.ebay.Item;
import aiss.model.resource.AliexpressResource;
import aiss.model.resource.EbayResources;


/**
 * Servlet implementation class SearchController
 */
public class SearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private static final Logger log = Logger.getLogger(SearchController.class.getName());
	 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchController() {
        super();
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		String query = request.getParameter("query"); //query tiene el valor del campo input
		
		Integer page;
		String paginacion = request.getParameter("pagination");
		if (paginacion != null) {
			System.out.println(paginacion);
			page = (Integer) request.getSession().getAttribute("page");
			if(paginacion.equals("siguiente")){
				if(page < 100){
					page++;
				}
			} else {
				if(page >1){
					page--;
				}
			}
			request.getSession().setAttribute("page", page);
		} else {
			page = 1;
			request.getSession().setAttribute("page", page);
		}
		
		if(query == null){
			query = (String) request.getSession().getAttribute("q2");
		}
		
		
		
		
		
		//EBAY
		log.log(Level.FINE, "Buscando en Ebay por: " + query);
		
		EbayResources ebay = new EbayResources();
		EbaySearch ebayresult = ebay.getEbayProducts(query, page.toString());
		
		List<String> res= new ArrayList<String>();
		for (Item i : ebayresult.getFindItemsByKeywordsResponse().get(0).getSearchResult().get(0).getItem()) {
			res.add(i.getTitle().get(0));
		}
		System.out.println(res);
		
		
		//ALIEXPRESS
		AliexpressResource aliexpress = new AliexpressResource();
		AliexpressSearch aliResult = aliexpress.getAliexpressProducts(query, page.toString());
		
		List<Product> aliProducts = new ArrayList<>(aliResult.getResult().getProducts());
		//Para quitar del titulo las etiquetas <font> y <b>
		for (Product p : aliProducts) {
			String title = p.getProductTitle().replaceAll("<font><b>", "");
			title = title.replaceAll("</b></font>", "");
			p.setProductTitle(title);
			String precio= p.getLocalPrice().replaceAll("EUR", "").trim();
			p.setLocalPrice(precio);
		}
		
		
			request.getSession().setAttribute("q2", query);
			
			request.setAttribute("page", page);
			//Productos de ebay
			request.setAttribute("itemsEbay", ebayresult.getFindItemsByKeywordsResponse().get(0).getSearchResult().get(0).getItem());
			//Productos de aliexpress
			request.setAttribute("itemsAli", aliProducts);
			//Enviamos a la vista de productos los productos de ebay y aliexpress
			request.getRequestDispatcher("/productos.jsp").forward(request, response);
		
		
		
		
	
	}
	
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
}
