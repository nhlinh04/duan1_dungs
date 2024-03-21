/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.HoaDon;

/**
 *
 * @author lenovo
 */
public interface HoaDonService {
    List<HoaDon> getAll();
    HoaDon getById();
    Boolean insert(HoaDon hoaDon);
    Boolean update(HoaDon hoaDon);
    Boolean delete(HoaDon hoaDon);
    List<HoaDon> searchByMa(String ma);
}
