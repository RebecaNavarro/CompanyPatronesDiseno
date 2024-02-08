public class Company {

    Employee employee;

    public Company(Employee employee){
        this.employee=employee;
    }

    public void createSoftware(){
        System.out.println(employee.toString() +" trabaja");
        employee.doWork();
    }

}
