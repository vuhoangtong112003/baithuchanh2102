package Shapes;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc{
    public float dai;
    public float rong;
    Scanner scanner=new Scanner(System.in);
    public void ChuNhat(){
        name="Hinh Chu Nhat";
    }
    public void NhapDai(){
        System.out.print("Nhap chieu dai:");
        dai=scanner.nextFloat();
    }
    public void NhapRong(){
        System.out.print("Nhap chieu rong:");
        rong=scanner.nextFloat();
    }
    public void TinhChuVi(){
        chuVi=(dai+rong)*2;
    }
    public void TinhDienTich(){
        dienTich=dai*rong;
    }
}