package testfor;
//(Conversion from kilograms to pounds) Write a program that displays the follow
// ing table (note 1 kilogram is 2.2 pounds):
public class kilogramstopounds {
    public static void main(String[] args) {
        double kilogram_to_pounds=2.2;
        for(int k =1; k <=200;k+=2){
            double total = k *kilogram_to_pounds;
            System.out.printf("%3d \t %.1f%n", k, total);
        }

    }
}
