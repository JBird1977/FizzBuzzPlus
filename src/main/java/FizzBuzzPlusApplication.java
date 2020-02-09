public class FizzBuzzPlusApplication
{
    public static String mainApplication(int inputNumber)
    {
        if (inputNumber == 3)
        {
            return "Fizz";
        }

        if (inputNumber == 5)
        {
            return "Buzz";
        }

        if (inputNumber == 15)
        {
            return "FizzBuzz";
        }
        return String.valueOf(inputNumber);
    }

}
