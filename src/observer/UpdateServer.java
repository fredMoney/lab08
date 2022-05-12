package observer;

import java.util.ArrayList;
import java.util.List;

public class UpdateServer {
    String updatePackage;
    List<iOS> listObservers;

    public UpdateServer(String updatePackage) {
        this.updatePackage = updatePackage;
        listObservers = new ArrayList<>();
    }

    void addObserver(iOS observer) {
        listObservers.add(observer);
    }

    void delObserver(iOS observer) {
        listObservers.remove(observer);
    }

    void pushUpdates() {
        for (iOS observer : listObservers) {
            observer.update(updatePackage);
        }
    }
}
