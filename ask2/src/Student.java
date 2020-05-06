public class Student
{
    private int am ;
    private String onoma ;
    private String epitheto ;
    private double ilikia ;
    private char filo ;
    private int apousies ;
    private double bathmos ;

    public Student(int am, String onoma, String epitheto, double ilikia, char filo, int apousies, double bathmos)
    {
        this.am = am;
        this.onoma = onoma;
        this.epitheto = epitheto;
        this.ilikia = ilikia;
        this.filo = filo;
        this.apousies = apousies;
        this.bathmos = bathmos;
    }
    @Override
    public String toString()
    {
        return "Mathitis : " + " am = " + am + ", onoma = " + onoma + ", epitheto = " + epitheto + " , ilikia= " + ilikia + " , filo = " + filo + ", apousies = " + apousies + ", bathmos = " + bathmos ;
    }
    public int getAm()
    {
        return am ;
    }
    public double getBathmos()
    {
        return this.bathmos ;
    }
}

