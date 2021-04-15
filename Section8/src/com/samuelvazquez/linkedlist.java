package com.samuelvazquez;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit,"Mexico");
        addInOrder(placesToVisit,"Japan");
        addInOrder(placesToVisit,"Canada");
        addInOrder(placesToVisit,"Thailand");
        addInOrder(placesToVisit,"Colombia");
        addInOrder(placesToVisit,"France");
        addInOrder(placesToVisit,"Switzerland");
        addInOrder(placesToVisit,"Russia");
        printList(placesToVisit);
        addInOrder(placesToVisit,"Japan");
        printList(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()) {
            System.out.println("Now visiting: " + i.next());
        }
        System.out.println("===================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCountry) {
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while(stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCountry);
            if(comparison == 0) {
                //equal, do not add
                System.out.println(newCountry + " is already included as a destination");
                //it wasn't successfully added
                return false;
            } else if(comparison > 0) {
                //new country should appear before this one
                // Bbbbb -> Aaaaa
                stringListIterator.previous();
                stringListIterator.add(newCountry);
                //record added successfully
                return true;
            } else if(comparison < 0) {
                //move on next city
            }
        }
        stringListIterator.add(newCountry);
        return true;
    }
}
