import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        int[] numArray = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        // Triangle tri = new Triangle(10,true);
        // Triangle tri2 = new Triangle(10,true);
        // Square sqr = new Square(5,true);
        // Diamond dia = new Diamond(10, true);
        // Shape[] shapes = new Shape[] {tri,sqr,dia,new Diamond(10, true)};
        // for (int i = 0; i < shapes.length; i++) {
        //     if (shapes[i] == dia) {
        //         ((Diamond)shapes[i]).thing();
        //     }
        //     else {
        //         shapes[i].draw();
        //     }
        // }
        // tri2.draw();

        System.out.println(fibonnacci(7));
        System.out.println(factorial(3));
        System.out.println(binarySearch(numArray,11));
        
        //System.out.println(Triangle.x);
    }

    public static int fibonnacci(int num) {
        int newNum;
        if (num == 1 || num == 2) {
            return 1;
        }
        else {
            newNum = fibonnacci(num - 2) +(fibonnacci(num - 1));
            return newNum;
        }

    }

    public static int factorial(int num) {
        int newNum;
        if (num == 1) {
            return 1;
        }
        else {
            newNum = factorial(num - 1) * num;
            return newNum;
        }
        
    }

    public static boolean binarySearch(int[] nums, int pos) {
        int newPos;
        int start = 0;
        int end = nums.length - 1;

        while (true) {
            newPos = (start + end + 1)/2;
            if (newPos > pos) {
                end = newPos;
                System.out.println(start);
                System.out.println(end);
            }
            else if (start == end && pos == end) {
                return true;
            }
            else if (start == end && pos != end) {
                return false;
            }
            else {
                System.out.println(start);
                System.out.println(end);
                start = newPos - 1;
            }
        }
    }
}
