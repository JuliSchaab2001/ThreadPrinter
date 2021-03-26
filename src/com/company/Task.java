package com.company;


public class Task extends Thread{
    private Integer pages;
    private Printer printer;


    public Task(Integer pages, Printer printer) {
        this.pages = pages;
        this.printer = printer;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Printer getPrinter() {
        return printer;
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    public void run(){
        try{
            printer.print(this.pages);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
