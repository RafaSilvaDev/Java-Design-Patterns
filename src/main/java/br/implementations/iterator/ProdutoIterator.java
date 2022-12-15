package br.implementations.iterator;

public class ProdutoIterator implements Iterator{

    Produto[] produtos;
    int posicao = 0;

    public ProdutoIterator(Produto[] produtos){
        this.produtos = produtos;
    }

    @Override
    public boolean hasNext() {
        //verificar se o posicao é menor que o tamanho do array e se a posicao é vazia. Caso sim, existe elementos
        return posicao < produtos.length && produtos[posicao] != null;
    }

    @Override
    public Object next() {
        Produto produto = produtos[posicao];
        posicao++;
        return produto;
    }

}
