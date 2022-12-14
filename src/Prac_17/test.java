package Prac_17;

public class test {

    public static void main(String[] args) {
        EmployeeController controller = new EmployeeController(getEmployeeFromDatabase());
        controller.updateView();
    }

    public static Employee getEmployeeFromDatabase(){
        Employee tmp = new Employee();
        tmp.setName("Denis");
        tmp.setRank("Senior programmer");
        tmp.setWorkExpirience(5);
        //tmp.setSalary(15000);
        return tmp;
    }

}
