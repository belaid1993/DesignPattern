package proxy;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> s = Arrays.asList("twitter","google", "facebook", "youtube");

        InternetServiceProvider i = new InternetProxy();

        for (String site : s){
            System.out.println(i.serveSite(site));
        }

    }
}
