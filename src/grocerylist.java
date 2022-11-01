import java.util.ArrayList;
public class grocerylist {
    ArrayList<String>orders = new ArrayList<>(10);
    public int i=0;
    public grocerylist(){

    }
    public void add (String x){
        orders.add(x);
        i++;
        }

    double cost=0;
    public double gettotalcost(){
        for(i =0 ; i<10 ;i++){
            cost = cost + orders.indexOf(i) ;
        }
        return cost;
    }
}
