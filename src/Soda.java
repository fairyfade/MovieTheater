public class Soda implements Concessions {
    @Override
    public double getPrice(){
        System.out.print("Soda costs $5.00.\n");
        return 5.00;
    }

    @Override
    public void setPrice(double p){
       double price = p;
    }
}
