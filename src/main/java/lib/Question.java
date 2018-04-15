package lib;

import java.util.ArrayList;
import java.util.HashMap;

public class Question {
    HashMap<String, String> map;
    private String correctCountry;
    private String correctCity;
    private ArrayList<String> cities;

    public Question(HashMap<String, String> map){
        this.map = map;
        setCorrectAnswers();
        setCities();
    }

    // Set the correct answer
    public void setCorrectAnswers(){
        // Pick a random number between 0-2
        int r = (int) (Math.random() * (3));
        // Get a list of all the keys
        ArrayList<String> keys = new ArrayList<String>(map.keySet());
        // Set the correct answers using the random number
        correctCountry = keys.get(r);
        correctCity = map.get(correctCountry);
    }

    // user input

    public String getCorrectCountry(){
        return correctCountry;
    }

    public ArrayList<String> getCities(){
        return cities;
    }

    private void setCities(){
        // Add each city to the array
        for (String key :  map.keySet()) {
            cities.add(map.get(key));
        }
    }
}
