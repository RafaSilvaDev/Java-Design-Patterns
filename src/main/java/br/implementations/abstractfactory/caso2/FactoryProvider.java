package br.implementations.abstractfactory.caso2;


import br.implementations.abstractfactory.caso2.enums.FactoryEnum;
import br.implementations.abstractfactory.caso2.factory.AbstractFactory;
import br.implementations.abstractfactory.caso2.factory.AnimalFactory;
import br.implementations.abstractfactory.caso2.factory.CorFactory;

public class FactoryProvider {
    public static AbstractFactory getFactory(FactoryEnum factory){
        switch(factory){
            case COR:
                return new CorFactory();
            case ANIMAL:
                return new AnimalFactory();
            default:
                return null;
        }
    }
}
