
public class Product {

    private int cost;
    private String name;

    public Product(int cost, String name) {
        this.cost = cost;
        this.name = name;
    }

    public int GetCost() {
        return cost;
    }

    public String GetName(){
        return name;
    }

    public void SetCost(int cost){
        this.cost = cost;
    }

    public void SetName(String name) {
        this.name = name;
    }
}
