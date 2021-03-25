package View;

import Controller.IPaintController;
import Model.IPaintModel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Observable;
import java.util.Observer;


/** the GUI(view) of the project.
 * the class connects with user and take input and acts accordingly.
 */
public class PaintView extends JPanel implements Observer, ActionListener {

    //variables declaration of interfaces.
    private IPaintModel model;
    private IPaintController controller;

    //variables declaration of GUI components.
    private JFrame mainWindow;
    private JPanel PaintMainFrame;
    private JToolBar toolset;
    private JButton line;
    private JButton rect;
    private JButton ellipses;
    private JButton roundRect;
    private JButton circle;
    private JButton dot;
    private JButton clear;
    private JButton selectColor;
    private JButton changeBackGroundColor;
    private Color c, selectColorBox;

    //static variables declaration.
    private final static int DEFAULT_FRAME_WIDTH = 1000;
    private final static int DEFAULT_FRAME_HEIGHT = 500;
    private int toolNumber;
    protected static String BUTTON_LINE = "Draw Line";
    protected static String BUTTON_RECT = "Draw Rectangle";
    protected static String BUTTON_ELLI = "Draw Ellipses";
    protected static String BUTTON_ROUND_RECT = "Draw Round Rectangle";
    protected static String BUTTON_CIRCLE = "Draw Circle";
    protected static String BUTTON_DOT = "Draw Dot";
    protected static String BUTTON_CLEAR = "Clear Canvas";
    protected static String BUTTON_CHANGE_BG_COLOR = "Change Background Color";
    private int x1, y1, x2, y2;

    /** the constructor of the class.
     * @param model model object tp access public methods of model interface.
     * @param controller controller object to access public methods of controller interface.
     */
    public PaintView (IPaintModel model, IPaintController controller) {
        this.model = model;
        this.controller = controller;
        // creates the new JFrame and set title for it.
        mainWindow = new JFrame("Simple Vector Drawing Tool");
        PaintMainFrame = new JPanel(); //creates the new JPanel(canvas to draw)
        toolset = new JToolBar(); // creates the new toolbar for buttons.
        setUpGUIComponents();
    }

    /** method to set up the GUI components.
     *
     */
    public void setUpGUIComponents() {
        mainWindow.setLayout(new BorderLayout());
        mainWindow.setSize(DEFAULT_FRAME_WIDTH, DEFAULT_FRAME_HEIGHT);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setVisible(true);
        mainWindow.getContentPane().add(toolset, BorderLayout.NORTH);
        mainWindow.getContentPane().add(PaintMainFrame, BorderLayout.CENTER);
        addToolbarElements();
        addActionListenerForButtons(this);
        ((Observable) model).addObserver(this);
        mouseActions();
    }

    /** method to add the GUI components(JButtons) to the toolbar.
     *
     */
    private void addToolbarElements() {
        toolset.setLayout(new FlowLayout(FlowLayout.CENTER));
        //creates the new JButtons and add the text to it
        line = new JButton(BUTTON_LINE);
        rect = new JButton(BUTTON_RECT);
        ellipses = new JButton(BUTTON_ELLI);
        roundRect = new JButton(BUTTON_ROUND_RECT);
        circle = new JButton(BUTTON_CIRCLE);
        dot = new JButton(BUTTON_DOT);
        clear = new JButton(BUTTON_CLEAR);
        changeBackGroundColor = new JButton(BUTTON_CHANGE_BG_COLOR);
        selectColor = new JButton("SelectColor");

        //add buttons to toolbar.
        toolset.add(selectColor);
        toolset.add(changeBackGroundColor);
        toolset.add(dot);
        toolset.add(line);
        toolset.add(rect);
        toolset.add(roundRect);
        toolset.add(ellipses);
        toolset.add(circle);
        toolset.add(clear);
    }

    /** Method to add the action listener fot buttons.
     * @param al
     */
    public void addActionListenerForButtons(ActionListener al) {
        line.addActionListener(al);
        rect.addActionListener(al);
        ellipses.addActionListener(al);
        roundRect.addActionListener(al);
        dot.addActionListener(al);
        circle.addActionListener(al);
        changeBackGroundColor.addActionListener(al);
        clear.addActionListener(al);
        selectColor.addActionListener(al);
    }

    /** method to monitor the mouse action and let user to draw on canvas.
     *
     */
    private void mouseActions() {
        PaintMainFrame.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                x1 = e.getX();
                y1 = e.getY();
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                x2 = e.getX();
                y2 = e.getY();
                drawShapes(PaintMainFrame.getGraphics(), x1, y1, x2, y2); //draw the shape on mouse released
                repaint();
            }
        });
    }

    /** method which calls the draw methods from controller to draw the shapes.
     * toolnumber - to checks which shape method to call from controller.
     * @param g graphic object to draw the shape.
     * @param x1 starting x position of a shape.
     * @param y1 starting y position of a shape.
     * @param x2 ending x position of a shape.
     * @param y2 ending y position of a shape.
     */
    private void drawShapes(Graphics g, int x1, int y1, int x2, int y2) {
        if (toolNumber == 1) {
            controller.ControlDrawLine(g, x1, y1, x2, y2, c);
        }
        else if (toolNumber == 2) {
            controller.ControlDrawRectangles(g, x1, y1, x2, y2, c);
        }
        else if (toolNumber == 3) {
            controller.ControlDrawEllipses(g, x1, y1, x2, y2, c);
        }
        else if (toolNumber == 4) {
            controller.ControlDrawRoundRect(g, x1, y1, x2, y2,40, 40, c);
        }
        else if (toolNumber == 5) {
            controller.ControlDrawEllipses(g, x1, y1, 100, 100, c);
        }
        else if (toolNumber == 6) {
            controller.ControlDrawDot(g, x1, y1, 5, 5, c);
        }
    }

    /** action performed method when any button is clicked.
     * toolnumber - so the drawShapes() method can calls the correct method from controller to draw the shape.
     * @param e action event of the button.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        toolNumber = 0;
        if (e.getSource() == line) {
            c = selectColorBox;
            toolNumber = 1;
        }
        else if (e.getSource() == rect) {
            c = selectColorBox;
            toolNumber = 2;
        }
        else if (e.getSource() == ellipses) {
            c = selectColorBox;
            toolNumber = 3;
        }
        else if (e.getSource() == roundRect) {
            c = selectColorBox;
            toolNumber = 4;
        }
        else if (e.getSource() == circle) {
            c = selectColorBox;
            toolNumber = 5;
        }
        else if (e.getSource() == dot) {
            c = selectColorBox;
            toolNumber = 6;
        }
        else if (e.getSource() == clear) {
            mainWindow.repaint();
        }
        else if (e.getSource() == selectColor) {
            // opens the color box to let user select the color.
            selectColorBox = JColorChooser.showDialog(this,  "Chose the Color and Select the shape again", Color.white);
        }
        else if (e.getSource() == changeBackGroundColor) {
            // opens the color box to let user select the color.
            selectColorBox = JColorChooser.showDialog(this,  "Chose the Color for BackGround", Color.white);
            PaintMainFrame.setBackground(selectColorBox);
        }
    }

    /** method which gets called everytime model(observable) notify its view(observer).
     * @param o argument not being used
     * @param arg argument not being used
     */
    @Override
    public void update(Observable o, Object arg) {
        SwingUtilities.invokeLater(
                new Runnable() {
                    public void run() {
                        //to get all previous graphics after drawing new one.
                        PaintMainFrame.getGraphics();
                    }
                });
    }
}
