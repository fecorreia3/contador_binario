/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.contador.controle;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fe_li
 *
 * 1 - Armazene o restante quando o número for dividido por 2 em uma matriz. 2 -
 * Divida o número por 2 3 - Repita as duas etapas acima até que o número seja
 * maior que zero. 4 - Imprima a matriz em ordem inversa agora.
 */
public class decTObin {

    public String converte(int y) {
        String numero = "";
        //array para guardar os numeros binarios
        int[] numBin = new int[10]; //esse valor informa quantas 'casas' o numero binario pode ter (2 = 00,10,11)

        if (y == 0) {
            numero = "0";
        } else {
            int x = 0;
            while (y > 0) {
                numBin[x] = y % 2;
                y = y / 2;
                x++;
            }
            for (int z = x - 1; z >= 0; z--) {
                numero = numero + numBin[z];
            }
        }
        return numero;
    }

    public List<String> decToBinary(int n) {
        // Size of an integer is assumed to be 6 bits
        
        List bin = new ArrayList();
        for (int i = 5; i >= 0; i--) {
            int k = n >> i;
            if ((k & 1) > 0) {
               bin.add("1");
            } else {
                bin.add("0");
            }            
        }
        return bin;
    }

    public static void main(String[] arg) {
        decTObin b = new decTObin();
        System.out.println(b.decToBinary(10));
        String t = b.decToBinary(10).get(0);
        
        System.out.println(t);
    }

}
