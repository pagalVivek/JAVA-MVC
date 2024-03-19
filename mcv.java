public class mcv {
    public static void main(String[]args){
        employee model = retriveEmployeeFromDatabase();

        employeeView view = new employeeView();

        controller control = new controller(model, view);

        control.updateView();

        control.setdata("Divine","6734","ChatGpt");
        System.out.println("\nEmployee details after updating : ");

        control.updateView();
    }

    private static employee retriveEmployeeFromDatabase(){
        employee emp = new employee();
        emp.setdata("vivek", "1243", "Technology");
        return emp;
    }
}
