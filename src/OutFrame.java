import javafx.scene.Group;
import javafx.scene.Scene;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.text.Element;
import javax.swing.text.html.ImageView;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.text.AttributedCharacterIterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OutFrame  {

    static public void printPhotoOfBirthMan(Person p) {

        JFrame photoOfBirthMan = new JFrame();
        photoOfBirthMan.setVisible(true);
        photoOfBirthMan.setTitle("Look at the hero of the day: " + p.getName());
        photoOfBirthMan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        photoOfBirthMan.setBounds(dimension.width / 2 - 250, dimension.height / 2 - 250, 500, 500);

        JLabel label = new JLabel();
        photoOfBirthMan.add(label);















    }


}














