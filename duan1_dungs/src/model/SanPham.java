/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.Date;
/**
 *
 * @author hoang
 */
public class SanPham {
     private int id;
    private String maSP;
    private int idThuongHieu;
    private int idDongMay;
    private int idChatLieuDay;
    private int idChatLieuKinh;
    private int idXuatXu;
    private int idChatLieuVo;
    private int idMau;
    private int giaNhap;
    private int giaBan;
    private int soLuongTon;
    private String hinhAnh;
    private String khangNuoc;
    private String kichCo;
    private String moTa;
    private Date ngayTao;
    private Date ngaySua;
    private boolean trangThai;

    public SanPham() {
    }

    public SanPham(int id, String maSP, int idThuongHieu, int idDongMay, int idChatLieuDay, int idChatLieuKinh, int idXuatXu, int idChatLieuVo, int idMau, int giaNhap, int giaBan, int soLuongTon, String hinhAnh, String khangNuoc, String kichCo, String moTa, Date ngayTao, Date ngaySua, boolean trangThai) {
        this.id = id;
        this.maSP = maSP;
        this.idThuongHieu = idThuongHieu;
        this.idDongMay = idDongMay;
        this.idChatLieuDay = idChatLieuDay;
        this.idChatLieuKinh = idChatLieuKinh;
        this.idXuatXu = idXuatXu;
        this.idChatLieuVo = idChatLieuVo;
        this.idMau = idMau;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.soLuongTon = soLuongTon;
        this.hinhAnh = hinhAnh;
        this.khangNuoc = khangNuoc;
        this.kichCo = kichCo;
        this.moTa = moTa;
        this.ngayTao = ngayTao;
        this.ngaySua = ngaySua;
        this.trangThai = trangThai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public int getIdThuongHieu() {
        return idThuongHieu;
    }

    public void setIdThuongHieu(int idThuongHieu) {
        this.idThuongHieu = idThuongHieu;
    }

    public int getIdDongMay() {
        return idDongMay;
    }

    public void setIdDongMay(int idDongMay) {
        this.idDongMay = idDongMay;
    }

    public int getIdChatLieuDay() {
        return idChatLieuDay;
    }

    public void setIdChatLieuDay(int idChatLieuDay) {
        this.idChatLieuDay = idChatLieuDay;
    }

    public int getIdChatLieuKinh() {
        return idChatLieuKinh;
    }

    public void setIdChatLieuKinh(int idChatLieuKinh) {
        this.idChatLieuKinh = idChatLieuKinh;
    }

    public int getIdXuatXu() {
        return idXuatXu;
    }

    public void setIdXuatXu(int idXuatXu) {
        this.idXuatXu = idXuatXu;
    }

    public int getIdChatLieuVo() {
        return idChatLieuVo;
    }

    public void setIdChatLieuVo(int idChatLieuVo) {
        this.idChatLieuVo = idChatLieuVo;
    }

    public int getIdMau() {
        return idMau;
    }

    public void setIdMau(int idMau) {
        this.idMau = idMau;
    }

    public int getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(int giaNhap) {
        this.giaNhap = giaNhap;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public String getKhangNuoc() {
        return khangNuoc;
    }

    public void setKhangNuoc(String khangNuoc) {
        this.khangNuoc = khangNuoc;
    }

    public String getKichCo() {
        return kichCo;
    }

    public void setKichCo(String kichCo) {
        this.kichCo = kichCo;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Date getNgaySua() {
        return ngaySua;
    }

    public void setNgaySua(Date ngaySua) {
        this.ngaySua = ngaySua;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }
    
    
}
