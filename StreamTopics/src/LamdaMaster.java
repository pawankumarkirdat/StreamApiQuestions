public class LamdaMaster {
    public static void main(String[] args) {
      /*Writing a method reference code*/
      Lamdainterface lamdainterface = Student::doStuff;
      lamdainterface.doAction();
      /*Writing a constructor reference code*/
      Lamdainterface lamdainterface1 = Student::new;
      lamdainterface1.doAction();
      /*Writing a code using lamda expression*/
        Lamdainterface lamdainterface2 = () -> {
            System.out.println("I am a Student from lamda expression");
        };
        lamdainterface2.doAction();
        Lamdainterface lamdainterface3 = () -> System.out.println("I am a Student2 from lamda expression");
        lamdainterface3.doAction();

    }
}
