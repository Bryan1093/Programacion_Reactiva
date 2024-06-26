package Models;

public class HiloUsuario implements Runnable{
    int identificacion;
    public HiloUsuario(int id) {
        this.identificacion = id;
    }


    @Override
    public void run() {
        while (true) {
            System.out.println("Hila de Usuario : " + identificacion);
        }
    }

    public int getIdentificacion() {
        return identificacion;
    }
}
