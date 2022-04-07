package creative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Collectionuse {

	public static void main(String[] args) {
		Collection<String> listOne = new ArrayList<String>(Arrays.asList("milan","dingo", "elpha", "hafil", "meat", "iga", "neeta.peeta"));
        Collection<String> listTwo = new ArrayList<String>(Arrays.asList("hafil", "iga", "binga", "mike", "dingo"));

        listOne.retainAll( listTwo );
        System.out.println( listOne );
        
        listOne.removeAll(listTwo);
        System.out.println(listOne);

	}

}
