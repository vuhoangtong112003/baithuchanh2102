import java.util.Scanner;

public class Min {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        int a,b,min=0;
        System.out.print("Nhap so thu a:"); a=scanner.nextInt();
        System.out.print("Nhap so thu b:"); b=scanner.nextInt();
        if(a>b)
        min=b;
        else
        min=a;
        System.out.println(("Min la:"+min));
    }
}

     

