package exams;

import java.lang.reflect.Array;
import java.util.*;

public class DeptoAlumnos {
    /**
     * Tenemos que ayudar a los docentes a preparar información solicitada por el Departamento de Alumnos.. Actualmente se registra
     * para cada alumno los días en los que concurrió a clase, pero ahora desde Alumnos se les pide que envíen la información de cada
     * fecha, ordenada por nombre de alumnos (donde el orden de las fechas no tiene importancia). Por ejemplo, si la lista que se recibe
     * es [("Ana", [ "Mie 10", "Vie 12"]), ("Luz", [ "Vie 12", "Mie 17"] ), ("Pedro", ["Mie 10", "Mie 17"])]. el resultado debe ser [(“Mie 10”,
     * [“Ana", "Pedro"]), (“Vie 12”, [“Ana", "Luz”]), (“Mie 17”, [“Luz”, "Pedro"])].
     * Escribir un método para resolver el ejercicio donde se utilicen las estructuras estudiadas en clase (Pila, Cola, Lista, Conjunto
     * (HashSet o TreeSet) y/o Diccionario (HashMap o TreeMap)). Justificar la elección usando argumentos de eficiencia.
     *
     * @param alumnos
     */
    public TreeMap<String, HashSet<String>> getPresence(HashMap<String, ArrayList<String>> alumnos) {
        TreeMap<String, ArrayList<String>> dias = new TreeMap<>();
        for (ArrayList<String> arr : alumnos.values()) {
            Iterator<String> iterator = alumnos.keySet().iterator();
            for (int i = 0; i < arr.size(); i++) {
                ArrayList<String> alumns = new ArrayList<>();
                while (iterator.hasNext())
                    alumns.add(iterator.next());
                dias.put(arr.get(i), alumns);
            }
        }
        System.out.println(dias);
        return null;
    }


    public static void main(String[] args) {
        DeptoAlumnos a = new DeptoAlumnos();
        HashMap<String, ArrayList<String>> list = new HashMap<>();
        ArrayList<String> dias = new ArrayList<>();
        dias.add("Mie 10");
        dias.add("Jue 11");
        list.put("Ana", dias);
        a.getPresence(list);
    }
}
