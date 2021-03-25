package Controller;

import java.awt.*;

/** this is the interface of the controller class.
 *
 */
public interface IPaintController {
    /** calls the draw line method from model.
     * @param k graphic object to draw the line.
     * @param x1 starting x position of a line.
     * @param y1 starting y position of a line.
     * @param x2 ending x position of a line.
     * @param y2 ending y position of line.
     * @param c the color of a line.
     */
    void ControlDrawLine(Graphics k, int x1, int y1, int x2, int y2, Color c);

    /** calls the draw rectangle method from model.
     * @param k graphic object to draw the rectangle shape.
     * @param x1 starting x position of a rectangle shape.
     * @param y1 starting y position of a rectangle shape.
     * @param x2 ending x position of rectangle shape.
     * @param y2 ending y position of rectangle shape.
     * @param c the color of a rectangle shape.
     */
    void ControlDrawRectangles(Graphics k, int x1, int y1, int x2, int y2, Color c);

    /** calls the draw ellipses method from model.
     * @param k graphic object to draw the ellipses shape.
     * @param x1 starting x position of a ellipses shape.
     * @param y1 starting y position of a ellipses shape.
     * @param x2 ending x position of ellipses shape.
     * @param y2 ending y position of ellipses shape.
     * @param c the color of ellipses shape.
     */
    void ControlDrawEllipses(Graphics k, int x1, int y1, int x2, int y2, Color c);

    /** calls the draw round rectangle method from model.
     * @param k graphic object to draw the round rectangle shape.
     * @param x1 starting x position of a round rectangle shape.
     * @param y1 starting y position of a round rectangle shape.
     * @param x2 ending x position of a round rectangle shape.
     * @param y2 ending y position of a round rectangle shape.
     * @param c the color of the round rectangle shape.
     * @param angleA the x angle of edge for shape.
     * @param angleB the y angle of edge for shape.
     */
    void ControlDrawRoundRect(Graphics k, int x1, int y1, int x2, int y2, int angleA, int angleB, Color c );

    /** calls the draw dot method from model.
     * @param k graphic object to draw the dot.
     * @param x1 starting x position of a dot.
     * @param y1 starting y position of a dot.
     * @param x2 ending x position of a dot.
     * @param y2 ending y position of a dor.
     * @param c the color of a dot.
     */
    void ControlDrawDot(Graphics k, int x1, int y1, int x2, int y2, Color c);

}
