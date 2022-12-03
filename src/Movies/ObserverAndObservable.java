/**
 * @author fahmidahamid
 * @author Chloe Jones
 * @date Sep 09 2020
 * @version 1.1
 */
package Movies;

import java.util.ArrayList;
import java.util.List;

interface Observer<T> {

    public void handle(PropertyChangedEvent args);
}

class PropertyChangedEvent{

    public Observable subject;
    public String propertyName;
    public Object newValue;


    public PropertyChangedEvent(
            Observable subject, String propertyName, Object newValue) {

        this.subject = subject;
        this.propertyName = propertyName;
        this.newValue = newValue;
    }

}


class Observable<T>{

    private List<Observer> observers;

    public Observable(){
        observers = new ArrayList<Observer>();
    }

    public void subscribe(Observer newObs)
    {
        observers.add(newObs);
    }

    public void unsubscribe(Observer rObs)
    {
        observers.remove(rObs);
    }

    public void notifyAll(String propertyName, Object newValue)
    {
        for(Observer o: observers) {
            o.handle(new PropertyChangedEvent(this, propertyName, newValue));
        }
    }
}
