package TaxiMeter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int distance;
        double perKm = 2.20, total, startPrice = 10.0;

        Scanner input = new Scanner(System.in);

        System.out.print("Gidilen Mesafe: ");
        distance = input.nextInt();

        total = distance * perKm;
        total += startPrice;

        total = (total < 20) ? 20 : total;

        System.out.print("Ücret: " + total);

    }

}