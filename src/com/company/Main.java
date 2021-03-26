package com.company;

public class Main {

    public static void main(String[] args) {
        Printer mainPrinter = new Printer();
        Task taskOne = new Task(5, mainPrinter);
        Task taskTwo = new Task(1, mainPrinter);
        Task taskThree = new Task(3, mainPrinter);
        Task taskFour = new Task(4, mainPrinter);
        Task taskFive= new Task(2, mainPrinter);
        taskOne.run();
        taskTwo.run();
        taskThree.run();
        taskFour.run();
        taskFive.run();
    }
}
