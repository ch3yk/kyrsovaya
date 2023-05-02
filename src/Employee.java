public class Employee {
    private String fio;
    private int salary;
    private int department;
    static int id;

    public Employee(String fio, int salary, int department) {
        this.fio = fio;
        this.salary = salary;
        this.department = department;
        id++;
    }

    public String getFio() {
        return fio;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public void setSalary(int salary) {

        this.salary = salary;
    }

    public void setDepartment(int department) {

        this.department = department;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return "Ф.И.О:" + fio + " Отдел:" + department + " ЗП:" + salary;
    }
}
