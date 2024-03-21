/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package panel;

import java.sql.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.GiamGia;
import model.SanPham;
import responsitory.GiamGiaResponsitory;
import responsitory.SanPhamResponsitory;

public class SanPhamPanel extends javax.swing.JPanel {

    private SanPhamResponsitory Sps = new SanPhamResponsitory();
    private GiamGiaResponsitory Gsg = new GiamGiaResponsitory();

    /**
     * Creates new form Panel2
     */
    public SanPhamPanel() {
        initComponents();

        loadTableGiamGia();
    }

    public void loadTableGiamGia() {
        GiamGiaResponsitory gs = new GiamGiaResponsitory();
        List<GiamGia> listGiamGia = Gsg.getAllGiamGia(); // Lấy danh sách giảm giá từ repository

        // Lấy mô hình bảng của tblGiamGia
        DefaultTableModel tableModel = (DefaultTableModel) tb2.getModel();
        tableModel.setRowCount(0); // Xóa tất cả các dòng hiện có trong bảng

        // Đổ dữ liệu từ danh sách giảm giá vào bảng
        for (GiamGia giamGia : listGiamGia) {
            Object[] rowData = {
                giamGia.getMaGiamGia(),
                giamGia.getTenGiamGia(),
                giamGia.getPhanTramGiam(),
                giamGia.getNgayBatDau(),
                giamGia.getNgayKetThuc(),
                giamGia.getNgayTao(),
                giamGia.getNgaySua()
            };
            tableModel.addRow(rowData); // Thêm dòng mới vào bảng
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnMoi = new javax.swing.JButton();
        btnDieuChinh = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtMaChuongTrinh = new javax.swing.JTextField();
        txtTenChuongTrinh = new javax.swing.JTextField();
        dateStart = new com.toedter.calendar.JDateChooser();
        dateNgayEnd = new com.toedter.calendar.JDateChooser();
        dateSua = new com.toedter.calendar.JDateChooser();
        txtHinhThucGiam = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        dateTao = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb2 = new javax.swing.JTable();

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnMoi.setText("Mới");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });

