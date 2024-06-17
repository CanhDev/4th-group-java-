package Models;

import java.util.Objects;
import java.io.Serializable;
/**
 *
 * @author CanhDev
 */
public class Tour implements Comparable<Tour>, Serializable {
    private static final long serialVersionUID = 1L;
    private String maTour;
    private String tenTour;
    private double giaTien;
    private String diaDiem;
    private String danhGia;
    private String lichTrinh;

    // Constructors
    public Tour() {
    }

    public Tour(String maTour, String tenTour, double giaTien, String diaDiem, String danhGia, String lichTrinh) {
        this.maTour = maTour;
        this.tenTour = tenTour;
        this.giaTien = giaTien;
        this.diaDiem = diaDiem;
        this.danhGia = danhGia;
        this.lichTrinh = lichTrinh;
    }

    // Getters and Setters
    public String getMaTour() {
        return maTour;
    }

    public void setMaTour(String maTour) {
        this.maTour = maTour;
    }

    public String getTenTour() {
        return tenTour;
    }

    public void setTenTour(String tenTour) {
        this.tenTour = tenTour;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    public String getDiaDiem() {
        return diaDiem;
    }

    public void setDiaDiem(String diaDiem) {
        this.diaDiem = diaDiem;
    }

    public String getDanhGia() {
        return danhGia;
    }

    public void setDanhGia(String danhGia) {
        this.danhGia = danhGia;
    }

    public String getLichTrinh() {
        return lichTrinh;
    }

    public void setLichTrinh(String lichTrinh) {
        this.lichTrinh = lichTrinh;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.maTour);
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
        final Tour other = (Tour) obj;
        return Objects.equals(this.maTour, other.maTour);
    }

    // Implement compareTo method for sorting by giaTien
    @Override
    public int compareTo(Tour other) {
        return Double.compare(this.giaTien, other.giaTien);
    }
}
