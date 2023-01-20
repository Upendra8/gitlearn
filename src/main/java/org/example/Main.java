import java.io.*;

/*class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\upend\\OneDrive\\Documents\\testing.txt"));
            BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\upend\\OneDrive\\Documents\\tested.txt",true));
            String line=br.readLine();
            bw.write(line);
            br.close();
            bw.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
}*/


import java.util.*;

class Employee{
    private String name;
    public  Employee(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
class EmployeeService{
    private Map<Integer,Employee> employee=new HashMap<>();
    public EmployeeService(){
        employee.put(17,new Employee("Upendra"));
        employee.put(18,new Employee("Yashwanth"));
    }
    public Optional<Employee> getNameById(int n){
        Employee emp=employee.get(n);
        return  Optional.ofNullable(emp);
    }
}
class Main{
    public static void main(String args[]){
        EmployeeService employ=new EmployeeService();
        Optional<Employee> op=employ.getNameById(18);
        Employee emped=op.orElseGet(()->new Employee("Unknown"));
        System.out.println(emped.getName());
        op=Optional.empty();
        emped=op.orElseGet(()->new Employee("Unknown"));
        System.out.println(emped.getName());
    }
}














