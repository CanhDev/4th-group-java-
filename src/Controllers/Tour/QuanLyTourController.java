/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers.Tour;
import java.util.*;
import Models.Tour;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedHashSet;
/**
 *
 * @author CanhDev
 */
public class QuanLyTourController {
    public static LinkedHashSet SearchTours(LinkedHashSet<Tour> dsTour, String searchString) {
        LinkedHashSet<Tour> list = new LinkedHashSet<>();
        if(searchString.length() > 0) {
            for(Tour x : dsTour) {
                if(x.getTenTour().equals(searchString)) {
                    list.add(x);
                }
            }
        }
        return list;
    }
    public static void sortByPrice(LinkedHashSet<Tour> x, int option) {
        // Chuyển đổi LinkedHashSet sang List
        List<Tour> list = new ArrayList<>(x);

        // Sắp xếp danh sách
        list.sort(new Comparator<Tour>() {
            @Override
            public int compare(Tour o1, Tour o2) {
                if (option == 0) return Double.compare(o1.getGiaTien(), o2.getGiaTien());
                else return Double.compare(o2.getGiaTien(), o1.getGiaTien());
            }
        });
        x.clear();
        x.addAll(list);
    }
    public static void writeToFile(Object obj, String fileName) {
        File file = new File(fileName);
        try {
            file.createNewFile();
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.close();
            fos.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static Object readDataFromFile(String fileName) {
        Object kq = null;
        File file = new File(fileName);
        if (file.length() > 0) {
            try {
                file.createNewFile();
                FileInputStream fos = new FileInputStream(file);
                ObjectInputStream oos = new ObjectInputStream(fos);
                kq = oos.readObject();
                oos.close();
                fos.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
        }
        return kq;
    }
}
