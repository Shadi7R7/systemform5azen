

public class Task {
    
   private int quantity ; 
   private int taskId ; 
   private Product product ;
   private String statue = "PENDING" ;// حالةالمهمة
   private double progress = 0 ;

    public Task(int quantity, int taskId, Product product) {
        this.quantity = quantity;
        this.taskId = taskId;
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTackId() {
        return taskId;
    }

    public void setTackId(int tackId) {
        this.taskId = tackId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getStatue() {
        return statue;
    }

    public void setStatue(String state) {
        this.statue = state;
    }

    public double getProgress() {
        return progress;
    }

    public void setProgress(double progress) {
        this.progress = progress;
    }


   
   
   
    
}

    

