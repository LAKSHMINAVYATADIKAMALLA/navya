import java.util.TreeSet;
import java.util.Set;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.Set;

public class TreeSetExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet tr=new TreeSet();
		tr.add("india");
		tr.add("china");
		tr.add("america");
		System.out.println(tr);
		Set tr1=new TreeSet();
		tr1.add(new Employee("101","kumar"));
		tr1.add(new Employee("102","hiii"));
		tr1 .forEach(System.out::println);
		System.out.println(tr1);


	}

}
