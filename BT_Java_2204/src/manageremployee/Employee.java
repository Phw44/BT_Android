/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manageremployee;

/**
 *
 * @author LENOVO
 */
public class Employee {
    public int id;
    public String name;
    public int age;
    public String department;
    public String code;
    public double salaryRate;

    public Employee(int id, String name, int age, String department, String code, double salaryRate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.code = code;
        this.salaryRate = salaryRate;
    }
    
    @Override
    public String toString() {
        return "ID: " + id + ", Tên: " + name + ", Tuổi: " + age + ", Phòng ban: " + department + ", Mã nhân viên: " + code + ", Mức lương: " + salaryRate;
    }
}
