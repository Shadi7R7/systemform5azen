
import java.util.ArrayList;
import java.util.List;

public class productLine {
    private int productLineId;
    private String name;
    private String status = "Active";
    private List<Task> tasks = new ArrayList<Task>();

    public productLine(int productLineId, String name) {
        this.productLineId = productLineId;
        this.name = name;
    }

    public int getProductLineId() {
        return productLineId;
    }

    public void setProductLineId(int productLineId) {
        this.productLineId = productLineId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
    
    
}
