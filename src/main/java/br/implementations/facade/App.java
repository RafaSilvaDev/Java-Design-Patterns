package br.implementations.facade;

public class App {

    public static void main(String[] args) {
        ComputerFacade facade =  new ComputerFacade();
        facade.buildPC();
    }

}
