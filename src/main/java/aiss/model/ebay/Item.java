
package aiss.model.ebay;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Item {
	 
	
    private List<String> itemId = null; //Importante
    private List<String> title = null;
    private List<String> globalId = null;
    private List<String> subtitle = null;
    private List<PrimaryCategory> primaryCategory = null;
    private List<String> galleryURL = null; //Importante
    private List<String> viewItemURL = null; //Importante
    private List<String> paymentMethod = null;
    private List<String> autoPay = null;
    private List<String> postalCode = null;
    private List<String> location = null;
    private List<String> country = null;
    private List<ShippingInfo> shippingInfo = null;
    private List<SellingStatu> sellingStatus = null;
    private List<ListingInfo> listingInfo = null;
    private List<String> returnsAccepted = null;
    private List<Condition> condition = null;
    private List<String> isMultiVariationListing = null;
    private List<String> topRatedListing = null;
    private List<ProductId> productId = null;

    public List<String> getItemId() {
        return itemId;
    }

    public void setItemId(List<String> itemId) {
        this.itemId = itemId;
    }

    public List<String> getTitle() {
        return title;
    }

    public void setTitle(List<String> title) {
        this.title = title;
    }

    public List<String> getGlobalId() {
        return globalId;
    }

    public void setGlobalId(List<String> globalId) {
        this.globalId = globalId;
    }

    public List<String> getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(List<String> subtitle) {
        this.subtitle = subtitle;
    }

    public List<PrimaryCategory> getPrimaryCategory() {
        return primaryCategory;
    }

    public void setPrimaryCategory(List<PrimaryCategory> primaryCategory) {
        this.primaryCategory = primaryCategory;
    }

    public List<String> getGalleryURL() {
        return galleryURL;
    }

    public void setGalleryURL(List<String> galleryURL) {
        this.galleryURL = galleryURL;
    }

    public List<String> getViewItemURL() {
        return viewItemURL;
    }

    public void setViewItemURL(List<String> viewItemURL) {
        this.viewItemURL = viewItemURL;
    }

    public List<String> getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(List<String> paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public List<String> getAutoPay() {
        return autoPay;
    }

    public void setAutoPay(List<String> autoPay) {
        this.autoPay = autoPay;
    }

    public List<String> getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(List<String> postalCode) {
        this.postalCode = postalCode;
    }

    public List<String> getLocation() {
        return location;
    }

    public void setLocation(List<String> location) {
        this.location = location;
    }

    public List<String> getCountry() {
        return country;
    }

    public void setCountry(List<String> country) {
        this.country = country;
    }

    public List<ShippingInfo> getShippingInfo() {
        return shippingInfo;
    }

    public void setShippingInfo(List<ShippingInfo> shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    public List<SellingStatu> getSellingStatus() {
        return sellingStatus;
    }

    public void setSellingStatus(List<SellingStatu> sellingStatus) {
        this.sellingStatus = sellingStatus;
    }

    public List<ListingInfo> getListingInfo() {
        return listingInfo;
    }

    public void setListingInfo(List<ListingInfo> listingInfo) {
        this.listingInfo = listingInfo;
    }

    public List<String> getReturnsAccepted() {
        return returnsAccepted;
    }

    public void setReturnsAccepted(List<String> returnsAccepted) {
        this.returnsAccepted = returnsAccepted;
    }

    public List<Condition> getCondition() {
        return condition;
    }

    public void setCondition(List<Condition> condition) {
        this.condition = condition;
    }

    public List<String> getIsMultiVariationListing() {
        return isMultiVariationListing;
    }

    public void setIsMultiVariationListing(List<String> isMultiVariationListing) {
        this.isMultiVariationListing = isMultiVariationListing;
    }

    public List<String> getTopRatedListing() {
        return topRatedListing;
    }

    public void setTopRatedListing(List<String> topRatedListing) {
        this.topRatedListing = topRatedListing;
    }

    public List<ProductId> getProductId() {
        return productId;
    }

    public void setProductId(List<ProductId> productId) {
        this.productId = productId;
    }

}
