public class TestMonitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Monitor m = new Monitor(12);
        Consumidor c = new Consumidor(m, 6, 4000);

        Productor p = new Productor(m, 6, 300);
        c.start();
        p.start();
    }

}
