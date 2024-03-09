public class Footballer extends Player implements IPosition {

    private String currentTeam;
    private String position;

    public Footballer(String name, int age, String nationalTeam, String currentTeam, String position) {
        super(name, age, nationalTeam);
        this.currentTeam = currentTeam;
        this.position = position;
    }

    @Override
    public void setPosition(String newPosition) {
        this.position = newPosition;
    }

    @Override
    void playerInformation() {
        System.out.println("----------");
        System.out.println("Futbolcu Bilgileri");
        System.out.println("Adı:" + this.getName());
        System.out.println("Soyadı:" + this.getAge());
        System.out.println("Milli Takım:" + this.getNationalTeam());
        System.out.println("Güncel Takım:" + this.currentTeam);
        System.out.println("Oynadığı Pozisyon:" + this.position);
        System.out.println("----------");
    }
}
