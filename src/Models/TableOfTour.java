package Models;

import Models.Tour;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class TableOfTour extends AbstractTableModel {
    private String[] name = {"Mã tour", "Tên tour", "Giá tiền", "Địa điểm", "Đánh giá", "Lịch trình"};
    // Khai báo lớp Chứa kiểu dữ liệu của từng trường tương ứng.
    private Class[] classes = {String.class, String.class, Double.class, String.class, Double.class, String.class}; 
    private List<Tour> dsTour;

    public TableOfTour(LinkedHashSet<Tour> ds) {
        dsTour = new ArrayList<>(ds);  // Chuyển đổi LinkedHashSet sang List
    }

    @Override
    public int getRowCount() {
        return dsTour.size();
    }

    @Override
    public int getColumnCount() {
        return name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Tour tour = dsTour.get(rowIndex);
        switch (columnIndex) {
            case 0: return tour.getMaTour(); 
            case 1: return tour.getTenTour();
            case 2: return tour.getGiaTien();
            case 3: return tour.getDiaDiem();
            case 4: return tour.getDanhGia();
            case 5: return tour.getLichTrinh();
            default: return null;
        }
    }

    @Override
    public Class getColumnClass(int columnIndex) {
        return classes[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return name[column];
    }
}
