//Driver Class
public class PlayInstrumentTester {
    public static void main(String[] args) {
        Instrument a =  new Instrument("Guitar", 101.5);
        Instrument b = new Instrument("Piano", 200.0);
        Instrument c = new Instrument("Violin", 150.9);

        a.setType("Guitar");
        a.setPrice(101.5);
        b.setType("Piano");
        b.setPrice(200.0);
        c.setType("Violin");
        c.setPrice(150.9);
        a.print();
        b.print();
        c.print();
    }
}
