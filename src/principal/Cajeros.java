/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package principal;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author USUARIO
 */
@Entity
@Table(name = "cajeros", catalog = "banco", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Cajeros.findAll", query = "SELECT c FROM Cajeros c"),
    @NamedQuery(name = "Cajeros.findByIdCajero", query = "SELECT c FROM Cajeros c WHERE c.idCajero = :idCajero"),
    @NamedQuery(name = "Cajeros.findByCiudad", query = "SELECT c FROM Cajeros c WHERE c.ciudad = :ciudad"),
    @NamedQuery(name = "Cajeros.findByTipoCajero", query = "SELECT c FROM Cajeros c WHERE c.tipoCajero = :tipoCajero"),
    @NamedQuery(name = "Cajeros.findByCantidadMinima", query = "SELECT c FROM Cajeros c WHERE c.cantidadMinima = :cantidadMinima"),
    @NamedQuery(name = "Cajeros.findByCantidadMaxima", query = "SELECT c FROM Cajeros c WHERE c.cantidadMaxima = :cantidadMaxima"),
    @NamedQuery(name = "Cajeros.findByDinero", query = "SELECT c FROM Cajeros c WHERE c.dinero = :dinero"),
    @NamedQuery(name = "Cajeros.findByEstado", query = "SELECT c FROM Cajeros c WHERE c.estado = :estado"),
    @NamedQuery(name = "Cajeros.findByRetiros", query = "SELECT c FROM Cajeros c WHERE c.retiros = :retiros"),
    @NamedQuery(name = "Cajeros.findByDepositos", query = "SELECT c FROM Cajeros c WHERE c.depositos = :depositos")})
public class Cajeros implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "id_cajero")
    private BigDecimal idCajero;
    @Column(name = "ciudad")
    private String ciudad;
    @Column(name = "tipo_cajero")
    private Short tipoCajero;
    @Column(name = "cantidad_minima")
    private BigInteger cantidadMinima;
    @Column(name = "cantidad_maxima")
    private BigInteger cantidadMaxima;
    @Basic(optional = false)
    @Column(name = "dinero")
    private BigInteger dinero;
    @Basic(optional = false)
    @Column(name = "estado")
    private boolean estado;
    @Basic(optional = false)
    @Column(name = "retiros")
    private BigInteger retiros;
    @Column(name = "depositos")
    private BigInteger depositos;

    public Cajeros() {
    }

    public Cajeros(BigDecimal idCajero) {
        this.idCajero = idCajero;
    }

    public Cajeros(BigDecimal idCajero, BigInteger dinero, boolean estado, BigInteger retiros) {
        this.idCajero = idCajero;
        this.dinero = dinero;
        this.estado = estado;
        this.retiros = retiros;
    }

    public BigDecimal getIdCajero() {
        return idCajero;
    }

    public void setIdCajero(BigDecimal idCajero) {
        BigDecimal oldIdCajero = this.idCajero;
        this.idCajero = idCajero;
        changeSupport.firePropertyChange("idCajero", oldIdCajero, idCajero);
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        String oldCiudad = this.ciudad;
        this.ciudad = ciudad;
        changeSupport.firePropertyChange("ciudad", oldCiudad, ciudad);
    }

    public Short getTipoCajero() {
        return tipoCajero;
    }

    public void setTipoCajero(Short tipoCajero) {
        Short oldTipoCajero = this.tipoCajero;
        this.tipoCajero = tipoCajero;
        changeSupport.firePropertyChange("tipoCajero", oldTipoCajero, tipoCajero);
    }

    public BigInteger getCantidadMinima() {
        return cantidadMinima;
    }

    public void setCantidadMinima(BigInteger cantidadMinima) {
        BigInteger oldCantidadMinima = this.cantidadMinima;
        this.cantidadMinima = cantidadMinima;
        changeSupport.firePropertyChange("cantidadMinima", oldCantidadMinima, cantidadMinima);
    }

    public BigInteger getCantidadMaxima() {
        return cantidadMaxima;
    }

    public void setCantidadMaxima(BigInteger cantidadMaxima) {
        BigInteger oldCantidadMaxima = this.cantidadMaxima;
        this.cantidadMaxima = cantidadMaxima;
        changeSupport.firePropertyChange("cantidadMaxima", oldCantidadMaxima, cantidadMaxima);
    }

    public BigInteger getDinero() {
        return dinero;
    }

    public void setDinero(BigInteger dinero) {
        BigInteger oldDinero = this.dinero;
        this.dinero = dinero;
        changeSupport.firePropertyChange("dinero", oldDinero, dinero);
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        boolean oldEstado = this.estado;
        this.estado = estado;
        changeSupport.firePropertyChange("estado", oldEstado, estado);
    }

    public BigInteger getRetiros() {
        return retiros;
    }

    public void setRetiros(BigInteger retiros) {
        BigInteger oldRetiros = this.retiros;
        this.retiros = retiros;
        changeSupport.firePropertyChange("retiros", oldRetiros, retiros);
    }

    public BigInteger getDepositos() {
        return depositos;
    }

    public void setDepositos(BigInteger depositos) {
        BigInteger oldDepositos = this.depositos;
        this.depositos = depositos;
        changeSupport.firePropertyChange("depositos", oldDepositos, depositos);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCajero != null ? idCajero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cajeros)) {
            return false;
        }
        Cajeros other = (Cajeros) object;
        if ((this.idCajero == null && other.idCajero != null) || (this.idCajero != null && !this.idCajero.equals(other.idCajero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "principal.Cajeros[ idCajero=" + idCajero + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
