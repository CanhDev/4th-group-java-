/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Admin
 */
public class TableKhachHang extends AbstractTableModel{

    public TableKhachHang(LinkedHashSet<KhachHang> dsKH1) {
    }

    public static void setModel(TableKhachHang tableKhachHang) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private String name[]={"Mã khách","Tên khách","Địa chỉ","Ngày sinh"};
    //Khai báo lớp Chứa kiểu dữ liệu của từng trường tương ứng.
    private Class classes[]={String.class,String.class,String.class, String.class};      
    //Tạo một đối tượng arrayList có tên dsSV.
    ArrayList<KhachHang> dsKH=new ArrayList<KhachHang>();

    @Override
    public int getRowCount() {
        return dsKH.size();    
    }

    @Override
    public int getColumnCount() {
        return  name.length;    
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex)
        {
            case 0: return dsKH.get(rowIndex).getMaKhachHang(); 
            case 1: return dsKH.get(rowIndex).getTenKhachHang();
            case 2: return dsKH.get(rowIndex).getDiaChi();
            case 3: return dsKH.get(rowIndex).getNgaySinh();
            default :return null;
        }
    }
    @Override
    public Class getColumnClass(int columnIndex)
    {
        return classes[columnIndex];
    }

    @Override
    public String getColumnName(int column)
    {
        return name[column];
    }
    
}
