package responsitory;

import java.sql.*;
import java.util.ArrayList;
import model.SanPham;

public class SanPhamResponsitory {

    public ArrayList<SanPham> getAllSanPham() {
        ArrayList<SanPham> sanPhamList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM SanPham";
            ResultSet rs = JDBCHelped.executeQuery(sql);
            while (rs.next()) {
                sanPhamList.add(mapResultSetToSanPham(rs));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sanPhamList;
    }

    public boolean insertSanPham(SanPham sanPham) {
        String sql = "INSERT INTO SanPham (ma_sp, so_luong_ton, gia_ban, khang_nuoc) VALUES (?, ?, ?, ?)";
        return executeUpdateWithParams(sql, sanPham.getMaSP(), sanPham.getSoLuongTon(), sanPham.getGiaBan(), sanPham.getKhangNuoc());
    }

    public boolean updateSanPham(SanPham sanPham) {
        String sql = "UPDATE SanPham SET so_luong_ton = ?, gia_ban = ?, khang_nuoc = ? WHERE ma_sp = ?";
        return executeUpdateWithParams(sql, sanPham.getSoLuongTon(), sanPham.getGiaBan(), sanPham.getKhangNuoc(), sanPham.getMaSP());
    }

    public boolean deleteSanPham(String maSP) {
        String sql = "DELETE FROM SanPham WHERE ma_sp = ?";
        return executeUpdateWithParams(sql, maSP);
    }
    
    public SanPham getById(int id) {
        SanPham sanPham = new SanPham();
        try {
            String sql = "SELECT * FROM SanPham WHERE id = ?";
            ResultSet rs = JDBCHelped.executeQuery(sql, id);
            if (rs.next()) {
                sanPham = mapResultSetToSanPham(rs);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sanPham;
    }
    
    private SanPham mapResultSetToSanPham(ResultSet rs) throws SQLException {
        SanPham sanPham = new SanPham();
        sanPham.setId(rs.getInt("id"));
        sanPham.setMaSP(rs.getString("ma_sp"));
        sanPham.setIdThuongHieu(rs.getInt("id_thuong_hieu"));
        sanPham.setIdDongMay(rs.getInt("id_dong_may"));
        sanPham.setIdChatLieuDay(rs.getInt("id_chat_lieu_day"));
        sanPham.setIdChatLieuKinh(rs.getInt("id_chat_lieu_kinh"));
        sanPham.setIdXuatXu(rs.getInt("id_xuat_xu"));
        sanPham.setIdChatLieuVo(rs.getInt("id_chat_lieu_vo"));
        sanPham.setIdMau(rs.getInt("id_mau"));
        sanPham.setGiaNhap(rs.getInt("gia_nhap"));
        sanPham.setGiaBan(rs.getInt("gia_ban"));
        sanPham.setSoLuongTon(rs.getInt("so_luong_ton"));
        sanPham.setHinhAnh(rs.getString("hinh_anh"));
        sanPham.setKhangNuoc(rs.getString("khang_nuoc"));
        sanPham.setKichCo(rs.getString("kich_co"));
        sanPham.setMoTa(rs.getString("mo_ta"));
        sanPham.setNgayTao(rs.getDate("ngay_tao"));
        sanPham.setNgaySua(rs.getDate("ngay_sua"));
        sanPham.setTrangThai(rs.getBoolean("trang_thai"));
        return sanPham;
    }
    
    private boolean executeUpdateWithParams(String sql, Object... params) {
        try {
            return JDBCHelped.excuteUpdate(sql, params) > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
