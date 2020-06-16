package entities;

import java.io.Serializable;
import java.util.TreeSet;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;


@Entity
@NamedQuery(name = "WeekMenuPlan.deleteAllRows", query = "DELETE from WeekMenuPlan")
public class WeekMenuPlan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long menuId;
    private TreeSet<Recipe> sevenRecipes;
    private String weekNo;
    private String year;
    
    public WeekMenuPlan() {
    }

    public WeekMenuPlan(TreeSet<Recipe> sevenRecipes, String weekNo, String year) {
        this.sevenRecipes = sevenRecipes;
        this.weekNo = weekNo;
        this.year = year;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public TreeSet<Recipe> getSevenRecipes() {
        return sevenRecipes;
    }

    public void setSevenRecipes(TreeSet<Recipe> sevenRecipes) {
        this.sevenRecipes = sevenRecipes;
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
    
}
