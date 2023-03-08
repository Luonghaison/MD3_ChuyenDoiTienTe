import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int tigia = 23000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền usd cần chuyển đổi: ");
        int a = sc.nextInt();
        System.out.println("Số tiền việt là: "+(a*tigia));

    }

}