package atencion.clases;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "examenClinico")
public class ExamenClinico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codExaC;
    @Column
    private int pesoKG;
    @Column
    private String pa;
    @Column
    private int tallaM;
    @Column
    private int pulso;
    @Column
    private String estAV;
    @Column
    private String obs;
    
    public ExamenClinico() {
    }

    public ExamenClinico(long codExaC, int pesoKG, String pa, int tallaM, int pulso, String estAV, String obs) {
        this.codExaC = codExaC;
        this.pesoKG = pesoKG;
        this.pa = pa;
        this.tallaM = tallaM;
        this.pulso = pulso;
        this.estAV = estAV;
        this.obs = obs;
    }

    public long getCodExaC() {
        return codExaC;
    }

    public void setCodExaC(long codExaC) {
        this.codExaC = codExaC;
    }

    public int getPesoKG() {
        return pesoKG;
    }

    public void setPesoKG(int pesoKG) {
        this.pesoKG = pesoKG;
    }

    public String getPa() {
        return pa;
    }

    public void setPa(String pa) {
        this.pa = pa;
    }

    public int getTallaM() {
        return tallaM;
    }

    public void setTallaM(int tallaM) {
        this.tallaM = tallaM;
    }

    public int getPulso() {
        return pulso;
    }

    public void setPulso(int pulso) {
        this.pulso = pulso;
    }

    public String getEstAV() {
        return estAV;
    }

    public void setEstAV(String estAV) {
        this.estAV = estAV;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
}
