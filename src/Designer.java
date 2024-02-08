public class Designer implements Employee{
    @Override
    public void doWork() {
        System.out.println("El trabajador diseña arquitectura");
    }

    @Override
    public String toString(){
        return ("El Diseñador");
    }

}
