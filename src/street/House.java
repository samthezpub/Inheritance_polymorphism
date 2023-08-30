package street;

import java.lang.reflect.Field;

public class House implements IHouse {

    public House(String adress, int tenantsNumber) {
        Adress = adress;
        TenantsNumber = tenantsNumber;
    }

    private String Adress;
    private int TenantsNumber;

    @Override
    public void setFieldsBasedOnInput(String input) {
        String[] values = input.split(",");

        Field[] fields = this.getClass().getDeclaredFields();
        try {
            for (int i = 0; i < fields.length; i++) {
                Field field = fields[i];
                field.setAccessible(true);

                if (field.getType() == String.class) {
                    field.set(this, values[i]);
                } else if (field.getType() == int.class) {
                    field.set(this, Integer.parseInt(values[i]));
                } else if (field.getType() == boolean.class) {
                    field.set(this, Boolean.parseBoolean(values[i]));
                }
            }
        } catch (IllegalAccessException e) {
            // Обработка исключения, например, вывод сообщения об ошибке или выполнение альтернативных действий
        }
    }

    @Override
    public String printObject() {
        return "Adress: " + this.Adress + "\n"
                + "TenantsNumber: " + this.TenantsNumber +
                "\n";
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }

    public int getTenantsNumber() {
        return TenantsNumber;
    }

    public void setTenantsNumber(int tenantsNumber) {
        TenantsNumber = tenantsNumber;
    }
}
