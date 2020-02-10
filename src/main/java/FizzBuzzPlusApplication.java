public class FizzBuzzPlusApplication
{
    public static String mainApplication(int inputNumber)
    {
        String result = String.valueOf(inputNumber);
        boolean resultContainsThree = false;
        boolean resultContainsFive = false;

        if (inputNumber % 3 == 0)
        {
            result = "Fizz";
        }

        if (inputNumber % 5 == 0)
        {
            result = "Buzz";
        }

        if (inputNumber % 15 == 0)
        {
            result = "FizzBuzz";
        }

        if (result == "FizzBuzz")
        {
            return result;
        }

        for (char c : result.toCharArray())
        {
            if (c == '3')
            {
                resultContainsThree = true;
            }
            if (c == '5')
            {
                resultContainsFive = true;
            }
        }

        if (resultContainsThree)
        {
            result = "Fizz";
        }

        if (resultContainsFive)
        {
            result = "Buzz";
        }
        if (resultContainsThree && resultContainsFive)
        {
            result = "FizzBuzz";
        }

        return result;
    }

}
