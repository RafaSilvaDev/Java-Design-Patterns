package br.implementations.abstractfactory.caso1;

public class AnimalFactory implements AbstractFactory<Animal> {
    public Animal criar(String tipo) {
        if("Cachorro".equalsIgnoreCase(tipo)){ //equalsIgnoreCase faz uma comparação entre strings ignorando caixas altas/baixas
            return new Cachorro();
        } else if("Pato".equalsIgnoreCase(tipo)){
            return new Pato();
        }else if ("Gato".equalsIgnoreCase(tipo)){
            return new Gato();
        }
        return null;
    }
}
