public enum DriverLicense {

    CATEGORY_A("motorcycles"),
    CATEGORY_B("cars and trucks"),
    CATEGORY_C ("trucks weighing"),
    CATEGORY_D ("buses"),
    CATEGORY_F ("trams");

    private String description;

    DriverLicense(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
}
