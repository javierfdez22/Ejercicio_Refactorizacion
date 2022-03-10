package ejercicio_refactorizacion;

public class Ejercicio_Refactorizacion {

    public static void main(String[] args) {
// TODO code application logic here
        int[] v = new int[5];
        v[0] = 2;
        v[1] = 4;
        v[2] = 6;
        Prueba p = new Prueba();
        p.va = 10;
        p.mo(v);
        p.bo(v);
        p.in(v);
    }
}