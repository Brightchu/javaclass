// BlueJ project: lesson2/crate

// Draw a crate by combining a rectangle with five lines.
//
// The front face is a rectangle with top left corner (20, 30), 
// width 100, and height 40. 
//
// A diagonal line goes from the face's top left corner  to (50, 10). 
// Another diagonal line goes from the face's bottom right corner 
// to (150, 50).
// A third diagonal starts at the face's top right corner and is
// parallel to the others.
// The fourth and fifth line join the end points of the diagonals.
//
// Before programming, get out a pen and draw the crate on a
// sheet of paper! Label each of the points with their coordinates.
//
// Also, don't forget to call draw() on your rectangle and line objects.

public class DrawACrate
{
    public static void main(String[] args)
    {
		// create a Rectangle
        Rectangle face = new Rectangle(20, 30, 100, 40);  
        face.draw();
		
		// create a Line
        Line line1 =new Line(20,30,50,10);                
        line1.draw();
		Line line2 =new Line(20+100,30,50+100,10);
        line2.draw();
		Line line3 =new Line(50+100,10,50,10);
        line3.draw();
		Line line4 =new Line(50+100,10,150,50);
        line4.draw();
		Line line5 =new Line(20+100,30+40,150,50);
        line5.draw();
		
		// create text
		Text topSecret= new Text(20,30,"TOP SECRET");
		topSecret.draw();	

		// color intro
		Rectangle box = new Rectangle(60, 120, 20, 30);
        Rectangle box2 = new Rectangle(80, 150, 20, 30);
        box.draw();
        box2.draw();
       
	    //set the color by RGB
        box.setColor(new Color(255, 0, 0));
        box.draw();
        box2.setColor(new Color(0, 255, 0));
        box2.fill();
		
		Line redLine= new Line(60 ,200,100,200);
		//set as the Defined color
		redLine.setColor(Color.RED);
		redLine.draw();
		
		//Translate, getWidth, getX in Rectangle
		//Rectangle box3=new Rectangle(80, 150, 20, 30);
		Rectangle box3=box2;
		box3.translate(25,25);
		box3.draw();
		System.out.println("box width is "+box3.getWidth()+" \nbox X coordinate is "+box3.getX());
		box2.fill();
    }
}
