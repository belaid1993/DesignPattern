package proxy;


import java.util.Arrays;
import java.util.List;

public class InternetProxy implements InternetServiceProvider {

    List<String> blockedSite = Arrays.asList("google", "facebook", "youtube");

    @Override
    public String serveSite(String url) {
        siteLog(url);
        if (blockedSite.contains(url)) {
            return "this site is blocked........!!";
        }
        return new Inwi().serveSite(url);
    }

    private void siteLog(String url) {
        System.out.printf("[%d] ---> %s request \n", System.currentTimeMillis(), url);
    }
}
