package dto;

import entities.Recipe;
import entities.WeekMenuPlan;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nina
 */
public class WeekMenuPlanDTO {

    private Long menuId;
    private String weekNo;
    private String year;
    private List<Recipe> sevenRecipes = new ArrayList();

    public WeekMenuPlanDTO() {
    }

    public WeekMenuPlanDTO(Long menuId, String weekNo, String year, List<Recipe> sevenRecipes) {
        this.menuId = menuId;
        this.weekNo = weekNo;
        this.year = year;
        this.sevenRecipes = sevenRecipes;
    }
    
    public WeekMenuPlanDTO(WeekMenuPlan wmp) {
        this.menuId = wmp.getMenuId();
        this.weekNo = wmp.getWeekNo();
        this.year = wmp.getYear();
        this.sevenRecipes = wmp.getSevenRecipes();
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public String getWeekNo() {
        return weekNo;
    }

    public void setWeekNo(String weekNo) {
        this.weekNo = weekNo;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public List<Recipe> getSevenRecipes() {
        return sevenRecipes;
    }

    public void setSevenRecipes(List<Recipe> sevenRecipes) {
        this.sevenRecipes = sevenRecipes;
    }

}
