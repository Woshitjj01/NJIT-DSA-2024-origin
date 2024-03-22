package oy.tol.tra;
import java.util.Arrays;
import java.util.Comparator;


public class Algorithms {


    public static <K extends Comparable<K>, V> void fastSort(Pair<K, V>[] array) {
        Comparator<Pair<K, V>> defaultComparator = new Comparator<Pair<K, V>>() {
            @Override
            public int compare(Pair<K, V> p1, Pair<K, V> p2) {
                return p1.getKey().compareTo(p2.getKey());
            }
        };
        quickSort(array, 0, array.length - 1, defaultComparator);
    }
        private static <K extends Comparable<K>, V> void quickSort(Pair<K, V>[] array, int low, int high, Comparator<Pair<K, V>> comparator) {
            if (low < high) {
                int pivotIndex = partition(array, low, high, comparator);
                quickSort(array, low, pivotIndex - 1, comparator);
                quickSort(array, pivotIndex + 1, high, comparator);
            }
        }

        private static <K extends Comparable<K>, V> int partition(Pair<K, V>[] array, int low, int high, Comparator<Pair<K, V>> comparator) {
            Pair<K, V> pivot = array[high];
            int i = low - 1;
            for (int j = low; j < high; j++) {
                if (comparator.compare(array[j], pivot) <= 0) {
                    i++;
                    // 交换 array[i] 和 array[j]
                    Pair<K, V> temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            // 将枢轴元素放到正确的位置
            Pair<K, V> temp = array[i + 1];
            array[i + 1] = array[high];
            array[high] = temp;
            return i + 1;
        }

    public static void sortWithComparator(Person[] array, Comparator<Person> comparator) {
        Arrays.sort(array, comparator);
    }



}
    
