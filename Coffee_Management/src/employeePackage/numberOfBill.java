/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeePackage;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class numberOfBill {
    int count;
    Date passtime;
    Date presenttime;

    public numberOfBill(int count, Date passtime, Date presenttime) {
        this.count = count;
        this.passtime = passtime;
        this.presenttime = presenttime;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Date getPasstime() {
        return passtime;
    }

    public void setPasstime(Date passtime) {
        this.passtime = passtime;
    }

    public Date getPresenttime() {
        return presenttime;
    }

    public void setPresenttime(Date presenttime) {
        this.presenttime = presenttime;
    }
    
    
}
