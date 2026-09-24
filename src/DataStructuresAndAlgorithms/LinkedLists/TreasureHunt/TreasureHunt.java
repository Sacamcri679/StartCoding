package DataStructuresAndAlgorithms.LinkedLists.TreasureHunt;

import java.util.LinkedList;

public class TreasureHunt {
    public static void main(String[] args) {
        LinkedList<String> clues = new LinkedList<>();
        clues.add("Check inside the mailbox");
        clues.add("Go to the fountain in the park");
        clues.add("look for the oak tree");
        clues.add("Turn right at the bench");
        clues.add("Go to the red post box");
        clues.add("Enter the coffee shop");
        clues.add("Look for the brown sofa");
        System.out.println(clues);

        clues.set(2, "Look behind the old Oak tree");
        System.out.println("Updated clues : " + clues);

        String firstClue = clues.get(0);
        System.out.println("First clue: " + firstClue);

        String secondClue = clues.get(1);
        System.out.println("Second clue: " +  secondClue);

        clues.removeLast();
        System.out.println(clues);
    }
}
