package observer;

public class Main {
    public static void main(String[] args) {
        UpdateServer server = new UpdateServer("v1.1");
        iOS car1 = new CarOS("v1.0");
        iOS car2 = new CarOS("v1.0");
        iOS car3 = new CarOS("v1.1");
        iOS car4 = new CarOS("v1.0");

        server.addObserver(car1);
        server.addObserver(car2);
        server.addObserver(car3);
        server.addObserver(car4);

        server.pushUpdates();
    }
}
