/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Views.Tour;
import Models.Tour;
import javax.swing.JOptionPane;

/**
 *
 * @author CanhDev
 */
public class EditTourForm extends javax.swing.JDialog {
    
    private QuanLyTour home;
    public void LoadTour(Tour editTour){
        txtMaTour.setText(editTour.getMaTour());
        txtTenTour.setText(editTour.getTenTour());
        txtGiaTien.setText(String.valueOf(editTour.getGiaTien()));
        txtDiaDiem.setText(editTour.getDiaDiem());
        txtDanhGia.setSelectedItem(editTour.getDanhGia());
        txtLichTrinh.setSelectedItem(editTour.getLichTrinh());
    }
    public EditTourForm(java.awt.Frame parent, boolean modal, Tour editTour) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        home = (QuanLyTour) parent;
        LoadTour(editTour);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMaTour = new javax.swing.JLabel();
        txtTenTour = new javax.swing.JTextField();
        txtGiaTien = new javax.swing.JTextField();
        txtDiaDiem = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        SaveBtn = new javax.swing.JButton();
        txtDanhGia = new javax.swing.JComboBox<>();
        txtLichTrinh = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sửa thông tin tour");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setText("Mã Tour : ");

        txtMaTour.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        txtMaTour.setText("jLabel3");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Tên Tour:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Địa điểm");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Giá tiền:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Đánh giá:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Lịch trình:");

        SaveBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SaveBtn.setText("Lưu");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });

        txtDanhGia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 sao", "2 sao", "3 sao", "4 sao", "5 sao" }));

        txtLichTrinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12h","24h", "48h", "6h-12h", "12h-22h"}));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMaTour)
                    .addComponent(txtGiaTien, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addComponent(txtTenTour, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addComponent(txtDiaDiem, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addComponent(txtDanhGia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtLichTrinh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(104, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaTour))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTenTour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtGiaTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDiaDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDanhGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(txtLichTrinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(SaveBtn)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed

                try {
            // Kiểm tra các trường dữ liệu rỗng
            if (txtMaTour.getText().isEmpty() || txtTenTour.getText().isEmpty() || txtGiaTien.getText().isEmpty() ||
                txtDiaDiem.getText().isEmpty()) {
                throw new IllegalArgumentException("Vui lòng điền đầy đủ thông tin!");
            }

            // Lấy dữ liệu từ các trường nhập liệu
            String maTour = txtMaTour.getText().trim();
            String tenTour = txtTenTour.getText().trim();
            double giaTien = Double.parseDouble(txtGiaTien.getText().trim());
            String diaDiem = txtDiaDiem.getText().trim();
            String danhGia = String.valueOf(txtDanhGia.getSelectedItem());
            String lichTrinh = txtLichTrinh.getSelectedItem().toString();

            // Tạo đối tượng Tour mới và cập nhật danh sách
            Tour new_t = new Tour(maTour, tenTour, giaTien, diaDiem, danhGia, lichTrinh);
            home.EditTour(new_t);

            // Hiển thị thông báo thành công và đóng cửa sổ
            JOptionPane.showMessageDialog(rootPane, "Sửa thành công!");
            this.dispose();
        } catch (NumberFormatException e) {
            // Bắt lỗi khi chuyển đổi giá tiền sang số thực thất bại
            JOptionPane.showMessageDialog(rootPane, "Giá tiền phải là một số hợp lệ!");
        } catch (IllegalArgumentException e) {
            // Bắt lỗi trống dữ liệu
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        } catch (Exception e) {
            // Bắt các lỗi khác
            JOptionPane.showMessageDialog(rootPane, "Đã xảy ra lỗi: " + e.getMessage());
        }
    }//GEN-LAST:event_SaveBtnActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditTourForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditTourForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditTourForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditTourForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EditTourForm dialog = new EditTourForm(new javax.swing.JFrame(), true, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SaveBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox<String> txtDanhGia;
    private javax.swing.JTextField txtDiaDiem;
    private javax.swing.JTextField txtGiaTien;
    private javax.swing.JComboBox<String> txtLichTrinh;
    private javax.swing.JLabel txtMaTour;
    private javax.swing.JTextField txtTenTour;
    // End of variables declaration//GEN-END:variables
}