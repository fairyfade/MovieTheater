/**@purpose Create a popcorn concession
 * @author Andy Trinh
 * @date 11/23/22
 */
package ConcessionsFactory;

public class Popcorn implements Concessions {
    @Override
    public double getPrice(){
        System.out.print("Popcorn costs $10.00.\n");
        return 10.00;
    }

    @Override
    public void setPrice(double p){
        double price = p;
    }
}
