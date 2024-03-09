public class Manager implements Employee{
    private String name;
    public Manager(String name){
        this.name=name;
    }
    @Override
    public void showItails() {
        System.out.println("Manager:"+name);
    }
}
