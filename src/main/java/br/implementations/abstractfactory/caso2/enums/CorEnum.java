package br.implementations.abstractfactory.caso2.enums;

import br.implementations.abstractfactory.caso2.cor.Branco;
import br.implementations.abstractfactory.caso2.cor.Cor;
import br.implementations.abstractfactory.caso2.cor.Marrom;
import br.implementations.abstractfactory.caso2.cor.Preto;

public enum CorEnum implements Instanciador<Cor>{
    BRANCO(new Branco()),
    PRETO(new Preto()),
    MARROM(new Marrom());

    private Cor cor;

    CorEnum(Cor cor) {

        this.cor = cor;
    }

    @Override
    public Cor getInstancia() {
        return cor;
    }
}
