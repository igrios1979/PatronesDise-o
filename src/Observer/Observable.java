package Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {

protected List<Observer> observers = new ArrayList<>();

public void addOserver(Observer o){

    observers.add(o);
}


}
