/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.io.Serializable;
import java.util.Objects;
import java.time.LocalDate;

/**
 *
 * @author HI
 */
public class DonHang implements Serializable{
private static final long serialVersionUID = 1L;

    private String maDonHang;
    private String tenDonHang;
    private LocalDate ngayLap;
    private int soNgayDuLich;
    private Tour tour;
    private KhachHang khachhang;

    public DonHang() {
    }

    public DonHang(String maDonHang, String tenDonHang, LocalDate ngayLap, int soNgayDuLich, Tour tour, KhachHang khachhang) {
        this.maDonHang = maDonHang;
        this.tenDonHang = tenDonHang;
        this.ngayLap = ngayLap;
        this.soNgayDuLich = soNgayDuLich;
        this.tour = tour;
        this.khachhang = khachhang;
    }

    public String getMaDonHang() {
        return maDonHang;
    }

    public String getTenDonHang() {
        return tenDonHang;
    }

    public LocalDate getNgayLap() {
        return ngayLap;
    }

    public int getSoNgayDuLich() {
        return soNgayDuLich;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    public Tour getTour() {
        return tour;
    }

    public String getMaTour() {
        return tour.getMaTour();
    }

    public KhachHang getKhachhang() {
        return khachhang;
    }

    public String getMaKhachHang() {
        return khachhang.getMaKhachHang();
    }

    public double getTienThanhToan() {
        return tour.getGiaTien() * this.getSoNgayDuLich();
    }

    public void setKhachhang(KhachHang khachhang) {
        this.khachhang = khachhang;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.maDonHang);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DonHang other = (DonHang) obj;
        return Objects.equals(this.maDonHang, other.maDonHang);
    }

    @Override
    public String toString() {
        return "DonHang{" + "maDonHang=" + maDonHang + ", tenDonHang=" + tenDonHang + ", ngayLap=" + ngayLap + ", soNgayDuLich=" + soNgayDuLich + ", maTour=" + tour.getMaTour() + ", maKhachhang=" + khachhang.getMaKhachHang() + '}';
    }

}
