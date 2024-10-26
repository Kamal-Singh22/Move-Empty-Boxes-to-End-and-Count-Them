import java.util.Arrays;

public class MoveEmptyBoxes {
    public static int moveEmptyBoxesToEnd(int[] boxes) {
        int count = 0;
        int index = 0;
        
        // Move non-zero elements to the front
        for (int i = 0; i < boxes.length; i++) {
            if (boxes[i] != 0) {
                boxes[index++] = boxes[i];
            } else {
                count++;
            }
        }
        
        // Fill remaining positions with zeroes
        while (index < boxes.length) {
            boxes[index++] = 0;
        }
        
        return count;
    }

    public static void main(String[] args) {
        int[] boxes = {1, 0, 2, 0, 3, 4, 0, 5};
        int emptyBoxCount = moveEmptyBoxesToEnd(boxes);
        System.out.println("Updated Boxes Array: " + Arrays.toString(boxes));
        System.out.println("Count of Empty Boxes: " + emptyBoxCount);
    }
}
