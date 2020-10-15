package web.models;

import org.springframework.stereotype.Component;

@Component
public class Car {

    private int id;
    private String models;
    private String serial;

    public Car() {
    }

    public Car(int id, String models, String serial) {
        this.id = id;
        this.models = models;
        this.serial = serial;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModels() {
        return models;
    }

    public void setModels(String models) {
        this.models = models;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", models='" + models + '\'' +
                ", serial='" + serial + '\'' +
                '}';
    }
}
