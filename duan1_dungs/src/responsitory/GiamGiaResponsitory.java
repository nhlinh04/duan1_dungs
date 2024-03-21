/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsitory;

import java.sql.*;
import java.util.ArrayList;
import model.GiamGia;

public class GiamGiaResponsitory {
        // Phương thức lấy tất cả các giảm giá
    public ArrayList<GiamGia> getAllGiamGia() {
        ArrayList<GiamGia> giamGiaList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM GiamGia";
            ResultSet rs = JDBCHelped.executeQuery(sql);
            while (rs.next()) {
                GiamGia giamGia = new GiamGia();
                giamGia.setMaGiamGia(rs.getString("ma_giam_gia"));
                giamGia.setTenGiamGia(rs.getString("ten_ma_giam"));
                giamGia.setPhanTramGiam(rs.getInt("phan_tram_giam"));
                giamGia.setNgayBatDau(rs.getDate("ngay_bat_dau"));
                giamGia.setNgayKetThuc(rs.getDate("ngay_ket_thuc"));
                giamGia.setNgayTao(rs.getDate("ngay_tao"));
                giamGia.setNgaySua(rs.getDate("ngay_sua"));
                giamGiaList.add(giamGia);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return giamGiaList;
    }

    // Phương thức thêm một giảm giá mới
    public boolean insert(GiamGia giamGia) {
        try {
            String sql = "INSERT INTO GiamGia (ma_giam_gia,ten_ma_giam, phan_tram_giam, ngay_bat_dau, ngay_ket_thuc, ngay_tao, ngay_sua) VALUES (?,?, ?, ?, ?, ?, ?)";
            return JDBCHelped.excuteUpdate(sql, 
                    giamGia.getMaGiamGia(),
                    giamGia.getTenGiamGia(), 
                    giamGia.getPhanTramGiam(),
                    giamGia.getNgayBatDau(),
                    giamGia.getNgayKetThuc(), 
                    giamGia.getNgayTao(), 
                    giamGia.getNgaySua()) > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // Phương thức cập nhật thông tin một giảm giá
    public boolean update(GiamGia giamGia) {
        try {
            String sql = "UPDATE GiamGia SET ten_ma_giam = ?, phan_tram_giam = ?, ngay_bat_dau = ?, ngay_ket_thuc = ?, ngay_sua = ? WHERE ma_giam_gia = ?";
            return JDBCHelped.excuteUpdate(sql, giamGia.getTenGiamGia(), giamGia.getPhanTramGiam(),
                    giamGia.getNgayBatDau(), giamGia.getNgayKetThuc(), giamGia.getNgaySua(), giamGia.getMaGiamGia()) > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // Phương thức xóa một giảm giá
    public boolean delete(int maGiamGia) {
        try {
            String sql = "DELETE FROM GiamGia WHERE ma_giam_gia = ?";
            return JDBCHelped.excuteUpdate(sql, maGiamGia) > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
