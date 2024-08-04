import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int units = scanner.nextInt();

        int bill = calculateElectricityBill(units);
        System.out.println("Rs." + bill);
    }
    public static int calculateElectricityBill(int units) {
        int bill = 0;

        if (units <= 200) {
            bill = units * 50;  // 0.5 paise = 50 paise = Rs.0.50
        } else if (units <= 400) {
            bill = (200 * 50) + ((units - 200) * 65) + 100;  // Rs.100 extra charge
        } else if (units <= 600) {
            bill = (200 * 50) + (200 * 65) + ((units - 400) * 80) + 200;  // Rs.200 extra charge
        } else if (units > 600) {
            bill = (200 * 50) + (200 * 65) + (200 * 80) + ((units - 600) * 125) + 425;  // Rs.425 extra charge
        }
        return bill;
    }
}
