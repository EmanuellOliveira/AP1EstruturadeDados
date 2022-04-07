package Questao4_Lista;

public class Carros {
    private String placa;
    private int capPassageiro;
    private int ano;
    private String marca;
    private String modelo;
    private String proprietario;
    
    public String getPlaca() {
        return placa;
    }
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public int getCapPassageiro() {
        return capPassageiro;
    }
    
    public void setCapPassageiro(int capPassageiro) {
        this.capPassageiro = capPassageiro;
    }
    
    public int getAno() {
        return ano;
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String getProprietario() {
        return proprietario;
    }
    
    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    @Override
    public String toString() {
        return "Carros [ano=" + ano + ", capPassageiro=" + capPassageiro + ", marca=" + marca + ", modelo=" + modelo
                + ", placa=" + placa + ", proprietario=" + proprietario + "]";
    }

    

}
