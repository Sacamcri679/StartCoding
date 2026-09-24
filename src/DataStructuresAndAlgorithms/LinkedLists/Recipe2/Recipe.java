package DataStructuresAndAlgorithms.LinkedLists.Recipe2;

import java.util.LinkedList;
import java.util.ListIterator;

public class Recipe {
    public static void main(String[] args) {
        //Using ListIterator to traverse the list
        LinkedList<String> recipeSteps = new LinkedList<>();
        ListIterator<String> iterator = recipeSteps.listIterator();
        //adding steps to the recipe
        recipeSteps.add("Preheat the oven to 350°F.");
        recipeSteps.add("Mix flour and sugar");
        recipeSteps.add("Add eggs and milk");
        //adding step at the beginning
        recipeSteps.addFirst("Gather all ingredients");
        //adding a step at the end
        recipeSteps.addLast("Serve and Enjoy.");
        System.out.println("Recipe Steps: " + recipeSteps);
        //adding a step at a specific position (index 2)
        recipeSteps.add(2, "Whisk the eggs before adding");
        System.out.println("Recipe Steps after adding in the middle: " + recipeSteps);

        //Removing the first step
        recipeSteps.removeFirst();
        System.out.println("Recipe Steps after removing first element: " + recipeSteps);

        //Removing the last step
        recipeSteps.removeLast();
        System.out.println("Recipe Steps after removing the last step: " + recipeSteps);

        //Removing a step at a specific position
        recipeSteps.remove(1);
        System.out.println("Recipe Steps after removing a step from the middle" + recipeSteps);

        //Forward traverse
        System.out.println("Traversing forward through the recipe");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Backward traversing
        System.out.println("\nTraversing backward through the recipe:");
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }

        //if you want to stop the traverse you can include an if statement inside the while loop
        while(iterator.hasPrevious()){
            String step = iterator.previous();
            if(step.equals("Mix flour and sugar")) {
                break; //Stop traversal when specific step is found
            }
        }
    }
}
