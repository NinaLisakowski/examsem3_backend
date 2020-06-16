package dto;

import entities.Item;
import entities.Storage;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nina
 */
public class StorageDTO {

    private Long itemId;
    private String amount;
    private List<Item> items = new ArrayList();

    public StorageDTO() {
    }

    public StorageDTO(Long itemId, String amount, List<Item> items) {
        this.itemId = itemId;
        this.amount = amount;
        this.items = items;
    }

    public StorageDTO(Storage storage) {
        this.itemId = storage.getItemId();
        this.amount = storage.getAmount();
        this.items = storage.getItems();
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
    
}
