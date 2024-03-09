public class FootballCoach extends Player{
    private String managedTeam;

    public FootballCoach(String name, int age, String nationalTeam, String managedTeam) {
        super(name, age, nationalTeam);
        this.managedTeam = managedTeam;
    }

    @Override
    void playerInformation() {
        System.out.println("----------");
        System.out.println("Teknik Direktör Bilgileri");
        System.out.println("Adı:" + this.getName());
        System.out.println("Soyadı:" + this.getAge());
        System.out.println("Milli Takım:" + this.getNationalTeam());
        System.out.println("Güncel Yönettiği Takım:" + this.managedTeam);
        System.out.println("----------");
    }
}
