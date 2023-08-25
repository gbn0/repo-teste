import java.util.ArrayList;

public class Main {

    public static int nOcorrencias(ArrayList<Integer> l, Integer el) {
        int n = 0;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i).equals(el)) {
                n++;
            }
        }
        return n;
    }
}