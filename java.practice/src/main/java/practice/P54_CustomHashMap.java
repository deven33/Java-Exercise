package practice;

import java.util.ArrayList;

public class P54_CustomHashMap<K, V> {
	// Bucket array used to store array chains
	private ArrayList<P54_HashNode<K, V>> bucket;

	// current capecity of array Lisy
	private int numBuckets;

	// current size of array list
	private int size;

	public P54_CustomHashMap() {
		bucket = new ArrayList<P54_HashNode<K, V>>();
		numBuckets = 10;
		size = 0;

		// crerate empty chain
		for (int i = 0; i < numBuckets; i++) {
			bucket.add(null);

		}
	}

	public int size() {
		return size;
	}

	// find index by hashcode
	public int getIndex(K key) {
		int hashCode = key.hashCode();
		int index = hashCode % numBuckets;
		return index;
	}
	
	// method to add a given key-value
	public void add(K key, V value) {
		// find head of the chain
		 int bucketIndex = getIndex(key);
		 P54_HashNode<K, V> head = bucket.get(bucketIndex);
		 
		 
		 // chheck if key is already present
		 while(head != null) {
			 if(head.key.equals(key)) {
				 head.value=value;
				 return;
			 }
			 head=head.next;
		 }
		 // Insert key in chain
		 size++;
		 head = bucket.get(bucketIndex);
		 P54_CustomHashMap<K,V> newnode = new P54_CustomHashMap<K, V>(key,value);
	}
}
