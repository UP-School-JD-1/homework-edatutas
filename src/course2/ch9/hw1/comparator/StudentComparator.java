package course2.ch9.hw1.comparator;

import java.util.Comparator;

public class StudentComparator implements Comparator {

	@Override
	public int compare(Object arg0, Object arg1) {
		AbstractStudent s1 = (AbstractStudent) arg0;
		AbstractStudent s2 = (AbstractStudent) arg1;

		if (s1.getNo() < s2.getNo())
			return -1;
		else if (s1.getNo() == s2.getNo())
			return 0;
		else
			return 1;
	}

}
