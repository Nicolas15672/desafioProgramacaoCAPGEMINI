import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class desafio02 {
    public static void main(String[] args) {
        List<Float> numeros = new ArrayList<>();

        numeros.add(1.0f);
        numeros.add(5.0f);
        numeros.add(3.0f);
        numeros.add(4.0f);
        numeros.add(2.0f);
        int diferenca = 1; //atribuí o valor de um inteiro qualquer  para realizar o calculo dos elementos pares do vetor que tem uma diferença igual ao valor de x
        Collections.sort(numeros);
        calcularDiferenca(numeros,diferenca);
    }
        public static void calcularDiferenca(List<Float> numeros,int diferenca){
        int contador = 0;
        for(int i=0; i< numeros.size();i++){
            for(int j = i+1; j< numeros.size();j++){
                if(Math.abs(numeros.get(j)- numeros.get(i))==Math.abs(diferenca)) {
                      contador++;
                }
            }

        }
            System.out.println("O número de pares no vetor que tem uma diferença igual ao valor de "+diferenca+" é = "+contador);

        }



    }
