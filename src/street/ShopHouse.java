package street;

public class ShopHouse extends House {
    private String ShopName;
    public ShopHouse(String adress, int tenantsNumber, String shopName) {
        super(adress, tenantsNumber);
        ShopName = shopName;
    }

    public String getShopName() {
        return ShopName;
    }

    public void setShopName(String shopName) {
        ShopName = shopName;
    }

    @Override
    public void setFieldsBasedOnInput(String input){

    }

    @Override
    public String printObject() {
        return "Adress: " + this.getAdress() + "\n"
                + "TenantsNumber: " + this.getTenantsNumber() + "\n"
                + "ShopName: " + ShopName;
    }
}
