package lib;

import java.util.ArrayList;
import java.util.HashMap;

public class Question {
    HashMap<String, String> map;
    String correctAnswer;


    public Question(HashMap<String, String> map){
        this.map = map;
        setCorrectAnswer();
    }

    // Set the correct answer
    public void setCorrectAnswer(){
        // Pick a random number between 0-2
        int r = (int) (Math.random() * (3));
        // Get a list of all the kets
        ArrayList<String> keys = new ArrayList<String>(map.keySet());
        // Set the correct answer using the random number
        correctAnswer = keys.get(r);
    }

    // user input
    // choose an answer
    // country
    // cities
}
