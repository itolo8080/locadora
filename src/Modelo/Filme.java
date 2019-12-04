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
public class Filme {
    //atributos
    private int codigo;
    private string titulo;
    private int ano;
    private string duracao;
    private int cod_categoria;
    private int cod_classificacao;
    private string capa;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public string getTitulo() {
        return titulo;
    }

    public void setTitulo(string titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public string getDuracao() {
        return duracao;
    }

    public void setDuracao(string duracao) {
        this.duracao = duracao;
    }

    public int getCod_categoria() {
        return cod_categoria;
    }

    public void setCod_categoria(int cod_categoria) {
        this.cod_categoria = cod_categoria;
    }

    public int getCod_classificacao() {
        return cod_classificacao;
    }

    public void setCod_classificacao(int cod_classificacao) {
        this.cod_classificacao = cod_classificacao;
    }

    public string getCapa() {
        return capa;
    }

    public void setCapa(string capa) {
        this.capa = capa;
    }
  
}
