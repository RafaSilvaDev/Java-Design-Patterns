package br.implementations.sigleton;

public class App {
    public static void main(String[] args) {
        Configuration config = Configuration.getInstance();
        Configuration config2 = Configuration.getInstance();

        //ambos os prints mostrarão a mesma posição em memória, pois deve-se existir apenas uma instancia em toda a aplicação
        System.out.println(config);
        System.out.println(config2);
    }
}
