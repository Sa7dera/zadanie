import java.util.Scanner;

class Person{
String imie;
String nazwisko;
int wiek;
String plec;

public Person(String imie, String nazwisko, int wiek, String plec){
    this.imie = imie;
    this.nazwisko = nazwisko;
    this.wiek = wiek;
    this.plec = plec;
}

public void przedstawianie(){
    System.out.println(imie);
}

public void zmianaWieku(){

    Scanner sc = new Scanner(System.in);
    System.out.println("wiek to");
    wiek = sc.nextInt();
    System.out.println("zmiana" + wiek);
    sc.close();
}

    public String getImie() {
        return imie;
    }


    public String getNazwisko() {
    return nazwisko;
    }


    public int getWiek() {
        return wiek;
    }

    public String getPlec() {
    return plec;
    }

}

class Employee extends Person {
    public Employee(String imie, String nazwisko, int wiek, String plec) {
        super(imie, nazwisko, wiek, plec);
        String stanowisko;
        int wynagrodzenie;
        int numerID;
        boolean status;

    }

    public void rozpocznijPrace() {
        System.out.println("praca rozpoczeta");
    }

    public void zakonczPrace() {
        System.out.println("zakonczona praca");
    }

    public void zwiekszenieWynagrodzenia() {
        Scanner sc = new Scanner(System.in);
        System.out.println("zwiekszenie wynagrodzenia z");
        int wynagrodzenie = sc.nextInt();
        System.out.println("zwiekszono na");
        sc.close();
    }
}

    class Manager extends Employee{
        public Manager(String imie, String nazwisko, int wiek, String plec){
            super(imie, nazwisko, wiek, plec);
            int liczbaPodwladnych;
            int dzial;
        }
        public void przydzialZadania(){
            System.out.println("przydzielono zadanie");
        }

        public void zmianaDzialu(){
            System.out.println("zmieniono dzial");
        }

    }


public class Main {
    public static void main(String[] args) {

        Manager krzysiu = new Manager("Krzysiu", "Kozak", 30, "mezczyzna");
        System.out.println(krzysiu.getImie());
        System.out.println(krzysiu.getNazwisko());
        System.out.println(krzysiu.getWiek());
        System.out.println(krzysiu.getPlec());

        krzysiu.przydzialZadania();
        krzysiu.zmianaDzialu();


    }
}