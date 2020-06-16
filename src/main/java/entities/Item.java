package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;


@Entity
@NamedQuery(name = "Item.deleteAllRows", query = "DELETE from Item")
public class Item implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemId;
    private String name;
    private String pricePrKg;
    @OneToMany(mappedBy = "item")
    private List<Ingredient> ingredients = new ArrayList();
    @ManyToOne
    private Storage storage;
    
    public Item() {
    }

    public Item(String name, String pricePrKg, Storage storage) {
        this.name = name;
        this.pricePrKg = pricePrKg;
        this.storage = storage;
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
