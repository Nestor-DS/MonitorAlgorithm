public class Consumidor extends Thread {

    private Monitor buff;
    private int n;
    private int sleep;

    /*
        El productor produce caracteres consecutivos contando a partir del carácter 'A'. La cantidad 
        de caracteres que va a producir dependerá del parámetro n que recibe en el constructor. Luego de 
        meter en cada carácter en el buffer duerme una cantidad de milisegundos, valor que también recibe
        como parámetro en el constructor    
     */
    public Consumidor(Monitor b, int n, int s) {
        //el monitor
        this.buff = b;
        //cuantos caracteres debe producir
        this.n = n;
        //cuanto tiempo dormir entre carácter y carácter
        this.sleep = s;

    }

    public void run() {
        try {
            char c;
            
            for (int i = 0; i < n; i++) {
                c = buff.sacar();
                System.out.println("Consume: " + c);
                sleep((int) (Math.random() * sleep));
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);

        }
    }

}
