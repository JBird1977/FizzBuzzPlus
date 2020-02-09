import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzPlusTest
{

    @Test
    public void InputAOneExpectAOne()
    {
        String expected = "1";
        String actual = FizzBuzzPlusApplication.mainApplication(1);
        assertEquals(expected, actual);
    }

    @Test
    public void InputATwoExpectATwo()
    {
        String expected = "2";
        String actual = FizzBuzzPlusApplication.mainApplication(2);
        assertEquals(expected, actual);
    }

    @Test
    public void InputAThreeExpectFizz()
    {
        String expected = "Fizz";
        String actual = FizzBuzzPlusApplication.mainApplication(3);
        assertEquals(expected, actual);
    }


}
