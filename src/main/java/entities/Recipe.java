package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQuery(name = "Recipe.deleteAllRows", query = "DELETE from Recipe")
public class Recipe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recipeId;
    private String preparationTime;
    private String directions;

    @ManyToMany
    private List<WeekMenuPlan> weekMenuPlans = new ArrayList();

    @OneToMany(mappedBy = "recipe")
    private List<Ingredient> ingredients = new ArrayList();

    public Recipe() {
    }

    public Recipe(String preparationTime, String directions, List<Ingredient> ingredients) {
        this.preparationTime = preparationTime;
        this.directions = directions;
        this.ingredients = ingredients;

    }

    public Long getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(Long recipeId) {
        this.recipeId = recipeId;
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

}
