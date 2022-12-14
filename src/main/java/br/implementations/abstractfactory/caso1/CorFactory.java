package br.implementations.abstractfactory.caso1;

public class CorFactory implements AbstractFactory<Cor> {
    public Cor criar(String tipo) {
        if("Marrom".equalsIgnoreCase(tipo)){ //equalsIgnoreCase faz uma comparação entre strings ignorando caixas altas/baixas
            return new Marrom();
        } else if("Preto".equalsIgnoreCase(tipo)){
            return new Preto();
        }else if ("Branco".equalsIgnoreCase(tipo)){
            return new Branco();
        }
        return null;
    }
}
