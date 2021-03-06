package ejercicio_refactorizacion;

public class CambiaLongitud extends Vector {
        
    
    //metodo que modifica el contenido de la posicion p 
    //de un array con el valor pasado
    public void modificar(int[] vector, int LongitudActual, int posicion) {
        int i;

        //Mostramos los elementos del array
        System.out.print("vector={");
        final int longitud = vector.length;
        for (i = 0; i < longitud; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
        //Modificamos el array
        if (posicion < longitud) {
            //mostramos su contenido
            System.out.println("Elemento a modificar=" + vector[posicion]);
            vector[posicion] = this.getValor();
        }
        //Mostramos los elementos del array
        visualizar(i, longitud, vector);
    }

    //metodo que borra el elemento de la posicion p desplazando a la izquierda todos los elementos
    public void borrar(int[] vector, int LongitudActual, int posicion) {
        int i;

        //mostramos su contenido
        //Mostramos los elementos del array
        System.out.print("vector={");
        final int longitud = vector.length;
        for (i = 0; i < longitud; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");

        //Borramos el elemento
        if (posicion < longitud) {
            System.out.println("Elemento a borrar=" + vector[posicion]);
            for (i = posicion; i < longitud - 1; i++) {
                vector[i] = vector[i + 1];
            }
        }

        //Mostramos los elementos del array
        visualizar(i, longitud, vector);
    }

    //metodo que inserta un elemento en la posicion p desplazando a la derecha todos los elementos
    public void insertar(int[] vector, int LongitudActual, int posicion) {
        int i;

        //mostramos su contenido
        //Mostramos los elementos del array
        System.out.print("vector={");
        final int longitud = vector.length;
        for (i = 0; i < longitud; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");

        //Borramos el elemento
        if (posicion < longitud) {
            System.out.println("Elemento a insertar=" + this.getValor());
            for (i = longitud - 1; i > posicion; i--) {
                vector[i] = vector[i - 1];
            }
            vector[posicion] = this.getValor();
        }

        visualizar(i, longitud, vector);
    }

}
