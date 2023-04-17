package Shapes;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat  {
    
    Scanner scanner=new Scanner(System.in);
    public void Vuong(){
        name="Hinh Vuong";
    }
    public void NhapCanh(){
        System.out.println("Nhap canh: ");
        dai=rong=scanner.nextFloat();
    }
}

