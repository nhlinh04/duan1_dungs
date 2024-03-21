
package responsitory;

import java.util.List;
import model.HoaDon;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class HoaDonResponsitory {

    // Phương thức lấy tất cả các hóa đơn
    public List<HoaDon> getAll() {
        List<HoaDon> list = new ArrayList<>();
        try (ResultSet rs = JDBCHelped.executeQuery("SELECT * FROM HoaDon")) {
            while (rs.next()) {
                list.add(mapResultSetToHoaDon(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    // Phương thức lấy hóa đơn theo ID
    public HoaDon getById(int id) {
        HoaDon hoaDon = null;
        try (ResultSet rs = JDBCHelped.executeQuery("SELECT * FROM HoaDon WHERE id = ?", id)) {
            if (rs.next()) {
                hoaDon = mapResultSetToHoaDon(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return hoaDon;
    }

    // Phương thức thêm một hóa đơn mới
    public boolean insert(HoaDon hoaDon) {
        String sql = "INSERT INTO HoaDon (ma_hoa_don, id_hinh_thuc_thanh_toan, id_khach_hang, "
                + "id_nhan_vien, ngay_tao, ngay_sua, ngay_thanh_toan, ngay_nhan_hang, ma_giam_gia, "
                + "ghi_chu, trang_thai) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        return JDBCHelped.excuteUpdate(sql, hoaDon.getMaHoaDon(), hoaDon.getIdHinhThucThanhToan(),
                hoaDon.getIdKhachHang(), hoaDon.getIdNhanVien(),
                hoaDon.getNgayTao(), hoaDon.getNgaySua(),
                hoaDon.getNgayThanhToan(), hoaDon.getNgayNhanHang(),
                hoaDon.getMaGiamGia(), hoaDon.getGhiChu(), hoaDon.getTrangThai()) > 0;
    }

    // Phương thức cập nhật thông tin một hóa đơn
    public boolean update(HoaDon hoaDon) {
        String sql = "UPDATE HoaDon SET ma_hoa_don = ?, id_hinh_thuc_thanh_toan = ?, id_khach_hang = ?, "
                + "id_nhan_vien = ?, ngay_tao = ?, ngay_sua = ?, ngay_thanh_toan = ?, ngay_nhan_hang = ?, "
                + "ma_giam_gia = ?, ghi_chu = ?, trang_thai = ? WHERE id = ?";
        return JDBCHelped.excuteUpdate(sql, hoaDon.getMaHoaDon(), hoaDon.getIdHinhThucThanhToan(),
                hoaDon.getIdKhachHang(), hoaDon.getIdNhanVien(),
                hoaDon.getNgayTao(), hoaDon.getNgaySua(),
                hoaDon.getNgayThanhToan(), hoaDon.getNgayNhanHang(),
                hoaDon.getMaGiamGia(), hoaDon.getGhiChu(), hoaDon.getTrangThai(),
                hoaDon.getId()) > 0;
    }

    // Phương thức xóa một hóa đơn
    public boolean delete(HoaDon hoaDon) {
        String sql = "DELETE FROM HoaDon WHERE id = ?";
        return JDBCHelped.excuteUpdate(sql, hoaDon.getId()) > 0;
    }

    // Phương thức tìm kiếm hóa đơn theo mã hóa đơn
    public List<HoaDon> searchByMa(String ma) {
        List<HoaDon> list = new ArrayList<>();
        try (ResultSet rs = JDBCHelped.executeQuery("SELECT * FROM HoaDon WHERE ma_hoa_don LIKE ?", "%" + ma + "%")) {
            while (rs.next()) {
                list.add(mapResultSetToHoaDon(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    // Phương thức tìm kiếm hóa đơn theo mã hóa đơn
    public List<HoaDon> searchByStatus(Integer status) {
        List<HoaDon> list = new ArrayList<>();
        try (ResultSet rs = JDBCHelped.executeQuery("SELECT * FROM HoaDon WHERE trang_thai LIKE ? ", status)) {
            while (rs.next()) {
                list.add(mapResultSetToHoaDon(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    // Phương thức ánh xạ ResultSet sang đối tượng HoaDon
    private HoaDon mapResultSetToHoaDon(ResultSet rs) throws SQLException {
        return new HoaDon(rs.getInt("id"), rs.getString("ma_hoa_don"),
                rs.getInt("id_hinh_thuc_thanh_toan"), rs.getInt("id_khach_hang"),
                rs.getInt("id_nhan_vien"), rs.getDate("ngay_tao"), rs.getDate("ngay_sua"),
                rs.getDate("ngay_thanh_toan"), rs.getDate("ngay_nhan_hang"),
                rs.getString("ma_giam_gia"), rs.getString("ghi_chu"), rs.getBoolean("trang_thai"));
    }

}
