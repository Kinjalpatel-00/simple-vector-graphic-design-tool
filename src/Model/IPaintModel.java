package Model;

import java.awt.*;

/** the interface of the model class.
 *
 */
public interface IPaintModel {
    /** method to draws the line.
     * @param k graphic object to draw the line.
     * @param x1 starting x position of a line.
     * @param y1 starting y position of a line.
     * @param x2 ending x position of a line.
     * @param y2 ending y position of a line.
     * @param c the color of the line.
     */
    void DrawLine(Graphics k, int x1, int y1, int x2, int y2, Color c );

    /** method to draw the rectangle shape.
     * @param k graphic object to draw the rectangle shape.
     * @param x1 starting x position of a rectangle shape.
     * @param y1 starting y position of a rectangle shape.
     * @param x2 ending x position of a rectangle shape.
     * @param y2 ending y position of a rectangle shape.
     * @param c the color of the rectangle shape.
     */
    void DrawRectangles(Graphics k, int x1, int y1, int x2, int y2, Color c);

    /** method to draw the ellipses shape.
     * @param k graphic object to draw the ellipses shape.
     * @param x1 starting x position of a ellipses shape.
     * @param y1 starting y position of a ellipses shape.
     * @param x2 ending x position of a ellipses shape.
     * @param y2 ending y position of a ellipses shape.
     * @param c the color of the ellipses shape.
     */
    void DrawEllipses(Graphics k, int x1, int y1, int x2, int y2, Color c);

    /** method to draw the round rectangle shape.
     * @param k graphic object to draw the round rectangle shape.
     * @param x1 starting x position of a round rectangle shape.
     * @param y1 starting y position of a round rectangle shape.
     * @param x2 ending x position of a round rectangle shape.
     * @param y2 ending y position of a round rectangle shape.
     * @param angleA the x angle of edge for shape.
     * @param angleB the y angle of edge for shape.
     * @param c the color of the round rectangle shape.
     */
    void DrawRoundRect(Graphics k, int x1, int y1, int x2, int y2, int angleA, int angleB, Color c);

    /** method to draw the dot.
     * @param k graphic object to draw dot.
     * @param x1 starting x position of a dot.
     * @param y1 starting y position of a dot.
     * @param x2 ending x position of a dot.
     * @param y2 ending y position of a dot.
     * @param c color of the dot.
     */
    void DrawDot(Graphics k, int x1, int y1, int x2, int y2, Color c);

}
