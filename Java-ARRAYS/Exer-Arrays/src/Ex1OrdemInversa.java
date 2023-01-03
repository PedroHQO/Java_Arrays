/*
 Crie um Vetor de 6 números interos 
 e mostre na ordem inversa
 */

public class Ex1OrdemInversa {
        public static void main(String[] args) {
        
            /*
              *Para se criar um array é necessário:
              *Tipo de classe(inteiros), nome(vetor), elemento dentro(6 números)
              * As ordens dos elementos dentro do array não muda.
              *Lembre-se a contagem se inicia no 0
              *print mostra os numeros na mesma linha, em vez de 1 em cada linha.
              * \n faz quebra de linha
              * São 6 posições que ele reconhece, porem a contagem começa por 0
              * logo só tem 5 posições, é por isso que colocou .length -1(6 - 1)
             */

            int[] vetor = {-1, 2, 9, -8, 77, 3};
            //Para retornar o tamanho do array usa-se (.length)
            //System.out.println(vetor.length);

            int count = 0;

            System.out.print(" Vetor: ");
            while(count < (vetor.length)){
                System.out.print(vetor[count] + " ");
                count ++;
            }

            System.out.print("\n Vetor: ");
            // começa com, vai ficar no loop até; a sequencia de passo será
            for(int i = (vetor.length - 1); i >= 0; i-- ) {
                System.out.print(vetor[i] + " ");
            }
    }

}
