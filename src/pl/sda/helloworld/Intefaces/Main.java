package pl.sda.helloworld.Intefaces;

public class Main {


    DS ds;

    public  Main(DS ds) {
        this.ds = ds;
    }

    public static void main(String[] args) {

        Main main = new Main(new FileDataStore());
        main.ds.writeValue("hmm2");
        System.out.println(" ");
        main.ds.readValue();
        System.out.println(" ");
        System.out.println("------------------------------------------");


        FileDataStore fileDataStore = new FileDataStore();
        fileDataStore.writeValue("hmm");
        System.out.println(" ");
        fileDataStore.readValue();
    }
}