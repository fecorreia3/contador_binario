/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.contador.controle;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author fe_li
 */
public class contador_teste {

    private int bpm;
    private Timer timer;
    private int num;

    public static void main(String[] args) {
        contador_teste c = new contador_teste();
        c.start();
    }

    public void start() {
        timer = new Timer();
        bpm = 120;

        //numero a ser convertido
        num = 13;

        decTObin bin = new decTObin();

        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                // Disparar a cada ciclo
                System.out.println(bin.converte(num));
                num--;
                if (num == 0) {
                    timer.cancel();
                }
            }
        }, 0, 60000 / bpm); // 60000 é o número de milissegundos em um minuto
    }

}
