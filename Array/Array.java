/**
 * Array
 */
public class Array {

    private int[] bucket;
    private int itemInBucket;
    private int result;

    public Array(int len) {
        bucket = new int[len];
    }

    public void show() {
        for (int i = 0; i < itemInBucket; i++) {
            System.out.println(bucket[i]);
            System.out.println(itemInBucket);
        }
    }

    public void add(int data) {
        if (bucket.length == itemInBucket) {
            int[] newBucket = new int[itemInBucket * 2];
            for (int i = 0; i < itemInBucket; i++) {
                newBucket[i] = bucket[i];
            }
            bucket = newBucket;
        }
        bucket[itemInBucket] = data;
        itemInBucket++;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= itemInBucket) {
            throw new IllegalArgumentException();
        }

        for (int i = index; i < itemInBucket; i++) {
            bucket[i] = bucket[i + 1];
        }
        itemInBucket--;

    }

    public int indexOf(int item) {
        for (int i = 0; i < itemInBucket; i++) {
            if (bucket[i] == item) {
                result = i;
            }else{
                result = -1;
            }

        }
        return result;
    }

}