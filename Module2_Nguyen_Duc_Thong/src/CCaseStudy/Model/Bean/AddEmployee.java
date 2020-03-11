package CCaseStudy.Model.Bean;
import CCaseStudy.Model.Dao.Employee;
import CCaseStudy.Model.Dao.Person;

import static CCaseStudy.Common.DocVaLuuFile.loadFileEmployee;
import static CCaseStudy.Common.DocVaLuuFile.saveFileEmployee;
import static CCaseStudy.Common.ValiDate.checkInterger;
import static CCaseStudy.Controller.MainController.listEmployee;
import static CCaseStudy.Controller.MainController.sc;
public class AddEmployee {
    public static void addEmployee(){
        Person employee = new Employee();
        AddPerson.addPerson(employee);
        String regex = "^[0-9]{3}$";
        System.out.println("Enter IdEmployee: 3 numbers");
        ((Employee)employee).setIdEmployee(checkInterger(regex, "Enter IdEmployee failed"));
        regex = "^[1-9]|[0-9]{2}$";
        System.out.println("Enter AgeEmployee: 1-99");
        ((Employee)employee).setAgeEmployee(checkInterger(regex, "Enter AgeEmployee failed"));
        System.out.println("Vui lòng nhập trình độ học vấn: ");
        ((Employee)employee).setLiteracy(sc.nextLine());
        System.out.println("Vui lòng nhập chức vụ: ");
        ((Employee)employee).setPosition(sc.nextLine());
        System.out.println("Vui lòng nhập lương: ");
        ((Employee)employee).setSalary(sc.nextLine());

        loadFileEmployee();
        listEmployee.add((Employee)employee);
        saveFileEmployee();
}
}