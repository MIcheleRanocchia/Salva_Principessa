import java.util.ArrayList;
public class Cavaliere implements Runnable{
    private String nome;
    private Cavaliere maestro;
    private Thread dragoDaUccidere;
    public Cavaliere(String nome, Thread dragoDaUccidere) {
        this.nome = nome;
        this.dragoDaUccidere = dragoDaUccidere;
    }
    @Override
    public void run() {
        for(int i=0; i<10  && (!dragoDaUccidere.isInterrupted()); i++){
            try {
                Thread.sleep(5);
                System.out.println(nome+ " sta cercando di colpire il drago "+(1+i));
                dragoDaUccidere.interrupt(); //lancio freccia
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
