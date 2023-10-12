package testfor;

public class multiplicationtable {
    public static void main(String[] args) {
        System.out.println("\t\t\t Multiplication table");
        System.out.println("       ");
        int j;
        for (j = 1; j < 10; j++) {
            System.out.print("   " + j);
        }
        System.out.println("\n--------------------------");
        for ( int i = 1; i < 10; i++){
            System.out.print(i + "|");
            for (j = 1; j < 10; j++) {
                System.out.printf("%4d",j * i);
                //%4d ở đây để nó có thể căn lệ cho câu cho nó dễ nhìn
                //đây là một công dụng khác của cái này khi mà nó chia hết thì nó sẽ ko hiện số
                //không mà thay vào đó là nó sẽ biến cái đó thành khoảng trống.'
            }
            System.out.println();
            //cái dòng này để dòng code nó xuống dòng tại vì mấy cái trên ko có cái nào xuôgns dòng
        }

    }

}
