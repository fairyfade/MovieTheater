package ConcessionsFactory;
public class Candy implements Concessions {
    @Override
    public double getPrice(){
        System.out.print("Candy costs $4.00.\n");
        return 4.00;
    }

    @Override
    public void setPrice(double p){
        double price = p;
    }
}
