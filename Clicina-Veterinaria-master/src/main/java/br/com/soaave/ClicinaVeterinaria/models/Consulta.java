package br.com.soaave.ClicinaVeterinaria.models;

public class Consulta {
    private String nomePet;
    private String dataConsulta;
    private String horaConsulta;
    private final String nomeDono;

    public Consulta(String nomePet, String dataConsulta, String horaConsulta, String nomeDono) {
        this.nomePet = nomePet;
        this.dataConsulta = dataConsulta;
        this.horaConsulta = horaConsulta;
        this.nomeDono = nomeDono;
    }

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

    public String getHoraConsulta() {
        return horaConsulta;
    }

    public void setHoraConsulta(String horaConsulta) {
        this.horaConsulta = horaConsulta;
    }

    public String getNomeDono() {
        return nomeDono;
    }
}
