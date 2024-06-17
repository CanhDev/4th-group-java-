/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author CanhDev
 */
public class KhachHang implements Serializable{
    private String maKhachHang;
    private String tenKhachHang;
    private String diaChi;
    private LocalDate ngaySinh;

    public KhachHang() {
    }

    
    // Constructors
    public KhachHang(String maKhachHang, String tenKhachHang, String diaChi, LocalDate ngaySinh) {
        try {
            this.maKhachHang=maKhachHang;
            setTenKhachHang(tenKhachHang);
            setDiaChi(diaChi);
            setNgaySinh(ngaySinh);
        } catch(Exception e) {
            System.out.println("Co loi du lieu Nguoi khong hop le " + e.toString());
        }  
    }


    // Getters and Setters
    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) throws Exception {
        if(tenKhachHang.trim().equals("")) {
            throw new Exception("Tên không được để trống");
        } else if(tenKhachHang.matches("[^a-zA-Z]+")) {
            throw new Exception("Tên không được có kí tự số");
        }
        this.tenKhachHang = tenKhachHang;
    }
    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) throws Exception {
        if(diaChi.trim().equals("")) {
            throw new Exception("Địa chỉ không được để trống");
        }
        this.diaChi = diaChi;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) throws Exception{
        if (ngaySinh == null) {
            throw new Exception("Lỗi dữ liệu ngày sinh!");
        }
        this.ngaySinh = ngaySinh;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "maKhachHang=" + maKhachHang + ", tenKhachHang=" + tenKhachHang + ", diaChi=" + diaChi + ", ngaySinh=" + ngaySinh + '}';
    }
}
