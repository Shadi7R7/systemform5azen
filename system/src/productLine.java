import java.util.ArrayList;
import java.util.List;

public class productLine extends Thread {
    private int productLineId;
    private String name;
    private String status = "Active";
    private List<Task> tasks = new ArrayList<Task>();
    private Stock stock ;

    public productLine(int productLineId, String name, Stock stock) {
        this.productLineId = productLineId;
        this.name = name;
        this.stock = stock;
    }
    public void addTask (Task task){
        tasks.add(task);
    }
    
    
    public int getProductLineId() {
        return productLineId;
    }

    public void setProductLineId(int productLineId) {
        this.productLineId = productLineId;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
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
    
    public void run () {
    
    while (true){
    
    if(!status.equals("Active")){
    
    try {
    
    Thread.sleep(1000);
    }catch(InterruptedException e){
        break;
    }
    continue ;
    
    }
   for(Task task : tasks){
       if(task.getStatue().equals("PENDING")){
       executeTask(task);
       
       }
       
   }
   try {
       Thread.sleep(500);
   }
    catch (InterruptedException e){
    
    break ;
    }
   
    }
     
    
    }
    public void executeTask (Task task ){
        task.setStatue("RUNNING");
        try {
        
        stock.consumeItems(task.getProduct(), task.getQuantity());
        for(int i=0;i<=100;i+=20){
            task.setProgress(i);
            Thread.sleep(400);
        }
        stock.addProduct(task.getProduct(), task.getQuantity());
        task.setStatue("COMPLETED");
        }catch(Exception e){
            stock.logError(e.getMessage());
            task.setStatue("CANCELLD"); 
        }

    
}
}
