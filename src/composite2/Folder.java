package composite2;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component {

    List<Component> com = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    public void view() {
        System.out.println(tabulation()+ " Folder "+name);
        com.forEach(Component::view);
    }

    public void add(Component c){
        c.level = this.level+1;
        this.com.add(c);
    }
}
