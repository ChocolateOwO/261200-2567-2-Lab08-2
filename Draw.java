class Draw extends Thread {
    private Turtle turtle;
    private int id;
    
    public Draw(int id, double x, double y, String color) {
        this.id = id;
        this.turtle = new Turtle(x, y);
        this.turtle.penColor(color); // กำหนดสีจาก Main.java
        turtle.speed(1);
    }

    @Override
    public void run() {
        switch (id) {
            case 1 -> drawLeaf();
            case 2 -> drawStick();
        }
    }

    private void drawLeaf() {
        turtle.down();
        turtle.width(100);
        turtle.left(45);
        turtle.forward(200);
        turtle.left(150);
        turtle.forward(100);
        turtle.right(130);
        turtle.forward(150);
        turtle.left(130);
        turtle.forward(100);
        turtle.right(100);
        turtle.forward(100);
        turtle.up();
        turtle.home();
        
        turtle.down();
        turtle.left(135);
        turtle.forward(200);
        turtle.right(150);
        turtle.forward(100);
        turtle.left(130);
        turtle.forward(150);
        turtle.right(130);
        turtle.forward(100);
        turtle.left(96.5);
        turtle.forward(100);
    }

    private void drawStick() {
        turtle.width(20);

        turtle.left(90);
        turtle.up();
        turtle.forward(40);
        turtle.right(45);
        turtle.down();
        turtle.forward(70);

        turtle.up();
        turtle.setPosition(0, 40);
        turtle.down();
        turtle.left(45);
        turtle.forward(70);

        turtle.up();
        turtle.setPosition(0, 110);
        turtle.down();
        turtle.right(45);
        turtle.forward(30);

        turtle.up();
        turtle.setPosition(0, 110);
        turtle.down();
        turtle.left(45);
        turtle.forward(30);

        turtle.up();
        turtle.setPosition(0, 160);
        turtle.down();
        turtle.left(45);
        turtle.forward(50);

        turtle.up();
        turtle.setPosition(0, 160);
        turtle.down();
        turtle.right(45);
        turtle.forward(50);

        turtle.up();
        turtle.setPosition(0, 0);
        turtle.right(180);
        turtle.down();
        turtle.forward(200);


    }
}
