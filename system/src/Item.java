
public class Item {
   private String name;
   private int itemId ; 
   private String category ;
   private double price ;
   private int quantity ;        
   private int minQuantity ;

    public Item(String name, int itemId, String category, double price, int quantity, int minQuantity) {
        this.name = name;
        this.itemId = itemId;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
        this.minQuantity = minQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }
 
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getMinQuantity() {
        return minQuantity;
    }

    public void setMinQuantity(int minQuantity) {
        this.minQuantity = minQuantity;
    }


   
}
