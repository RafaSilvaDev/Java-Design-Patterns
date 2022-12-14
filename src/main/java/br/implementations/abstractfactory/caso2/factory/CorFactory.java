package br.implementations.abstractfactory.caso2.factory;

import br.implementations.abstractfactory.caso2.cor.Cor;
import br.implementations.abstractfactory.caso2.enums.CorEnum;

public class CorFactory implements AbstractFactory<Cor, CorEnum>{
    public Cor criar(CorEnum cor) {
        return cor.getInstancia();
    }
}
