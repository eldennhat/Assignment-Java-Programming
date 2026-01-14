package Bai6;
import java.util.HashSet;

public class Test6 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 7, 5, 2};
        HashSet<Integer> so = new HashSet<>();
        System.out.println("Adding element");
        for (int num : numbers) {
            so.add(num);
        }
        //3.
        System.out.println("Elements in a HashSet: " + so);
        //4. Explain code
        /*
        HashSet KHÔNG đảm bảo thứ tự chèn (insertion order).
         Nó lưu trữ các phần tử dựa trên cơ chế Băm (Hashing).
         Vị trí của mỗi phần tử trong bộ nhớ được quyết định bởi mã băm (hashCode)
         của phần tử đó, giúp việc tìm kiếm và thêm mới cực nhanh, nhưng đổi lại là mất đi thứ tự sắp xếp ban đầu.
         */
    }
}
