
package model.respon;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author lenovo
 */
public class BillRes {
    private String code;
    private String customeName;
    private List<ProductRes> products;
    private BigDecimal total;

    public BillRes() {
    }

    public BillRes(String code, String customeName, List<ProductRes> products, BigDecimal total) {
        this.code = code;
        this.customeName = customeName;
        this.products = products;
        this.total = total;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCustomeName() {
        return customeName;
    }

    public void setCustomeName(String customeName) {
        this.customeName = customeName;
    }

    public List<ProductRes> getProducts() {
        return products;
    }

    public void setProducts(List<ProductRes> products) {
        this.products = products;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    
    
}
