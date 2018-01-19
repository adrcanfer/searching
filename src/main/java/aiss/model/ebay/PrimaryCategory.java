
package aiss.model.ebay;

import java.util.List;

public class PrimaryCategory {

    private List<String> categoryId = null;
    private List<String> categoryName = null;

    public List<String> getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(List<String> categoryId) {
        this.categoryId = categoryId;
    }

    public List<String> getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(List<String> categoryName) {
        this.categoryName = categoryName;
    }

}
