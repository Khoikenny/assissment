import java.util.Scanner;
        public class Q9 {
            public static void main(String[] args) {
                Scanner inputLine= new Scanner(System.in);
                System.out.println(" Please enter the length of a side of a hexagon");
                double S = inputLine.nextDouble();
                double A= (3* Math.sqrt(3)) * (S * S) / 2 ;
                System.out.printf(" the area of the hexagon with side %.2f is %.2f\n",S,  A );

            }
        }
