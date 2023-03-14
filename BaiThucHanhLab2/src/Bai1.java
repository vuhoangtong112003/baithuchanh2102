import java.text.DecimalFormat;
import java.util.Scanner;
 
public class Bai1
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
         
        System.out.println("Nhap vao so thu nhat: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Nhap vao so thu hai: ");
        int secondNumber = scanner.nextInt();
         
        // 1. Tính tổng, hiệu, tích, thương, phép chia lấy dư của 2 số đó.
        int tong = firstNumber + secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + tong);
         
        int hieu = firstNumber - secondNumber;
        System.out.println(firstNumber + " - " + secondNumber + " = " + hieu);
         
        int tich = firstNumber * secondNumber;
        System.out.println(firstNumber + " * " + secondNumber + " = " + tich);
         
        float thuong = (float) firstNumber / secondNumber;
        System.out.println(firstNumber + " / " + secondNumber + " = " + 
                decimalFormat.format(thuong));  // làm tròn thương đến 2 chữ số thập phân
         
        int phanDu = firstNumber % secondNumber;
        System.out.println(firstNumber + " % " + secondNumber + " = " + phanDu);
         
        // 2. Sử dụng các toán tử so sánh đã học để so sánh 2 số đó.
        System.out.println("Ket qua so sanh bang 2 so " + firstNumber + " va " + 
                secondNumber + " la " + (firstNumber == secondNumber));
        System.out.println("Ket qua so sanh khong bang 2 so " + firstNumber + " va " + 
                secondNumber + " la " + (firstNumber != secondNumber));
        System.out.println("Ket qua so sanh lon hon 2 so " + firstNumber + " va " + 
                secondNumber + " la " + (firstNumber > secondNumber));
        System.out.println("Ket qua so sanh lon hon hoac bang 2 so " + firstNumber + " va " + 
                secondNumber + " la " + (firstNumber >= secondNumber));
        System.out.println("Ket qua so sanh nho hon 2 so " + firstNumber + " va " + 
                secondNumber + " la " + (firstNumber < secondNumber));
        System.out.println("Ket qua so sanh nho hon hoac bang 2 so " + firstNumber + " va " + 
                secondNumber + " la " + (firstNumber <= secondNumber));
    }
 
}
