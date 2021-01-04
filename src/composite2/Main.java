package composite2;

public class Main {

    public static void main(String[] args) {

        Folder root = new Folder("root");
        Folder f1 = new Folder("f1");
        Folder f2 = new Folder("f2");
        Folder f3 = new Folder("f3");
        File f = new File("file");



        root.add(f1);
        root.add(f2);
        root.add(f3);
        f3.add(f1);
        f3.add(f);



        root.view();



    }
}
