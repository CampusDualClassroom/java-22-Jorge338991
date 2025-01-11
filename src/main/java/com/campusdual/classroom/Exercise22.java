package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Exercise22 {

    public static List<String> createArrayList() {
        List<String> lista = new ArrayList();
        String coleccion[] = {
                "GKFFD",
                "TNANA",
                "MPMSL",
                "PSWME",
                "LZMLF",
                "JYEBV",
                "YELNT",
                "JSNKR",
                "JFESF",
                "TMJLL"
        };

        for (String elemento : coleccion) {
            lista.add(elemento);
        }
        return lista;
    }

    public static void printElementsAndIndex(List<String> customList) {
        for (String elemento : customList) {
            System.out.println(elemento + " " + customList.indexOf(elemento));
        }
    }

    public static boolean addElementToList(List<String> customList, String element) {
        return customList.add(element);
    }

    public static void main(String[] args) {
        List<String> myArrayList = createArrayList();
        addElementToList(myArrayList, "AAAAA");
        printElementsAndIndex(myArrayList);
    }
}
