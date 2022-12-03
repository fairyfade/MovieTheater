/**@purpose Demonstrate what a concessions factory can do 
 * @author Andy Trinh
 * @date 11/23/22
 */
package ConcessionsFactory;

public class DemoConcessionsFactory {
    public static void main(String[] args) {
        ConcessionsFactory concessionFactory = new SimpleConcessionsFactory();

        Concessions pop1 = concessionFactory.getConcessions("POPCORN");
        pop1.getPrice();

        Concessions sod1 = concessionFactory.getConcessions("SODA");
        sod1.getPrice();

        Concessions cand1 = concessionFactory.getConcessions("CANDY");
        cand1.getPrice();
    }
}
