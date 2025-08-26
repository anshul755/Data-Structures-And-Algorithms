import java.util.*;

public class HashMapScratch {
    
    static class hashMap<K,V>{
        private class Node{
            K key;
            V value;

            public Node(K key,V value){
                this.key=key;
                this.value=value;
            }
        }

        private int n;
        private int N;
        private LinkedList<Node>[] buckets;

        @SuppressWarnings("unchecked")
        public hashMap(){
            this.N=4;
            this.buckets=new LinkedList[4];
            for(int i=0;i<4;i++){
                this.buckets[i]=new LinkedList<>();
            }
        }

        private int hashFunction(K key){
            return Math.abs(key.hashCode())%N; 
        }

        private int SearchinLL(K key,int bi){
            LinkedList<Node>ll=buckets[bi];
            int di=0;
            for(int i=0;i<ll.size();i++){
                Node node=ll.get(i);
                if(Objects.equals(node.key,key)){
                    return di;
                }
                di++;
            }
            return -1;
        }

        private void rehash(){
            LinkedList<Node>[] oldbuckets=buckets;
            buckets=new LinkedList[N*2];
            N=2*N;

            for(int i=0;i<buckets.length;i++){
                buckets[i]=new LinkedList<>();
            } 

            for(int i=0;i<oldbuckets.length;i++){
                LinkedList<Node>ll=oldbuckets[i];
                for(int j=0;j<ll.size();j++){
                    Node node=ll.get(j);
                    put(node.key,node.value);
                }
            }
        }

        public void put(K key,V value){
            int bi=hashFunction(key);
            int di=SearchinLL(key,bi);

            if(di!=-1){
                Node node=buckets[bi].get(di);
                node.value=value;
            }else{
                buckets[bi].add(new Node(key, value));
                n++;
            }
            double lambda=(double)n/N;

            if(lambda>2.0){
                rehash();
            }
        }

        public boolean containsKey(K key){
            int bi=hashFunction(key);
            int di=SearchinLL(key, bi);
            
            if(di!=-1) return true;

            return false;
        }

        public V remove(K key){
            int bi=hashFunction(key);
            int di=SearchinLL(key, bi);
            if(di!=-1){
                Node node=buckets[bi].remove(di);
                n--;
                return node.value;
            }
            return null;
        }

        public V get(K key){
            int bi=hashFunction(key);
            int di=SearchinLL(key,bi);

            if(di!=-1){
                Node node=buckets[bi].get(di);
                return node.value;
            }
            return null;
        }

        public ArrayList<K> keySet(){
            ArrayList<K>keys=new ArrayList<>();

            for(int i=0;i<buckets.length;i++){
                LinkedList<Node>ll=buckets[i];
                for(Node node:ll){
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty(){
            return n==0;
        }

    }
    public static void main(String[] args) {
        hashMap<Integer,Integer>map=new hashMap<>();

        map.put(777, 10);
        map.put(77, 20);
        map.put(7, 30);

        ArrayList<Integer>keys=map.keySet();

        for(int key:keys){
            System.out.println(map.get(key));
        }
    }
}