package br.implementations.abstractfactory.caso1;

public interface AbstractFactory<T> {
    T criar(String tipo);
}
