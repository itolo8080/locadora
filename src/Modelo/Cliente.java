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
public class Cliente {
 private int codigo;
 private string nome;
 private string nascimento;
 private string RG;
 private string CPF;
 private string Telefone;
 private string Email;
 private string Bairro;
 private string Rua;
 private int Numero;
 private string CEP;
 //metodos getters e setters

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public string getNome() {
        return nome;
    }

    public void setNome(string nome) {
        this.nome = nome;
    }

    public string getNascimento() {
        return nascimento;
    }

    public void setNascimento(string nascimento) {
        this.nascimento = nascimento;
    }

    public string getRG() {
        return RG;
    }

    public void setRG(string RG) {
        this.RG = RG;
    }

    public string getCPF() {
        return CPF;
    }

    public void setCPF(string CPF) {
        this.CPF = CPF;
    }

    public string getTelefone() {
        return Telefone;
    }

    public void setTelefone(string Telefone) {
        this.Telefone = Telefone;
    }

    public string getEmail() {
        return Email;
    }

    public void setEmail(string Email) {
        this.Email = Email;
    }

    public string getBairro() {
        return Bairro;
    }

    public void setBairro(string Bairro) {
        this.Bairro = Bairro;
    }

    public string getRua() {
        return Rua;
    }

    public void setRua(string Rua) {
        this.Rua = Rua;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public string getCEP() {
        return CEP;
    }

    public void setCEP(string CEP) {
        this.CEP = CEP;
    }
}
