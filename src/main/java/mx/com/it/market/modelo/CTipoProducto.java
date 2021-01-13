/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.it.market.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author asusrog
 */
@Entity
@Table(name = "cTipoProducto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CTipoProducto.findAll", query = "SELECT c FROM CTipoProducto c")})
public class CTipoProducto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTipoProducto")
    private Long idTipoProducto;
    @Column(name = "cTipoProductocol")
    private String cTipoProductocol;

    public CTipoProducto() {
    }

    public CTipoProducto(Long idTipoProducto) {
        this.idTipoProducto = idTipoProducto;
    }

    public Long getIdTipoProducto() {
        return idTipoProducto;
    }

    public void setIdTipoProducto(Long idTipoProducto) {
        this.idTipoProducto = idTipoProducto;
    }

    public String getCTipoProductocol() {
        return cTipoProductocol;
    }

    public void setCTipoProductocol(String cTipoProductocol) {
        this.cTipoProductocol = cTipoProductocol;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoProducto != null ? idTipoProducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CTipoProducto)) {
            return false;
        }
        CTipoProducto other = (CTipoProducto) object;
        if ((this.idTipoProducto == null && other.idTipoProducto != null) || (this.idTipoProducto != null && !this.idTipoProducto.equals(other.idTipoProducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.it.market.modelo.CTipoProducto[ idTipoProducto=" + idTipoProducto + " ]";
    }
    
}
