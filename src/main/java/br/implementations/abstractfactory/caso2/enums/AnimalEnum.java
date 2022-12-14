package br.implementations.abstractfactory.caso2.enums;

import br.implementations.abstractfactory.caso2.animal.Animal;
import br.implementations.abstractfactory.caso2.animal.Cachorro;
import br.implementations.abstractfactory.caso2.animal.Gato;
import br.implementations.abstractfactory.caso2.animal.Pato;

public enum AnimalEnum implements Instanciador<Animal>{
    GATO(new Gato()),
     PATO(new Pato()),
    CACHORRO(new Cachorro());

    private Animal animal;

    AnimalEnum(Animal animal) {
        this.animal = animal;
    }

    @Override
    public Animal getInstancia() {
        return animal;
    }
}
