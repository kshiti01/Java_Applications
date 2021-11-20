/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author kshit
 */
public class OrderRequest extends WorkRequest{
    
    private String testResult;
    private String id;
    
    private List<QuantityOfItems> itemsWithQuantityList = new ArrayList<QuantityOfItems>();
    
    private String customerFeedback;

    public OrderRequest() {
        UUID uuid = UUID.randomUUID();
        id = uuid.toString();
    }
    
    public String getId() {
        return id;
    }

    public QuantityOfItems addItem(QuantityOfItems itemWithQuantity){
        itemsWithQuantityList.add(itemWithQuantity);
        return itemWithQuantity;
    }

    public List<QuantityOfItems> getItemsWithQuatityList() {
        return itemsWithQuantityList;
    }

    public void setItemsWithQuatityList(List<QuantityOfItems> itemsWithQuatityList) {
        this.itemsWithQuantityList = itemsWithQuatityList;
    }

    public String getCustomerFeedback() {
        return customerFeedback;
    }

    public void setCustomerFeedback(String customerFeedback) {
        this.customerFeedback = customerFeedback;
    }

    
    
}
