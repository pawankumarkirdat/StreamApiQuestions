import java.util.Arrays;
import java.util.List;

public class ExceptionDemo {

    public static void main(String[] args) {
        try {
            int num = 5;
            int remainder = num / 0;
            System.out.println(remainder);
            String[] arr = {"1", "2", "4", "5", "6"};
//            List<String> list = Arrays.asList(arr);
//            list.add("1");
//            for (String a:list) {
//                System.out.println(a);
//            }
            for (int i = 0; i <= arr.length; i++)
                System.out.print(arr[i] + " ");

        } catch (ArithmeticException e) {
            System.out.println("Inside ArithmeticException catch bloc :" + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Inside ArrayIndexOutOfBoundsException catch bloc :" + e);
        } catch (Exception e) {
            System.out.println("Inside Exception catch bloc :" + e);
        }
    }
}
