package ejercicio_refactorizacion;

public class NoCambiaLongitud {
        
    private int valor;
    



    public void visualizar(int i, final int longitud, int[] vector) {
        //Mostramos los elementos del array
        System.out.print("vector={");
        for (i = 0; i < longitud; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
    }

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }
}
