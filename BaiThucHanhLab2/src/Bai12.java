import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int hang,cot;
        do{
            System.out.println("Nhap so hang: ");
            hang=scanner.nextInt();
        }while(hang<=0);
        do{
            System.out.println("Nhap so hang: ");
            cot=scanner.nextInt();
        }while(cot<=0);

        int a[][]=new int[hang][cot];
        System.out.println("Nhap cac phan tu trong mang: ");
        for(int i=0;i<hang;i++){
            for(int j=0;j<cot;j++){
                System.out.printf("Nhap a[%d,%d]= ",i,j);
                a[i][j]=scanner.nextInt();
            }
        } 
        int max=a[0][0];
        int a_i=0,a_j=0;
        for(int i=0;i<hang;i++){
            for(int j=0;j<cot;j++){
                if(a[i][j]>max)
                max=a[i][j];
                a_i=i;
                a_j=j;
            }
        }  
        System.out.printf("Phan tu co gia tri lon nhat la a[%d,%d]= %d",a_i,a_j,max);
    }
}