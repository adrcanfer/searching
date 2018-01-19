
package aiss.model.ebay;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class FindItemsByKeywordsResponse {
	
    private List<String> ack = null;
    private List<String> version = null;
    private List<String> timestamp = null;
   
   //Lo que el adri quiere
    private List<SearchResult> searchResult = null;
    
    private List<PaginationOutput> paginationOutput = null;
    private List<String> itemSearchURL = null;

    public List<String> getAck() {
        return ack;
    }

    public void setAck(List<String> ack) {
        this.ack = ack;
    }

    public List<String> getVersion() {
        return version;
    }

    public void setVersion(List<String> version) {
        this.version = version;
    }

    public List<String> getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(List<String> timestamp) {
        this.timestamp = timestamp;
    }

    public List<SearchResult> getSearchResult() {
        return searchResult;
    }

    public void setSearchResult(List<SearchResult> searchResult) {
        this.searchResult = searchResult;
    }

    public List<PaginationOutput> getPaginationOutput() {
        return paginationOutput;
    }

    public void setPaginationOutput(List<PaginationOutput> paginationOutput) {
        this.paginationOutput = paginationOutput;
    }

    public List<String> getItemSearchURL() {
        return itemSearchURL;
    }

    public void setItemSearchURL(List<String> itemSearchURL) {
        this.itemSearchURL = itemSearchURL;
    }

}
