package br.implementations.abstractfactory.caso2.factory;
import br.implementations.abstractfactory.caso2.animal.Animal;
import br.implementations.abstractfactory.caso2.enums.AnimalEnum;

public class AnimalFactory implements AbstractFactory<Animal, AnimalEnum>{
    public Animal criar(AnimalEnum animal) {
        return animal.getInstancia();
    }
}
