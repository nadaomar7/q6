public class Main {
    public static void main(String[] args) {
        grocerylist c = new grocerylist();
        groceryitemorder k = new groceryitemorder("chips",30);
        System.out.println(c.gettotalcost());
        c.add("cookies");
        k.setQuantity(4);
        k.getCost();
    }
}