import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Tree {

    private int value;
    private Tree left;
    private Tree right;

    public static void main(String[] args) {
        Tree tree = new Tree(20,new Tree(7, new Tree(4,null,new Tree(6,null,null)),new Tree(9,null,null)),
                new Tree(35,new Tree(31,new Tree(28,null,null),null),
                        new Tree(40,new Tree(38,null,null), new Tree(52,null,null))));
    }
}
