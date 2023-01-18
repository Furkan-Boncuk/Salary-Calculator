public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("kemal",1985,45,2000.0);
        String printEmployeeInfo = employee.toString();
        System.out.println(printEmployeeInfo);
    }
}
