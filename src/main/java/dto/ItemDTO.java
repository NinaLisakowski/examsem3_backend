package dto;

import entities.Ingredient;
import entities.Item;
import entities.Storage;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nina
 */
public class ItemDTO {
    
   private Long itemId;
    private String name;
    private String pricePrKg;
    private List<Ingredient> ingredients = new ArrayList();
    private Storage storage;

    public ItemDTO() {
    }

    public ItemDTO(Long itemId, String name, String pricePrKg, List<Ingredient> ingredients, Storage storage) {
        this.itemId = itemId;
        this.name = name;
        this.pricePrKg = pricePrKg;
        this.ingredients = ingredients;
        this.storage = storage;
    }

    public ItemDTO(Item item) {
        this.itemId = item.getItemId();
        this.name = item.getName();
        this.pricePrKg = item.getPricePrKg();
        this.ingredients = item.getIngredients();
        this.storage = item.getStorage();
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPricePrKg() {
        return pricePrKg;
    }

    public void setPricePrKg(String pricePrKg) {
        this.pricePrKg = pricePrKg;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }
}
