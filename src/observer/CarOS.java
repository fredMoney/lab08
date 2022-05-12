package observer;

public class CarOS implements iOS {
    String lastUpdate;

    public CarOS(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public void update(String updateInfo) {
        if(!lastUpdate.equals(updateInfo)) {
            lastUpdate = updateInfo;
            System.out.println("Actualizat cu succes la versiunea: " + lastUpdate + ".");
        }
    }

    void printLastUpdate() {
        System.out.println(lastUpdate);
    }
}
