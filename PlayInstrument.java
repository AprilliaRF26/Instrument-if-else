public class PlayInstrument{
    public static void main(String[] args) {

        Instrument a = new Instrument("Guitar", 101.5);
        Instrument b = new Instrument("Piano", 200.0);
        Instrument c = new Instrument("Violin", 150.9);

        a.setType("Guitar");
        a.setPrice(501.5);
        a.print();
        b.print();
        c.print();
        
        if (a.getPrice() > b.getPrice() && a.getPrice() > c.getPrice()) {
            System.out.println("Harga Gitar paling mahal"); 
        } else if (b.getPrice() > a.getPrice() && b.getPrice() > c.getPrice()) {
            System.out.println("Harga Piano paling mahal");
        } else if (c.getPrice() > a.getPrice() && c.getPrice() > b.getPrice()){
            System.out.println("Harga Violin paling mahal");
        }


        if (a.getPrice() < b.getPrice() && a.getPrice() < c.getPrice()) {
            System.out.println("Harga Gitar paling murah"); 
        } else if (b.getPrice() < a.getPrice() && b.getPrice() < c.getPrice()) {
            System.out.println("Harga Piano paling murah");
        } else if (c.getPrice() < a.getPrice() && c.getPrice() < b.getPrice()){
            System.out.println("Harga Violin paling murah");
        }
    
    }
}    
