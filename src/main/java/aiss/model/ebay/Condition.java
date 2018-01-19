
package aiss.model.ebay;

import java.util.List;

public class Condition {

    private List<String> conditionId = null;
    private List<String> conditionDisplayName = null;

    public List<String> getConditionId() {
        return conditionId;
    }

    public void setConditionId(List<String> conditionId) {
        this.conditionId = conditionId;
    }

    public List<String> getConditionDisplayName() {
        return conditionDisplayName;
    }

    public void setConditionDisplayName(List<String> conditionDisplayName) {
        this.conditionDisplayName = conditionDisplayName;
    }

}
