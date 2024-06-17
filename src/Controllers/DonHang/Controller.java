/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Controllers.DonHang;

/**
 *
 * @author HI
 */
public interface Controller {

    public void writeToFile(Object obj, String fileName);

    public Object readDataFromeFile(String fileName);
}
