package factoryAbstract;

public class App {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer(new PCFactory("256","hd","gforce"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("1T","1080","256G"));

        System.out.println(pc);
        System.out.println(server);
    }
}
