package br.implementations.strategy;

public class Strategy {

    public static void main(String[] args) {
        Person person = new Person("12345678911", 16);
        validatePerson(person, new PhysicaPersonValidator());
        validatePerson(person, new LegalPersonValidator()); //Exception com o registry, pois não vale como CNPJ
        validatePerson(person, new Greater18years()); //Exception com o age, pois a idade é menor de 18
    }

    public static  void validatePerson(Person person, IValidator validator){
        validator.validate(person);
    }

    private static class PhysicaPersonValidator implements IValidator{

        @Override
        public void validate(Person person) {
            if(person.getRegistry().length() > 11){
                throw new IllegalArgumentException("Problema com o CPF!");
            }
        }
    }

    private static class LegalPersonValidator implements IValidator{

        @Override
        public void validate(Person person) {
            if(person.getRegistry().length() < 14){
                throw new IllegalArgumentException("Problema com o CNPJ!");
            }
        }
    }

    private static class Greater18years implements IValidator{

        @Override
        public void validate(Person person) {
            if(person.getAge() < 18){
                throw new IllegalArgumentException("É menor de 18!");
            }
        }
    }

}
