
package br.SisAgenda.modelo;


public class Tarefa {
    
    private int Colab;
    private int Equipe;
    private String titAge;
    private String desAge;
    private String dataCri;
    private String dataEnt;

    public Integer getColab() {
        return Colab;
    }

    public void setColab(Integer Colab) {
        this.Colab = Colab;
    }

    public Integer getEquipe() {
        return Equipe;
    }

    public void setEquipe(Integer Equipe) {
        this.Equipe = Equipe;
    }
    
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
