package entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;


@Entity
@NamedQuery(name = "Item.deleteAllRows", query = "DELETE from Item")
public class Item implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemId;
    private String name;
    private String pricePrKg;
    
    public Item() {
    }

    public Item(String name, String pricePrKg) {
        this.name = name;
        this.pricePrKg = pricePrKg;
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

    
}
