package street;

import java.util.*;

public class Street<T extends House> {
    public Street(List<T> houses) {
        Houses = houses;
    }

    public Street() {
        Houses = new ArrayList<>();
    }

    private List<T> Houses;

    public void addHouse(T house) {
        Houses.add(house);
    }

    public void removeHouse(House house) {
        Houses.remove(house);
    }

    public List<T> getHouses() {
        return Houses;
    }

    public void printHouses(){
        for (T house : Houses) {
            System.out.println(house.printObject());
        }
    }

}

