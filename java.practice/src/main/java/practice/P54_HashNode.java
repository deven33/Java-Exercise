package practice;

public class P54_HashNode<K, V> {
	K key;
	V value;

	//Reference to next node
	P54_HashNode<K, V> next;
	
	public P54_HashNode(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
}
