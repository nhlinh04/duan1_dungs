/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsitory;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.HoaDonChiTiet;
/**
 *
 * @author lenovo
 */
public class HoaDonChiTietResponsitory {

    // Phương thức lấy tất cả các hóa đơn chi tiết
    public List<HoaDonChiTiet> getAll() {
        List<HoaDonChiTiet> list = new ArrayList<>();
        try (ResultSet rs = JDBCHelped.executeQuery("SELECT * FROM HoaDonChiTiet")) {
            while (rs.next()) {
                list.add(mapResultSetToHoaDonChiTiet(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    // Phương thức lấy hóa đơn chi tiết theo ID
    public HoaDonChiTiet getById(int id) {
        HoaDonChiTiet hoaDonChiTiet = null;
        try (ResultSet rs = JDBCHelped.executeQuery("SELECT * FROM HoaDonChiTiet WHERE id = ?", id)) {
            if (rs.next()) {
                hoaDonChiTiet = mapResultSetToHoaDonChiTiet(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return hoaDonChiTiet;
    }

    // Phương thức thêm một hóa đơn chi tiết mới
    public boolean insert(HoaDonChiTiet hoaDonChiTiet) {
        String sql = "INSERT INTO HoaDonChiTiet (id_san_pham, id_hoa_don, so_luong, don_gia, ngay_tao, ngay_sua, trang_thai) VALUES (?, ?, ?, ?, ?, ?, ?)";
        return JDBCHelped.excuteUpdate(sql, hoaDonChiTiet.getIdSanPham(), hoaDonChiTiet.getIdHoaDon(),
                hoaDonChiTiet.getSoLuong(), hoaDonChiTiet.getDonGia(),
                hoaDonChiTiet.getNgayTao(), hoaDonChiTiet.getNgaySua(),
                hoaDonChiTiet.getTrangThai()) > 0;
    }

    // Phương thức cập nhật thông tin một hóa đơn chi tiết
    public boolean update(HoaDonChiTiet hoaDonChiTiet) {
        String sql = "UPDATE HoaDonChiTiet SET id_san_pham = ?, id_hoa_don = ?, so_luong = ?, don_gia = ?, ngay_tao = ?, ngay_sua = ?, trang_thai = ? WHERE id = ?";
        return JDBCHelped.excuteUpdate(sql, hoaDonChiTiet.getIdSanPham(), hoaDonChiTiet.getIdHoaDon(),
                hoaDonChiTiet.getSoLuong(), hoaDonChiTiet.getDonGia(),
                hoaDonChiTiet.getNgayTao(), hoaDonChiTiet.getNgaySua(),
                hoaDonChiTiet.getTrangThai(), hoaDonChiTiet.getId()) > 0;
    }

    // Phương thức xóa một hóa đơn chi tiết
    public boolean delete(HoaDonChiTiet hoaDonChiTiet) {
        String sql = "DELETE FROM HoaDonChiTiet WHERE id = ?";
        return JDBCHelped.excuteUpdate(sql, hoaDonChiTiet.getId()) > 0;
    }

    // Phương thức ánh xạ ResultSet sang đối tượng HoaDonChiTiet
    private HoaDonChiTiet mapResultSetToHoaDonChiTiet(ResultSet rs) throws SQLException {
        return new HoaDonChiTiet(rs.getInt("id"), rs.getInt("id_san_pham"),
                rs.getInt("id_hoa_don"), rs.getInt("so_luong"), rs.getDouble("don_gia"),
                rs.getDate("ngay_tao"), rs.getDate("ngay_sua"), rs.getBoolean("trang_thai"));
    }

}
