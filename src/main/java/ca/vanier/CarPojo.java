package ca.vanier;

class CarPojo {
    private String carModel;
    private String carBrand;
    private int carYear;

    public CarPojo(String carModel, String carBrand, int carYear) {
        this.carModel = carModel;
        this.carBrand = carBrand;
        this.carYear = carYear;
    }

    // getters setters
    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;

    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;

    }

    public int getCarYear() {
        return carYear;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;

    }

}