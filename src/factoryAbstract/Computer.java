package factoryAbstract;

public abstract class Computer {

    public abstract String getCPU();
    public abstract String getHDD();
    public abstract String getRAM();


    @Override
    public String toString() {
        return "Computer{RAM :"+this.getRAM()+" HDD :"+this.getHDD()+" CPU :"+this.getCPU()+"}";
    }
}
