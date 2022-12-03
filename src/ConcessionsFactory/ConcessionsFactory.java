/**@purpose Define what goes into a concessions factory
 * @author Andy Trinh
 * @date 11/23/22
 */
package ConcessionsFactory;

abstract class ConcessionsFactory {
    public abstract Concessions getConcessions(String concessionType);
}
