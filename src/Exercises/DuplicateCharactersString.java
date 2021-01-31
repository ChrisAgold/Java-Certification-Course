package Exercises;

public class DuplicateCharactersString {
    public static void main(String[] args) {
        // Find duplicate Characters
        String sentence = "How many duplicates are there?";
        System.out.println(sentence);
        // Store all characters
        String characters = "";
        // Store all duplicate characters
        String duplicates = "";
        for (int i = 0; i < sentence.length(); i++) {
            String current = Character.toString(sentence.charAt(i));
            // find duplicates
            if (characters.contains(current)) {
                if (!duplicates.contains(current))
                    // add to duplicates
                    duplicates += current + ",";
            }
            // add characters to String characters
            characters += current;
        }
        System.out.println(duplicates);
    }
}