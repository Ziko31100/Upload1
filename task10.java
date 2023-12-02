package ProjectHw;

public class task10 {

    public static void main(String[] args) {
        String[] arr = {"Apple", "Banana", "Orange", "Banana", "Apple", "Cherry", "Orange"};

        System.out.println("Duplicate elements in the array :");

        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {

                if (arr[i].equalsIgnoreCase(arr[j])) {
                    System.out.println(arr[i]);

                }
            }
        }
    }
}
