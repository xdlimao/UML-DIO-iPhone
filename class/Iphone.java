import interfaces.*;

public class Iphone implements IBrowser, IMusicPlayer, ITelephone {
    public String model;
    public String color;
    protected String numberPhone;
    protected int storageCapacity;

    Iphone(String model, String color, String numberPhone, int storageCapacity) {
        this.model = model;
        this.color = color;
        this.numberPhone = numberPhone;
        this.storageCapacity = storageCapacity
    }

    public void openApp(int appId) {
        System.out.println("Abrindo app: " + appId);
    }
    public void closeApp(int appId) {
        System.out.println("Fechando app: " + appId)
    }
}