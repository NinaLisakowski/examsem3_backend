package dto;

import entities.Ingredient;
import entities.Recipe;
import entities.WeekMenuPlan;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nina
 */
public class RecipeDTO {

    private Long recipeId;
    private String preparationTime;
    private String directions;
    private List<WeekMenuPlan> weekMenuPlans = new ArrayList();
    private List<Ingredient> ingredients = new ArrayList();

    public RecipeDTO() {
    }

    public RecipeDTO(Long recipeId, List<Ingredient> ingredients, String preparationTime, String directions, List<WeekMenuPlan> weekMenuPlans) {
        this.recipeId = recipeId;
        this.ingredients = ingredients;
        this.preparationTime = preparationTime;
        this.directions = directions;
        this.weekMenuPlans = weekMenuPlans;
    }

    public RecipeDTO(Recipe recipe) {
        this.recipeId = recipe.getRecipeId();
        this.ingredients = recipe.getIngredients();
        this.preparationTime = recipe.getPreparationTime();
        this.directions = recipe.getDirections();
        this.weekMenuPlans = recipe.getWeekMenuPlans();
    }

    public Long getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(Long recipeId) {
        this.recipeId = recipeId;
    }

    public String getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(String preparationTime) {
        this.preparationTime = preparationTime;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

    public List<WeekMenuPlan> getWeekMenuPlans() {
        return weekMenuPlans;
    }

    public void setWeekMenuPlans(List<WeekMenuPlan> weekMenuPlans) {
        this.weekMenuPlans = weekMenuPlans;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

}
