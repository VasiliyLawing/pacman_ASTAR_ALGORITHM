package ch1.unit1


// To use something not built-in in Kotlin we should import it
// In this example we use two classes defined in a library called "toyGraphics".

// We import classes Graphic, Window and Pal16
import com.anysolo.toyGraphics.Graphics
import com.anysolo.toyGraphics.Pal16
import com.anysolo.toyGraphics.Window


fun main() {
    /*
    Here we create an object representing a window and assign it name "wnd".

    Term "object" means a value, but we call a value an object when we talk
    about something more complex that just a number. Something having an internal structure.

    "wnd" is object of Window class. Window is a class defined in ToyGraphics library to represent a window
    on the screen. An object and class are related like, for example, a name of a ship and model of that ship.
    */

    /*
    When we create an object we can pass some arguments.
    In this case arguments are width and height of the window.
    So, our window will be 800 x 600 pixels.
    */
    val wnd = Window(800, 600)

    // You can think about class Graphics like a smart pen.
    // We create an object of this class to draw on the window
    // we pass the window we want to draw on as an argument
    val gc = Graphics(wnd)

    /*
     Y axis goes from up to down
     X axis goes from left to right

     Objects usually have more then just one value inside.

     Below you can see we use function setColor and values innerWidth and innerHeight.

     Value 'color' exists inside any objects of class Graphics.
     Values 'width' and 'height' exist inside any object of class Window.

     You can access something inside object using dor notation like you can see below.

     If you write name of the object, for example "wnd", then "." and just wait for couple seconds, IDEA shows you
     everything you can use inside that object. Try it.
    */

    // Set width of the lines we draw.
    gc.setStrokeWidth(3)

    // You can use colors from simple VGA palette Pal16 like this
    gc.color = Pal16.blue
    gc.drawLine(0, 0, wnd.width-1, wnd.height-1)

    gc.color = Pal16.red
    gc.drawLine(0, wnd.height-1, wnd.width-1, 0)
}
