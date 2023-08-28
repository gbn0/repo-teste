import java.util.ArrayList;

public class Main {

    public static int nOcorrencias(ArrayList<Integer> l, Integer el) {
        int n = 0;
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).equals(el)) {
                n++;
            }
        }
        return n;
    }

    public static ArrayList<Integer> listRepeat(ArrayList<Integer> l) {
        ArrayList<Integer> rep = new ArrayList<Integer>();
        for (int i = 0; i < l.size(); i++) {
            for (int j = i + 1; j < l.size(); j++) {
                if (l.get(i).equals(l.get(j))) {
                    rep.add(l.get(j));
                }
            }
        }
        return rep;
    }

    public static boolean hasRepeat(ArrayList<Integer> l) {
        for (int i = 0; i < l.size(); i++) {
            for (int j = i + 1; j < l.size(); j++) {
                if (l.get(i).equals(l.get(j))) {
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
            if (!aux) {
                l1.add(l2.get(i));
            }
            aux = false;
        }
        return l1;
    }

    public static int nroRepeat(ArrayList<Integer> l) {

        int aux = 0;
        int somaInterna = 0;
        for (int i = 0; i < l.size(); i++) {
            for (int j = 0; j < l.size(); j++) {
                if (l.get(i).equals(l.get(j))) {
                    somaInterna++;
                }
            }
            if (somaInterna > 1) {
                aux++;
            }
            somaInterna = 0;
        }
        return aux;
    }

    public static ArrayList<Integer> intersect(ArrayList<Integer> l1, ArrayList<Integer> l2) {

        ArrayList<Integer> aux = new ArrayList<Integer>();

        for (int i = 0; i < l1.size(); i++) {
            for (int j = 0; j < l2.size(); j++) {
                if (l1.get(i).equals(l2.get(j))) {
                    aux.add(l2.get(j));
                }
            }
        }

        int verificaRepeticao = 0;

        for (int i = 0; i < aux.size(); i++) {
            for (int j = 0; j < aux.size(); j++) {
                if (aux.get(i).equals(aux.get(j))) {
                    verificaRepeticao++;
                }
            }
            if (verificaRepeticao > 1) {
                aux.remove(i);
            }
            verificaRepeticao = 0;
        }

        return aux;
    }
}