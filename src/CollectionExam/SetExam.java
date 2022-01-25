package CollectionExam;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExam {

	public static void main(String[] args) {
		/* Set
		   : 중복 x
		   - 중복 x , 순서 x : HashSet
		   - 중복 x , 순서 o : LinkedHashSet, SortedSet, TreeSet
		 */
		
		// 
		Set<String> s1 = new HashSet<>();
		Set<String> s2 = Set.of("Three", "Four");
		
		Set<String> s3 = new LinkedHashSet<>();

	}

}
