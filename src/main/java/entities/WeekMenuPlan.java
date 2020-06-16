package entities;

import java.io.Serializable;
import java.util.Set;
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
    private Set<Recipe> sevenRecipes;
    
    public WeekMenuPlan() {
    }

    public WeekMenuPlan(String weekNo, String year, Set<Recipe> sevenRecipes) {
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

    public Set<Recipe> getSevenRecipes() {
        return sevenRecipes;
    }

    public void setSevenRecipes(Set<Recipe> sevenRecipes) {
        this.sevenRecipes = sevenRecipes;
    }

    
}
