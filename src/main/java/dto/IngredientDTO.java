package dto;

import entities.Ingredient;
import entities.Item;
import entities.Recipe;

/**
 *
 * @author Nina
 */
public class IngredientDTO {
    
    private Long item_id;
    private String amount;
    private Recipe recipe;
    private Item item;

    public IngredientDTO() {
    }

    public IngredientDTO(Long item_id, String amount, Recipe recipe, Item item) {
        this.item_id = item_id;
        this.amount = amount;
        this.recipe = recipe;
        this.item = item;
    }
    
     public IngredientDTO(Ingredient ingredient) {
        this.item_id = ingredient.getItem_id();
        this.amount = ingredient.getAmount();
        this.recipe = ingredient.getRecipe();
        this.item = ingredient.getItem();
    }

    public Long getItem_id() {
        return item_id;
    }

    public void setItem_id(Long item_id) {
        this.item_id = item_id;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

}
