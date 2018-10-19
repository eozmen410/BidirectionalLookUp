/*
Bidirectional Map, provides bidirectional lookup functionality, by using 2
maps to store the data.
 */
public class BidirectionalMap<K extends Comparable<K>, V extends Comparable<V>> {

    private Map<K,V> forward;
    private Map<V, K> back;

    public BidirectionalMap() {
        forward = new Map<>();
        back = new Map<>();
    }

    public void insert (K key, V value) {
        forward.put(key, value);
        back.put(value, key);
    }

    public V lookup(K key) {
        return forward.get(key);
    }

    public K rlookup(V value) {
        return back.get(value);
    }

    public void deleteKey(K key) {
        V value = forward.get(key);
        forward.remove(key);
        back.remove(value);
    }

    public void print() {
        for(K key : forward.keySet()) {
            System.out.println(key + " " + forward.get(key) );
        }
    }

}
