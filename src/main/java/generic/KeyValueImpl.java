package generic;

public class KeyValueImpl<K, V> implements KeyValue<K, V> {
    private K key;
    private V value;

    public KeyValueImpl(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }
}
