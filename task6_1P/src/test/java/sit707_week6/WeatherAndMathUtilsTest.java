package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class WeatherAndMathUtilsTest {

    @Test
    public void testStudentIdentity() {
        String studentId = "your_student_id"; // Replace with your actual student ID
        Assert.assertNotNull("Student ID is null", studentId);
    }

    @Test
    public void testStudentName() {
        String studentName = "your_name"; // Replace with your actual name
        Assert.assertNotNull("Student name is null", studentName);
    }
    
    @Test
    public void testFalseNumberIsEven() {
        Assert.assertFalse(WeatherAndMathUtils.isEven(1));
    }

    @Test
    public void testTrueNumberIsEven() {
        Assert.assertTrue(WeatherAndMathUtils.isEven(2));
    }
    
    @Test
    public void testCancelWeatherAdvice() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(70.1, 0.0));
    }

    @Test
    public void testWarnWeatherAdvice() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(46.0, 5.0));
    }
    
    @Test
    public void testAllClearWeatherAdvice() {
        Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(10.0, 2.0));
    }
    
    @Test
    public void testIsPrime() {
        Assert.assertTrue(WeatherAndMathUtils.isPrime(2));
        Assert.assertTrue(WeatherAndMathUtils.isPrime(3));
        Assert.assertFalse(WeatherAndMathUtils.isPrime(4));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testNegativeWindSpeed() {
        WeatherAndMathUtils.weatherAdvice(-1, 1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testNegativePrecipitation() {
        WeatherAndMathUtils.weatherAdvice(1, -1);
    }
}
