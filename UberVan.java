import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {
    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    private Integer passenger;

    public UberVan(String license, Account driver) {
        super(license, driver);
    }

    public UberVan(String license, Account driver,
            Map<String, Map<String, Integer>> typeCarAccepted,
            ArrayList<String> seatsMaterial) {
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }

    @Override
    public Integer getPassenger() {
        return super.getPassenger();
    }

    @Override
    public void setPassenger(Integer passenger) {
        if (passenger == 6) {
            this.passenger = passenger;
        } else {
            System.out.println("Requiere 6 Pasajeros");
        }
    }

    void printDataCar() {
        if(passenger != null){
            System.out.println("License: " + license + " Driver: " + driver.name + " Passenger: " + passenger);
        }
    }
}
