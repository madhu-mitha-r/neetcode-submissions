interface Shape {
    Shape clone();
}

class Rectangle implements Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle rect){
      this.width = rect.width;
      this.height = rect.height;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
}

class Square implements Shape {
    private int length;

    public Square(int length) {
        this.length = length;
    }

    public Square(Square sq){
        this.length = sq.length;
    }

    public int getLength() {
        return this.length;
    }

    @Override
    public Shape clone() {
        return new Square(this);
    }
}

class Test {
    public List<Shape> cloneShapes(List<Shape> shapes) {
        return shapes.stream().map((shape)->shape.clone()).collect(Collectors.toList());
    }
}
