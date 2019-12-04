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
public class Aluguel {
  //atributos
    private int cod;
    private int coddvd;
    private int codcliente;
    private string data_aluguel;
    private string horario;
    private string data_devolucao;

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getCoddvd() {
        return coddvd;
    }

    public void setCoddvd(int coddvd) {
        this.coddvd = coddvd;
    }

    public int getCodcliente() {
        return codcliente;
    }

    public void setCodcliente(int codcliente) {
        this.codcliente = codcliente;
    }

    public string getData_aluguel() {
        return data_aluguel;
    }

    public void setData_aluguel(string data_aluguel) {
        this.data_aluguel = data_aluguel;
    }

    public string getHorario() {
        return horario;
    }

    public void setHorario(string horario) {
        this.horario = horario;
    }

    public string getData_devolucao() {
        return data_devolucao;
    }

    public void setData_devolucao(string data_devolucao) {
        this.data_devolucao = data_devolucao;
    }
}
