package coursework;

import coursework.lib.Question;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class QuestionTests {

    private boolean arrayContains(String[] array, String item){
        for (String a : array){
            if (a.equals(item))
                return true;
        }
        return false;
    }

    @Test
    public void testQuestion() {
        HashMap<String, String> map = new HashMap<>();
        map.put("testcountry1", "testcity1");
        map.put("testcountry2", "testcity2");
        map.put("testcountry3", "testcity3");
        Question test = new Question(map);
        String output = test.getCorrectCountry();

        String[] countries = { "testcountry1", "testcountry2", "testcountry3" };

        // The order is not guaranteed hence this approach for testing
        Assert.assertTrue(arrayContains(countries, output));
        Assert.assertEquals(map.get(output), test.getCorrectCity());

        Assert.assertFalse(test.getCorrect());
        Assert.assertTrue(test.answer(test.getCorrectCountryNumber()+1));

        test.setCorrect(true);
        Assert.assertTrue(test.getCorrect());

        String[] cities = { "testcity1", "testcity2", "testcity3" };

        // The order is not guaranteed hence this approach for testing
        Assert.assertEquals(3, test.getCities().size());
        for (String city : cities){
            Assert.assertTrue(test.getCities().contains(city));
        }

    }


}
