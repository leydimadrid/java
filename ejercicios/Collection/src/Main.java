import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("----SET----");
        //HashSet
        System.out.println("-------HASHSET-------");
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Leydi");
        hashSet.add("Johana");
        hashSet.add("Madrid");
        System.out.println(hashSet + " datos en el HashSet");

        hashSet.remove("Leydi");
        System.out.println(hashSet + " datos en el HashSet después de Remove");
        hashSet.remove("Johana");
        System.out.println(hashSet + " datos en el HashSet después de Remove");


        System.out.println("-------TREESET-------");
        //TreeSet
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Juan");
        treeSet.add("Carlos");
        treeSet.add("Vásquez");
        System.out.println(treeSet + " datos en el TreeSet");
        treeSet.remove("Juan");
        System.out.println(treeSet + " datos en el TreeSet después de Remove");
        treeSet.remove("Carlos");
        System.out.println(treeSet + " datos en el TreeSet después de Remove");

        System.out.println("-------LinkedHashSet-------");
        //TreeSet
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Juan");
        linkedHashSet.add("Carlos");
        linkedHashSet.add("Vásquez");
        System.out.println(linkedHashSet + " datos en el LinkedHashSet");
        linkedHashSet.remove("Juan");
        System.out.println(linkedHashSet + " datos en el LinkedHashSet después de Remove");
        linkedHashSet.remove("Carlos");
        System.out.println(linkedHashSet + " datos en el LinkedHashSet después de Remove");

        System.out.println("----LIST----");
        System.out.println("----ArrayList----");

        List<String> arrayList = new ArrayList<>();
        arrayList.add("Hola");
        arrayList.add("Soy");
        arrayList.add("una");
        arrayList.add("ArrayList");
        arrayList.add(0, "ArrayList");
        System.out.println(arrayList);
        System.out.println("Eliminando el elemento: "+ arrayList.remove(1));
        System.out.println(arrayList);

        System.out.println("----LinkedList----");
        List<Number> linkedList = new LinkedList<>();
        linkedList.add(3);
        linkedList.addFirst(1);
        linkedList.addLast(4);
        linkedList.add(0, 100);
        System.out.println(linkedList);
        linkedList.remove(3);
        System.out.println(linkedList);
        linkedList.removeFirst();
        System.out.println(linkedList);

        System.out.println("----MAP----");
        System.out.println("----HashMap----");

        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Medellín");
        hashMap.put(2, "Pereira");
        hashMap.put(3, "Bogotá");
        System.out.println(hashMap);

        for (Integer i : hashMap.keySet()) {
            System.out.println(i + " - " + hashMap.get(i));
        }

        System.out.println("Eliminando el elemento: " + hashMap.remove(2));

        for (Integer i : hashMap.keySet()) {
            System.out.println(i + " - " + hashMap.get(i));
        }

        System.out.println("----TreeMap----");
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Gato");
        treeMap.put(4, "Perro");
        treeMap.put(10, "Lobo");
        System.out.println(treeMap);
        for (Integer i : treeMap.keySet()) {
            System.out.println(i + "-" + treeMap.get(i));
        }

        System.out.println("Elimando el elemento: " + treeMap.remove(10));
        for (Integer i : treeMap.keySet()) {
            System.out.println(i + "-" + treeMap.get(i));
        }

        System.out.println("----LinkedHashMap----");
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(3, "Samuel");
        linkedHashMap.put(6, "Juan");
        linkedHashMap.put(8, "Brayan");
        System.out.println(linkedHashMap);
        for (Integer i: linkedHashMap.keySet()) {
            System.out.println(i+ "-" + linkedHashMap.get(i));
        }
        System.out.println("Elimando un elemento: " + linkedHashMap.remove(3));
        for (Integer i: linkedHashMap.keySet()) {
            System.out.println(i + "-" + linkedHashMap.get(i));
        }
    }
}