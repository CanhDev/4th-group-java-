/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;


import java.util.Iterator;
import java.util.LinkedHashSet;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author HI
 */
public class TableDonHang extends AbstractTableModel{
    private String Name[] = {"Mã đơn hàng", "Tên đơn hàng", "Ngày lập", "Số ngày du lịch", "Mã tour", "Mã khách hàng", "Tiền thanh toán"};
    
    private Class classes[] = {String.class, String.class, NgayThang.class, Integer.class, Tour.class, KhachHang.class, Double.class};

    LinkedHashSet<DonHang> dsDH = new LinkedHashSet<DonHang>();
    
    public TableDonHang(LinkedHashSet<DonHang> ds){
        dsDH = ds;
    }

    @Override
    public int getRowCount() {
        return dsDH.size();
    }

    @Override
    public int getColumnCount() {
        return Name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        DonHang donHang = getElementAt(rowIndex);
        switch (columnIndex) {
            case 0: return donHang.getMaDonHang();
            case 1: return donHang.getTenDonHang();
            case 2: return donHang.getNgayLap();
            case 3: return donHang.getSoNgayDuLich();
            case 4: return donHang.getMaTour();
            case 5: return donHang.getMaKhachHang();
            case 6: return donHang.getTienThanhToan();
            default:
                throw new AssertionError();
        }
    }

    public DonHang getElementAt(int index){
        Iterator<DonHang> it = dsDH.iterator();
        int currentIndex = 0;
        while(it.hasNext()){
            DonHang donHang = it.next();
            if(currentIndex == index){
                return donHang;
            }
            currentIndex++;
        }
        return null;
    }
    @Override
    public Class getColumnClass(int columnIndex) {
        return classes[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return Name[column];
    }
    
}
