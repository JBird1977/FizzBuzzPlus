public class FizzBuzzPlusApplication
{

    public static void main(String[] args)
    {
        for (int i = 1; i < 101; i++)
        {
            String answer = mainApplication(i);
            System.out.println(answer);
        }

    }
    public static String mainApplication(int inputNumber)
    {


        String numberToTest = String.valueOf(inputNumber);
        String result = "";

        result = fizzBuzzCoreCheck(inputNumber);
        if (result.equals("FizzBuzz"))
        {
            return result;
        }
        result = fizzBuzzPlusCheck(numberToTest);

        return result;
    }

    public static String fizzBuzzCoreCheck(int inputNumber)
    {
        String result = String.valueOf(inputNumber);
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

        return result;
    }

    public static String fizzBuzzPlusCheck(String numberToTest)
    {
        String result = numberToTest;
        boolean numberContainsThree = false;
        boolean numberContainsFive = false;
        for (char c : numberToTest.toCharArray())
        {
            if (c == '3')
            {
                numberContainsThree = true;
            }
            if (c == '5')
            {
                numberContainsFive = true;
            }
        }

        if (numberContainsThree)
        {
            result = "Fizz";
        }

        if (numberContainsFive)
        {
            result = "Buzz";
        }
        if (numberContainsThree && numberContainsFive)
        {
            result = "FizzBuzz";
        }

        return result;
    }
}


