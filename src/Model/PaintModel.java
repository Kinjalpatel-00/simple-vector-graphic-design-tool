package Model;

import java.awt.*;

import java.util.Observable;

/** The model class of the application.
 *
 */
public class PaintModel extends Observable implements IPaintModel {

    /** method to create the line and set the color of the line.
     * @param g graphic object to draw the line.
     * @param x1 starting x position of a line.
     * @param y1 starting y position of a line.
     * @param x2 ending x position of a line.
     * @param y2 ending y position of a line.
     * @param c the color of the line.
     */
    @Override
    public void DrawLine(Graphics g, int x1, int y1, int x2, int y2, Color c) {
        g.setColor(c);
        g.drawLine(x1, y1, x2, y2);
        update();
    }

    /** method to create the rectangle shape and set the color of the shape.
     * @param g graphic object to draw the rectangle shape.
     * @param x1 starting x position of a rectangle shape.
     * @param y1 starting y position of a rectangle shape.
     * @param x2 ending x position of a rectangle shape.
     * @param y2 ending y position of a rectangle shape.
     * @param c the color of the rectangle shape.
     */
    @Override
    public void DrawRectangles(Graphics g, int x1, int y1, int x2, int y2, Color c) {
        g.setColor(c);
        g.drawRect(x1, y1, x2, y2);
        update();
    }

    /** method to create the ellipses shape and set the color of the shape.
     * @param g graphic object to draw the ellipses shape.
     * @param x1 starting x position of a ellipses shape.
     * @param y1 staring y position of a ellipses shape.
     * @param x2 ending x position of a ellipses shape.
     * @param y2 ending y position of a ellipses shape.
     * @param c the color of the ellipses shape
     */
    @Override
    public void DrawEllipses(Graphics g, int x1, int y1, int x2, int y2, Color c) {
        g.setColor(c);
        g.drawOval(x1, y1, x2, y2);
        update();
    }

    /** method to create the round rectangle shape and set the color of the shape.
     * @param g graphic object to draw the round rectangle shape.
     * @param x1 starting x position of a round rectangle shape.
     * @param y1 starting x position of a round rectangle shape.
     * @param x2 starting x position of a round rectangle shape.
     * @param y2 starting x position of a round rectangle shape.
     * @param angleA the x angle of edge for shape.
     * @param angleB the y angle of edge for shape.
     * @param c the color of the round rectangle shape.
     */
    @Override
    public void DrawRoundRect(Graphics g, int x1, int y1, int x2, int y2, int angleA, int angleB, Color c) {
        g.setColor(c);
        g.drawRoundRect(x1, y1, x2, y2, angleA, angleB);
    }

    /** method creates the dot and set the color of it.
     * @param g graphic object to draw the dot.
     * @param x1 staring x position of dot.
     * @param y1 staring y position of dot.
     * @param x2 ending x position of dot.
     * @param y2 ending y position of dot.
     * @param c the color of the dot.
     */
    @Override
    public void DrawDot(Graphics g, int x1, int y1, int x2, int y2, Color c) {
        g.setColor(c);
        g.fillOval(x1, y1, x2, y2);
    }

    /** this method notify the observer(view).
     *
     */
    private void update() {
        this.setChanged();
        this.notifyObservers();
    }
}
