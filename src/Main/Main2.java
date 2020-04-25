package Main;


import java.util.LinkedHashMap;
import java.util.Map;


    public class Main2 extends LinkedHashMap<Integer,Integer> {
        public int capacity;
        public Main2(int capacity){
            super(capacity,0.75f,true);
            this.capacity=capacity;
        }
        public int get(int key){
            return super.getOrDefault(key,-1);
        }
        public void put(int key,int value){
            super.put(key,value);
        }
        @Override
        protected boolean removeEldestEntry(Map.Entry<Integer,Integer> eldest){
            return size()>capacity;
        }

        public static void main(String[] args) {
            Main2 main2 =new Main2(2);
            main2.put(2,3);
            main2.put(3,4);
            main2.put(4,5);
            System.out.println(main2.get(2));
        }
    }


