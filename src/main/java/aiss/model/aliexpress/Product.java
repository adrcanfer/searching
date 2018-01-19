
package aiss.model.aliexpress;


public class Product {

    private String imageUrl;
    private String productUrl;
    private String productTitle;
    private String originalPrice;
    private String salePrice;
    private String localPrice;
    
    public String getLocalPrice(){
    	return localPrice;
    }
    
    public void setLocalPrice(String localPrice){
    	this.localPrice= localPrice;
    }
    
    public String getSalePrice(){
    	return salePrice;
    }
    public void setSalePrice(String salePrice){
    	this.salePrice= salePrice;
    }

    public String getOriginalPrice(){
    	return originalPrice;
    }
    public void setOriginalPrice(String originalPrice){
    	this.originalPrice= originalPrice;
    }
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getProductUrl() {
        return productUrl;
    }

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

}
