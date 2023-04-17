package Shapes;

import java.util.Scanner;

public class HinhTru extends HinhTron {
    public float chieuCao;
    Scanner scanner=new Scanner(System.in);
    public void Tru(){
        name="Hinh Tru";
    }
    public void NhapChieuCao(){
        NhapBanKinh();
        System.out.println("Nhap Chieu Cao: ");
        chieuCao=scanner.nextFloat();
    }
    public void TinhTheTich(){
        TinhDienTich();
        theTich=dienTich*chieuCao;
    }

}
