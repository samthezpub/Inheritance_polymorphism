package street;

public class Main {
    public static void main(String[] args) {
        Street street = new Street();
        House house = new House("9 May, 30", 200);
        School school = new School("Kiyvskaya St, 30", 10, AccreditationLevelEnum.ОБЩЕОБРАЗОВАТЕЛЬНАЯ);
        ShopHouse shopHouse = new ShopHouse("Kiyvskaya St, 20", 5, "ATB");

        street.addHouse(house);
        street.addHouse(school);
        street.addHouse(shopHouse);

        street.printHouses();
    }
}