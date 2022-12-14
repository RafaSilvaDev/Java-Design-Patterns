package br.implementations.abstractfactory.caso2;
import br.implementations.abstractfactory.caso2.animal.Animal;
import br.implementations.abstractfactory.caso2.cor.Cor;
import br.implementations.abstractfactory.caso2.enums.AnimalEnum;
import br.implementations.abstractfactory.caso2.enums.CorEnum;
import br.implementations.abstractfactory.caso2.enums.FactoryEnum;

public class App {
    public static void main(String[] args) {

        //criando um gato marrom
        Animal animal = (Animal) FactoryProvider.getFactory(FactoryEnum.ANIMAL).criar(AnimalEnum.GATO);
        Cor cor = (Cor) FactoryProvider.getFactory(FactoryEnum.COR).criar(CorEnum.BRANCO);

        String resultado = String.format("Um %s de cor %s faz %s", animal.getAnimal(), cor.getCor(), animal.fazSom());
        System.out.println(resultado);
    }
}
