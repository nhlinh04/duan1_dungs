
package service;

import java.util.List;
import model.HoaDonChiTiet;

/**
 *
 * @author lenovo
 */
public interface HoaDonChiTietService {
    List<HoaDonChiTiet> getAll();
    HoaDonChiTiet getById();
    Boolean insert(HoaDonChiTiet hoaDonChiTiet);
    Boolean update(HoaDonChiTiet hoaDonChiTiet);
    Boolean delete(HoaDonChiTiet hoaDonChiTiet);
}
