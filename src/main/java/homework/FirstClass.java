package homework;

public class FirstClass {
    public static void main(String[] args) {
        String countryName = "Nepal";
        int population = 29140000;
        int totalArea = 147516;
        String capital = "Kathmandu";
        String officialLanguage = "Nepali";
        boolean isEUCountry = false;
        char currency = 'र';

        System.out.println("The capital city of " + countryName + " is " + capital +
                ". \nTotal area of " + countryName + " is " + totalArea + " square kilometers. \nPopulation: " + population +
                " people. \nThe official language in " + countryName + " is " + officialLanguage +
                ". \n" + currency + " is the official currency of " + countryName +
                ". \nIs " + countryName + " an EU country? " + isEUCountry);

        System.out.println("\n*** ARITMĒTISKIE OPERATORI ***");
        int a = 10;
        int b = 3;
        int c = 7;

        float d = 9f;
        float e = 3f;
        float f = 6f;

        System.out.println("\nSaskaitīšana");
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " + " + c + " = " + (a + c));
        System.out.println(b + " + " + c + " = " + (b + c));

        System.out.println("\nAtņemšana");
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " - " + c + " = " + (a - c));
        System.out.println(b + " - " + c + " = " + (b - c));

        System.out.println("\nReizināšana");
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " * " + c + " = " + (a * c));
        System.out.println(b + " * " + c + " = " + (b * c));

        System.out.println("\nDalīšana");
        System.out.println(d + " / " + e + " = " + (d / e));
        System.out.println(d + " / " + f + " = " + (d / f));
        System.out.println(f + " / " + e + " = " + (f / e));

        System.out.println("\nAtlikums");
        System.out.println(a + " % " + b + " = " + (a % b));
        System.out.println(a + " % " + c + " = " + (a % c));
        System.out.println(c + " % " + b + " = " + (c % b));
    }
}
