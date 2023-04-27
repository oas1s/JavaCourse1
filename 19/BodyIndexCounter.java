public class BodyIndexCounter {

    public Double countBodyIndex(User user){
        return user.getWeight()/(user.getHeight()*user.getHeight());
    }
}
