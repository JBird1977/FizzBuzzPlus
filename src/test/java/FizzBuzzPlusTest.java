import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzPlusTest
{

    @Test
    public void InputAOneExpectAOne()
    {
        int expected = 1;
        int actual = FizzBuzzPlusApplication.mainApplication(1);
        assertEquals(expected, actual);
    }

    @Test
    public void InputATwoExpectATwo()
    {
        int expected = 2;
        int actual = FizzBuzzPlusApplication.mainApplication(2);
        assertEquals(expected, actual);
    }


}
