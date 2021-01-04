package composite2;

public class File extends Component {

    public File(String name) {
        super(name);
    }


    @Override
    public void view() {

        System.out.println(tabulation()+" File "+name);
    }
}
