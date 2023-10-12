package testfor;

class KilogramsPoundsConverter {
    public static void main(String[] args) {
        // Constants for conversion factors
        double KILOGRAMS_TO_POUNDS = 2.2;
        double POUNDS_TO_KILOGRAMS = 1 / KILOGRAMS_TO_POUNDS;

        // Display the table header
        System.out.println("Kilograms  Pounds | Pounds  Kilograms");
        System.out.println("------------------------------------");

        // Loop from 1 to 199 in steps of 2
        for (int kilograms = 1, pounds = 20; kilograms <= 30; kilograms += 2, pounds += 5) {
            double poundsValue = kilograms * KILOGRAMS_TO_POUNDS;
            double kilogramsValue = pounds * POUNDS_TO_KILOGRAMS;

            // Display the values in both tables side by side
            System.out.printf("%3d      %.2f | %5d    %.2f%n", kilograms, poundsValue, pounds, kilogramsValue);
        }
    }
}
