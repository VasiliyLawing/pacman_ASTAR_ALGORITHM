package ch1.s1


// To use something not built-in in Kotlin we should import it
// In this example we use two classes defined in a library called "toyGraphics".

// We import classes Graphic and Window
import com.anysolo.toyGraphics.Graphics
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
    So, our window will be 1920 x 1080 pixels.
    */
    val wnd = Window(1920, 1080)

    // You can think about class Graphics like a smart pen.
    // We create an object of this class to draw on the window
    // we pass the window we want to draw on as an argument
    val gc = Graphics(wnd)

    /*
     Y axis goes from up to down
     X axis goes from left to right

     Objects usually have more then just one value inside.

     Below you can see we use function setColor and values innerWidth and innerHeight.

     Function setColor exists inside class Graphics.
     Values innerWidth and innerHeight exist inside class Window.

     Any object of a class contains everything its class contains. Class is like a template for creation of objects.

     You can access something inside class using dor notation like you can see below.

     If you write name of the object, for example "wnd", then "." and just wait for couple seconds, IDEA shows you
     everything you can use inside that object. Try it.

     wnd.innerWidth and wnd.innerHeight contain width and height of the
     inner window area. Inner area does not include window title. This is space available
     for your drawings.
    */

    // Set width of the lines we draw.
    gc.setStroke(3.0)

    // You can use colors from simple VGA palette like Int numbers 0 .. 15
    gc.setColor(1)
    gc.drawLine(0, 0, wnd.innerWidth-1, wnd.innerHeight)

    gc.setColor(4)
    gc.drawLine(0, wnd.innerHeight-1, wnd.innerWidth-1, 0)
}
