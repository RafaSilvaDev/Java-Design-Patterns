package br.implementations.sigleton;

import java.util.Objects;

public class Configuration {
    private static Configuration instance;

    private Configuration(){

    }

    public static Configuration getInstance(){
        if (Objects.isNull(instance)) {
            synchronized (Configuration.class) {
                if (Objects.isNull(instance)) {
                    instance = new Configuration();
                }
            }
        }
        return instance;
    }
}
