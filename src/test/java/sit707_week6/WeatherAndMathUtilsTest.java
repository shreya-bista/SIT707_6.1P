package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class WeatherAndMathUtilsTest {
	
	public String CANCEL = "CANCEL";
	public String ALL_CLEAR = "ALL CLEAR";
	public String WARN = "WARN";
	
	@Test
	public void testStudentIdentity() {
		String studentId = "224114235";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Shreya Bista";
		Assert.assertNotNull("Student name is null", studentName);
	}
	
	@Test
	public void testFalseNumberIsEven() {
		Assert.assertTrue(WeatherAndMathUtils.isEven(8));
	}
	
    @Test
    public void testCancelWeatherAdvice() {
    	Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(70.1, 0.0));
    }
    
    
    @Test
    public void testWindSpeedAndPptCancel1() {
    	String actual = WeatherAndMathUtils.weatherAdvice(71, 7);
    	
    	Assert.assertEquals(CANCEL, actual);
    }
    
    @Test
    public void testWindSpeedAndPptCancel2() {
    	String actual = WeatherAndMathUtils.weatherAdvice(46, 5);
    	
    	Assert.assertEquals(CANCEL, actual);
    }
    
    @Test
    public void testWindSpeedAndPptAllClear() {
    	String actual = WeatherAndMathUtils.weatherAdvice(44, 3);
    	
    	Assert.assertEquals(ALL_CLEAR, actual);
    }
    @Test
    public void testWindSpeedAndPptWarn() {
    	String actual = WeatherAndMathUtils.weatherAdvice(46, 3);
    	
    	Assert.assertEquals(WARN, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIllegalArgumentExceptionWhenBothNegative() {
    	WeatherAndMathUtils.weatherAdvice(-10.0, -5.0);
    }

    @Test
    public void testNoIllegalArgumentExceptionWhenPositiveValues() {
        // Ensure no exception is thrown when valid input is provided
        Assert.assertNotNull(WeatherAndMathUtils.weatherAdvice(10.0, 5.0));
    }
    
//    Testing isEven:
//    	Even number:
//    	Input: a = 4
//    	Expected Output: true
//    	Explanation: 4 is an even number.
    
    @Test
    public void testIsEvenTrueConditon() {
    	boolean actual = WeatherAndMathUtils.isEven(4);
    	Assert.assertTrue(actual);
    }
    
//    	Odd number:
//    	Input: a = 7
//    	Expected Output: false
//    	Explanation: 7 is an odd number.
    @Test
    public void testIsEvenFalseConditon() {
    	boolean actual = WeatherAndMathUtils.isEven(7);
    	Assert.assertFalse(actual);
    }
    
    
//    	Zero:
//    	Input: a = 0
//    	Expected Output: true
//    	Explanation: 0 is an even number.
    
    @Test
    public void testIsEvenZeroConditon() {
    	boolean actual = WeatherAndMathUtils.isEven(0);
    	Assert.assertTrue(actual);
    }
    
    
//    	Negative even number:
//    	Input: a = -6
//    	Expected Output: true
//    	Explanation: -6 is an even number.
    
    @Test
    public void testIsEvenNegativeConditon() {
    	boolean actual = WeatherAndMathUtils.isEven(-6);
    	Assert.assertTrue(actual);
    }
    
//    	Negative odd number:
//    	Input: a = -9
//    	Expected Output: false
//    	Explanation: -9 is an odd number.
    
    @Test
    public void testIsEvenNegativeOddConditon() {
    	boolean actual = WeatherAndMathUtils.isEven(-9);
    	Assert.assertFalse(actual);
    }
    
//    	Testing isPrime:
//    	Prime number:
//    	Input: n = 7
//    	Expected Output: true
//    	Explanation: 7 is a prime number.
    @Test
    public void testIsPrimeTrueConditon() {
    	boolean actual = WeatherAndMathUtils.isPrime(7);
    	Assert.assertTrue(actual);
    }
    
    
    
//    	Non-prime number:
//    	Input: n = 10
//    	Expected Output: false
//    	Explanation: 10 is not a prime number.
    

    @Test
    public void testIsPrimeFalseConditon() {
    	boolean actual = WeatherAndMathUtils.isPrime(10);
    	Assert.assertFalse(actual);
    }
    
//    	Edge case: 1:
//    	Input: n = 1
//    	Expected Output: true
//    	Explanation: 1 is not considered a prime number.
    

    @Test
    public void testIsPrime1Conditon() {
    	boolean actual = WeatherAndMathUtils.isPrime(1);
    	Assert.assertTrue(actual);
    }
    
//    	Edge case: Negative number:
//    	Input: n = -5
//    	Expected Output: false
//    	Explanation: -5 is not a prime number.
    
    @Test
    public void testIsPrimeNegativeConditon() {
    	boolean actual = WeatherAndMathUtils.isPrime(-5);
    	Assert.assertTrue(actual);
    }
    
//    	Edge case: Large prime number:
//    	Input: n = 997
//    	Expected Output: true
//    	Explanation: 997 is a prime number.
    @Test
    public void testIsPrimeLargeNumberTrueConditon() {
    	boolean actual = WeatherAndMathUtils.isPrime(997);
    	Assert.assertTrue(actual);
    }
//    	Edge case: Large non-prime number:
//    	Input: n = 1000
//    	Expected Output: false
//    	Explanation: 1000 is not a prime number.
    @Test
    public void testIsPrimeLargeNumberFalseConditon() {
    	boolean actual = WeatherAndMathUtils.isPrime(1000);
    	Assert.assertFalse(actual);
    }
}
