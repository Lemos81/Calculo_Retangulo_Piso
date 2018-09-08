/*
Crie uma classe que modele um retângulo: 
Atributos: -LadoA, LadoB (ou Comprimento e Largura, ou Base e Altura, a escolher); 
Métodos: -Mudar valor dos lados, 
Retornar valor dos lados, calcular área e calcular perímetro; 
Crie um programa que utilize esta classe. Ele deve pedir ao usuário que informe as medidas de um local. 
Depois, deve criar um objeto com as medidas e calcular a quantidade de piso e de rodapés necessários para o local
 */
package calculo_retangulo;
import java.util.Scanner;

/**
 *
 * @author Flávio
 */
public class Calculo_Retangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Retangulo ret1 = new Retangulo();           //instancia a class Retangulo.
        
        //Solicitar ao usuário as medidas do local.
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o comprimento da área: ");
        double Comprimento = teclado.nextDouble();
        System.out.print("Digite largura da área: ");
        double Largura = teclado.nextDouble();
        
        //Retorna à class Retangulo para que os metodos sejam executados.
        ret1.setComprimento(Comprimento);                     
        ret1.setLargura(Largura);
        
        //Exibe o resultado para o usuário.
        System.out.println("\nÁrea possui: " + ret1.Area()+" metros²");
        System.out.println("Perímetro possui: " + ret1.Perimetro()+"\n");

        //Solicita ao usuário aas medidas do piso.
        System.out.print("Informe o comprimento do piso: ");
        double CPiso = teclado.nextDouble();
        System.out.print("Informe a largura do piso: ");
        double LPiso = teclado.nextDouble();
        
        //Retorna à class Retangulo para que os metodos sejam executados.
        ret1.setCPiso(CPiso);
        ret1.setLPiso(LPiso);
        
        //Exibe o resultado para o usuário.
        System.out.println("\nSerá necessário: " + ret1.NPiso()+" pisos");

    }
}