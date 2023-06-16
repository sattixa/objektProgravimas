public class Plant {
    private String title;
    private String latinTitle;
    private boolean isOneYearPlant;
    private String region;
    private int height;
    private boolean isEatable;

    public Plant() {

    }

    public Plant(String title, String latinTitle, boolean isOneYearPlant, String region, int height, boolean isEatable) {
        this.title = title;
        this.latinTitle = latinTitle;
        this.isOneYearPlant=isOneYearPlant;
        this.region=region;
        this.height=height;
        this.isEatable=isEatable;}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLatinTitle() {
        return latinTitle;
    }

    public void setLatinTitle(String latinTitle) {
        this.latinTitle = latinTitle;
    }

    public boolean getOneYearPlant() {
        return isOneYearPlant;
    }

    public void setOneYearPlant(boolean isOneYearPlant) {
        this.isOneYearPlant = isOneYearPlant;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;

    }

    public boolean getEatable() {
        return isEatable;
    }

    public void setEatable(boolean isEatable) {
        this.isEatable = isEatable;
    }

    boolean truee;

    @Override
    public String toString(){
        return  (truee? "true" : "false") ;
    }
    // Sukurti klasę Plant
        //Visi laukai turi būti private, turėti getterius ir setterius.

        //konstruktoriai -
        // 2. tuščias ir su visais fieldais.
        // Klasės laukai:
        // Pavadinimas
        //lotyniskas pavadinimas
        //boolean vienmetis
        //kokiam zemyne auga
        //suaugusio augalo aukstis metrais.
        //ar valgomas?

        //Maine susikuriam masyvą saugoti augalams. sukuriame 4 augalus (2x2 pagal konstruktorius)

        //prasukti ciklą ir atspausdinti augalus



    }
