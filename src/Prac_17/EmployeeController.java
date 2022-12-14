package Prac_17;

public class EmployeeController {
    Employee model;
    EmployeeView view;

    EmployeeController(Employee tmp){
        model = tmp;
        view = new EmployeeView();
    }

    public void setStudentName(String name){
        model.setName(name);
    }

    public String getStudentName(){
        return model.getName();
    }

    public void setStudentRollNo(String rollNo){
        model.setRank(rollNo);
    }

    public String getStudentRollNo(String rollNo){
        return model.getRank();
    }

    public void updateView(){
        view.printStudentDetails(model.getName(),model.getRank(),model.getSalary());
    }
}
