import java.util.Scanner;

public class BillSplitter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hey There! Wanna Split Your Bill");
        System.out.println("Choose Your Currency:\n 1. Indian Rupee \n 2. Dollars \n 3. Euros");
        System.out.println("Enter 1 or 2 or 3 :)");
        int choice = in.nextInt();
        double bill;
        int n;
        double splitbill;
        switch (choice) {
            case 1:
                System.out.println("Enter your bill in Rupees (ex:123.42): ");
                bill = in.nextFloat();
                System.out.println("How many people are you there?");
                n = in.nextInt();
                splitbill = bill / n;
                double rupees = Math.floor(splitbill);
                double paise = splitbill % 1;
                String pais = String.valueOf(paise).substring(2, 4) + " Paise";
                System.out.println("You Can Split Your Bill in to: " + rupees + " Rupees and " + pais);
                break;
            case 2:
                System.out.println("Enter your bill in Dollars (ex:12.33): ");
                bill = in.nextFloat();
                System.out.println("How many people are you there?");
                n = in.nextInt();
                splitbill = bill / n;
                double dollars = Math.floor(splitbill);
                double cents = splitbill % 1;
                String cent = String.valueOf(cents).substring(2, 4) + " Cents";
                System.out.println("You Can Split Your Bill in to: " + dollars + " Dollars and " + cent);
                break;
            case 3:
                System.out.println("Enter your bill in Pounds (ex:23.23): ");
                bill = in.nextFloat();
                System.out.println("How many people are you there?");
                n = in.nextInt();
                splitbill = bill / n;
                double pounds = Math.floor(splitbill);
                double penny = splitbill % 1;
                String pence = String.valueOf(penny).substring(2, 4) + " Pence";
                System.out.println("You Can Split Your Bill in to: \n " + pounds + " Pounds and " + pence);
                break;

            default:
                break;
        }

    }
}