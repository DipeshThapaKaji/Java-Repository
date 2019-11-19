/**
 * Dipesh Thapa
 * CSCI 295
 * HW 9
 *
 */
public class Rectangle {

    private int width;
    private int height;

    public Rectangle() {
        width = 1;
        height = 1;

    }

    public Rectangle(int initialWidth, int initialHeight) {
        width = initialWidth;
        height = initialHeight;
    }

// Returns the value of the instance variable width
    public int getWidth() {
        return width;
    }

// Returns the value of the instance variable Height
    public int getHeight() {
        return height;
    }

    //Sets the instance variable width to the specified vaule
    public void setWidth(int newWidth) {
        width = newWidth;
    }

//Sets the instance variable Height to the specified vaule
    public void setHeight(int newHeight) {
        width = newHeight;
    }

    public void set(int newWidth, int newHeight) {
        width = newWidth;
        height = newHeight;
    }

    //calculates  area of the rectangle
    public int area() {
        return width * height;
    }

   
    public int perimeter() {
        return 2 * (width) +2 * (height);

    }

    public boolean isSquare() {
        return height == width;
    }

    @Override
    public String toString() {
        return "Rectangle ( width: " + width + " ," + "height: " + height + " )";
    }

    public static void main(String[] args) {
        Rectangle a = new Rectangle(2, 4);
        //  Rectangle b = new Rectangle(2,3);
        System.out.println(a.area());
        // System.out.println(b.area());

    }

}
