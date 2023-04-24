import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

public class MyMap<K extends Comparable<K>,V> implements Map<K,V> {

    private Tree<K,V> root;
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    private static class Tree<K extends Comparable<K>,V> {
        private Tree<K,V>  parent;
        private Tree<K,V>  left;
        private Tree<K,V>  right;
        private K key;
        private V value;


        public Tree<K,V> get(K key) {
            return null;
        }

        public K remove(K key){
            return null;
        }

        public V add(Tree<K,V> node){
            return null;
        }
    }

    @Override
    public int size() {
        if (root == null){
            return 0;
        }

        Queue<Tree<K,V>> queue = new ArrayDeque<>();
        int size = 0;
        queue.add(root);
        while (!queue.isEmpty()){
            Tree<K,V> tree = queue.remove();

            if (tree.getLeft()!= null) {
                queue.add(tree.getLeft());
            }
            if (tree.getRight()!= null) {
                queue.add(tree.getRight());
            }
            size++;
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public V get(Object key) {
        return null;
    }

    @Override
    public V put(K key, V value) {
        return null;
    }

    @Override
    public V remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
    }

    @Override
    public void clear() {

    }

    @Override
    public Set<K> keySet() {
        return null;
    }

    @Override
    public Collection<V> values() {
        return null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }
}
