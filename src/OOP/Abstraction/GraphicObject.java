package OOP.Abstraction;

public abstract class GraphicObject {
    int x,y;

    public GraphicObject(){
        System.out.println("Abstract constructor...");
    }

    void moveTo(int newX, int newY){
        System.out.println("moving to x: "+x+" and y: "+y); 
    }

    abstract void draw();
    abstract void resize();
}
