
package aiss.model.ebay;

import java.util.List;

public class ShippingInfo {

    private List<ShippingServiceCost> shippingServiceCost = null;
    private List<String> shippingType = null;
    private List<String> shipToLocations = null;
    private List<String> expeditedShipping = null;
    private List<String> oneDayShippingAvailable = null;
    private List<String> handlingTime = null;

    public List<ShippingServiceCost> getShippingServiceCost() {
        return shippingServiceCost;
    }

    public void setShippingServiceCost(List<ShippingServiceCost> shippingServiceCost) {
        this.shippingServiceCost = shippingServiceCost;
    }

    public List<String> getShippingType() {
        return shippingType;
    }

    public void setShippingType(List<String> shippingType) {
        this.shippingType = shippingType;
    }

    public List<String> getShipToLocations() {
        return shipToLocations;
    }

    public void setShipToLocations(List<String> shipToLocations) {
        this.shipToLocations = shipToLocations;
    }

    public List<String> getExpeditedShipping() {
        return expeditedShipping;
    }

    public void setExpeditedShipping(List<String> expeditedShipping) {
        this.expeditedShipping = expeditedShipping;
    }

    public List<String> getOneDayShippingAvailable() {
        return oneDayShippingAvailable;
    }

    public void setOneDayShippingAvailable(List<String> oneDayShippingAvailable) {
        this.oneDayShippingAvailable = oneDayShippingAvailable;
    }

    public List<String> getHandlingTime() {
        return handlingTime;
    }

    public void setHandlingTime(List<String> handlingTime) {
        this.handlingTime = handlingTime;
    }

}
