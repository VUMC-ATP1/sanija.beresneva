package homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LoopHomeWork
{
    public static final int  PIN_CODE = 1234;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. UZDEVUMS");
        int sum = 0;
        while(sum<=100){
            System.out.println("Ievadi veselu skaitli");
            int number = scanner.nextInt();
            sum=sum+number;
            if (sum>100) {
                System.out.println("Gatavs");
                break;
            }
        }


        System.out.println("2. UZDEVUMS");
        System.out.println("Ievadi veselu skaitli, lai pārbaudītu, vai tas ir pirmskaitlis");
        int number = scanner.nextInt();
        System.out.println("Ir pirmskaitlis: " + isPrime(number));


        System.out.println("3. UZDEVUMS");
        int[] intArray = {3, 5, 1, 2, 3, 4, 5, 876, 5, 44, 3};
        String[] stringArray = {"dog", "cat", "mouse", "tiger", "zebra"};
        char[] charArray = {'a', 'b', 'c', '1', '2', '3', '!', 63};
        int i = 0;

        System.out.println("int datu tipa masīvs while ciklā:");
        while(i<intArray.length){
            System.out.print(intArray[i] + " ");
            i++;
        }

        i=0;
        System.out.println("\n\nString datu tipa masīvs while ciklā:");
        while(i<stringArray.length){
            System.out.print(stringArray[i] + " ");
            i++;
        }

        i=0;
        System.out.println("\n\nchar datu tipa masīvs while ciklā:");
        while(i<charArray.length){
            System.out.print(charArray[i] + " ");
            i++;
        }

        i=0;
        System.out.println("\n\nint datu tipa masīvs do while ciklā:");
        do {
            System.out.print(intArray[i] + " ");
            i++;
        }
        while (i<intArray.length);

        i=0;
        System.out.println("\n\nString datu tipa masīvs do while ciklā:");
        do {
            System.out.print(stringArray[i] + " ");
            i++;
        }
        while (i<stringArray.length);

        i=0;
        System.out.println("\n\nchar datu tipa masīvs do while ciklā:");
        do {
            System.out.print(charArray[i] + " ");
            i++;
        }
        while (i<charArray.length);

        i=0;
        System.out.println("\n\nint datu tipa masīvs for ciklā:");
        for(i=0; i<intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }

        i=0;
        System.out.println("\n\nString datu tipa masīvs for ciklā:");
        for(i=0; i<stringArray.length; i++){
            System.out.print(stringArray[i] + " ");
        }

        i=0;
        System.out.println("\n\nchar datu tipa masīvs for ciklā:");
        for(i=0; i<charArray.length; i++){
            System.out.print(charArray[i] + " ");
        }

        System.out.println("\n\nint datu tipa masīvs for each ciklā:");
        for (int elements : intArray) {
            System.out.print(elements + " ");
        }

        System.out.println("\n\nString datu tipa masīvs for each ciklā:");
        for (String elements : stringArray) {
            System.out.print(elements + " ");
        }

        System.out.println("\n\nchar datu tipa masīvs for each ciklā:");
        for (char elements : charArray) {
            System.out.print(elements + " ");
        }

        System.out.println("\n\n4. UZDEVUMS");
        Random random = new Random();
        int[] evenNumbers = new int[100];
        for (i=0; i<evenNumbers.length; i++){
            evenNumbers[i] = random.nextInt(100)*2;
        }

        System.out.println(Arrays.toString(evenNumbers));


        System.out.println("\n\n5. UZDEVUMS");
        System.out.println("Ievadi veselu skaitli, kam vēlies aprēķināt faktoriālo vērtību");
        long number2 = scanner.nextLong();
        System.out.println(aprekinatFaktorialaVertibu(number2));

        i=1;
        System.out.println("\n\n6. UZDEVUMS");
        System.out.println("Ievadi PIN kodu");
        do {
            int pin = scanner.nextInt();
            if(PIN_CODE == pin){
                System.out.println("PIN ir pieņemts, laipni lūdzam atpakaļ");
                break;
            } else if (i==3 && PIN_CODE != pin) {
                System.out.println("Atvainojiet, bet jūs esat bloķēts");
                break;
            } else {
                System.out.println("Nepareizs PIN, mēģiniet vēlreiz");
            }
            i++;
        }
        while(i<4);
    }

    public static long aprekinatFaktorialaVertibu(long number) {
        long value = 1;
        for(long i = number; i>0; i--){
            value = value * i;
        }
        return value;
    }

    public static boolean isPrime(int number) {
        if(number<2) return false;
        if (number!=2 && number%2==0) return false;
        for(int i=3;i*i<=number;i+=2) {
            if(number%i==0) return false;
        }
        return true;
    }
}
