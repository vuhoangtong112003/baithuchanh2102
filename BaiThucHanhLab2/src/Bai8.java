import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n,tong=0,tbc=0,num=0,count=0;
            System.out.print("Nhap vao so luong phan tu: ");
            n=scanner.nextInt();
            for(int i=0;i<n;i++){
                System.out.printf("Nhap vao phan tu thu "+(i+1)+": ");
                num=scanner.nextInt();
                count++;
                tong+=num;
            }
            tbc=tong/count;
            System.out.printf("Tbc cac so vua nhap la: %d", tbc);
    }
}