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

    public static ArrayList<Integer> listRepeat(ArrayList<Integer> l) {
        ArrayList<Integer> rep = new ArrayList<Integer>();
        for(int i = 0; i < l.size(); i++) {
            for(int j = i + 1; j < l.size(); j++) {
                if(l.get(i).equals(l.get(j))) {
                    rep.add(l.get(j));
                }
            }
        }
        return rep;
    }
}