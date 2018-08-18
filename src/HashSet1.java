import java.util.*;
public class HashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String> hs= new HashSet<String>();
hs.add("Love");
hs.add("hatred");
hs.add("Anu");
hs.add("Anu");
hs.add("Love");
hs.add("hatred");
hs.add("chile");
Iterator<String> itr= hs.iterator();

while(itr.hasNext()) {
	System.out.println(itr.next());
}
	}

}
