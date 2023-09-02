public class TeamLeadDeveloper extends DeveloperDecorator{
    public TeamLeadDeveloper(Developer developer) {
        super(developer);
    }

    @Override
    public String develop() {
        return super.develop() + makingCalls();
    }

    public String makingCalls(){
        return "Im on call(";
    }


}
