package Main;

import Controller.*;
import Model.*;
import View.PaintView;

/** The vector graphic design tool.
 * this is the main class of the MVC project.
 */
public class MVCMain {
    /** main method of the MVC programme.
     * this main method creates the model and pass it to the controller.
     * the view will uses model and controller to run the programme.
     * @param args no user input is required to run the programme.
     */
    public static void main(String args[]) {
        // creates the new model
        IPaintModel model = new PaintModel();

        //carets the controller and passes the model.
        IPaintController controller = new PaintController(model);

        //new view will passes both controller and model.
        new PaintView(model, controller);
    }
}
