import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        // Sukurti klasę Book.
        // Properties: title, pages, releaseYear
        //visi properties turi būti inkapsuliuoti.
        //sukurti 3 objektus su reikšmėmis naudojantis tuščiu konstruktoriu, ir tris naudojantis pilnu konstuktoriu.
        //sudėti juos į knygų masyvą.
        //prasukti ciklą per masyvą ir atspausdinti knygas

        Book b = new Book("pavasaris", 1980, 195);
        Book b2 = new Book("vasara", 1990, 100);
        Book b3 = new Book("ziema", 2000, 195);

        Book b4 = new Book();
        b4.setPages(10);
        b4.setTitle("knyga");
        b4.setReleaseYear(1234);

        Book b5 = new Book();
        b5.setPages(100);
        b5.setTitle("pavadinimas");
        b5.setReleaseYear(2010);

        Book b6 = new Book();
        b6.setPages(100);
        b6.setTitle("kazkoks");
        b6.setReleaseYear(2011);


        ArrayList<Book> library = new ArrayList<>();
        library.add(b);
        library.add(b2);
        library.add(b3);
        library.add(b4);
        library.add(b5);
        library.add(b6);

        for (int i = 0; i < library.size(); i++) {
            System.out.println(library.get(i).getPages() + " " + library.get(i).getTitle() + " " + library.get(i).getReleaseYear());
        }
        Plant p1 = new Plant("kazkoks pavadinimas", "tas pavadinimas lotyniskai", true, "Malta", 123, false);
        Plant p2 = new Plant("kazkoks pavadinimas2", "tas pavadinimas lotyniskai2", true, "Kinija", 12, false);

        Plant p3 = new Plant();
        p3.setTitle("kazkoks pavadinimas3");
        p3.setLatinTitle("tas pavadinimas lotyniskai3");
        p3.setOneYearPlant(false);
        p3.setRegion("Egiptas");
        p3.setHeight(23);
        p3.setEatable(false);


        Plant p4 = new Plant();
        p4.setTitle("kazkoks pavadinimas4");
        p4.setLatinTitle("tas pavadinimas lotyniskai4");
        p4.setOneYearPlant(true);
        p4.setRegion("Rumunija");
        p4.setHeight(899);
        p4.setEatable(true);

        ArrayList<Plant> plants = new ArrayList<>();
        plants.add(p1);
        plants.add(p2);
        plants.add(p3);
        plants.add(p4);




        for (int i = 0; i < plants.size(); i++) {
            System.out.println(plants.get(i).getTitle() + "[" + plants.get(i).getLatinTitle()+ "], kilmes regionas:" + plants.get(i).getRegion()+" ,ilgis mm:" + plants.get(i).getHeight()+ "ar valgomas? "+(plants.get(i).getEatable() ?"taip":"ne") +" ,ar vienmetis? " + (plants.get(i).getOneYearPlant()?"taip ":"ne"));
            //System.out.println(plants.get(i).getEatable() ?"yes":"no");
            //System.out.println(plants.get(i).getOneYearPlant()?"taip ":"ne");
            //System.out.println(plants.get(i).getEatable());
            //System.out.println(plants.get(i).getOneYearPlant());
    }

}}