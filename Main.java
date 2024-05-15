public class Main {
    public static void main(String[] args) {
        MyHashTable<Integer, String> table = new MyHashTable<>();

        table.put(1, "hello");
        table.put(2, "my");
        table.put(3, "name");
        table.put(4, "is");
        table.put(5, "Sanzhar");

        for (int i = 0; i < 6; i++) {
            System.out.println("key " + i + ":" + table.get(i));
        }

        String removedValue = table.remove(1);
        System.out.println("removed key 1: " + removedValue);
        System.out.println( "key 1: " + table.contains(1));
        System.out.println();

        Integer keyForValue = table.getKey("Sanzhar");
        System.out.println("Key for Sanzhar: " + keyForValue);
        System.out.println();

        for (int i = 0; i < 10; i++) {
            table.put(i, "Value" );
            System.out.println("Added key " + i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Value for key " + i + ": " + table.get(i));
        }
    }
}