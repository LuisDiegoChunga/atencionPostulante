package atencion.clases;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "entrevista")
public class Entrevista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codEnt;
    @Column
    private String preg1;
    @Column
    private String preg2;
    @Column
    private String preg3;
    @Column
    private String preg4;
    @Column
    private String preg5;
    @Column
    private String preg6;
    @Column
    private String preg7;
    @Column
    private String preg8;
    @Column
    private String preg9;
    @Column
    private String preg10;
    @Column
    private String preg11;
    @Column
    private String preg12;
    @Column
    private String preg13;
    @Column
    private String preg14;
    @Column
    private String preg15;
    @Column
    private String preg16;
    @Column
    private String preg17;
    @Column
    private String preg18;
    @Column
    private String preg19;
    @Column
    private String preg20;
    @Column
    private String preg21;
    @Column
    private String preg22;
    @Column
    private String preg23;
    @Column
    private String preg24;
    @Column
    private String entrevistador;

    public Entrevista() {
    }

    public Entrevista(long codEnt, String preg1, String preg2, String preg3, String preg4, String preg5, String preg6, String preg7, String preg8, String preg9, String preg10, String preg11, String preg12, String preg13, String preg14, String preg15, String preg16, String preg17, String preg18, String preg19, String preg20, String preg21, String preg22, String preg23, String preg24, String entrevistador) {
        this.codEnt = codEnt;
        this.preg1 = preg1;
        this.preg2 = preg2;
        this.preg3 = preg3;
        this.preg4 = preg4;
        this.preg5 = preg5;
        this.preg6 = preg6;
        this.preg7 = preg7;
        this.preg8 = preg8;
        this.preg9 = preg9;
        this.preg10 = preg10;
        this.preg11 = preg11;
        this.preg12 = preg12;
        this.preg13 = preg13;
        this.preg14 = preg14;
        this.preg15 = preg15;
        this.preg16 = preg16;
        this.preg17 = preg17;
        this.preg18 = preg18;
        this.preg19 = preg19;
        this.preg20 = preg20;
        this.preg21 = preg21;
        this.preg22 = preg22;
        this.preg23 = preg23;
        this.preg24 = preg24;
        this.entrevistador = entrevistador;
    }

    public long getCodEnt() {
        return codEnt;
    }

    public void setCodEnt(long codEnt) {
        this.codEnt = codEnt;
    }

    public String getPreg1() {
        return preg1;
    }

    public void setPreg1(String preg1) {
        this.preg1 = preg1;
    }

    public String getPreg2() {
        return preg2;
    }

    public void setPreg2(String preg2) {
        this.preg2 = preg2;
    }

    public String getPreg3() {
        return preg3;
    }

    public void setPreg3(String preg3) {
        this.preg3 = preg3;
    }

    public String getPreg4() {
        return preg4;
    }

    public void setPreg4(String preg4) {
        this.preg4 = preg4;
    }

    public String getPreg5() {
        return preg5;
    }

    public void setPreg5(String preg5) {
        this.preg5 = preg5;
    }

    public String getPreg6() {
        return preg6;
    }

    public void setPreg6(String preg6) {
        this.preg6 = preg6;
    }

    public String getPreg7() {
        return preg7;
    }

    public void setPreg7(String preg7) {
        this.preg7 = preg7;
    }

    public String getPreg8() {
        return preg8;
    }

    public void setPreg8(String preg8) {
        this.preg8 = preg8;
    }

    public String getPreg9() {
        return preg9;
    }

    public void setPreg9(String preg9) {
        this.preg9 = preg9;
    }

    public String getPreg10() {
        return preg10;
    }

    public void setPreg10(String preg10) {
        this.preg10 = preg10;
    }

    public String getPreg11() {
        return preg11;
    }

    public void setPreg11(String preg11) {
        this.preg11 = preg11;
    }

    public String getPreg12() {
        return preg12;
    }

    public void setPreg12(String preg12) {
        this.preg12 = preg12;
    }

    public String getPreg13() {
        return preg13;
    }

    public void setPreg13(String preg13) {
        this.preg13 = preg13;
    }

    public String getPreg14() {
        return preg14;
    }

    public void setPreg14(String preg14) {
        this.preg14 = preg14;
    }

    public String getPreg15() {
        return preg15;
    }

    public void setPreg15(String preg15) {
        this.preg15 = preg15;
    }

    public String getPreg16() {
        return preg16;
    }

    public void setPreg16(String preg16) {
        this.preg16 = preg16;
    }

    public String getPreg17() {
        return preg17;
    }

    public void setPreg17(String preg17) {
        this.preg17 = preg17;
    }

    public String getPreg18() {
        return preg18;
    }

    public void setPreg18(String preg18) {
        this.preg18 = preg18;
    }

    public String getPreg19() {
        return preg19;
    }

    public void setPreg19(String preg19) {
        this.preg19 = preg19;
    }

    public String getPreg20() {
        return preg20;
    }

    public void setPreg20(String preg20) {
        this.preg20 = preg20;
    }

    public String getPreg21() {
        return preg21;
    }

    public void setPreg21(String preg21) {
        this.preg21 = preg21;
    }

    public String getPreg22() {
        return preg22;
    }

    public void setPreg22(String preg22) {
        this.preg22 = preg22;
    }

    public String getPreg23() {
        return preg23;
    }

    public void setPreg23(String preg23) {
        this.preg23 = preg23;
    }

    public String getPreg24() {
        return preg24;
    }

    public void setPreg24(String preg24) {
        this.preg24 = preg24;
    }

    public String getEntrevistador() {
        return entrevistador;
    }

    public void setEntrevistador(String entrevistador) {
        this.entrevistador = entrevistador;
    }
    
}