        btnDieuChinh.setText("Điều chỉnh");
        btnDieuChinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDieuChinhActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDieuChinh, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnXoa)
                .addContainerGap(683, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMoi, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDieuChinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("CHƯƠNG TRÌNH KHUYẾN MÃI");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Thông tin chương trình");

        jLabel3.setText("Mã khuyến mãi");

        jLabel4.setText("Tên khuyến mãi");

        jLabel6.setText("Phần trăm giảm");

        jLabel7.setText("Ngày bắt đầu");

        jLabel8.setText("Ngày kết thúc");

        jLabel9.setText("Ngày sửa");

        jLabel14.setText("Ngày tạo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(109, 109, 109)
                                        .addComponent(txtMaChuongTrinh, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(64, 64, 64)
                                        .addComponent(dateTao, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(dateStart, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                            .addComponent(txtHinhThucGiam, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(dateNgayEnd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(dateSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTenChuongTrinh, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(100, 100, 100))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txtMaChuongTrinh, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtHinhThucGiam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTenChuongTrinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(dateStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateNgayEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel14))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(dateSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(dateTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("DANH SÁCH CHƯƠNG TRÌNH KHUYẾN MÃI");

        tb2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã khuyến mãi", "Tên khuyến mãi", "Phần trăm giảm ", "Ngày bắt đầu", "Ngày kết thúc", "Ngày tạo", "Ngày sửa"
            }
        ));
        tb2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tb2);
        if (tb2.getColumnModel().getColumnCount() > 0) {
            tb2.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(342, 342, 342)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
// Kiểm tra không trùng mã khuyến mãi

    public boolean isDuplicatePromoCode(String newPromoCode) {
        DefaultTableModel model = (DefaultTableModel) tb2.getModel();
        int rowCount = model.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            String existingPromoCode = model.getValueAt(i, 0).toString();
            if (existingPromoCode.equals(newPromoCode)) {
                // Mã khuyến mãi trùng, hiển thị thông báo lỗi và trả về true
                JOptionPane.showMessageDialog(this, "Mã khuyến mãi đã tồn tại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return true;
            }
        }
        // Mã khuyến mãi không trùng, trả về false
        return false;
    }

// Kiểm tra phần trăm giảm là số
    public boolean isNumeric(String str) {
        try {
            int percent = Integer.parseInt(str);
            // Nếu không có lỗi, chuỗi có thể được chuyển đổi thành một số nguyên, trả về true
            return true;
        } catch (NumberFormatException e) {
            // Nếu có lỗi, chuỗi không phải là số, hiển thị thông báo lỗi và trả về false
            JOptionPane.showMessageDialog(this, "Phần trăm giảm phải là một số.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

// Phương thức kiểm tra trước khi thêm chương trình khuyến mãi mới
    public boolean validatePromoCode() {
        String newPromoCode = txtMaChuongTrinh.getText().trim();
        String percent = txtHinhThucGiam.getText().trim();

        // Kiểm tra không trùng mã khuyến mãi
        if (isDuplicatePromoCode(newPromoCode)) {
            return false;
        }

        // Kiểm tra phần trăm giảm là số
        if (!isNumeric(percent)) {
            return false;
        }

        // Nếu không có lỗi, trả về true
        return true;
    }

// Sử dụng phương thức validatePromoCode trong phương thức xử lý sự kiện cho nút Thêm

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed

        if (validatePromoCode()) {
            // Lấy thông tin từ các trường nhập liệu
            String maGiamGia = txtMaChuongTrinh.getText();
            String tenGiamGia = txtTenChuongTrinh.getText();
            Integer phanTramGiam = Integer.parseInt(txtHinhThucGiam.getText());
            Date ngayBatDau = new Date(dateStart.getDate().getTime());
            Date ngayKetThuc = new Date(dateNgayEnd.getDate().getTime());
            Date ngayTao = new Date(System.currentTimeMillis());
            Date ngaySua = new Date(System.currentTimeMillis());

            // Tạo một đối tượng GiamGia mới
            GiamGia giamGia = new GiamGia(maGiamGia, tenGiamGia, phanTramGiam, ngayBatDau, ngayKetThuc, ngayTao, ngaySua);

            // Thêm chương trình khuyến mãi mới vào cơ sở dữ liệu
            boolean isSuccess = Gsg.insert(giamGia);

            if (isSuccess) {
                // Nếu thêm thành công, thông báo và làm mới bảng
                JOptionPane.showMessageDialog(this, "Thêm chương trình khuyến mãi thành công.");
                // Xóa nội dung của các trường nhập liệu
                txtMaChuongTrinh.setText("");
                txtTenChuongTrinh.setText("");
                txtHinhThucGiam.setText("");
                dateStart.setDate(null);
                dateNgayEnd.setDate(null);
                dateSua.setDate(null);
                dateTao.setDate(null);
                loadTableGiamGia(); // Làm mới bảng hiển thị chương trình khuyến mãi
            } else {
                // Nếu thêm không thành công, thông báo lỗi
                JOptionPane.showMessageDialog(this, "Thêm chương trình khuyến mãi không thành công. Vui lòng thử lại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnMoiActionPerformed

   
    private void tb2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb2MouseClicked
        // Lấy chỉ số của hàng được chọn
        int rowIndex = tb2.getSelectedRow();

        // Kiểm tra nếu không có hàng nào được chọn
        if (rowIndex == -1) {
            return;
        }

        // Lấy dữ liệu từ hàng được chọn
        DefaultTableModel model = (DefaultTableModel) tb2.getModel();
        String maGiamGia = model.getValueAt(rowIndex, 0).toString();
        String tenGiamGia = model.getValueAt(rowIndex, 1).toString();
        String phanTramGiam = model.getValueAt(rowIndex, 2).toString();
        Date ngayBatDau = (Date) model.getValueAt(rowIndex, 3);
        Date ngayKetThuc = (Date) model.getValueAt(rowIndex, 4);
        Date ngayTao = (Date) model.getValueAt(rowIndex, 5);
        Date ngaySua = (Date) model.getValueAt(rowIndex, 6);

        // Hiển thị dữ liệu lên các trường trên form
        txtMaChuongTrinh.setText(maGiamGia);
        txtTenChuongTrinh.setText(tenGiamGia);
        txtHinhThucGiam.setText(phanTramGiam);
        dateStart.setDate(ngayBatDau);
        dateNgayEnd.setDate(ngayKetThuc);
        dateSua.setDate(ngayTao);
        dateTao.setDate(ngaySua);

    }//GEN-LAST:event_tb2MouseClicked

    private void btnDieuChinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDieuChinhActionPerformed
        int rowIndex = tb2.getSelectedRow();

// Kiểm tra nếu không có hàng nào được chọn
        if (rowIndex == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một hàng để sửa.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

// Lấy thông tin cần sửa từ các trường trên form
        String maGiamGia = txtMaChuongTrinh.getText();
        String tenGiamGia = txtTenChuongTrinh.getText();
        Integer phanTramGiam = Integer.parseInt(txtHinhThucGiam.getText());
        Date ngayBatDau = new Date(dateStart.getDate().getTime());
        Date ngayKetThuc = new Date(dateNgayEnd.getDate().getTime());
        Date ngayTao = new Date(System.currentTimeMillis());
        Date ngaySua = new Date(System.currentTimeMillis());

// Cập nhật dữ liệu của hàng được chọn trong bảng
        DefaultTableModel model = (DefaultTableModel) tb2.getModel();
        model.setValueAt(maGiamGia, rowIndex, 0);
        model.setValueAt(tenGiamGia, rowIndex, 1);
        model.setValueAt(phanTramGiam, rowIndex, 2);
        model.setValueAt(ngayBatDau, rowIndex, 3);
        model.setValueAt(ngayKetThuc, rowIndex, 4);
        model.setValueAt(ngayTao, rowIndex, 5);
        model.setValueAt(ngaySua, rowIndex, 6);

// Reset lại form sau khi sửa
        txtMaChuongTrinh.setText("");
        txtTenChuongTrinh.setText("");
        txtHinhThucGiam.setText("");
        dateStart.setDate(null);
        dateNgayEnd.setDate(null);
        dateSua.setDate(null);
        dateTao.setDate(null);

// Hiển thị thông báo sửa thành công
        JOptionPane.showMessageDialog(this, "Sửa thông tin thành công.");
    }//GEN-LAST:event_btnDieuChinhActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int rowIndex = tb2.getSelectedRow();

        // Kiểm tra nếu không có hàng nào được chọn
        if (rowIndex == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một hàng để xóa.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Xác nhận việc xóa bằng hộp thoại
        int option = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);

        if (option == JOptionPane.YES_OPTION) {
            // Nếu người dùng đồng ý xóa, thực hiện xóa hàng
            DefaultTableModel model = (DefaultTableModel) tb2.getModel();
            model.removeRow(rowIndex);

            // Hiển thị thông báo
            JOptionPane.showMessageDialog(this, "Xóa thành công.");

            // Reset lại form sau khi xóa
            txtMaChuongTrinh.setText("");
            txtTenChuongTrinh.setText("");
            txtHinhThucGiam.setText("");
            dateStart.setDate(null);
            dateNgayEnd.setDate(null);
            dateSua.setDate(null);
            dateTao.setDate(null);
        }
    }//GEN-LAST:event_btnXoaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDieuChinh;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnXoa;
    private com.toedter.calendar.JDateChooser dateNgayEnd;
    private com.toedter.calendar.JDateChooser dateStart;
    private com.toedter.calendar.JDateChooser dateSua;
    private com.toedter.calendar.JDateChooser dateTao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tb2;
    private javax.swing.JTextField txtHinhThucGiam;
    private javax.swing.JTextField txtMaChuongTrinh;
    private javax.swing.JTextField txtTenChuongTrinh;
    // End of variables declaration//GEN-END:variables
}
