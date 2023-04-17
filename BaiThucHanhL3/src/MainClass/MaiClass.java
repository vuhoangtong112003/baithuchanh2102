package MainClass;

import Shapes.HinhChuNhat;
import Shapes.HinhTron;
import Shapes.HinhTru;
import Shapes.HinhVuong;
public class MainClass {
    public static void main(String[] args) {
        HinhChuNhat hinhChuNhat=new HinhChuNhat();
        hinhChuNhat.ChuNhat();
        hinhChuNhat.Name();
        hinhChuNhat.NhapDai();
        hinhChuNhat.NhapRong();
        hinhChuNhat.TinhChuVi();
        hinhChuNhat.inChuVi();
        hinhChuNhat.TinhDienTich();
        hinhChuNhat.InDienTich();

        HinhTron hinhTron=new HinhTron();
        hinhTron.Tron();
        hinhChuNhat.Name();
        hinhTron.NhapBanKinh();
        hinhTron.TinhChuVi();
        hinhTron.inChuVi();
        hinhTron.TinhDienTich();
        hinhTron.InDienTich();

        HinhTru hinhTru=new HinhTru();
        hinhTru.Tru();
        hinhChuNhat.Name();
        hinhTru.NhapBanKinh();
        hinhTru.NhapChieuCao();
        hinhTru.TinhTheTich();
        hinhTru.inTheTich();

        HinhVuong hinhVuong=new HinhVuong();
        hinhVuong.Vuong();
        hinhChuNhat.Name();
        hinhVuong.NhapCanh();
        hinhVuong.TinhChuVi();
        hinhVuong.inChuVi();
        hinhVuong.TinhDienTich();
        hinhVuong.InDienTich();
    }
}