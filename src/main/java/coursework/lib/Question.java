package coursework.lib;

import java.util.ArrayList;
import java.util.HashMap;

public class Question {
    HashMap<String, String> map;
    private String correctCountry;
    private int correctCountryNumber;
    private String correctCity;
    private ArrayList<String> cities = new ArrayList<>();
    // The Question is wrong until answered correctly
    private Boolean correct = false; // here not sure where the set method is but i think i made one

    /**
     * Constructor for the class
      * @param map - A {@link HashMap} of the random countries and capitals from the DB
     */
    public Question(HashMap<String, String> map){
        this.map = map;
        setCorrectAnswers();
        setCities();
    }

    // Set the correct answers
    private void setCorrectAnswers(){
        // Pick a random number between 0-2
        correctCountryNumber = (int) (Math.random() * (3));
        // Get a list of all the keys
        ArrayList<String> keys = new ArrayList<String>(map.keySet());
        // Set the correct answers using the random number
        correctCountry = keys.get(correctCountryNumber);
        correctCity = map.get(correctCountry);
    }

    /**
     * User submits the answer to the question
     * @param i - {@link int} value of the answer
     * @return {@link boolean} - True if the answer is correct
     */
    public boolean answer(int i){
        // Array is zero index, user will input 1,2,3
        return i - 1 == correctCountryNumber;
    }

    /**
     * Get the correct country, used in framing the question
     * @return {@link String} - The correct country
     */
    public String getCorrectCountry(){
        return correctCountry;
    }

    /**
     * Get the correct country number, used in framing the question
     * @return {@link String} - The correct country
     */
    public int getCorrectCountryNumber(){
        return correctCountryNumber;
    }

    /**
     * Get the list of cities for a question
     * @return {@link ArrayList} - Of {@link String} city names
     */
    public ArrayList<String> getCities(){
        return cities;
    }

    // Build a list opf cities
    private void setCities(){
        // Add each city to the array
        for (String key :  map.keySet()) {
            cities.add(map.get(key));
        }
    }

    /**
     * Set the answer to the question
     * @param bol - A {@link Boolean} for the answer - true is answered correctly
     */
    public void setCorrect(boolean bol){
        correct = bol;
    }

    /**
     * Has the question been answered correctly
     * @return {@link Boolean} - Ture is the question has been answered correctly
     */
    public Boolean getCorrect(){
        return correct;
    }
}
