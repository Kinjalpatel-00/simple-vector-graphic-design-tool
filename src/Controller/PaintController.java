package Controller;

import Model.IPaintModel;

import java.awt.*;

/** this is the controller of the project.
 * controller directs view, and call methods from model.
 */
public class PaintController implements IPaintController {
    private IPaintModel model;

    /** this is a constructor of a class.
     * @param model model class object
     */
    public PaintController(IPaintModel model) {
        this.model = model;
    }

    /** this is the method which calls the method from model class to draw the line.
     * @param k graphic object to draw the line.
     * @param x1 starting x position of a line.
     * @param y1 starting y position of a line.
     * @param x2 ending x position of a line.
     * @param y2 ending y position of a line.
     * @param c the color of the line.
     */
    @Override
    public void ControlDrawLine(Graphics k, int x1, int y1, int x2, int y2,Color c) {
        try {
            model.DrawLine(k,x1,y1,x2,y2,c);
        }
        catch (NumberFormatException e) {
        }
    }

    /** this is the method which calls the method from model class to draw the rectangle shape.
     * @param k graphic object to draw the rectangle shape.
     * @param x1 staring x position of a rectangle shape.
     * @param y1 staring y position of a rectangle shape.
     * @param x2 ending x position of a rectangle shape.
     * @param y2 ending y position of a rectangle shape.
     * @param c the color of the rectangle shape.
     */
    @Override
    public void ControlDrawRectangles(Graphics k, int x1, int y1, int x2, int y2, Color c) {
        try {
            model.DrawRectangles(k,x1,y1,x2,y2,c);
        }
        catch (NumberFormatException e) {
        }
    }

    /** this is the method which calls the method from model class to draw the ellipses shape.
     * @param k graphic object to draw the ellipses shape.
     * @param x1 staring x position of a ellipses shape.
     * @param y1 staring y position of a ellipses shape.
     * @param x2 ending x position of a ellipses shape.
     * @param y2 ending y position of a ellipses shape.
     * @param c the color of the ellipses shape.
     */
    @Override
    public void ControlDrawEllipses(Graphics k, int x1, int y1, int x2, int y2, Color c) {
        try {
            model.DrawEllipses(k,x1,y1,x2,y2,c);
        }
        catch (NumberFormatException e) {
        }
    }

    /** this is the method which calls the method from model class to draw the round rectangle shape.
     * @param k graphic object to draw round rectangle.
     * @param x1 staring x position of a round rectangle shape.
     * @param y1 staring y position of a round rectangle shape.
     * @param x2 ending x position of a round rectangle shape.
     * @param y2 ending y position of a round rectangle shape.
     * @param angleA the x angle of edge for shape.
     * @param angleB the y angle of edge for shape.
     * @param c the color of the round rectangle shape.
     */
    @Override
    public void ControlDrawRoundRect(Graphics k, int x1, int y1, int x2, int y2, int angleA, int angleB, Color c) {
        try{
            model.DrawRoundRect(k, x1, y1, x2, y2, angleA, angleB, c);
        }
        catch (NumberFormatException e) {

        }
    }

    /** this is the method which calls the method from model class to draw the dot.
     * @param k graphic object to draw a dot.
     * @param x1 staring x position of a dot.
     * @param y1 staring y position of a dot.
     * @param x2 ending x position of a dot.
     * @param y2 ending y position of a dot.
     * @param c the color of dot.
     */
    @Override
    public void ControlDrawDot(Graphics k, int x1, int y1, int x2, int y2, Color c) {
        try {
            model.DrawDot(k,x1,y1,x2,y2,c);
        }
        catch (NumberFormatException e) {
        }
    }
}
