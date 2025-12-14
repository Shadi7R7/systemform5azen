import java.io.*;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class Stock {
    
    private Map<Integer,Item> items = new HashMap <Integer,Item> ();
    private Map<Integer , Integer > productsStock = new HashMap<Integer , Integer >();
    
    public void addItem(Item item){
    items.put(item.getItemId(), item);
    
    }
    
    public Item getItem(int id){
    
    return items.get(id);
    
    }
    public synchronized void consumeItems(Product p,int qty ) throws Exception {
    
        for (Item item : p.getItem().keySet()){
        
            int need = p.getItem().get(item)*qty ; 
            if(item.getQuantity()< need){
                throw new Exception("No enough stock items for : "+ item.getName());
                }
            }
         for (Item item : p.getItem().keySet()){
             int need= p.getItem().get(item)*qty ;
             item.setQuantity(item.getQuantity()-need);
             
         }
    
    }
    public synchronized void addProduct (Product p , int qty ) {
        productsStock.put(p.getId(),productsStock.getOrDefault(p.getId(),0)+qty);
        
}
    public void logError(String msg){
    
    try(FileWriter fw = new FileWriter("error.txt",true) ){
    
    fw.write(LocalDateTime.now() + "  " + msg + "\n");
    
    
    } catch (Exception e){
        System.out.println(e);
    
    }
    }
    
    public List<Item> searchItemByName(String keyword){
        return items.values().stream().filter(i -> i.getName().toLowerCase().contains(keyword.toLowerCase())).collect(Collectors.toList());
    }
    
}
