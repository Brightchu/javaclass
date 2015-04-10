public class DrawARectangle
{
    public static void main(String[] args)
    {
       // TODO: your code here
        Rectangle box = new Rectangle(60, 90, 20, 30);
        Rectangle box2 = new Rectangle(60, 90, 20, 30); 
        box.draw();
        box2.draw();
        box2.translate(20, 30);
    }
}