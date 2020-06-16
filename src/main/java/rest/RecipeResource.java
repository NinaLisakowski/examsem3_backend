package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import errorhandling.NotFoundException;
import facades.RecipeFacade;
import javax.persistence.EntityManagerFactory;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import utils.EMF_Creator;
import utils.EMF_Creator.DbSelector;
import utils.EMF_Creator.Strategy;

@Path("recipes")
public class RecipeResource {

    private static final EntityManagerFactory EMF = EMF_Creator.createEntityManagerFactory(DbSelector.DEV, Strategy.CREATE);
    private static final RecipeFacade FACADE = RecipeFacade.getRecipeFacade(EMF);
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public String demo() {
        return "{\"msg\":\"Hello World\"}";
    }
    
    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public String getAllRecipes() {
        return GSON.toJson(FACADE.getAllRecipes());
    }

    @GET
    @Path("/preparationTime/{preparationTime}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getRecipesByPreparationTime(@PathParam("preparationTime") String preparationTime) throws NotFoundException{
        return GSON.toJson(FACADE.getAllRecipeByPreparationTime(preparationTime));
    }

}
