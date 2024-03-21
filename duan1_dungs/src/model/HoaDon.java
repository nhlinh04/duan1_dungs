/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author lenovo
 */
public class HoaDon {
    private int id;
    private String maHoaDon;
    private int idHinhThucThanhToan;
    private int idKhachHang;
    private int idNhanVien;
    private Date ngayTao;
    private Date ngaySua;
    private Date ngayThanhToan;
    private Date ngayNhanHang;
    private String maGiamGia;
    private String ghiChu;
    private Boolean trangThai;

    public HoaDon() {
    }

    public HoaDon(int id, String maHoaDon, int idHinhThucThanhToan, int idKhachHang, int idNhanVien, Date ngayTao, Date ngaySua, Date ngayThanhToan, Date ngayNhanHang, String maGiamGia, String ghiChu, Boolean trangThai) {
        this.id = id;
        this.maHoaDon = maHoaDon;
        this.idHinhThucThanhToan = idHinhThucThanhToan;
        this.idKhachHang = idKhachHang;
        this.idNhanVien = idNhanVien;
        this.ngayTao = ngayTao;
        this.ngaySua = ngaySua;
        this.ngayThanhToan = ngayThanhToan;
        this.ngayNhanHang = ngayNhanHang;
        this.maGiamGia = maGiamGia;
        this.ghiChu = ghiChu;
        this.trangThai = trangThai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public int getIdHinhThucThanhToan() {
        return idHinhThucThanhToan;
    }

    public void setIdHinhThucThanhToan(int idHinhThucThanhToan) {
        this.idHinhThucThanhToan = idHinhThucThanhToan;
    }

    public int getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(int idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public int getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(int idNhanVien) {
        this.idNhanVien = idNhanVien;
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

    public Date getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(Date ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    public Date getNgayNhanHang() {
        return ngayNhanHang;
    }

    public void setNgayNhanHang(Date ngayNhanHang) {
        this.ngayNhanHang = ngayNhanHang;
    }

    public String getMaGiamGia() {
        return maGiamGia;
    }

    public void setMaGiamGia(String maGiamGia) {
        this.maGiamGia = maGiamGia;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public Boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }
    
    
    
}
