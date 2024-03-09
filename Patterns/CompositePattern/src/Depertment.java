import javax.swing.plaf.DesktopPaneUI;
import java.util.ArrayList;
import java.util.List;
public class Depertment implements Employee{
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Depertment(String name){
        this.name=name;
    }
    public void addEmployee(Employee employee){
        employees.add(employee);
    }
    @Override
    public void showItails() {
        System.out.println("Depertment:"+name);
        System.out.println(name+ "depertmanda çalışanların listesi: ");
        for(Employee employee:employees){
            employee.showItails();
        }
    }
}
