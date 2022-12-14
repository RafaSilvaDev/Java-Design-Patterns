package br.implementations.abstractfactory.caso2.factory;

public interface AbstractFactory<T, U extends Enum<U>>{ //passagem de tipo e enumerador de um objeto
    T criar(U tipo);
}
