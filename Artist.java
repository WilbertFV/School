public abstract class Artist {

    public abstract void draw();

    public static void main(String[] args) {
        Square s1 = new Square();
        Circle c1 = new Circle();
        Triangle t1 = new Triangle();

        s1.draw();
        c1.draw();
        t1.draw();
    }
}

class Square extends Artist {

    @Override
    public void draw() {
        System.out.println("The artist drew 4 equal sides at 90 degrees");
    }
}

class Circle extends Artist {

    @Override
    public void draw() {
        System.out.println("The artist drew a 360 degrees perfect circle");
    }
}

class Triangle extends Artist {

    @Override
    public void draw() {
        System.out.println("The artist drew 3 sides with 180 degrees");
    }
}
