import lombok.*;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

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

        System.out.println(sumWide(tree));
    }
    public static int sumDeep(Tree root) {
        Stack<Tree> stack = new Stack<>();
        stack.push(root);

        int summ = 0;

        while (!stack.isEmpty()) {
            Tree node = stack.pop();

            System.out.println(node.value);

            summ = summ + node.value;

            if (node.right != null) {
                stack.push(node.right);
            }

            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return summ;
    }

    public static int sumWide(Tree root) {
        Queue<Tree> stack = new ArrayDeque<>();
        stack.add(root);

        int summ = 0;

        while (!stack.isEmpty()) {
            Tree node = stack.remove();

            System.out.println(node.value);

            summ = summ + node.value;

            if (node.left != null) {
                stack.add(node.left);
            }

            if (node.right != null) {
                stack.add(node.right);
            }
        }
        return summ;
    }
}
