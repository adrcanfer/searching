
package aiss.model.ebay;

import java.util.List;

public class PaginationOutput {

    private List<String> pageNumber = null;
    private List<String> entriesPerPage = null;
    private List<String> totalPages = null;
    private List<String> totalEntries = null;

    public List<String> getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(List<String> pageNumber) {
        this.pageNumber = pageNumber;
    }

    public List<String> getEntriesPerPage() {
        return entriesPerPage;
    }

    public void setEntriesPerPage(List<String> entriesPerPage) {
        this.entriesPerPage = entriesPerPage;
    }

    public List<String> getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(List<String> totalPages) {
        this.totalPages = totalPages;
    }

    public List<String> getTotalEntries() {
        return totalEntries;
    }

    public void setTotalEntries(List<String> totalEntries) {
        this.totalEntries = totalEntries;
    }

}
