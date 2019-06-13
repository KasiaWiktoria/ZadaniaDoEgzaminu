/*
W pewnym programie zdefiniowano obiekt typu JButton oraz kontener typu

        ArrayList:
        ...
        JButton clearButton = new JButton(”Clear” );
        ArrayList<Figure> picture = new ArrayList<>();
        ...
        Proszę dopisać fragment kodu, który zapewni wyczyszczenie kontenera picture po
        kliknięciu myszą na guziku clearButton. Klasa ArrayList ma metodę clear(),
        która usuwa wszystkie elementy.
*/

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Figure {

    JButton clearButton = new JButton("Clear");
    ArrayList<Figure> picture = new ArrayList<>();

    {
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                picture.clear();
            }
        });
    }
}
