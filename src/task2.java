//Задача 2 : Напишите обобщенный метод printArray, который принимает массив любого типа и выводит его элементы на консоль.
import java.util.Arrays;

public class task2 {
    public static void main(String[] args){
            printArray(new int[]{2, 4, 6});
        }

        static void printArray(int[] arr) {
            Arrays.stream(arr).forEach(System.out::println);
        }
}
