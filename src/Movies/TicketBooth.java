package Movies;
public class TicketBooth implements Observer<MovieEvent> {
    private static final TicketBooth instance = new TicketBooth();

    private TicketBooth() {
    }

    public static TicketBooth getTicketBooth() {
        return instance;
    }

    @Override
    public void handle(PropertyChangedEvent args) {
        if (args.propertyName == "soldOut") {
            boolean newRating = ((Boolean) args.newValue).booleanValue();
            if (newRating == true) {
                //we can later agree on how we will handle a sold out movie.
                System.out.println("SOLD OUT! " +args.subject);
            }
        }
    }
}


/***
 * used this code to cast Object to boolean:
 * https://stackoverflow.com/questions/2206598/how-to-cast-object-to-boolean
 */