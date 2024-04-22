package org.for_ages.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Cliente {
    private int IDCliente;
    private String nome;

    private ArrayList<Chamado> chamado;


    public Cliente (){

    }
    public Cliente(int IDCliente, String nome) {
        this.IDCliente = IDCliente;
        this.nome = nome;
        this.chamado = new ArrayList<>();
    }

    public int getIDCliente() {
        return IDCliente;
    }

    public void setIDCliente(int IDCliente) {
        this.IDCliente = IDCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Chamado> getChamado() {
        return chamado;
    }

    public void setChamado(ArrayList<Chamado> chamado) {
        this.chamado = chamado;
    }
}
