/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculo_retangulo;

/**
 *
 * @author Flávio
 */
public class Retangulo {
    
    //Atributos 
    private double Comprimento;
    private double Largura;
    private double CPiso;
    private double LPiso;
    
    //Métodos
    public void setComprimento(double Comprimento) {
        this.Comprimento = Comprimento;
    }

    public void setLargura(double Largura) {
        this.Largura = Largura;
    }
    public void setCPiso(double CPiso) {
        this.CPiso = CPiso;
    }

    public void setLPiso(double LPiso) {
        this.LPiso = LPiso;
    }

    public double Area() {                  //Calcula área.
        return Comprimento * Largura;
    }

    public double Perimetro() {             //Calcula perímetro.
        return (Comprimento * 2) + (Largura * 2);
    }
    public double APiso() {             //Calcula perímetro.
        return CPiso * LPiso;
    }
    public double NPiso() {             //Calcula perímetro.
        return Area() * 1.0/APiso();
    }
}