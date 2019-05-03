package Class;

import java.sql.Date;

public class NhapHang {
    String idbillimport,materialsname,unit;
    Date importDate;
    int amount,price;
    public NhapHang(){
    }

    public String getIdbillimport() {
        return idbillimport;
    }

    public void setIdbillimport(String idbillimport) {
        this.idbillimport = idbillimport;
    }

    public String getMaterialsname() {
        return materialsname;
    }

    public void setMaterialsname(String materialsname) {
        this.materialsname = materialsname;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Date getImportDate() {
        return importDate;
    }

    public void setImportDate(Date importDate) {
        this.importDate = importDate;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
