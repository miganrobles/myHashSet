
/**
 * Write a description of class MiHashSet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiHashSet
{
    // instance variables - replace the example below with your own
    private ArrayListInt set; 

    /**
     * Constructor for objects of class MiHashSet
     */
    public MiHashSet()
    {
        set = new ArrayListInt();
    }

    /**
     * Añade el elemento al conjunto si no estaba. Devuelve verdadero en caso de que el elemento no estuviera presente en el conjunto y falso en caso contrario.
     */
    public boolean add(int valor)
    {
        boolean val = set.contains(valor);
        if (!val) {
            set.add(valor);
        }
        return !val;
    }

    /**
     * Vacía el conjunto
     */
    public void clear()
    {
        set.clear();
    }

    /**
     * Devuelve verdadero si el conjunto contiene el elemento, falso en caso contrario.
     */
    public boolean contains(int elemento)
    {
        return set.contains(elemento);
    }

    /**
     * Devuelve verdadero si el conjunto no contiene elementos
     */
    public boolean isEmpty()
    {
        return set.isEmpty();
    }

    /**
     * Elimina del conjunto el elemento dado. Si no existiera devuelve falso; si existía en el conjunto devuelve verdadero
     */
    public boolean remove(int elemento)
    {
        boolean val = contains(elemento);
        if (val) {
            set.remove(set.indexOf(elemento));
        }
        return val;
    }

    /**
     * Devuelve el número de elementos del conjunto
     */
    public int size()
    {
        return set.size();
    }

    /**
     * Devuelve una cadena conteniendo todos los elementos del conjunto separados por comas y entre corchetes.
     */
    public String toString()
    {
        String cadena = "[";
        if (!isEmpty()) {
            cadena += set.get(0);
            for (int i = 1; i < size(); i++) {
                cadena += ", " + set.get(i);
            }
        }
        cadena += "]";
        return cadena;
    }
    
    /**
     * Devuelve verdadero si el parámetro es igual al conjunto sobre el que se invoca y falso en otro caso
     */
    public boolean equals(MiHashSet otroConjunto)
    {
        boolean igual = (otroConjunto.size() == size());
        int index = 0;
        while (igual && index < size()) {
            if (!(otroConjunto.contains(set.get(index)))) {
                igual = false;
            }
            index++;
        }
        return igual;
    }
}