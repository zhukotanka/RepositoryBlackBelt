package Collections.List.ListIterator;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExmpl {
    public static void main(String[] args) {
        String s = "madam";
        List<Character> characterList = new LinkedList <>();
        for (char ch: s.toCharArray()) {
            characterList.add(ch);
        }

        ListIterator<Character> iterator1 = characterList.listIterator();
        ListIterator<Character> iterator2 = characterList.listIterator(characterList.size());
        boolean isPalindrom = true;
        while (iterator1.hasNext() && iterator2.hasPrevious()){

            if(iterator1.next()!=iterator2.previous()){
                isPalindrom = false;
                break;
            }
        }
        if(isPalindrom){
            System.out.println("Palindrom");
        }else {
            System.out.println("Not palindrom");
        }

    }
}
