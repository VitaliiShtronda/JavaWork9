import java.util.Objects;

class HashMap<K, V> {
    private static final int DEFAULT_Bouquet = 16;
    private int bouquet = DEFAULT_Bouquet;

    private HashMapLinkedList<K,V>[] bouquetArray;
    private int size;

    public HashMap() {
        bouquetArray = new HashMapLinkedList[DEFAULT_Bouquet];
        createBouquet(bouquetArray, bouquetArray.length);
        size = 0;
    }

    private void createBouquet(HashMapLinkedList<K, V>[] bouquetArray, int bouquetQty) {
        for (int i = 0; i < bouquet; i++) {
            bouquetArray[i] = new HashMapLinkedList<>();
        }
    }

    private int getBouquetNumber(K key) {
        return Objects.hash(key) % bouquet;
    }

    public void put(K key, V value) {
        if (size == bouquet) {
            increaseBouquet();
        }
        addElementToBouquet(key, value, bouquetArray);
        size++;
    }


    private void increaseBouquet() {
        HashMapLinkedList<K, V>[] newBouquetArray = new HashMapLinkedList[bouquet * 2];
        createBouquet(newBouquetArray, newBouquetArray.length);
        transferElementsToNewArray(bouquetArray, newBouquetArray);
        bouquetArray = newBouquetArray;
        bouquet *= 2;
    }


    private void transferElementsToNewArray(HashMapLinkedList<K, V>[] bouquetArray, HashMapLinkedList<K, V>[] newBouquetArray) {
        for (int i = 0; i < bouquet; i++) {
            while (bouquetArray[i].getFirstNode() != null) {
                addElementToBouquet(bouquetArray[i].getFirstNode().getKey(),
                        bouquetArray[i].getFirstNode().getValue(),
                        newBouquetArray);
                bouquetArray[i].remove(bouquetArray[i].getFirstNode().getKey());
            }
        }
    }

    private void addElementToBouquet(K key, V value, HashMapLinkedList<K, V>[] bouquetArray) {
        int bouquetNumber = getBouquetNumber(key);
        bouquetArray[bouquetNumber].add(key, value);
    }


    public void remove(K key) {
        int bouquetNumber = Objects.hash(key) % bouquet;
        bouquetArray[bouquetNumber].remove(key);
        size--;
    }

    public void clear() {
        bouquetArray = new HashMapLinkedList[DEFAULT_Bouquet];
        createBouquet(bouquetArray, bouquetArray.length);
        size = 0;
    }

    public int size() {
        return size;
    }

    public V get(K key) {
        int bouquetNumber = getBouquetNumber(key);
        return bouquetArray[bouquetNumber].get(key);

    }
}