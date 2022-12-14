package Prac_6.task10;

public class Computer {
    private int id;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;
    Computer(Processor processor, Memory memory, Monitor monitor){
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }
    Computer(String processor, String memory, String monitor){
        this.processor = new Processor(processor);
        this.memory = new Memory(memory);
        this.monitor = new Monitor(monitor);
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public String toString() {
        return "Id: " + id + processor.toString() + memory.toString() + monitor.toString();
    }
}
