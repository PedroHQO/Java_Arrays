/**
 Faça um programa que leia um vetor de 6 caracteres ,
 e diga quantas consoantes foram lidas.
 Imprima as consoantes. 
 */

 import java.util.Scanner;
public class Ex2Consoantes {

        public static void main(String[] args) {
            //Para dar entrada pelo o teclado
            Scanner sc = new Scanner(System.in);
            //montando um arrays com scanner
            String[] consoantes = new String[6];

            int quantiConsoantes = 0;
            int cont = 0;

            do{
                System.out.println("Letra: ");
                String letra = sc.next();
                //equalIgnoreCase essa estrutura ignora maiúscula e minuscula,
                // resumindo ela torna ambas iguais

                //Se letra !(não) for a, e, i, o, u
                // consoantes[cont](arrays) = letra (quer dizer que letra é consoante)
                if( !(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))){

                        consoantes[cont] = letra;
                        //ao pegar essas consoantes, somasse +1,
                        //para fazer a contagem
                        quantiConsoantes ++;
                    }

                    cont++;
            //Enquuanto cont for menor que consoantes(6), isso ipede de passar de 5, já que
            //começa no 0 a contagem
            }while(cont < consoantes.length);

            System.out.println("Consoantes digitadas: ");
            /*
             * Esse laço de repetição chama-se foreach, ele pega 
             * a posição de cada elemento dentro do array, no nosso
             * caso ele pega as consoantes em suas posições
             */
            for (String consoante : consoantes) {
                /*
                Todas as letras que não são consoantes, elas são
                imprimidas como null, lembre-se no array não se pode
                apagar ou mudar as posições de memoria
                */

                //Se consoante for diferente de null, vai imprimir as consoantes
                if(consoante != null)
                    System.out.print(consoante + " ");
                
            }
            //Imprimi a quantidade de consoante digitadas
            System.out.println("\nQuantidade de CONSOANTES: " + quantiConsoantes );

            
        }
    
}