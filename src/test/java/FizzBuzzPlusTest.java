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


}
