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


@Entity
@NamedQuery(name = "WeekMenuPlan.deleteAllRows", query = "DELETE from WeekMenuPlan")
public class WeekMenuPlan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long menuId;
    private String weekNo;
    private String year;
    
    @ManyToMany(mappedBy = "weekMenuPlans")
    private List<Recipe> sevenRecipes = new ArrayList();
    
    public WeekMenuPlan() {
    }

    public WeekMenuPlan(List<Recipe> sevenRecipes, String weekNo, String year) {
        this.weekNo = weekNo;
        this.year = year;
        this.sevenRecipes = sevenRecipes;
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
