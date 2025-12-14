import java.util.*;
import java.time.*;

public class FactoryManager {
    private List<productLine> lines = new ArrayList<>();
    
    
    public List<Task> getTaskByState(String state){
        List<Task> result = new ArrayList<>();
        for(productLine line : lines){
            for(Task task : line.getTasks()){
            if(task.getStatue().equals(state)){
                result.add(task);
            }
            }
        }
        return result;
    }
    
    
    public List<Task> getTasksForLine(int lineId){
        return lines.stream().filter(l -> l.getId() == lineId).findFirst().map(productLine::getTasks).orElse(new ArrayList<>());
    }
    
    public Map<Integer, Integer> getProductLine(productLine line){
        Map<Integer, Integer> result = new HashMap<>();
        for(Task task : line.getTasks()){
            if(task.getStatue().equals("COMPLETED")){
                int pid = task.getProduct().getId();
                result.put(pid,result.getOrDefault(pid, 0) + task.getQuantity());
            }
        }
        return result;
    }
    
    public Product getMostRequestedProduct(LocalDate from, LocalDate to){
        Map<Product , Integer> counter = new HashMap<>();
        
        for(productLine line : lines)
        {
            for(Task task : line.getTasks())
            {
                if(!task.getStartDate().isBefore(to)&& !task.getStartDate().isAfter(from))
                {
                    counter.put(task.getProduct(), counter.getOrDefault(task.getProduct(), 0) + task.getQuantity());
                }
                }
        }
        return Collections.max(counter.entrySet(),Map.Entry.comparingByValue()).getKey();
            
    }
    
    public List<Task> sortTasksByProgress(productLine line){
        return line.getTasks().stream().sorted(Comparator.comparing(Task :: getProgress)).toList();
    }
}
