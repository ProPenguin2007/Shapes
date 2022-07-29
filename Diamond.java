public class Diamond extends Shape{
    
    public Diamond(int Size,boolean Hollow) {
        super(Size * 2 + 1,Hollow);
    }

    public void draw() {
        System.out.println("");
        if (!hollow) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (( j > size/2 - i && j < size/2 + i) && i <= size/2) {
                        System.out.print("*");
                    }
                    else if (i > size/2 && ( j < size - i + size/2 - 1 && j > i - size/2)) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print("-");
                    }
                }
                System.out.print("\n");
            }
        }
        else {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (( j == size/2 - i || j == size/2 + i) && i <= size/2) {
                        System.out.print("*");
                    }
                    else if (i > size/2 && ( j == size - i + size/2 - 1 || j == i - size/2)) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print("-");
                    }
                }
                System.out.print("\n");
            }
        }
        super.draw();
        System.out.println();
    }

    public static String name() {
        return "Diamond";
    }

    public void thing() {
        System.out.println("this is a diamond");
    }
}
