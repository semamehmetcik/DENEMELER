package PROJE;

public class Kisi {

     /*
    Öğretmen: Ad-Soyad, Tc kimlik No, yaş
	Öğrenci: Ad-Soyad, Tc kimlik No, yaş
     */

    private String firstname;
    private String lastname;
    private String tcNo;
    private int yas;

    public Kisi(String TC, String firstname, String lastname, int yas) {

        this.firstname = firstname;
        this.lastname = lastname;
        this.tcNo = TC;
        this.yas = yas;
    }

    public Kisi() {
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}
