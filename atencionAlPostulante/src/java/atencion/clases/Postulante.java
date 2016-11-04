package atencion.clases;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "postulante")
public class Postulante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codP;
    @Column
    private String nombre;
    @Column
    private String dni;
    @Column
    private String ocupacion;
    @Column
    private String lugarN;
    @Column
    private String fechaN;
    @Column
    private int edad;
    @Column
    private String distrito;
    @Column
    private String domicilio;
    @Column
    private String centroT;
    @Column
    private int telCasa;
    @Column
    private int celular;
    @Column
    private String fechaR;
    @Column
    private String sexo;
    @Column
    private String estadoC;
    @Column
    private String grupoS;
    @Column
    private String factorRh;
    @Column
    private String tipoDon;

    
    public Postulante() {
    }

    
    public Postulante(long codP, String nombre, String dni, String ocupacion, String lugarN, String fechaN, int edad, String distrito, String domicilio, String centroT, int telCasa, int celular, String fechaR, String sexo, String estadoC, String grupoS, String factorRh, String tipoDon) {
        this.codP = codP;
        this.nombre = nombre;
        this.dni = dni;
        this.ocupacion = ocupacion;
        this.lugarN = lugarN;
        this.fechaN = fechaN;
        this.edad = edad;
        this.distrito = distrito;
        this.domicilio = domicilio;
        this.centroT = centroT;
        this.telCasa = telCasa;
        this.celular = celular;
        this.fechaR = fechaR;
        this.sexo = sexo;
        this.estadoC = estadoC;
        this.grupoS = grupoS;
        this.factorRh = factorRh;
        this.tipoDon = tipoDon;
    }

    
    
    public long getCodP() {
        return codP;
    }

    public void setCodP(long codP) {
        this.codP = codP;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getLugarN() {
        return lugarN;
    }

    public void setLugarN(String lugarN) {
        this.lugarN = lugarN;
    }

    public String getFechaN() {
        return fechaN;
    }

    public void setFechaN(String fechaN) {
        this.fechaN = fechaN;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCentroT() {
        return centroT;
    }

    public void setCentroT(String centroT) {
        this.centroT = centroT;
    }

    public int getTelCasa() {
        return telCasa;
    }

    public void setTelCasa(int telCasa) {
        this.telCasa = telCasa;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getFechaR() {
        return fechaR;
    }

    public void setFechaR(String fechaR) {
        this.fechaR = fechaR;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoC() {
        return estadoC;
    }

    public void setEstadoC(String estadoC) {
        this.estadoC = estadoC;
    }

    public String getGrupoS() {
        return grupoS;
    }

    public void setGrupoS(String grupoS) {
        this.grupoS = grupoS;
    }

    public String getFactorRh() {
        return factorRh;
    }

    public void setFactorRh(String factorRh) {
        this.factorRh = factorRh;
    }

    public String getTipoDon() {
        return tipoDon;
    }

    public void setTipoDon(String tipoDon) {
        this.tipoDon = tipoDon;
    }
    
    
}
