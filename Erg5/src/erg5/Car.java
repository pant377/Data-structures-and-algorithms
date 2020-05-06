
package erg5;

public class Car {
    
    private String AK;

    public String getAK() {
        return AK;
    }

    public void setAK(String AK) {
        this.AK = AK;
    }

    public Car(String AK) {
        this.AK = AK;
    }

    @Override
    public String toString() {
        return " Autokinito me " + "AK = " + AK ;
    }
    
    
}
