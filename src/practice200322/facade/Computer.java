package practice200322.facade;

public class Computer {
    CPU cpu;
    Disk disk;
    Memory memory;

    public Computer(CPU cpu, Disk disk, Memory memory) {
        this.cpu = cpu;
        this.disk = disk;
        this.memory = memory;
    }

    public void startup() {
        cpu.startup();
        disk.startup();
        memory.startup();
    }

    public void shutdown() {
        cpu.shutdown();
        disk.shutdown();
        memory.shutdown();
    }
}
