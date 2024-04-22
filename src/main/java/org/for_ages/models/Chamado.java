package org.for_ages.models;

import java.util.Date;

public class Chamado {

    /**
     Variáveis sem uso no momento:

     private int IDSolicitante;

     Data será implementada:
     private Date dataAbertura;
     private Date dataFechamento;

     private String status;
     **/

    // Variável Global
    private static int countChamado = 1;
    private int id;
    private String chamadaProblema;

    private String nivelUrgencia;


    public Chamado(){

    }


    public Chamado(String problema, String nivelUrgencia){
        this.id = countChamado;
        this.chamadaProblema= problema;
        this.nivelUrgencia = nivelUrgencia;
        Chamado.countChamado += 1;

    }

    public int getId() {
        return id;
    }

    public String getChamadaProblema() {
        return chamadaProblema;
    }

    public void setChamadaProblema(String chamadaProblema) {
        this.chamadaProblema = chamadaProblema;
    }

    public String getNivelUrgencia() {
        return nivelUrgencia;
    }

    public void setNivelUrgencia(String nivelUrgencia) {
        this.nivelUrgencia = nivelUrgencia;
    }

    // to String
    public String toString(){
        return "Id: " + this.getId() +
                "\nNome da Chamada: " + this.getChamadaProblema() +
                "\nNivel Urgencia: " + this.getNivelUrgencia();
    }
}
