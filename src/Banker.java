import java.util.ArrayList;
import java.util.Collections;

public class Banker {
    ArrayList<Integer> available = new ArrayList<>();
    ArrayList<Process> processes = new ArrayList<>();
    public Banker(Integer[] available, ArrayList<Process> processes){
        Collections.addAll(this.available, available);
        this.processes = processes;
    }

    public ArrayList<Integer> getAvailable() {
        return available;
    }

    public void setAvailable(ArrayList<Integer> available) {
        this.available = available;
    }

    public ArrayList<Process> getProcesses() {
        return processes;
    }

    public void setProcesses(ArrayList<Process> processes) {
        this.processes = processes;
    }

    public void output(){
        System.out.println("      Allocation    Max          Need        Finish    Available");
        System.out.println("       A  B  C      A  B  C      A  B  C                A  B  C");
        System.out.println(processes.get(0).output() + this.available);
        for(int i = 1 ; i < this.processes.size() ; i ++){
            System.out.println(processes.get(i).output());
        }

        System.out.println();
    }

    public boolean needLessThanAvailable(Process process){
        boolean state = true;
        for(int i = 0 ; i < this.available.size() ; i ++){
            if (process.getNeed().get(i) > this.available.get(i)){
                state = false;
                break;
            }
        }
        return state;
    }

    public boolean finish(){
        boolean state = true;
        for(Process process : this.processes){
            if (!process.isFinish()){
                state = false;
                break;
            }
        }
        return state;
    }

    public void alg(){
        output();
        while (!finish()){
            for(Process process : this.processes){
                if(needLessThanAvailable(process)){
                    // need set zero
                    for(int i = 0 ; i < process.getNeed().size() ; i ++){
                        process.getNeed().set(i, 0);
                    }

                    // add allocation to available
                    for(int i = 0 ; i < process.getAllocation().size() ; i ++){
                        this.available.set(i, this.available.get(i) + process.getAllocation().get(i));
                        process.getAllocation().set(i, 0);
                    }

                    // set state
                    process.setFinish(true);
                    output();
                }
                if(finish())
                    break;

            }

        }
    }


}
