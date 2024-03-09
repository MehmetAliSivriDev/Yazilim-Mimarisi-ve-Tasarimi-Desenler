abstract class Player {

    private String name;
    private int age;
    private String nationalTeam;

    public Player(String name, int age, String nationalTeam) {
        this.name = name;
        this.age = age;
        this.nationalTeam = nationalTeam;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getNationalTeam() {
        return nationalTeam;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNationalTeam(String nationalTeam) {
        this.nationalTeam = nationalTeam;
    }

    abstract void playerInformation();
}
