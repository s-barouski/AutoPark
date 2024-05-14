public class AutoPark {

  private Car[] garage = new Car[100];

  private Driver[] drivers = new Driver[200];


  public Car getCarByVin(String vin, String stateNumber) {
    for (Car element : garage) {
      if (element != null &&
              (element.getVin() == vin || element.getStateNumber() == stateNumber)
      ) {
        return element;
      }
    }
    return null;
  }

  public void addCar(Car car) {
    for (int i = 0; i < this.garage.length; i++) {
      if (garage[i] == null) {
        garage[i] = car;
        return;
      }
    }
  }

  public void addDriver(Driver driver) {
    for (int i = 0; i < this.drivers.length; i++) {
      if (drivers[i] == null) {
        drivers[i] = driver;
        return;
      }
    }
  }


  public Car[] getGarage() {
    return garage;
  }

  public Driver[] getDrivers() {
    return drivers;
  }

  public Driver getDriverByFio(String fio) { //метод поиска водителя по фио
    for (Driver driver : drivers) {
      if (driver != null &&(driver.getFio() == fio)) {return driver;}
    }
    return null;
  }
  public Driver delDriverByFio(String fio) { //метод удаления водителя по фио
    for (Driver driver : drivers) {
      if (driver != null && (driver.getFio() == null)) {return driver;}
    }
    return null;
  }
  public Car delCarByVin(String vin) {
    for (Car element : garage) {
      if (element != null &&
              (element.getVin() == vin)
      ) {
        return element;
      }
    }
    return null;
  }

}
