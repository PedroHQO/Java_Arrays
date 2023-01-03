/*
 Faça um programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene
 os num vetor. Ao final mostre o seu sucessor. 
 */

 //Essa classe gera numeros aleatórios
import java.util.Random;
public class Ex3NumAleat {
    
    
    
    public static void main(String[] args) {
      Random random = new Random();

      int[] numAleatorio = new int[20];

      for(int i = 0; i < numAleatorio.length; i++){

          int numero = random.nextInt(100);
          numAleatorio[i] = numero;

      }

      System.out.print("Numeros Aleatorios: ");
      for (int numero : numAleatorio) {
        System.out.print(numero + " ");
      }
      
      
      System.out.print("\nAntecessores dos Numeros Aleatorios: ");
        for (int numero : numAleatorio) {
          System.out.print((numero - 1) + " ");
        }
      

      System.out.print("\nSucessores dos Numeros Aleatorios: ");
      for (int numero : numAleatorio) {
        System.out.print((numero + 1) + " ");
      
      }
      
        

          
        
    }
}
