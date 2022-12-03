package ConcessionsFactory;

public class SimpleConcessionsFactory extends ConcessionsFactory {
    public Concessions getConcessions(String concessionType){
        if(concessionType == null){
           return null;
        }		
        else if(concessionType.equalsIgnoreCase("POPCORN")){
           return new Popcorn();
           
        } else if(concessionType.equalsIgnoreCase("SODA")){
           return new Soda();
           
        }else if(concessionType.equalsIgnoreCase("CANDY")){
               return new Candy();      
           }
        else{
            return null;
         }
    }
}
