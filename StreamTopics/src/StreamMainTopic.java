import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class StreamMainTopic {
    public static void main(String[] args) {

        /***********************Remove duplicates from the list***********************************/
        //Declaration of list
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C#");
        list.add("Java");
        list.add("Kotlin");
        list.add("Python");
        System.out.println("Before sorting citylist :" + list);
        System.out.println("After sorting citylist :" + list);

        String name = "Pawan";

        name.chars().mapToObj(c -> (char)c).sorted();

        /* Stream api to sort list based upon dictonary values*/
        //Below code using lambda expression in ascending order
        list.stream().sorted((string1, string2) -> (string1.compareTo(string2))).collect(Collectors.toList()).forEach(System.out::print);
        System.out.println();
        //Below code using lambda expression in descending order
        list.stream().sorted((string1, string2) -> (string2.compareTo(string1))).collect(Collectors.toList()).forEach(System.out::print);
        System.out.println();
        //by using Comparator in ascending order
        list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList()).forEach(System.out::print);
        System.out.println();
        //by using Comparator in descending order
        list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::print);
        System.out.println();

        //by using Comparator in descending order using joining Collectors
        String listjoining = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.joining(" "));
        System.out.println(listjoining);

        //Below code using sorted in ascending order
        System.out.println("Sorted method to sort list : ");
        list.stream().sorted().collect(Collectors.toList()).forEach(System.out::print);
        System.out.println();







        /* Stream api to remove duplicates from the list*/
        List noduplicateList = list.stream().distinct().collect(Collectors.toList());
        System.out.println(noduplicateList);

        /* Stream api to remove duplicates from the list and print*/
        list.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
        /**********************************************************/

        /************************Sort list based upon length**********************************/
        List<String> citylist = List.of("Mumbai","Banglore","Pune","Delhi","Hyderabad");
        System.out.println("Before sorting citylist :" + citylist);
        System.out.println("After sorting citylist :");
        citylist.stream().sorted((s1,s2) -> Integer.compare(s1.length(),s2.length())).collect(Collectors.toList()).forEach(System.out::println);
        /**********************************************************/

        /**************************Filter stream based upon starting with 'a' ********************************/
        List<String> stringList = new ArrayList<>();
        stringList.add("ank");
        stringList.add("sam");
        stringList.add("az");
        stringList.add("neh");
        stringList.add("ad");
        System.out.println("String list before filtering: "+ stringList);
        System.out.println("String list after filtering starting with 'a': "+ stringList);
        stringList.stream().filter(s1 -> s1.startsWith("a")).collect(Collectors.toList()).forEach(System.out::println);
        /**********************************************************/

        /*************************Filter stream based upon starting with 'a' and sort in ascending order*********************************/
        System.out.println("String list after filtering starting with 'a' and sort in ascending order: "+ stringList);
        stringList.stream().filter(s1 -> s1.startsWith("a")).sorted().collect(Collectors.toList()).forEach(System.out::println);
        /**********************************************************/

        /*************************Filter stream based upon starting with 'a' and sort in descending order*********************************/
        System.out.println("String list after filtering starting with 'a' and sort in descending order: "+ stringList);
        stringList.stream().filter(s1 -> s1.startsWith("a")).sorted((s1,s2)->s2.compareTo(s1) ).collect(Collectors.toList()).forEach(System.out::println);
        /**********************************************************/

        /*************************Filter stream based upon starting with 'a' and convert it into UPPERCASE and sort in ascending order*********************************/
        System.out.println("String list after filtering starting with 'a' and sort in ascending order(UPPERCASE): "+ stringList);
        stringList.stream().filter(s1 -> s1.startsWith("a")).sorted().map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);
        /**********************************************************/

        /*************************Filter stream based upon starting with 'a' and convert it into LOWERCASE and sort in ascending order*********************************/
        System.out.println("String list after filtering starting with 'a' and sort in ascending order(LOWERCASE): "+ stringList);
        stringList.stream().filter(s1 -> s1.startsWith("a")).sorted().map(String::toLowerCase).collect(Collectors.toList()).forEach(System.out::println);
        /**********************************************************/

        /*************************Filter stream based upon starting with 'a' and any record start with 'a'*********************************/
        System.out.println("String list after filtering starting with 'a' and any record start with 'a': "+ stringList);
        System.out.println(stringList.stream().anyMatch(s1 -> s1.startsWith("a")));
        /**********************************************************/

        /*************************Filter stream based upon starting with 'a' and allMatch record start with 'a'*********************************/
        System.out.println("String list after filtering starting with 'a' and allMatch record start with 'a': "+ stringList);
        System.out.println(stringList.stream().allMatch(s1 -> s1.startsWith("a")));
        /**********************************************************/

        /*************************Filter stream based upon starting with 'a' and noneMatch record start with 'a'*********************************/
        System.out.println("String list after filtering starting with 'a' and noneMatch record start with 'a': "+ stringList);
        System.out.println(stringList.stream().noneMatch(s1 -> s1.startsWith("a")));
        /**********************************************************/

        /*************************Filter stream based upon starting with 'b' and noneMatch record start with 'b'*********************************/
        System.out.println("String list after filtering starting with 'b' and noneMatch record start with 'b': "+ stringList);
        System.out.println(stringList.stream().noneMatch(s1 -> s1.startsWith("b")));
        /**********************************************************/

        /*************************Filter stream based upon starting with 'a' and its count*********************************/
        System.out.println("String list after filtering starting with 'a' and its count: "+ stringList);
        System.out.println(stringList.stream().filter(s1 -> s1.startsWith("a")).count());
        /**********************************************************/
    }
}