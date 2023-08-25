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

    public static ArrayList<Integer> uniao(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        boolean aux = false;
        for (int i = 0; i < l2.size(); i++) {
            for (int j = 0; i < l1.size(); i++) {
                if (l1.get(j).equals(l2.get(i))) {
                    aux = true;
                }
            }
            if(!aux) {
                l1.add(l2.get(i));
            }
            aux = false;
        }
        return l1;
    }
}