public class GelistirilmisGorevAdapter implements  Gorev{

    private GelistirilmisGorev gelistrilmisGorev;

    public GelistirilmisGorevAdapter(GelistirilmisGorev gelistirilmisGorev){
        this.gelistrilmisGorev=gelistirilmisGorev;
    }

    @Override
    public String getGorevAdi() {
        return gelistrilmisGorev.taskIsimGetir();
    }
}
