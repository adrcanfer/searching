
package aiss.model.ebay;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class ListingInfo {

    private List<String> bestOfferEnabled = null;
    private List<String> buyItNowAvailable = null;
    private List<String> startTime = null;
    private List<String> endTime = null;
    private List<String> listingType = null;
    private List<String> gift = null;

    public List<String> getBestOfferEnabled() {
        return bestOfferEnabled;
    }

    public void setBestOfferEnabled(List<String> bestOfferEnabled) {
        this.bestOfferEnabled = bestOfferEnabled;
    }

    public List<String> getBuyItNowAvailable() {
        return buyItNowAvailable;
    }

    public void setBuyItNowAvailable(List<String> buyItNowAvailable) {
        this.buyItNowAvailable = buyItNowAvailable;
    }

    public List<String> getStartTime() {
        return startTime;
    }

    public void setStartTime(List<String> startTime) {
        this.startTime = startTime;
    }

    public List<String> getEndTime() {
        return endTime;
    }

    public void setEndTime(List<String> endTime) {
        this.endTime = endTime;
    }

    public List<String> getListingType() {
        return listingType;
    }

    public void setListingType(List<String> listingType) {
        this.listingType = listingType;
    }

    public List<String> getGift() {
        return gift;
    }

    public void setGift(List<String> gift) {
        this.gift = gift;
    }

}
