package com.company;

public class Printer {
    private int count =0;
    private boolean working = false;

    public synchronized void print(Integer pages){
        try{
            while(working){
                wait();
            }
            working =true;
            System.out.println("Comienzo de la impresion-> "+count);
            Thread.sleep(3000);
            for (int i =0; i<pages;i++){
                Thread.sleep(2500);
                System.out.println("Imprimiedo pagina numero: "+(i+1));
            }

            System.out.println("Fin de la impresion-> "+count);
            count++;
            Thread.sleep(3000);
            clean();
            working = false;
            notifyAll();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void clean()
    {
        for (int i=0; i < 60; i++)
        {
            System.out.println("");
        }
    }

}
