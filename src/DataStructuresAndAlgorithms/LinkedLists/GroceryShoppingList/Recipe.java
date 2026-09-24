package DataStructuresAndAlgorithms.LinkedLists.GroceryShoppingList;

import java.util.LinkedList;

public class Recipe {
    public static void main(String[] args) {
        LinkedList<String> recipeSteps = new LinkedList<>();
        recipeSteps.add("Milk");
        recipeSteps.add("Bread");
        recipeSteps.add("Eggs");
        recipeSteps.add("Butter");
        recipeSteps.add("Tomatoes");

        System.out.println(recipeSteps);

        recipeSteps.set(2, "Whole wheat bread");
        System.out.println(recipeSteps);

        recipeSteps.remove(3);
        System.out.println(recipeSteps);

        recipeSteps.add("Cheese");
        System.out.println(recipeSteps);
    }
}
