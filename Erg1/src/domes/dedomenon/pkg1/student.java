
package domes.dedomenon.pkg1;

public class student {
    
    int am;
    String onoma;
    String epitheto;
    double age;
    char filo;
    int apousies;
    double vathmos;

    public student(int am, String onoma, String epitheto, double age, char filo, int apousies, double vathmos) {
        this.am = am;
        this.onoma = onoma;
        this.epitheto = epitheto;
        this.age = age;
        this.filo = filo;
        this.apousies = apousies;
        this.vathmos = vathmos;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public int getAm() {
        return am;
    }

    public void setAm(int am) {
        this.am = am;
    }

    public int getApousies() {
        return apousies;
    }

    public void setApousies(int apousies) {
        this.apousies = apousies;
    }

    public String getEpitheto() {
        return epitheto;
    }

    public void setEpitheto(String epitheto) {
        this.epitheto = epitheto;
    }

    public char getFilo() {
        return filo;
    }

    public void setFilo(char filo) {
        this.filo = filo;
    }

    public String getOnoma() {
        return onoma;
    }

    public void setOnoma(String onoma) {
        this.onoma = onoma;
    }

    public double getVathmos() {
        return vathmos;
    }

    public void setVathmos(double vathmos) {
        this.vathmos = vathmos;
    }

    @Override
    public String toString() {
        return "student{" + "am=" + am + ", onoma=" + onoma + ", epitheto=" + epitheto + ", age=" + age + ", filo=" + filo + ", apousies=" + apousies + ", vathmos=" + vathmos + '}';
    }
    
   
}

