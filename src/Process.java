import java.util.ArrayList;
import java.util.Collections;

public class Process {
    private ArrayList<Integer> allocation = new ArrayList<>();
    private ArrayList<Integer> max = new ArrayList<>();
    private ArrayList<Integer> need = new ArrayList<>();
    private String name;
    private boolean finish = false;

    public Process(String name, Integer[] allocation, Integer[] max){
        this.name = name;
        Collections.addAll(this.allocation, allocation);
        Collections.addAll(this.max, max);
        setNeed();
    }

    public void setNeed(){
        this.need = Main.subtract(max, allocation);
    }

    public void setAllocation(ArrayList<Integer> allocation) {
        this.allocation = allocation;
    }

    public void setMax(ArrayList<Integer> max) {
        this.max = max;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public ArrayList<Integer> getAllocation() {
        return allocation;
    }

    public ArrayList<Integer> getMax() {
        return max;
    }

    public ArrayList<Integer> getNeed() {
        return need;
    }

    public boolean isFinish() {
        return finish;
    }

    public String output(){
        return this.name + "    " + this.allocation + "    " + this.max + "    " + this.need + "    " + this.finish + "     ";
    }
}
