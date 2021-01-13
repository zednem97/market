/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.it.market.modeloo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author asusrog
 */
@Embeddable
public class EmpleadoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "NUM_EMP")
    private int numEmp;
    @Basic(optional = false)
    @Column(name = "NUM_DEPTO")
    private int numDepto;

    public EmpleadoPK() {
    }

    public EmpleadoPK(int numEmp, int numDepto) {
        this.numEmp = numEmp;
        this.numDepto = numDepto;
    }

    public int getNumEmp() {
        return numEmp;
    }

    public void setNumEmp(int numEmp) {
        this.numEmp = numEmp;
    }

    public int getNumDepto() {
        return numDepto;
    }

    public void setNumDepto(int numDepto) {
        this.numDepto = numDepto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) numEmp;
        hash += (int) numDepto;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmpleadoPK)) {
            return false;
        }
        EmpleadoPK other = (EmpleadoPK) object;
        if (this.numEmp != other.numEmp) {
            return false;
        }
        if (this.numDepto != other.numDepto) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.it.market.modeloo.EmpleadoPK[ numEmp=" + numEmp + ", numDepto=" + numDepto + " ]";
    }
    
}
