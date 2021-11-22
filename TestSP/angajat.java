package TestSP;

public class Angajat {

    private String  addr;
    private String  name;
    private String  department;
    private Integer salary;

    public Angajat(){
    }

    public Angajat(String addr, String name, String department, Integer salary){
        this.addr       = addr;
        this.name       = name;
        this.department = department;
        this.salary     = salary;
    }
    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }


    public String toString(){

        return "[" +
            this.getAddr() +
            " : " +
            this.getName() +
            " : " +
            this.getDepartment() +
            "]";
    }

}
