public class Tester implements Employee{

    @Override
    public void doWork() {
        System.out.println("EL trabajador testea el software");
    }

    @Override
    public String toString(){
        return ("El Tester");
    }

}
