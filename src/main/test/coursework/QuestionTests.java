package coursework;

import coursework.lib.Question;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class QuestionTests {

    private boolean arrayContains(String[] array, String item){
        for (String a : array){
            if (a.equals(item))
                return true;
        }
        return false;
    }

    @Test
    public void testSomething() {
        HashMap<String, String> map = new HashMap<>();
        map.put("testcountry1", "testcity2");
        map.put("testcountry2", "testcity2");
        map.put("testcountry3", "testcity2");
        Question test = new Question(map);
        String output = test.getCorrectCountry();

        String[] array = { "testcountry1", "testcountry2", "testcountry3" };

        Assert.assertTrue(arrayContains(array, output));
    }


}
