package br.com.soaave.ClicinaVeterinaria.models;


public class Consulta {
    private String nomePet;
    private String dataConsulta;
    private String nomeDono;
    private String horaConsulta;

    // Construtor
    public Consulta(String nomePet, String dataConsulta, String nomeDono) {
        this.nomePet = nomePet;
        this.dataConsulta = dataConsulta;
        this.nomeDono = nomeDono;
        this.horaConsulta = horaConsulta;
    }

    // Getters e Setters
    public String getNomePet() {
        return nomePet;
    }

    public void setNomePet(String nomePet) {
        this.nomePet = nomePet;
    }

    public String getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(String dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public String getHoraConsulta() {
        return horaConsulta;
    }

    public void setHoraConsulta(String horaConsulta) {
        this.horaConsulta = horaConsulta;
    }
}

