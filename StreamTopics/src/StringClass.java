import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

public class StringClass {

    public static void main(String[] args) {
        String s1 = "Asmita";
        String s2 = "Asmita";
        String s3 = new String("Asmita");
        System.out.println(s1==s2);//true
        System.out.println(s1==s3);
        System.out.println("Output :"+s1.equals(s2));//true
        System.out.println("Output :"+s1.equals(s3));

        List<String> list1 = List.of("Asmita", "Pawan", "Shraddha","Pawan");
        List<String> list2 = new ArrayList<>();
        list2.add("Student1");
        list2.add("Student2");
        list2.add("Student3");
        list2.add("Student4");
        list2.add("Student5");
        list2.add("Student1");
        List<String> listdistinct = list1.stream().distinct().collect(Collectors.toList());
        System.out.println(listdistinct);

        Long countListValues = list1.stream().count();
        System.out.println(countListValues);

        boolean listBoolean = list1.stream().anyMatch(str -> str.startsWith("S"));
        System.out.println(listBoolean);

        boolean listBoolean1 = list1.stream().allMatch(str -> str.startsWith("P"));
        System.out.println(listBoolean1);

        list2.add("Amit");
        System.out.println(list2);

        Vector<String> vector= new Vector<>();
        vector.add("Employee1");
        vector.add("Employee1");
        vector.add("Employee1");
        vector.add("Employee1");
        vector.add("Employee1");
        vector.add("Employee1");
        vector.add("Employee1");
        vector.add("Employee1");
        vector.add("Employee1");
        vector.add("Employee2");
        vector.add("Employee1");

        List list3 = List.of("Employee1");
        //System.out.println(vector);
        vector.forEach(System.out::println);
        System.out.println(vector.capacity());
        vector.removeAll(list3);
        vector.forEach(System.out::println);


       String[] str = {"s1","s2", "s3"};
       String[] strclone = str.clone();
        System.out.println(strclone.length);
        Arrays.stream(strclone).map(x -> x.concat("String")).collect(Collectors.toList()).forEach(System.out::println);


    }
}




