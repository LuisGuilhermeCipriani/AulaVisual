/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Luis Guilherme
 */
public class Automovel {
    private String placa;
    private String modelo;
    private String dataFabricacao;
    private String motorizacao;
    private double valorBasico;
    private String categoria;

    public Automovel() {
    }

    public Automovel(String placa, String modelo, String dataFabricacao, String motorizacao, double valorBasico, String categoria) {
        this.placa = placa;
        this.modelo = modelo;
        this.dataFabricacao = dataFabricacao;
        this.motorizacao = motorizacao;
        this.valorBasico = valorBasico;
        this.categoria = categoria;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public String getMotorizacao() {
        return motorizacao;
    }

    public void setMotorizacao(String motorizacao) {
        this.motorizacao = motorizacao;
    }

    public double getValorBasico() {
        return valorBasico;
    }

    public void setValorBasico(double valorBasico) {
        this.valorBasico = valorBasico;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public double calcularImposto(double porcentagem){
        double imposto = porcentagem + ((3.0/100)*500);
        return imposto;
    }
    
    public double valorTotalDoVeiculo(double porcentagem){
        double total = valorBasico + ((5/100)*valorBasico) + calcularImposto(porcentagem);
        return total;
    }
    
    public String exibirInformacoes(){
        String dados = "Placa: " + placa +
                "\nModelo: " + modelo +
                "\nData de Fabricação: " + dataFabricacao +
                "\nMotorização: " + motorizacao +
                "\nValor Básico: " + valorBasico +
                "\nCategoria: " + categoria;
        return dados;
    }
}
