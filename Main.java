public class Main {

  public static void main(String[] args) {

    AutoPark taxi7788 = new AutoPark();
    System.out.println(taxi7788.getDrivers().length);
    System.out.println(taxi7788.getGarage().length);

    Car mercedes = new Car();
    mercedes.setBrand("MERCEDES");
    mercedes.setColor("BLUE");
    mercedes.setYear(1999);
    taxi7788.addCar(mercedes);
    System.out.println(taxi7788.getGarage()[0].getBrand());

    Car bmw = new Car("auto", "BMW", "12321sdfdf", "2147-gd4",
        "disel", 2020, true, "yellow", 123123.12);
    taxi7788.addCar(bmw);
    System.out.println(taxi7788.getGarage()[1].getBrand());

    Car lada = new Car("auto", "Lada", "654gfsdg46", "4536-gd4",
            "gas", 1999, true, "white", 16563.12);
    taxi7788.addCar(lada);
    System.out.println(taxi7788.getGarage()[2].getBrand());

    Car opel = new Car();
    opel.setBrand("Opel");
    opel.setColor("BLUE");
    opel.setYear(2012);
    taxi7788.addCar(opel);
    System.out.println(taxi7788.getGarage()[3].getBrand());

    Car renault = new Car();
    renault.setBrand("Renault");
    renault.setColor("BLACK");
    renault.setYear(2010);
    taxi7788.addCar(renault);
    System.out.println(taxi7788.getGarage()[4].getBrand());

    Car belgee = new Car("auto", "BelGee", "d656565gfsdg46", "4539-gd4",
            "gas", 2024, true, "silwer", 30.00);
    taxi7788.addCar(belgee);
    System.out.println(taxi7788.getGarage()[5].getBrand());

    Car belgee2 = new Car("auto", "BelGee", "d6989895gfsdg46", "4009-gd4",
            "gas", 2024, true, "silwer", 29.00);
    taxi7788.addCar(belgee2);
    System.out.println(taxi7788.getGarage()[6].getBrand());

    Car mtz = new Car("tractor", "MTZ", "d6989959595gfsdg46", "3265-gd4",
            "diesel", 1993, true, "blu", 1562300.00);
    taxi7788.addCar(mtz);
    System.out.println(taxi7788.getGarage()[7].getBrand());

    Car zaz = new Car("auto", "ZAZ", "d699899595gfsdg46", "3266-gd4",
            "gas", 1980, true, "yellow", 230000.00);
    taxi7788.addCar(zaz);
    System.out.println(taxi7788.getGarage()[8].getBrand());

    Car peugeot = new Car("auto", "Peugeot", "d699899595gf848g46", "9594-MB4",
            "diesel", 2001, true, "green", 720000.10);
    taxi7788.addCar(peugeot);
    System.out.println(taxi7788.getGarage()[9].getBrand());


    AutoPark driversRoom = new AutoPark();
    System.out.println(driversRoom.getDrivers().length);

    Driver bob = new Driver();
    bob.setDriverLicense(DriverLicense.CATEGORY_B);
    bob.setFio("Bob");
    bob.setLetherFoot(23);
    bob.setAge(40);
    bob.setBirthdateDay(20);
    bob.setBirthdateMonth(12);
    bob.setBirthdateYear(1984);
    bob.setMale(true);
    bob.setPosition("Master");
    driversRoom.addDriver(bob);
    System.out.println(driversRoom.getDrivers()[0].getFio()+", "+bob.getAge()+", "+bob.getPosition()+", "+bob.getDriverLicense());

    Driver john = new Driver("John", 20, 23, 5,
            2004, true, "Intern", 40,DriverLicense.CATEGORY_B);
    driversRoom.addDriver(john);
    System.out.println(driversRoom.getDrivers()[1].getFio()+", "+john.getAge()+", "+john.getPosition());

    Driver harry = new Driver("Harry", 30, 10, 6,
            1994, true, "Master", 36, DriverLicense.CATEGORY_A);
    driversRoom.addDriver(harry);
    System.out.println(driversRoom.getDrivers()[2].getFio()+", "+harry.getAge()+", "+harry.getPosition());

    Driver marry = new Driver("Marry", 20, 1, 5,
            2004, false, "Intern", 40, DriverLicense.CATEGORY_D);
    driversRoom.addDriver(marry);
    System.out.println(driversRoom.getDrivers()[3].getFio()+", "+marry.getAge()+", "+marry.getPosition());

    Driver bill = new Driver("Bill", 45, 6, 10,
            1979, true, "Professional", 36, DriverLicense.CATEGORY_C);
    driversRoom.addDriver(bill);
    System.out.println(driversRoom.getDrivers()[4].getFio()+", "+bill.getAge()+", "+bill.getPosition());

    Driver ostin = new Driver("Ostin", 45, 15, 8,
            1979, true, "Professional", 36, DriverLicense.CATEGORY_D);
    driversRoom.addDriver(ostin);
    System.out.println(driversRoom.getDrivers()[5].getFio()+", "+ostin.getAge()+", "+ostin.getPosition());

    Driver katrin = new Driver("Katrin", 30, 8, 2,
            1994, false, "Master", 42, DriverLicense.CATEGORY_A);
    driversRoom.addDriver(katrin);
    System.out.println(driversRoom.getDrivers()[6].getFio()+", "+driversRoom.getDrivers()[6].getAge()+", "+driversRoom.getDrivers()[6].getPosition());

    Driver alex = new Driver("Alex", 35, 9, 4,
            1999, true, "Master", 38, DriverLicense.CATEGORY_D);
    driversRoom.addDriver(alex);
    System.out.println(driversRoom.getDrivers()[7].getFio()+", "+driversRoom.getDrivers()[7].getAge()+", "+driversRoom.getDrivers()[7].getPosition());

    Driver mila = new Driver("Mila", 31, 4, 9,
            1993, false, "Intern", 41, DriverLicense.CATEGORY_C);
    driversRoom.addDriver(mila);
    System.out.println(driversRoom.getDrivers()[8].getFio()+", "+driversRoom.getDrivers()[8].getAge()+", "+driversRoom.getDrivers()[8].getPosition());

    Driver mike = new Driver("Mike", 21, 10, 10,
            2003, true, "Intern", 40,DriverLicense.CATEGORY_C);
    driversRoom.addDriver(mike);
    System.out.println(driversRoom.getDrivers()[9].getFio()+", "+driversRoom.getDrivers()[9].getAge()+", "+driversRoom.getDrivers()[9].getPosition());

    Driver sam = new Driver("Sam", 33, 25, 06,
            1997, true, "Master", 36, DriverLicense.CATEGORY_B);
    driversRoom.addDriver(sam);
    System.out.println(driversRoom.getDrivers()[10].getFio()+", "+driversRoom.getDrivers()[10].getAge()+", "+driversRoom.getDrivers()[10].getPosition());

    Driver john2 = new Driver("John", 25, 30, 3,
            1999, true, "Intern", 36, DriverLicense.CATEGORY_D);
    driversRoom.addDriver(john2);
    System.out.println(driversRoom.getDrivers()[11].getFio()+", "+driversRoom.getDrivers()[11].getAge()+", "+driversRoom.getDrivers()[11].getPosition());

    Driver harry2 = new Driver("Harry", 50, 9, 1,
            1974, true, "Professional", 35, DriverLicense.CATEGORY_A);
    driversRoom.addDriver(harry2);
    System.out.println(driversRoom.getDrivers()[12].getFio()+", "+driversRoom.getDrivers()[12].getAge()+", "+driversRoom.getDrivers()[12].getPosition());

    Driver marry2 = new Driver("Marry", 20, 5, 12,
            2004, false, "Intern", 35, DriverLicense.CATEGORY_C);
    driversRoom.addDriver(marry2);
    System.out.println(driversRoom.getDrivers()[13].getFio()+", "+driversRoom.getDrivers()[13].getAge()+", "+driversRoom.getDrivers()[13].getPosition());

    Driver bill2 = new Driver("Bill", 55, 9, 5,
            1969, true, "Professional", 41, DriverLicense.CATEGORY_F);
    driversRoom.addDriver(bill2);
    System.out.println(driversRoom.getDrivers()[14].getFio()+", "+driversRoom.getDrivers()[14].getAge()+", "+driversRoom.getDrivers()[14].getPosition());

  Manager manager = new Manager("Bobbi Gray", 32, "Supervisor");
  manager.Manag();

  Bookkeeper bookkeeper = new Bookkeeper("Hanna Lebowski", 25, "junior bookkeeher");
  bookkeeper.Bookkeep();

    


  }
}
