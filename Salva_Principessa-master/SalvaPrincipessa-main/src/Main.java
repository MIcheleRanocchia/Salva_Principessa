import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Thread> dragos = new ArrayList<>();
        for (int i = 0; (i < 3); i++) {
            Thread t = new Thread(new D_SputaFuoco(String.valueOf(i)));
            dragos.add(t);
        }
        Thread sangiorgio = new Thread(new Cavaliere("giorgio", dragos.get(1)));
        for (Thread t : dragos) {
            t.start();
        }
        System.out.println("i draghi sono partiti per distruggere i villaggi");
        sangiorgio.start();
        try{
            int a = 0;
            a = 6/0;
            System.out.println("risultato" + a);
        }catch(ArithmeticException x){
            System.out.println(x);
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("averi dovuto stampare risultato il risultato ");
        }
        System.out.println("Giorgio si preapara alla battaglia.");
        try {
            sangiorgio.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("il cavaliere ha atterrato il drago");

    }
}