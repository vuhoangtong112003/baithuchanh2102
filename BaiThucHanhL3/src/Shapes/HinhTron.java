package Shapes;

import java.util.Scanner;

public class HinhTron extends HinhHoc {
    public float banKinh;
    Scanner scanner=new Scanner(System.in);
    public void Tron(){
        name="Hinh Tron";
    }
    public void NhapBanKinh(){
        System.out.println("Nhap Ban Kinh: ");
        banKinh=scanner.nextFloat();
    }
    public void TinhChuVi(){
        chuVi=2*PI*banKinh;
    }
    public void TinhDienTich(){
        dienTich=PI*banKinh*banKinh;
    }
}



