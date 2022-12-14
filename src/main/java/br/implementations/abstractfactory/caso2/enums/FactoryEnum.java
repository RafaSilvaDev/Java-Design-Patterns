package br.implementations.abstractfactory.caso2.enums;

import br.implementations.abstractfactory.caso2.factory.AbstractFactory;
import br.implementations.abstractfactory.caso2.factory.AnimalFactory;
import br.implementations.abstractfactory.caso2.factory.CorFactory;

public enum FactoryEnum implements Instanciador<AbstractFactory> {
    ANIMAL(new AnimalFactory()),
    COR(new CorFactory());

    private AbstractFactory factory;

    FactoryEnum(AbstractFactory factory) {
        this.factory = factory;
    }

    @Override
    public AbstractFactory getInstancia() {
        return factory;
    }
}
