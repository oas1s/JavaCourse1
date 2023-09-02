package SOLID.O;

public class FileToDbSaver implements IFileSaver{
    @Override
    public void save() {
        System.out.println("saving to DB");
    }
}
