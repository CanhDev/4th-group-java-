/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers.DonHang;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import Models.DonHang;

/**
 *
 * @author HI
 */
public class ControllerDonHang extends ControllerFile {

    public void sortByMaDonHang(LinkedHashSet<DonHang> x) {
        ArrayList<DonHang> arrList = new ArrayList<>(x);
        Collections.sort(arrList, new Comparator<DonHang>() {
            @Override
            public int compare(DonHang o1, DonHang o2) {
                return o1.getMaDonHang().compareTo(o2.getMaDonHang());
            }
        });
        x.clear();
        x.addAll(arrList);
    }

    public void sortBySoNgayDuLich(LinkedHashSet<DonHang> x) {
        ArrayList<DonHang> arrList = new ArrayList<>(x);
        Collections.sort(arrList, new Comparator<DonHang>() {
            @Override
            public int compare(DonHang o1, DonHang o2) {
                return Integer.compare(o1.getSoNgayDuLich(), o2.getSoNgayDuLich());
            }
        });
        x.clear();
        x.addAll(arrList);
    }

    public void sortByTienThanhToan(LinkedHashSet<DonHang> x) {
        ArrayList<DonHang> arrList = new ArrayList<>(x);
        Collections.sort(arrList, new Comparator<DonHang>() {
            @Override
            public int compare(DonHang o1, DonHang o2) {
                return Double.compare(o1.getTienThanhToan(), o2.getTienThanhToan());
            }
        });
        x.clear();
        x.addAll(arrList);
    }

    public LinkedHashSet<DonHang> timKiemDonHang(LinkedHashSet<DonHang> ds, String tuKhoa) {
        LinkedHashSet<DonHang> ketQuaTimKiem = new LinkedHashSet<>();
        String tuKhoaLower = tuKhoa.toLowerCase();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        boolean isSoTien = isNumeric(tuKhoa);
        for (DonHang x : ds) {
            if (x.getMaDonHang().toLowerCase().contains(tuKhoaLower)
                    || x.getTenDonHang().toLowerCase().contains(tuKhoaLower)
                    || x.getNgayLap().format(formatter).contains(tuKhoaLower)
                    || (!isSoTien && String.valueOf(x.getTienThanhToan()).contains(tuKhoa))) {
                ketQuaTimKiem.add(x);
            }else if(isSoTien && x.getTienThanhToan() >= Double.parseDouble(tuKhoa)){
                ketQuaTimKiem.add(x);
            }
        }
        return ketQuaTimKiem;
    }

    public boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
