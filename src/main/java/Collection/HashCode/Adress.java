package Collection.HashCode;

import java.util.Objects;

public class Adress {

    private final String StreetName;
    private final int StreetNumber;



    public Adress(String streetName, int streetNumber) {
        StreetName = streetName;
        StreetNumber = streetNumber;
    }


    public String getStreetName() {
        return StreetName;
    }

    public int getStreetNumber() {
        return StreetNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Adress adress)) return false;
        return StreetNumber == adress.StreetNumber && Objects.equals(StreetName, adress.StreetName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(StreetName, StreetNumber);
    }
}
