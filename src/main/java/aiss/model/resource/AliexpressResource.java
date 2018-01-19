package aiss.model.resource;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.restlet.resource.ClientResource;

import aiss.model.aliexpress.AliexpressSearch;

public class AliexpressResource {

	public AliexpressResource() {

	}

	public AliexpressSearch getAliexpressProducts(String name, String page) throws UnsupportedEncodingException {
		String name2 = URLEncoder.encode(name, "UTF-8");
		String page2 = URLEncoder.encode(page, "UTF-8");
		String url = "http://gw.api.alibaba.com/openapi/param2/2/"
				+ "portals.open/api.listPromotionProduct/[api_key]?fields="
				+ "productTitle,productUrl,imageUrl,originalPrice,salePrice,localPrice&pageNo="+page2+"&localCurrency=EUR&languaje=espageSize=10&keywords="+name2;

		ClientResource cr = new ClientResource(url);
		AliexpressSearch res = cr.get(AliexpressSearch.class);

		return res;
	}
}
