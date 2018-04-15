package coursework;

import coursework.lib.Question;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class QuestionTests {

    @Test
    public void testSomething(){
        HashMap<String, String> map = new HashMap<>();
        map.put("testcountry1", "testcity2");
        map.put("testcountry2", "testcity2");
        map.put("testcountry3", "testcity2");
        Question test = new Question(map);
        String output = test.getCorrectCountry();
        Assert.assertEquals("testcountry" + (test.getCorrectCountryNumber()), output);
    }
}
