package br.implementations.iterator;

public class App {

    public static void main(String[] args) {
        Produto[] produtos = new Produto[4];

        produtos[0] = new Produto("Leite", 4.50);
        produtos[1] = new Produto("Açúcar", 8.25);
        produtos[2] = new Produto("Mel", 4.00);
        produtos[3] = new Produto("Café", 6.50);

        Iterator produtoIterator = new ProdutoIterator(produtos);

        while(produtoIterator.hasNext()){
            Produto p = (Produto) produtoIterator.next();
            System.out.println(p.getNome() + " = R$" + p.getPreco());
        }
    }

}
