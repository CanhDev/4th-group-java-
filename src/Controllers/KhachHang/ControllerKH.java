/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers.KhachHang;
import java.time.format.DateTimeFormatter;
import Models.KhachHang;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;

/**
 *
 * @author Admin
 */
public class ControllerKH extends ControllerFile{
    public void sortByMaKhachHang(LinkedHashSet<KhachHang> x) {
        ArrayList<KhachHang> arrList = new ArrayList<>(x);
        Collections.sort(arrList, new Comparator<KhachHang>() {
            @Override
            public int compare(KhachHang o1, KhachHang o2) {
                return o1.getMaKhachHang().compareTo(o2.getMaKhachHang());
            }
        });
        x.clear();
        x.addAll(arrList);
    }
    public void sortByDiaChi(LinkedHashSet<KhachHang> x) {
        ArrayList<KhachHang> arrList = new ArrayList<>(x);
        Collections.sort(arrList, new Comparator<KhachHang>() {
            @Override
            public int compare(KhachHang o1, KhachHang o2) {
                return o1.getDiaChi().compareTo(o2.getDiaChi());
            }
        });
        x.clear();
        x.addAll(arrList);
    }
    public void sortByName(LinkedHashSet<KhachHang> x) {
        ArrayList<KhachHang> arrList = new ArrayList<>(x);
        Collections.sort(arrList, new Comparator<KhachHang>() {
            @Override
            public int compare(KhachHang o1, KhachHang o2) {
                return o1.getTenKhachHang().compareTo(o2.getTenKhachHang());
            }
        });
        x.clear();
        x.addAll(arrList);
    }
     public LinkedHashSet<KhachHang> timKiemKhachHang(LinkedHashSet<KhachHang> ds, String tuKhoa) {
        LinkedHashSet<KhachHang> ketQuaTimKiem = new LinkedHashSet<>();
        String tuKhoaLower = tuKhoa.toLowerCase();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        for (KhachHang x : ds) {
            if (x.getMaKhachHang().toLowerCase().contains(tuKhoaLower)
                    || x.getTenKhachHang().toLowerCase().contains(tuKhoaLower)
                    || x.getNgaySinh().format(formatter).contains(tuKhoaLower)
                    ) {
                ketQuaTimKiem.add(x);
            }
        }
        return ketQuaTimKiem;
    }
}
