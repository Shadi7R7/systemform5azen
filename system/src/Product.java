
import java.util.*;

public class Product {
    private int id;
    private String nameProduct;
    private HashMap<Item,Integer> item = new HashMap<Item,Integer>();
    public Product(int id, String nameProduct) {
        this.id = id;
        this.nameProduct = nameProduct;
    }

    public HashMap<Item,Integer> getItem() {
        return item;
    }

    public void setItem(HashMap<Item,Integer> item) {
        this.item = item;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }


}
