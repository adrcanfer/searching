
package aiss.model.ebay;

import java.util.List;

public class SellingStatu {

    private List<CurrentPrice> currentPrice = null;
    private List<ConvertedCurrentPrice> convertedCurrentPrice = null;
    private List<String> sellingState = null;
    private List<String> timeLeft = null;
    private List<String> bidCount = null;

    public List<CurrentPrice> getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(List<CurrentPrice> currentPrice) {
        this.currentPrice = currentPrice;
    }

    public List<ConvertedCurrentPrice> getConvertedCurrentPrice() {
        return convertedCurrentPrice;
    }

    public void setConvertedCurrentPrice(List<ConvertedCurrentPrice> convertedCurrentPrice) {
        this.convertedCurrentPrice = convertedCurrentPrice;
    }

    public List<String> getSellingState() {
        return sellingState;
    }

    public void setSellingState(List<String> sellingState) {
        this.sellingState = sellingState;
    }

    public List<String> getTimeLeft() {
        return timeLeft;
    }

    public void setTimeLeft(List<String> timeLeft) {
        this.timeLeft = timeLeft;
    }

    public List<String> getBidCount() {
        return bidCount;
    }

    public void setBidCount(List<String> bidCount) {
        this.bidCount = bidCount;
    }

}
