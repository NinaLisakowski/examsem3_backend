package facades;

import dto.RecipeDTO;
import entities.Recipe;
import errorhandling.NotFoundException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

/*
 * @author Nina
 */
public class RecipeFacade {

    private static RecipeFacade instance;
    private static EntityManagerFactory emf;

    private RecipeFacade() {
    }

    /**
     *
     * @param _emf
     * @return an instance of this facade class.
     */
    public static RecipeFacade getRecipeFacade(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new RecipeFacade();
        }
        return instance;
    }

    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public List<RecipeDTO> getAllRecipes() {
        EntityManager em = getEntityManager();
        List<RecipeDTO> rDTOList = new ArrayList();
        try {
            TypedQuery<Recipe> q = em.createNamedQuery("Recipe.getAll", Recipe.class);
            for (Recipe r : q.getResultList()) {
                rDTOList.add(new RecipeDTO(r));
            }
            return rDTOList;
        } finally {
            em.close();
        }
    }

    public List<RecipeDTO> getAllRecipeByPreparationTime(String preparationTime) throws NotFoundException {
        EntityManager em = getEntityManager();
        List<RecipeDTO> rDTOList = new ArrayList();
        try {
            TypedQuery<Recipe> q = em.createQuery("SELECT r FROM Recipe r WHERE r.preparationTime = :preparationTime", Recipe.class
            ).setParameter("preparationTime", preparationTime);
            for (Recipe r : q.getResultList()) {
                rDTOList.add(new RecipeDTO(r));
            }
            return rDTOList;
        } finally {
            em.close();
        }
    }

//    List<RecipeDTO> getAllRecipeByIngredients(Ingredient ingredient) {
//        EntityManager em = getEntityManager();
//        List<RecipeDTO> rDTOList = new ArrayList();
//        try {
//            TypedQuery<Recipe> q = em.createQuery("SELECT r FROM Recipe r WHERE r.ingredients = :ingredient", Recipe.class
//            ).setParameter("ingredient", ingredient);
//            for (Recipe r : q.getResultList()) {
//                rDTOList.add(new RecipeDTO(r));
//            }
//            return rDTOList;
//        } finally {
//            em.close();
//        }
//    }

}

//    public PersonDTO getPersonByPhone(String phone) throws NotFoundException {
//        EntityManager em = getEntityManager();
//        try {
//            Person p = em.createQuery("SELECT p FROM Person p WHERE p.phone = :phone", Person.class).setParameter("phone", phone).getSingleResult();
//            if (p == null) {
//                throw new NotFoundException("No person found with this phone");
//            }
//            return new PersonDTO(p);
//        } finally {
//            em.close();
//        }
//    }
//    
//public List<PersonDTO> getPersonsFromHobby(String hobby) throws NotFoundException {
//        EntityManager em = getEntityManager();
//        List<PersonDTO> phDTOList = new ArrayList();
//        try {
//            Hobby q = em.createQuery("SELECT h FROM Hobby h WHERE h.name = :hobby", Hobby
//
//.class  
//
//
//).setParameter("hobby", hobby).getSingleResult();
//            for (Person p : q.getPersons()) {
//                phDTOList.add(new PersonDTO(p));
//            }
//            return phDTOList;
//        } finally {
//            em.close();
//        }
//    }
//    

