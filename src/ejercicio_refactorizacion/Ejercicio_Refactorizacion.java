package ejercicio_refactorizacion;

public class Ejercicio_Refactorizacion {

    public static void main(String[] args) {

        // TODO code application logic here
        int[] vector = new int[5];
        vector[0] = 2;
        vector[1] = 4;
        vector[2] = 6;
        CambiaLongitud p = new CambiaLongitud();
        p.setValor(10);
        p.modificar(vector, 0, 1);
        p.borrar(vector, 0, 1);
        p.insertar(vector, 0, 1);
    }
}