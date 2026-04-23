import java.util.ArrayList;

public class SmartCamera implements SmartDevice, Cloneable {
    private String location;
    private ArrayList<String> footageLogs;

    public SmartCamera(String location) {
        this.location = location;
        this.footageLogs = new ArrayList<>();
    }

    public void record(String event){
        footageLogs.add(event);
    }

    public void showLogs(){
        System.out.println("Camera at " + location + " logs: " + footageLogs);
    }

    @Override
    public void performAction() {
        System.out.println("Camera at " + location + ": Streaming live video...");
    }
    
    /**
     * Deep copy clone
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        SmartCamera copy = (SmartCamera) super.clone();

        copy.footageLogs = new ArrayList<>(footageLogs);
        
        return copy;
    }
}
