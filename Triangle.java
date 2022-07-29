public class Triangle extends Shape{

    
    public Triangle(int Size,boolean Hollow) {
        super(Size, Hollow);
    }

    public void draw() {
        System.out.println("");
        if (hollow) {
            for (int i = 1; i < size + 1; i++) {
                for (int j = 0; j < i; j++) {
                    if (j > 0 && j < i - 1 && i > 1 && i < size) {
                        System.out.print("-");
                    }
                    else {
                        System.out.print("*");
                    }
                }
                System.out.print("\n");
            }
        }
        else {
            for (int i = 1; i < size + 1; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        }
        super.draw();
        System.out.println();
    }

    public static String name() {
        return "Triangle";
    }
}
