public class Programmer implements Employee{

    @Override
    public void doWork() {
        System.out.println("EL trabajador escribe código");
    }

    @Override
    public String toString(){
        return ("El Programador");
    }

}
