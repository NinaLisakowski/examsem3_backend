package facades;

import dto.RecipeDTO;
import entities.Ingredient;
import entities.Item;
import entities.Recipe;
import entities.Storage;
import entities.WeekMenuPlan;
import errorhandling.NotFoundException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utils.EMF_Creator;
import utils.EMF_Creator.DbSelector;
import utils.EMF_Creator.Strategy;

//Uncomment the line below, to temporarily disable this test
//@Disabled
public class RecipeFacadeTest {

    private static EntityManagerFactory emf;
    private static RecipeFacade facade;
    private static Ingredient egg;
    private static Recipe recipe2;

    public RecipeFacadeTest() {
    }

    @BeforeAll
    public static void setUpClass() {
        emf = EMF_Creator.createEntityManagerFactory(DbSelector.TEST,
                Strategy.DROP_AND_CREATE);
        facade = RecipeFacade.getRecipeFacade(emf);
    }


    /*   **** HINT **** 
        A better way to handle configuration values, compared to the UNUSED example above, is to store those values
        ONE COMMON place accessible from anywhere.
        The file config.properties and the corresponding helper class utils.Settings is added just to do that. 
        See below for how to use these files. This is our RECOMENDED strategy
     */
    //@BeforeAll
    public static void setUpClassV2() {
        emf = EMF_Creator.createEntityManagerFactory(DbSelector.TEST,
                Strategy.DROP_AND_CREATE);
        facade = RecipeFacade.getRecipeFacade(emf);
    }

//    @AfterAll
//    public static void tearDownClass() {
////        Clean up database after test is done or use a persistence unit with drop-and-create to start up clean on every test
//    }

