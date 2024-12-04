
package org.example;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Polyclinic {
    private String NameOfPol;
    private String AdressOfPol;
    private String SecName;
    private String Num;
    private String Date;

    public Polyclinic(String NameOfPol, String AdressOfPol, String SecName, String Num, String Date){
        this.NameOfPol = NameOfPol;
        this.AdressOfPol = AdressOfPol;
        this.SecName = SecName;
        this.Num = Num;
        this.Date = Date;
    }

    public String getNameOfPol(){return  NameOfPol;}
    public void  setNameOfPol(String NameOfPol){this.NameOfPol = NameOfPol;}

    public String getAdressOfPol(){return  AdressOfPol;}
    public void  setAdressOfPol(String adressOfPol){this.AdressOfPol = AdressOfPol;}

    public String getSecName(){return  SecName;}
    public void  setSecName(String SecName){this.SecName = SecName;}

    public String getNum(){return  Num;}
    public void  setNum(String Num){this.Num = Num;}

    public String getDate(){return  Date;}
    public void  setDate(String Date){this.Date = Date;}


    public String toString() {
        return String.format("Polyclinic{NameOfPol=%s, AdressOfPol=%s, SecName = %s, Num = %s, Date = %s}", NameOfPol, AdressOfPol, SecName, Num, Date);
    }
}

class PolyclinicGroup {

    private String DoctorSecName;
    private String Post;
    private String Diagnosis;
    private  Polyclinic[] Polyclinic;

    public PolyclinicGroup(){
        this.DoctorSecName = "";
        this.Post = "";
        this.Diagnosis = "";
        this.Polyclinic = new Polyclinic[0];
    }
    public  PolyclinicGroup(String DoctorSecName, String Post, String Diagnosis, Polyclinic[] Polyclinic){
        this.DoctorSecName = DoctorSecName;
        this.Post = Post;
        this.Diagnosis = Diagnosis;
        this.Polyclinic = Polyclinic;
    }

    public String getDoctorSecName(){return  DoctorSecName;}
    public void setDoctorSecName(String DoctorSecName){this.DoctorSecName = DoctorSecName;}

    public String getPost(){return Post;}
    public void setPost(String Post){this.Post = Post;}

    public String getDiagnosis() {return Diagnosis;}
    public void setDiagnosis(String diagnosis) {Diagnosis = diagnosis;}

    public Polyclinic[] getPolyclinic() {return Polyclinic;}

    public void setPolyclinic(Polyclinic[] polyclinic) {Polyclinic = polyclinic;}

    public void addPolyclinic(Polyclinic polyclinic){
        Polyclinic = Arrays.copyOf(Polyclinic, Polyclinic.length+1);
        Polyclinic[Polyclinic.length-1] = polyclinic;
    }
    public void removePolyclinic(String Name){
        Polyclinic = Arrays.stream(Polyclinic).filter(polyclinic -> !polyclinic.getNameOfPol().equals(Name)).toArray(Polyclinic[]::new);
    }
    public String toString(){
        return String.format("Polyclinic{Doctor's second name: %s, Post: %s, Diagnosis: %s, polyclinics: %s}", DoctorSecName, Post, Diagnosis, Arrays.toString(Polyclinic));
    }

}

public class Main {
    public static void main(String[] args){
        PolyclinicGroup Polyclinc = new PolyclinicGroup("Perov", "qwerty", "autism", new Polyclinic[]{
                new Polyclinic("First", "Krd", "Negrov", "123456", "21.21.21"),
                new Polyclinic("Second", "Krd", "52", "111111", "22.22.22"),
                new Polyclinic("Firth", "Krd", "Aboba", "654321", "52.52.52")
        });
        System.out.println(Polyclinc);

        Polyclinc.addPolyclinic(new Polyclinic("52", "Krd", "budehcbweuh", "987654", "12.12.12"));
        System.out.println("Добавлена поликлиника");
        System.out.println(Polyclinc);

        Polyclinc.removePolyclinic("First");
        System.out.println(Polyclinc);
    }

}



