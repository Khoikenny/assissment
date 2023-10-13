package string;

public class tinhbang {
    public static void main(String[] args) {
        System.out.println("i    m(i)");
        System.out.println("--------------");
        double sum = 0;
        for (int i = 1; i <= 20; i++) {
            sum += (double) i / (i + 1);
            System.out.printf("%-5d%-10.4f\n", i, sum);
        }
    }
}
