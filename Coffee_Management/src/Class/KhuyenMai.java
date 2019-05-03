/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.sql.Date;

/**
 *
 * @author boss
 */
public class KhuyenMai {
    Date datestart,dateend;
    int percent;
    String contains;
    public KhuyenMai(){
    }

    public Date getDatestart() {
        return datestart;
    }

    public void setDatestart(Date datestart) {
        this.datestart = datestart;
    }

    public Date getDateend() {
        return dateend;
    }

    public void setDateend(Date dateend) {
        this.dateend = dateend;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public String getContains() {
        return contains;
    }

    public void setContains(String contains) {
        this.contains = contains;
    }
    
}
