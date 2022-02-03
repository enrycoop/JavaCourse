package OOP.Abstraction;

public class Abstractiontest {
    public static void main (String args[]){
        GraphicObject circle = new Circle();

        GraphicObject graphicObj;
        graphicObj = new GraphicObject() {
            @Override
            void draw() {

            }

            @Override
            void resize() {

            }
        };

        circle.draw();
        Circle circle2 = new Circle();
        circle2.draw();
    }
}
