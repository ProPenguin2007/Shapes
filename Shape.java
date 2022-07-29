public class Shape {

    public int size;
    public boolean hollow;
    public int sides = 3;

    public Shape(int Size,boolean Hollow) {
        size = Size;
        hollow = Hollow;
    }

    public void draw() {
        for (int l = 0; l < size - 4;l++) {
            System.out.print("*");
            if ((size- 5)/2 == l) {
                System.out.print("Done");
            }
        }
        return;
    }

    public static String name() {
        return "Shape";
    }

}