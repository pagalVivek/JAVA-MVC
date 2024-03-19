public class employee {
    private String EmployeeName;
    private String EmployeeId;
    private String EmployeeDept;

    public String getname() {
        return EmployeeName;
    }
    public String getid() {
        return EmployeeId;
    }
    public String getdept() {
        return EmployeeDept;
    }

    public void setdata(String name, String id, String dept) {
        this.EmployeeName = name;
        this.EmployeeId = id;
        this.EmployeeDept = dept;
    }
}