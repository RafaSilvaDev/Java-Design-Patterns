package br.implementations.abstractfactory.caso1;

public class App {
    public static void main(String[] args) {
        AbstractFactory abstractFactory;

        //criando um gato marrom
        abstractFactory = FactoryProvider.getFactory("Animal");
        Animal animal = (Animal) abstractFactory.criar("Gato");

        abstractFactory = FactoryProvider.getFactory("Cor");
        Cor cor = (Cor) abstractFactory.criar("Marrom");

        String resultado = String.format("Um %s de cor %s faz %s", animal.getAnimal(), cor.getCor(), animal.fazSom());
        System.out.println(resultado);
    }
}
