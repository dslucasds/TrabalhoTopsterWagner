
package br.SisAgenda.modelo;


public class Tarefa {
    
    private String titAge;
    private String desAge;
    private String dataCri;

    public String getDataCri() {
        return dataCri;
    }

    public void setDataCri(String dataCri) {
        this.dataCri = dataCri;
    }

    public String getDataEnt() {
        return dataEnt;
    }

    public void setDataEnt(String dataEnt) {
        this.dataEnt = dataEnt;
    }
    private String dataEnt;
    private int idEqp;
    private int idCol;

    public int getIdEqp() {
        return idEqp;
    }

    public void setIdEqp(int idEqp) {
        this.idEqp = idEqp;
    }

    public int getIdCol() {
        return idCol;
    }

    public void setIdCol(int idCol) {
        this.idCol = idCol;
    }
    
    public String getTitAge() {
        return titAge;
    }

    public void setTitAge(String titAge) {
        this.titAge = titAge;
    }

    public String getDesAge() {
        return desAge;
    }

    public void setDesAge(String desAge) {
        this.desAge = desAge;
    }

 
}
