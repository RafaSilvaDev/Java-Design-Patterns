package br.implementations.facade;

public class ComputerFacade {

    private Memory memory;
    private HardDisk hd;
    private CPU cpu;
    private OperationalSystem os;

    public ComputerFacade(){
        this.memory = new Memory();
        this.hd = new HardDisk();
        this.cpu = new CPU();
        this.os = new OperationalSystem();
    }

    public void buildPC(){
        System.out.println("Building a new PC:");

        memory.installMemory();
        hd.installHardDisk();
        cpu.installCPU();
        os.installOS();

        System.out.println("The PC was built without any mistakes!");
    }

}
