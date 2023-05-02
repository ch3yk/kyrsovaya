public class Main {
        public static void main(String[] args) {
            Employee[] worker = new Employee[10];
            worker[0] = new Employee("Голованов С.Д.", 123456, 1);
            worker[1] = new Employee("Ковалюсь И.О.", 132456, 2);
            worker[2] = new Employee("Ушаков Д.Е.", 142356, 3);
            worker[3] = new Employee("Голубцов В.О.", 152346, 4);
            worker[4] = new Employee("Голуб Б.А.", 162345, 5);
            worker[5] = new Employee("Чернов Д.И.", 165432, 1);
            worker[6] = new Employee("Голубцов Р.О.", 156432, 2);
            worker[7] = new Employee("Елисеев К.Д.", 146532, 3);
            worker[8] = new Employee("Окишев С.С.", 136542, 4);
            worker[9] = new Employee("Федотов К.В.", 126543, 5);
            listEmployee(worker);
            System.out.println("Суммa зарплат в месяц:"+salaryCosts(worker));
            System.out.println("Мин зарплата:"+minSalary(worker));
            System.out.println("Макс зарплата:"+maxSalary(worker));
            System.out.println("Средняя зарплата:"+averageSalary(worker));
            listFIO(worker);
        }
        public static void listEmployee(Employee[] worker) {
            for (Employee employee : worker) {
                System.out.println(employee.toString());
            }
        }
        public static int salaryCosts(Employee[] worker) {
            int salaryCosts=0;
            for (Employee employee : worker) {
                salaryCosts = salaryCosts + employee.getSalary();
            }
            return salaryCosts;
        }
    public static Employee minSalary(Employee[] worker) {
        Employee min = worker[0];
        for (Employee employee : worker) {
            if (employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        }
        return min;
    }
    public static Employee maxSalary(Employee[] worker) {
        Employee max = worker[0];
        for (Employee employee : worker) {
            if (employee.getSalary() < max.getSalary()) {
                max = employee;
            }
        }
        return max;
    }

        public static int averageSalary(Employee[] worker) {
            int salaryCosts=0;
            for (Employee employee : worker) {
                salaryCosts = salaryCosts + employee.getSalary();
            }
            return salaryCosts/Employee.id;
        }
        public static void listFIO(Employee[] worker) {
            for (Employee employee : worker) {
                System.out.println(employee.getFio());
            }
        }
}