package com.dnivra26;

public class Rectangle {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 6);
        System.out.println(rectangle.getArea());
        Square square = new Square(4);
        square.setHeight(5);
        System.out.println(square.getArea());

        Rectangle re = new Square(4);
        re.setWidth(4);
        re.setHeight(5);
        //assert this to be 20

    }


}

class Square extends Rectangle {

    public Square(int side) {
        super(side, side);
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width;
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
        this.width = height;
    }
}



