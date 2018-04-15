package lib;

import java.util.ArrayList;
import java.util.HashMap;

public class Question {
    HashMap<String, String> map;
    String correctCity;


    public Question(HashMap<String, String> map){
        this.map = map;
        setCorrectCity();
    }

    // Set the correct answer
    public void setCorrectCity(){
        // Pick a random number between 0-2
        int r = (int) (Math.random() * (3));
        // Get a list of all the keys
        ArrayList<String> keys = new ArrayList<String>(map.keySet());
        // Set the correct answer using the random number
        correctCity = keys.get(r);
    }

    // user input
    // choose an answer
    // country


    // cities
}
