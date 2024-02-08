public class Main {
    public static void main(String[] args) {

//        Employee employee = new Programmer();
//        Employee employee = new Designer();

        Employee employee = new Tester();

        Company company = new Company(employee);
        company.createSoftware();

    }

}