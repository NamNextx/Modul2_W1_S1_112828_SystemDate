import java.sql.SQLOutput;
import java.util.Date;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Moi ban nhap vao a:");
        int a = sc.nextInt();
//        System.out.print("Moi ban nhap vao b:");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("Sum of "+a+" Va "+b+" = "+sum);

        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào tên người yêu cũ  : ");
        String mylove_old = input.nextLine();
        System.out.println("Tên người yêu cũ : "+mylove_old);
        Date date = new Date();
        System.out.print("Thoi gian cua he thong la; " + date);
        // Bai tap 2
        createValue();
    }

    static void createValue() {
        /*
        Biến i kiểu số nguyên, có giá trị là 10
        Biến f kiểu số thực, có giá trị là 20.5
        Biến d kiểu số thực lớn, có giá trị là 20.5
        Biến b kiểu logic, có giá trị là true
        Biến c kiểu ký tự, có giá trị là 'a'
        Biến s kiểu chuỗi, có giá trị là "Hà Nội".
         */
        int a = 10;
        float f=20.5f;
        double d=20.5;
        boolean b=true;
        char c='a';
        String S="Ha Noi";

        System.out.println("a= "+a);
        System.out.println("f= "+f);
        System.out.println("d= "+d);
        System.out.println("b= "+b);
        System.out.println("c= "+c);
        System.out.println("S= "+S);

    }

}
