package br.implementations.adapter;

public class PhysicalPerson implements  PersonAdapter{

    private String cpf;

    public PhysicalPerson(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String getRegister() {
        return getCpf();
    }
}
