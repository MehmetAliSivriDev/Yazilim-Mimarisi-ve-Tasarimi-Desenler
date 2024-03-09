import java.util.ArrayList;
import java.util.List;

public class HGSAccount {
    private String name;
    private Long tcKimlikNo;
    private String surname;
    private double balance = 1000;
    private List<HGSPassage> passages = new ArrayList<>();

    public HGSAccount(String name, Long tcKimlikNo, String surname) {
        this.name = name;
        this.tcKimlikNo = tcKimlikNo;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public Long getTcKimlikNo() {
        return tcKimlikNo;
    }

    public String getSurname() {
        return surname;
    }

    public double getBalance() {
        return balance;
    }

    public List<HGSPassage> getPassages() {
        return passages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTcKimlikNo(Long tcKimlikNo) {
        this.tcKimlikNo = tcKimlikNo;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setPassages(List<HGSPassage> passages) {
        this.passages = passages;
    }

    public void addPassages(HGSPassage hgsPassage){
        List<HGSPassage> tempList = this.passages;
        tempList.add(hgsPassage);
        this.passages = tempList;
    }

    public void deposit(double balance){
        this.balance += balance;
    }

    public void displayPassages(){
        for(int i=0;i< this.passages.size();i++){
            System.out.println("----------");
            System.out.println("Geçiş Tarihiniz =" + this.passages.get(i).getDate());
            System.out.println("Geçiş Yolu =" + this.passages.get(i).getRoute());
            System.out.println("Geçiş Ücretiniz =" + this.passages.get(i).getFee());
            System.out.println("----------");
        }
    }

    public void displayAccount(){
        System.out.println("---------------------");
        System.out.println("Ad =" + this.name);
        System.out.println("Soyad =" + this.surname);
        System.out.println("TC Kimlik No=" + this.tcKimlikNo);
        System.out.println("Bakiye =" + this.balance);
        System.out.println("---------------------");

    }
}
