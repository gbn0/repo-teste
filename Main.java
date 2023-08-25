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

    public static boolean hasRepeat(ArrayList<Integer> l) {
        for(int i = 0; i < l.size(); i++) {
            for(int j = i + 1; j < l.size(); j++) {
                if(l.get(i).equals(l.get(j))) {
                    return true;
                }
            }
        }
        return false;
    }
}