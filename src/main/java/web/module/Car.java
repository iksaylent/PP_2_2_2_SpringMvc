package web.module;

public class Car {
    private String model;
    private String color;
    private int room;

    public Car(String model, String color, int room) {
        this.model = model;
        this.color = color;
        this.room = room;
    }

    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public Integer getRoom() {
        return room;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setRoom(int room) {
        this.room = room;
    }
}