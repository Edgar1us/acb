/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Edgar
 */
public class Jugador implements Serializable{
    
    private int idJugador;
    private String nombreJugador;
    private String ape1;
    private String ape2;
    private boolean lesionado;
    private Date fechaNacimiento;
    private Date horaPartido;
    private Date fechaHoraPartido;
    private float valorMercado;
    private BigDecimal sueldo;
    private TipoJugador tipoJugador;
    private Equipo equipo;

    public Jugador() {
    }

    public Jugador(String nombreJugador, String ape1, String ape2, boolean lesionado, Date fechaNacimiento, Date horaPartido, Date fechaHoraPartido, float valorMercado, BigDecimal sueldo, TipoJugador tipoJugador, Equipo equipo) {
        this.nombreJugador = nombreJugador;
        this.ape1 = ape1;
        this.ape2 = ape2;
        this.lesionado = lesionado;
        this.fechaNacimiento = fechaNacimiento;
        this.horaPartido = horaPartido;
        this.fechaHoraPartido = fechaHoraPartido;
        this.valorMercado = valorMercado;
        this.sueldo = sueldo;
        this.tipoJugador = tipoJugador;
        this.equipo = equipo;
    }

    

    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public String getApe1() {
        return ape1;
    }

    public void setApe1(String ape1) {
        this.ape1 = ape1;
    }

    public String getApe2() {
        return ape2;
    }

    public void setApe2(String ape2) {
        this.ape2 = ape2;
    }

    public boolean isLesionado() {
        return lesionado;
    }

    public void setLesionado(boolean lesionado) {
        this.lesionado = lesionado;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getHoraPartido() {
        return horaPartido;
    }

    public void setHoraPartido(Date horaPartido) {
        this.horaPartido = horaPartido;
    }

    public Date getFechaHoraPartido() {
        return fechaHoraPartido;
    }

    public void setFechaHoraPartido(Date fechaHoraPartido) {
        this.fechaHoraPartido = fechaHoraPartido;
    }

    public float getValorMercado() {
        return valorMercado;
    }

    public void setValorMercado(float valorMercado) {
        this.valorMercado = valorMercado;
    }

    public BigDecimal getSueldo() {
        return sueldo;
    }

    public void setSueldo(BigDecimal sueldo) {
        this.sueldo = sueldo;
    }

    public TipoJugador getTipoJugador() {
        return tipoJugador;
    }

    public void setTipoJugador(TipoJugador tipoJugador) {
        this.tipoJugador = tipoJugador;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Jugador{" + "idJugador=" + idJugador + ", nombreJugador=" + nombreJugador + ", ape1=" + ape1 + ", ape2=" + ape2 + ", lesionado=" + lesionado + ", fechaNacimiento=" + fechaNacimiento + ", horaPartido=" + horaPartido + ", fechaHoraPartido=" + fechaHoraPartido + ", valorMercado=" + valorMercado + ", sueldo=" + sueldo + ", tipoJugador=" + tipoJugador + ", equipo=" + equipo + '}';
    }

    
    
    
    
    
}
