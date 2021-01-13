/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.it.market.modeloo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author asusrog
 */
@Entity
@Table(name = "DEPTO")
@NamedQueries({
    @NamedQuery(name = "Depto.findAll", query = "SELECT d FROM Depto d")})
public class Depto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUM_DEPTO")
    private Integer numDepto;
    @Column(name = "DEPARTAMENTO")
    private String departamento;

    public Depto() {
    }

    public Depto(Integer numDepto) {
        this.numDepto = numDepto;
    }

    public Integer getNumDepto() {
        return numDepto;
    }

    public void setNumDepto(Integer numDepto) {
        this.numDepto = numDepto;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numDepto != null ? numDepto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Depto)) {
            return false;
        }
        Depto other = (Depto) object;
        if ((this.numDepto == null && other.numDepto != null) || (this.numDepto != null && !this.numDepto.equals(other.numDepto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.it.market.modeloo.Depto[ numDepto=" + numDepto + " ]";
    }
    
}