    // Setup the DataBase in a known state BEFORE EACH TEST
    //TODO -- Make sure to change the script below to use YOUR OWN entity class
    @BeforeEach
    public void setUp() {
        EntityManager em = emf.createEntityManager();
        List<Ingredient> ingredientsL1 = new ArrayList();
        List<Ingredient> ingredientsL2 = new ArrayList();
        List<Ingredient> ingredientsL3 = new ArrayList();
        List<Ingredient> ingredientsL4 = new ArrayList();
        List<Ingredient> ingredientsL5 = new ArrayList();
        List<Ingredient> ingredientsL6 = new ArrayList();
        List<Ingredient> ingredientsL7 = new ArrayList();
        List<Ingredient> ingredientsL8 = new ArrayList();
        List<Ingredient> ingredientsL9 = new ArrayList();
        List<Ingredient> ingredientsL10 = new ArrayList();
        List<Ingredient> ingredientsL11 = new ArrayList();
        List<Ingredient> ingredientsL12 = new ArrayList();
        List<Recipe> sevenRecipeL1 = new ArrayList();
        List<Recipe> sevenRecipeL2 = new ArrayList();
        List<Recipe> sevenRecipeL3 = new ArrayList();
        List<Recipe> sevenRecipeL4 = new ArrayList();
        List<Recipe> sevenRecipeL5 = new ArrayList();

        try {
            em.getTransaction().begin();

            Storage storage1 = new Storage("90");
            Storage storage2 = new Storage("17");
            Storage storage3 = new Storage("3");
            Storage storage4 = new Storage("1");
            Storage storage5 = new Storage("56");
            Storage storage6 = new Storage("12");
            Storage storage7 = new Storage("34");
            Storage storage8 = new Storage("2");
            Storage storage9 = new Storage("4");
            Storage storage10 = new Storage("1");

            Item item1 = new Item("onion", "60");
            Item item2 = new Item("tomato", "45");
            Item item3 = new Item("salt", "89");
            Item item4 = new Item("pepper", "50");
            Item item5 = new Item("carrot", "70");
            Item item6 = new Item("beet", "70");
            Item item7 = new Item("potato", "43");
            Item item8 = new Item("berries", "180");
            Item item9 = new Item("vanillacream", "110");
            Item item10 = new Item("turkey", "150");
            Item item11 = new Item("salad", "30");
            Item item12 = new Item("dried berries", "240");
            Item item13 = new Item("apple", "23");
            Item item14 = new Item("steak", "112");
            Item item15 = new Item("chicken", "76");
            Item item16 = new Item("fruit", "50");
            Item item17 = new Item("egg", "200");

            egg = new Ingredient("100", item17);
            Ingredient salt = new Ingredient("2", item3);
            Ingredient pepper = new Ingredient("2", item4);
            Ingredient tomato = new Ingredient("650", item2);
            Ingredient onion = new Ingredient("250", item1);
            Ingredient chicken = new Ingredient("1000", item15);
            Ingredient potato = new Ingredient("500", item7);
            Ingredient carrot = new Ingredient("350", item5);
            Ingredient beet = new Ingredient("300", item6);
            Ingredient berries = new Ingredient("780", item8);
            Ingredient vanillacreme = new Ingredient("100", item9);
            Ingredient turkey = new Ingredient("1000", item10);
            Ingredient salad = new Ingredient("250", item11);
            Ingredient apple = new Ingredient("130", item13);
            Ingredient steak = new Ingredient("690", item14);
            Ingredient friuts = new Ingredient("540", item16);

            ingredientsL1.add(egg);
            ingredientsL1.add(salt);
            ingredientsL1.add(pepper);
            ingredientsL2.add(salt);
            ingredientsL2.add(pepper);
            ingredientsL2.add(tomato);
            ingredientsL2.add(onion);
            ingredientsL3.add(chicken);
            ingredientsL3.add(potato);
            ingredientsL3.add(carrot);
            ingredientsL3.add(beet);
            ingredientsL3.add(onion);
            ingredientsL4.add(berries);
            ingredientsL4.add(vanillacreme);
            ingredientsL5.add(turkey);
            ingredientsL5.add(salad);
            ingredientsL6.add(berries);
            ingredientsL7.add(potato);
            ingredientsL7.add(carrot);
            ingredientsL7.add(beet);
            ingredientsL7.add(onion);
            ingredientsL8.add(apple);
            ingredientsL9.add(potato);
            ingredientsL9.add(steak);
            ingredientsL10.add(chicken);
            ingredientsL10.add(potato);
            ingredientsL11.add(friuts);
            ingredientsL12.add(steak);
            ingredientsL12.add(potato);
            ingredientsL12.add(carrot);
            ingredientsL12.add(beet);

            Recipe recipe1 = new Recipe("45min", "Fry the egg on the pan until crisp and sprinkle salt and pepper", ingredientsL1);
            recipe2 = new Recipe("30min", "Blend tomatoes and heat, add salt, pepper, onions", ingredientsL2);
            Recipe recipe3 = new Recipe("90min", "Chicken with potatoes, carrots, beets and onions", ingredientsL3);
            Recipe recipe4 = new Recipe("7min", "Mixed berries with vanillacream", ingredientsL4);
            Recipe recipe5 = new Recipe("360min", "Ovenbaked turkey with a side of salad", ingredientsL5);
            Recipe recipe6 = new Recipe("7min", "Dried berries in different shapes", ingredientsL6);
            Recipe recipe7 = new Recipe("70min", "Steamed vegetables cutted into slices", ingredientsL7);
            Recipe recipe8 = new Recipe("1min", "Wash one apple and cut it into smaller pieces", ingredientsL8);
            Recipe recipe9 = new Recipe("30min", "Boil potatoes and cook the steak until desired redness is achieved", ingredientsL9);
            Recipe recipe10 = new Recipe("60min", "Cook chicken in the oven, boil potatoes and mash them", ingredientsL10);
            Recipe recipe11 = new Recipe("15min", "Fruit salad, cut all the fruit in small edible pieces", ingredientsL11);
            Recipe recipe12 = new Recipe("99min", "Sous vide your steak and ovenbake potatoes, carrots and beets", ingredientsL12);

            sevenRecipeL1.add(recipe1);
            sevenRecipeL1.add(recipe2);
            sevenRecipeL1.add(recipe3);
            sevenRecipeL1.add(recipe4);
            sevenRecipeL1.add(recipe5);
            sevenRecipeL1.add(recipe6);
            sevenRecipeL1.add(recipe7);
            sevenRecipeL2.add(recipe1);
            sevenRecipeL2.add(recipe3);
            sevenRecipeL2.add(recipe5);
            sevenRecipeL2.add(recipe7);
            sevenRecipeL2.add(recipe9);
            sevenRecipeL2.add(recipe11);
            sevenRecipeL2.add(recipe12);
            sevenRecipeL3.add(recipe2);
            sevenRecipeL3.add(recipe3);
            sevenRecipeL3.add(recipe4);
            sevenRecipeL3.add(recipe8);
            sevenRecipeL3.add(recipe10);
            sevenRecipeL3.add(recipe11);
            sevenRecipeL3.add(recipe12);
            sevenRecipeL4.add(recipe3);
            sevenRecipeL4.add(recipe7);
            sevenRecipeL4.add(recipe8);
            sevenRecipeL4.add(recipe9);
            sevenRecipeL4.add(recipe10);
            sevenRecipeL4.add(recipe11);
            sevenRecipeL4.add(recipe12);
            sevenRecipeL5.add(recipe4);
            sevenRecipeL5.add(recipe6);
            sevenRecipeL5.add(recipe7);
            sevenRecipeL5.add(recipe9);
            sevenRecipeL5.add(recipe10);
            sevenRecipeL5.add(recipe11);
            sevenRecipeL5.add(recipe12);

            WeekMenuPlan wmp1 = new WeekMenuPlan(sevenRecipeL1, "10", "2020");
            WeekMenuPlan wmp2 = new WeekMenuPlan(sevenRecipeL2, "11", "2020");
            WeekMenuPlan wmp3 = new WeekMenuPlan(sevenRecipeL3, "12", "2019");
            WeekMenuPlan wmp4 = new WeekMenuPlan(sevenRecipeL4, "13", "2018");
            WeekMenuPlan wmp5 = new WeekMenuPlan(sevenRecipeL5, "14", "2015");

            em.persist(storage1);
            em.persist(storage2);
            em.persist(storage3);
            em.persist(storage4);
            em.persist(storage5);
            em.persist(storage6);
            em.persist(storage7);
            em.persist(storage8);
            em.persist(storage9);
            em.persist(storage10);

            em.persist(item1);
            em.persist(item2);
            em.persist(item3);
            em.persist(item4);
            em.persist(item5);
            em.persist(item6);
            em.persist(item7);
            em.persist(item8);
            em.persist(item9);
            em.persist(item10);
            em.persist(item11);
            em.persist(item12);
            em.persist(item13);
            em.persist(item14);
            em.persist(item15);
            em.persist(item16);

            em.persist(egg);
            em.persist(salt);
            em.persist(pepper);
            em.persist(tomato);
            em.persist(onion);
            em.persist(chicken);
            em.persist(potato);
            em.persist(carrot);
            em.persist(beet);
            em.persist(berries);
            em.persist(vanillacreme);
            em.persist(turkey);
            em.persist(salad);
            em.persist(apple);
            em.persist(steak);
            em.persist(friuts);

            em.persist(recipe1);
            em.persist(recipe2);
            em.persist(recipe3);
            em.persist(recipe4);
            em.persist(recipe5);
            em.persist(recipe6);
            em.persist(recipe7);
            em.persist(recipe8);
            em.persist(recipe9);
            em.persist(recipe10);
            em.persist(recipe11);
            em.persist(recipe12);

            em.persist(wmp1);
            em.persist(wmp2);
            em.persist(wmp3);
            em.persist(wmp4);
            em.persist(wmp5);

            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    @AfterEach
    public void tearDown() {
//        Remove any data after each test was run
    }

    @Test
    public void testGetAllRecipes() {
        System.out.println("getAllRecipes");
        List<RecipeDTO> recipes = facade.getAllRecipes();
        assertEquals(12, recipes.size());
    }

    @Test
    public void testGetAllRecipeByPreparationTime() throws NotFoundException {
        System.out.println("getAllRecipeByPreparationTime");
        String preparationTime = recipe2.getPreparationTime();
        List<RecipeDTO> recipes = facade.getAllRecipeByPreparationTime(preparationTime);
        assertEquals(4, recipes.size());
    }

//    @Test
//    public void testGetAllRecipeByIngredient() throws NotFoundException {
//        System.out.println("getAllRecipeByIngredient");
//        Ingredient ingredient = recipe2.getIngredients().get(3);
//        List<RecipeDTO> recipes = facade.getAllRecipeByIngredients(ingredient);
//        assertEquals(3, recipes.size());
//    }

}
