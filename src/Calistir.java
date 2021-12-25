import java.util.ArrayList;
import java.util.List;

public class Calistir {


    public static void main(String[] args) {


        // Generics <>
        //ArrayList<Ogrenci> ogrenciliste = new ArrayList();



        // polymorphism --> subclass'ın objesini, süperclass değişkenine atamak

        List<Ogrenci> ogrenciliste = new ArrayList();



        Ogrenci ogr1 = new Ogrenci(1,"ibrahim","Tatlıses");
        Ogrenci ogr2 = new Ogrenci(2,"Ferdi","Tayfur");
        Ogrenci ogr3 = new Ogrenci(3,"Müslüm","Gürses");
        Ogrenci ogr4 = new Ogrenci(4,"Orhan","Gencebay");


        ogrenciliste.add(ogr1);
        ogrenciliste.add(ogr2);
        ogrenciliste.add(ogr3);
        ogrenciliste.add(ogr4);


        System.out.println(ogrenciliste.size());

        Ogrenci deneme = ogrenciliste.get(1);

        System.out.println(deneme.getAd());

        for (int i = 0; i < ogrenciliste.size(); i++) {

            Ogrenci yeniOgr = ogrenciliste.get(i);
            System.out.println(yeniOgr.getNo()+" "+yeniOgr.getAd()+" "+yeniOgr.getSoyad());
            
        }
        System.out.println("-----------------------------------------------------------");

        // forEach döngüsü
        for (Ogrenci student: ogrenciliste)
        {
            System.out.println(student.getNo()+" "+student.getAd()+" "+student.getSoyad());
        }



    }

}
