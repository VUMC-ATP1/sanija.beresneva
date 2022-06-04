package homeworkTwo;

import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. UZDEVUMS");
        int x = 7;
        System.out.println("Skaitļa x vērtība ir: " + x);
        System.out.println("Skaitlis x ir pozitīvs: " + (x>0));
        System.out.println("Skaitlis x ir negatīvs: " + (x<0));
        System.out.println("Skaitlis x ir lielāks par 5 un ir mazāks vai vienāds par 10: " + ((x>5)&&(x<=10)));
        System.out.println("Skaitlis x nav mazāks vai vienāds par 5 un ir mazāks par 10: " + (!(x<=5)&&(x<10)));
        System.out.println("Skaitlis x ir vienāds ar 0 vai x ir vienāds ar 10: " + (x==0 || x==10));
        System.out.println("Skaitļa x*x reizinājums ir lielāks par 10: " + (x*x>10));

        System.out.println("\n\n2. UZDEVUMS");
        System.out.println("Ievadi mēneša numuru: ");
        int numberOfMonth = scanner.nextInt();
        switch (numberOfMonth){
            case 1:
                System.out.println(numberOfMonth + " - Janvāris");
                break;
            case 2:
                System.out.println(numberOfMonth + " - Februāris");
                break;
            case 3:
                System.out.println(numberOfMonth + " - Marts");
                break;
            case 4:
                System.out.println(numberOfMonth + " - Aprīlis");
                break;
            case 5:
                System.out.println(numberOfMonth + " - Maijs");
                break;
            case 6:
                System.out.println(numberOfMonth + " - Jūnijs");
                break;
            case 7:
                System.out.println(numberOfMonth + " - Jūlijs");
                break;
            case 8:
                System.out.println(numberOfMonth + " - Augusts");
                break;
            case 9:
                System.out.println(numberOfMonth + " - Septembris");
                break;
            case 10:
                System.out.println(numberOfMonth + " - Oktobris");
                break;
            case 11:
                System.out.println(numberOfMonth + " - Novembris");
                break;
            case 12:
                System.out.println(numberOfMonth + " - Decembris");
                break;
            default:
                System.out.println("Nekorekts mēneša cipars");
        }

        System.out.println("\n\n3. UZDEVUMS");
        System.out.println("Ievadi 1. skaitli:");
        int firstNumber = scanner.nextInt();
        System.out.println("Ievadi 2. skaitli:");
        int secondNumber = scanner.nextInt();
        System.out.println("Ievadi 3. skaitli:");
        int thirdNumber = scanner.nextInt();
        System.out.println("Lielākais skaitlis no trim ievadītājiem skaitļiem ir: " + Math.max(Math.max(firstNumber, secondNumber), thirdNumber));

        System.out.println("\n\n4. UZDEVUMS");
        System.out.println("Ievadi luksofora krāsu (sarkans/dzeltens/zaļš):");
        String color = scanner.next();
        if(color.equalsIgnoreCase("sarkans") || color.equalsIgnoreCase("dzeltens")) {
            System.out.println("Stāvēt un gaidīt zaļo gaismu.");
        }
        else if (color.equalsIgnoreCase("zaļš")){
            System.out.println("Var šķērsot krustojumu.");
        }
        else {
            System.out.println("Pārliecināties par situācijas drošību un tad šķērsot krustojumu.");
        }

        System.out.println("\n\n5. UZDEVUMS");
        for (int i=0; i<3; i++){
            printBusinessCard();
        }

        System.out.println("\n\n6. UZDEVUMS");
        printBusinessCardTwo("Līga", "Kalniņa", "+371 93740237", 1965);
        printBusinessCardTwo("Juris", "Vītols", "+371 43402370", 1930);

        System.out.println("\n\n7. UZDEVUMS");
        int summa = sum(4, 10);
        System.out.println(summa);

        System.out.println("\n\n8. UZDEVUMS");
        System.out.println(average(10, 2, 4));
    }
    public static void printBusinessCard(){
        System.out.println("\nVizītkarte\n#########");
        System.out.println("Vārds: Jānis");
        System.out.println("Uzvārds: Bērziņš");
        System.out.println("Telefona numurs: +371 22297349");
        System.out.println("Dzimšanas gads: 1990");
    }
    public static void printBusinessCardTwo(String name, String surname, String phoneNumber, int birthYear){
        System.out.println("\nVizītkarte\n#########");
        System.out.printf("Vārds: %s", name);
        System.out.printf("\nUzvārds: %s", surname);
        System.out.printf("\nTelefona numurs: %s", phoneNumber);
        System.out.printf("\nDzimšanas gads: %d\n", birthYear);
    }
    public static int sum(int num1, int num2){
        return num1 + num2;
    }
    public static double average(double num1, double num2, double num3){
        return (num1 + num2 + num3)/3;
    }
}
