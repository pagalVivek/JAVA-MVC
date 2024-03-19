public class controller {
    private employee model;
    private employeeView view;

    public controller(employee model,employeeView view){
        this.model = model;
        this.view = view;
    }

    public void setdata(String name,String id,String dept){
        model.setdata(name, id, dept);
    }

    public String getName(){
        return model.getname();
    }

    public String getId(){
        return model.getid();
    }

    public String getDept(){
        return model.getdept();
    }

    public void updateView(){
        view.printdetails(getName(), getId(), getDept());
    }
}
