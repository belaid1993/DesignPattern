package factory;

public class ComputerFactory {
    public static Computer getComputer(String type, String RAM, String CPU, String HDD) {


            if ("PC".equalsIgnoreCase(type)) return new Pc(RAM, HDD, CPU);
            else if ("SERVER".equalsIgnoreCase(type)) return new Server(RAM, HDD, CPU);
            return null;

    }
}
