public class FizzBuzzPlusApplication
{
    public static String mainApplication(int inputNumber)
    {
        String result = "";

        result = String.valueOf(inputNumber);

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

}
