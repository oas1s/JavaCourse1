package list;

public class MyList {
    private String[] strings = new String[10];
    private int lastFreeIndex = 0;


    public boolean add(String s){
        if (lastFreeIndex+1>=strings.length){
            String[] newArray = new String[strings.length+10];
            copyArrays(strings,newArray);
            strings = newArray;
        }
        strings[lastFreeIndex] = s;
        lastFreeIndex++;
        return true;
    }

    public String get(int index){
        return strings[index];
    }

    private void copyArrays(String[] source, String[] target){
        for (int i = 0; i < source.length; i++) {
            target[i] = source[i];
        }
    }

    public int size(){
        if (lastFreeIndex ==0) {
            return 1;
        }
        return lastFreeIndex;
    }

    public void removeAll(MyList myList){

    }
}
