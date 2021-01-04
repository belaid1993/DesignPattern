package factory;

public class App {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc","8GB","Gforce","hd");
        Computer server = ComputerFactory.getComputer("server","1T","256" , "rak téma");

        System.out.println(pc);
        System.out.println(server);
    }
}
