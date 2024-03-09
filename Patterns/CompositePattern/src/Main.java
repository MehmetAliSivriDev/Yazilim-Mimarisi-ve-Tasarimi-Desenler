public class Main {
    public static void main(String[] args) {
        //leaf employees
        Developer developer1 = new Developer("Bekir Faruk Arabacı");
        Developer developer2 = new Developer("Mehmet Ali Sivri");
        Manager manager = new Manager("Bora Aslan");

        //

        //Composite depertment
        Depertment devolopmentDepertment = new Depertment("Software Development");
        devolopmentDepertment.addEmployee(developer1);
        devolopmentDepertment.addEmployee(developer2);
        devolopmentDepertment.addEmployee(manager);

        devolopmentDepertment.showItails();
    }
}