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
        System.out.println("This is the implementation of the Square");
    }
}

class Circle extends Artist {

    @Override
    public void draw() {
        System.out.println("This is the implementation of the Circle");
    }
}

class Triangle extends Artist {

    @Override
    public void draw() {
        System.out.println("This is the implementation of the Triangle");
    }
}
