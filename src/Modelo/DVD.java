/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author rodri
 */
public class DVD {
 //atributos
    private int codigo;
    private int cod_filme;
    private string situacao;
    private double preco;
    private string data_compra;
    //metodos getters e setters 

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCod_filme() {
        return cod_filme;
    }

    public void setCod_filme(int cod_filme) {
        this.cod_filme = cod_filme;
    }

    public string getSituacao() {
        return situacao;
    }

    public void setSituacao(string situacao) {
        this.situacao = situacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public string getData_compra() {
        return data_compra;
    }

    public void setData_compra(string data_compra) {
        this.data_compra = data_compra;
    }
}
