public class groceryitemorder {
public String name ;
public double quantity=4 ;
public double priceperunit;
public groceryitemorder(String name, double pricePerUnit) {
    this.name = name;
    this.priceperunit = priceperunit;
    this.quantity = quantity;
}
public double getCost(){
 return quantity*priceperunit;
}
public void setQuantity(int quantity){
    this.quantity=quantity;
}
}

