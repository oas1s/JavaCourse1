public class SeniorDeveloper extends DeveloperDecorator{
    public SeniorDeveloper(Developer developer) {
        super(developer);
    }

    @Override
    public String develop() {
        return super.develop() + reviewCode();
    }

    public String reviewCode(){
        return "Reviewing code...";
    }


}
