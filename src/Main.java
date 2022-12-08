import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        // process data
        ArrayList<Process> processes = new ArrayList<>();
        processes.add(new Process("P1", new Integer[]{0, 1, 0}, new Integer[]{7, 5, 3}));
        processes.add(new Process("P2", new Integer[]{2, 0, 0}, new Integer[]{3, 2, 2}));
        processes.add(new Process("P3", new Integer[]{3, 0, 2}, new Integer[]{9, 0, 2}));
        processes.add(new Process("P4", new Integer[]{2, 1, 1}, new Integer[]{2, 2, 2}));
        processes.add(new Process("P5", new Integer[]{0, 0, 2}, new Integer[]{4, 3, 3}));

        // banker's algorithm
        Banker banker = new Banker(new Integer[]{3, 3, 2}, processes);
        banker.alg();
    }

    public static ArrayList<Integer> subtract(ArrayList<Integer> a1, ArrayList<Integer> a2){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0 ; i < a1.size(); i ++){
            result.add(a1.get(i) - a2.get(i));
        }
        return result;
    }

    public static ArrayList<Integer> addition(ArrayList<Integer> a1, ArrayList<Integer> a2){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0 ; i < a1.size(); i ++){
            result.add(a1.get(i) + a2.get(i));
        }
        return result;
    }
}