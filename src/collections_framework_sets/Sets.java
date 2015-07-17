package collections_framework_sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

    public static void main(String[] args) {

        //A Set (an interface) is a kind of collection that stores unique elements only.

        //Used less often than lists or maps, sets are nevertheless great for creating collections of things that are
        //unique --- in other words, for removing duplicates. It's also very quick to check whether a value exists in
        //a set, whereas checking for something in a list can take a long time in computer terms.

        //As with maps and lists, there are several types of Sets you can use. In this tutorial, we will look at:
        //Hashsets, LinkedHashSets and TreeSets.

        ////////// Hashset - This does not retain order /////////

        //First things first, let's create a HashSet object:

        Set<String> set1 = new HashSet<String>();

        set1.add("Cat");
        set1.add("Dog");
        set1.add("Mouse");
        set1.add("Rabbit");
        set1.add("Peacock");

        System.out.println("Before adding a duplicate Mouse element " + set1);

        //When I print out the above, as with HashMaps, the elements are printed in any order. Can be random.

        //Note that the Set classes (i.e. ones that implement from 'Set') inherit the toString method from
        //AbstractCollection. The Set elements are output as a string list separated by commas.

        //So at the top of this class, we mentioned that a Set stores unique elements only.
        //So let's see what happens when I try to add a duplicate e.g. "Mouse" to set1

        set1.add("Mouse");

        System.out.println("After adding a duplicate Mouse element " + set1);

        //You'll notice in the printout to the console that the duplicate "Mouse" value is not added to set1.

        //So unlike a List, Sets only contain unique items.

        //One good use of Sets - sorting out the duplicates from a list of elements!

        //So now let's look at another type of Set...

        ////////// LinkedHashSet - Remembers the order in which you entered items/elements /////////

        Set<String> set2 = new LinkedHashSet<String>();

        set2.add("Football");
        set2.add("Tennis");
        set2.add("Cricket");
        set2.add("Rugby");
        set2.add("Golf");

        set2.add("Football");

        System.out.println("LinkedHashSets print out the items in the same order in which they were entered : " + set2);

        //And again, the duplicate Football entry is ignored.

        //And the final type of Set we'll look at is TreeSet.

        ////////// TreeSet - Sorts your elements into their natural order /////////

        Set<String> set3 = new TreeSet<String>();

        set3.add("Italy");
        set3.add("Austria");
        set3.add("Spain");
        set3.add("Greece");
        set3.add("Germany");

        System.out.println("TreeSets sort the elements into their 'natural order' : " + set3);


        //////// Common Operations with Sets ////////

        //1) Iteration through a Set

        for(String element : set1) {
            System.out.println(element);
        }

        //2) Often you want to know whether a Set contains a particular item.
        //Unlike with a List where you have to search through all the items in the list, sets are optimised to find
        //particular elements quickly

        if(set3.contains("Belgium")) {
            System.out.println("Belgium present");
        }
        if(set3.contains("Italy")) {
            System.out.println("Contains Italy");
        }

        //3) You can also check whether a Set is empty:

        Set<String> set4 = new TreeSet<String>();

        if(set4.isEmpty()) {
            System.out.println("Set 4 is empty at start");
        }

        set4.add("Potato");
        set4.add("Carrot");

        if(set4.isEmpty()) {
            System.out.println("Set 4 is still empty after adding items");
        }

        //There are some other really useful methods from Set. Have a look at the interface for more info (and use the
        //Java API documentation online)

        /////// But some key ones to have a look at in this tutorial ////////



        ////// Intersection ////////



        //I'll start by creating 2 new sets + adding some elements to them

        Set<String> newSet = new TreeSet<String>();
        Set<String> newSet2 = new TreeSet<String>();

        newSet.add("Richard");
        newSet.add("James");
        newSet.add("Scott");
        newSet.add("Amit");
        newSet.add("David");

        //For newSet2, I'm going to add a couple of elements that are in newSet and some that are unique to newSet2:

        newSet2.add("Richard");
        newSet2.add("James");
        newSet2.add("Bernard");
        newSet2.add("Travis");
        newSet2.add("Marc");

        //If I want to find out which elements are common to both sets, the first step is to create a copy of one of
        //my sets (so that I don't mess up the original!)

        //To do this, I create a new Set (as below) and then pass the 'newSet' reference variable into HashSet's
        //constructor

        Set<String> intersectionSet = new HashSet<String>(newSet);

        //The above is really good to know!!!! Perhaps read up more on this :-)


        //UP to 3 mins 30 seconds remaining - started typing the below anyway




        //The below prints out my copy of newSet:
        System.out.println(intersectionSet);

        intersectionSet.retainAll(newSet2);

        System.out.println(intersectionSet);







    }

}
