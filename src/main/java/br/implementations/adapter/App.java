package br.implementations.adapter;

import java.util.Objects;

public class App {

    public static void main(String[] args) {
        PhysicalPerson joao = new PhysicalPerson(null);
        LegalPerson empresa = new LegalPerson(null);

        PersonProcessor pp = new PersonProcessor();
        pp.process(joao);
        pp.process(empresa);

    }

    public static class PersonProcessor{
        void process(PersonAdapter adapter){
            if(Objects.isNull(adapter.getRegister())){
                System.out.println("Registro não informado");
            }
        }
    }

}
