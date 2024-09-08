/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.contador.controle;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author fe_li
 */
public class hora_binaria {

    public void relogio() {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                Date datahora = new Date();
                String hora = new SimpleDateFormat("HH:mm:ss").format(datahora);
                System.out.println(hora);
            }
        }, 0, 1000);
    }

    public void relogioBin() {
        Timer timer = new Timer();
        decTObin bin = new decTObin();
         
         
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                Date datahora = new Date();
                String hora = bin.converte(Integer.parseInt(new SimpleDateFormat("HH").format(datahora)));
                String minuto = bin.converte(Integer.parseInt(new SimpleDateFormat("mm").format(datahora)));
                String segundo = bin.converte(Integer.parseInt(new SimpleDateFormat("ss").format(datahora)));
                System.out.println(hora + "-" + minuto + "-" + segundo);
            }
        }, 0, 1000);
        
        
    }

    public static void main(String[] args) {
        hora_binaria h = new hora_binaria();
        h.relogioBin();
    }

}
