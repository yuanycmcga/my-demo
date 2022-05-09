package base.beans;

/**
 * @author chenyuanyuan
 * @company Sunline
 * @description Car
 * @create 2020/09/27 16:52
 */
public class Car {

    private String name;
    private String brand;
    private String type;

    public Car() {

    }
    public Car(String name, String brand, String type) {
        this.name = name;
        this.brand = brand;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
