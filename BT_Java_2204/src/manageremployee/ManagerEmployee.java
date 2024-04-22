package manageremployee;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class ManagerEmployee {
    
    private ArrayList<Employee> employees;
    
    public ManagerEmployee() {
         try {
            System.setOut(new PrintStream(System.out, true, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            System.err.println("Unsupported encoding!");
        }
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(int index) {
//        employees.remove(index);
         for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).id == index) {
                employees.remove(i);
                System.out.println("Employee with ID " + index + " removed successfully.");
                return;
            }
        }
    }

    public void displayEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void main(String[] args) {
       
        ManagerEmployee ems = new ManagerEmployee();

        ems.addEmployee(new Employee(1, "Nguyễn Thị Phương", 30, "Công nghệ thông tin", "001", 25050));
        ems.addEmployee(new Employee(2, "Đỗ Quanh Huy", 28, "Nhân sự", "002", 22040));
        ems.addEmployee(new Employee(3, "Nguyễn Văn A", 35, "Tài chính", "003", 28300));
        ems.addEmployee(new Employee(4, "Nguyễn Văn B", 32, "Marketing", "004", 26100));
        ems.addEmployee(new Employee(5, "Đăng Văn Hà", 29, "Công nghệ thông tin", "005", 272200));
        ems.addEmployee(new Employee(6, "Nguyễn Hoàng Việt", 31, "Nhân sự", "006", 23300));
        ems.addEmployee(new Employee(7, "Phan Bội Châu", 33, "Tài chính", "007", 29400));
        ems.addEmployee(new Employee(8, "Võ Hồng Đức", 27, "Marketing", "008", 24500));
        ems.addEmployee(new Employee(9, "La Anh Tú", 34, "Công nghệ thông tin", "009", 282200));
        ems.addEmployee(new Employee(10, "La Văn B", 26, "Nhân sự", "010", 21010));

        System.out.println("Danh sách nhân viên:");
        ems.displayEmployees();

        Scanner scanner = new Scanner(System.in);
            int choice;

        do{
            System.out.println("Chọn chức năng:");
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Xóa nhân viên");
            System.out.println("3. Thoát");

            System.out.print("Lựa chọn của bạn: ");
             choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("Nhập thông tin cho nhân viên mới:");
                System.out.print("ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Tên: ");
                String name = scanner.nextLine();
                System.out.print("Tuổi: ");
                int age = scanner.nextInt();
                scanner.nextLine(); 
                System.out.print("Phòng ban: ");
                String department = scanner.nextLine();
                System.out.print("Mã nhân viên: ");
                String code = scanner.nextLine();
                System.out.print("Mức lương: ");
                double salaryRate = scanner.nextDouble();
                ems.addEmployee(new Employee(id, name, age, department, code, salaryRate));
                   System.out.println("\nDanh sách nhân viên:");
                     ems.displayEmployees();
            } else if (choice == 2) {
                System.out.print("Nhập ID nhân viên cần xóa: ");
                int index = scanner.nextInt();
                ems.removeEmployee(index);
                System.out.println("\nDanh sách nhân viên sau khi thay đổi:");
                 ems.displayEmployees();
            }
        }while(choice != 3);

        scanner.close();
    }
    
}
