/**
 * @author cj34920
 *         Date: 2018/01/18
 */
public class CommonTest {

    public static void main(String[] args) {
        int[] arr = new int[]{100, 89, 91, 76, 99, 1, 5, 4};
        choose4(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    //冒泡排序
    public static void maopao(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; i < j; j--) {
                if (arr[j] < arr[j - 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
            }
        }
    }

    public static void inser2(int[] arr) {
        int t, j = 0;
        for (int i = 1; i < arr.length; i++) {
            t = arr[i];
            for (j = i - 1; j >= 0 && arr[j] > t; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = t;
        }
    }

    //直接插入
    public static void insertSort(int array[]) {
        int i, j, t = 0;
        for (i = 1; i < array.length; i++) {
            t = array[i];
            for (j = i - 1; j >= 0 && t < array[j]; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = t;
        }
    }

    //选择排序
    public static void chooseSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;

                }
            }
            int tmp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = tmp;
        }
    }

    //快速排序
    private static void quick_sort(int[] arr, int low, int high) {
        // 解决和合并
        if (low <= high) {
            int mid = partition(arr, low, high);
            // 递归
            quick_sort(arr, low, mid - 1);
            quick_sort(arr, mid + 1, high);
        }

    }

    private static int partition(int[] arr, int low, int high) {
        // 分解
        int pivot = arr[high];
        int i = low - 1;
        int temp;
        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // 交换中间元素和privot
        temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;

    }

    //直接插入排序
    private static void insert(int[] arr) {
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            int minValue = arr[i];
            for (j = i - 1; j >= 0 && arr[j] > minValue; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = minValue;

        }
    }

    //直接插入排序
    public static void insert3(int[] arr) {
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            int minValue = arr[i];
            for (j = i - 1; j >= 0 && arr[j] > minValue; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = minValue;
        }
    }

    //选择排序
    public static void choose4(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }
    }
}
