package chapter1.task_1_1;

public class Solution {

    public boolean isUnique(String text) {
        boolean[] characters = new boolean[128];
        for (int i = 0; i < text.length(); i++) {
            if(characters[text.charAt(i)]){
                return false;
            }
            characters[text.charAt(i)] = true;
        }

        return true;
    }
}
