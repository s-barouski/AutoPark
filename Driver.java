public class Driver extends People{

    private boolean isMale;
    private int birthdateYear;
    private int birthdateMonth;
    private int birthdateDay;
    private int letherFoot;
    private DriverLicense driverLicense;

    public Driver() {

    }

    public Driver(
            String fio, int age, int birthdateDay, int birthdateMonth, int birthdateYear, boolean isMale, String position, int letherFoot, DriverLicense driverLicense) {

        setFio(fio);
        setAge(age);
        this.isMale = isMale;
        setPosition(position);
        this.birthdateDay = birthdateDay;
        this.birthdateMonth = birthdateMonth;
        this.birthdateYear = birthdateYear;
        this.letherFoot = letherFoot;
        this.driverLicense = driverLicense;

    }



    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getBirthdateYear() {
        return birthdateYear;
    }

    public void setBirthdateYear(int birthdateYear) {
        this.birthdateYear = birthdateYear;
    }

    public int getBirthdateMonth() {
        return birthdateMonth;
    }

    public void setBirthdateMonth(int birthdateMonth) {
        this.birthdateMonth = birthdateMonth;
    }

    public int getBirthdateDay() {
        return birthdateDay;
    }

    public void setBirthdateDay(int birthdateDay) {
        this.birthdateDay = birthdateDay;
    }


    public int getLetherFoot() {
        return letherFoot;
    }

    public void setLetherFoot(int letherFoot) {
        this.letherFoot = letherFoot;
    }

    public DriverLicense getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(DriverLicense driverLicense) {
        this.driverLicense = driverLicense;
    }
}
