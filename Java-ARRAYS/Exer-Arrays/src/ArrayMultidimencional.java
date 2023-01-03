
/*
 Gere e imprima uma matriz M 4x4 com valores aleatorios entre 0-9
 */
import java.util.Random; 

public class ArrayMultidimencional {
    public static void main(String[] args) {
      Random random = new Random();
      
      /*
       * No array multidimensional em forma de matriz é composto por 2 []
       * Primeiro [] para definir LUNHAS da MATRIZ
       * Segundo [] para definir COLUNAS da MATRIZ
       */

       // 4 linhas 4 colunas
       int[][] M = new int[4][4];
        //Para LINHA
       for(int i = 0; i < M.length; i++){
            
            //Para COLUNA
        for( int j = 0; j < M[i].length; j++){
                //Monatndo a matriz com numeros aleatórios
            M [i][j] = random.nextInt(9);
        }

       }

       /*
        O foreach é bem usado para expressar um output(pesquisar mais)
        nesta estrutura pegamos o array linha dentro de M
        depois definimos coluna que está dentro de linha, para assim
        imprimirmos a matriz
        */
       
        System.out.println("Matriz: ");
        for (int[] linha : M ) {
            //Essa coluna está representando o elemento
            for (int coluna : linha ) {
                System.out.print(coluna + " ");
                
            }
            System.out.println();
       }

       
    }
}
