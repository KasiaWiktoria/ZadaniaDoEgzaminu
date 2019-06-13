/*
W pewnym programie zdefiniowano obiekt typu JTextField oraz kontener
typu ArrayList:
...
JTextField dxAsText = new JTextField(”0.0, 1.0, 2.0” );
ArrayList<Double> dx = new ArrayList<>();
...
Proszę dopisać fragment kodu, który zapewni wypełnienie kontenera dx po wypełnieniu
pola dxAsTexti naciśnięciu klawisza Enter. Kontener ma zawierać wszystkie liczby
poprawnie wpisane w pole tekstowe (klasa ArrayList ma metodę clear(), która usuwa
wszystkie elementy, co pozwala przygotować kontener). Wpisanie niepoprawnej wartości w
to pole nie powinno prowadzić do błędu w programie
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import static com.sun.glass.ui.Cursor.setVisible;

public class dxAsText {

    JTextField dxAsTest = new JTextField("0.0, 1.0, 2.0");
    ArrayList<Double> dx = new ArrayList<>();


    public void JTextFieldToArrayList() {

        dxAsTest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] tmp = dxAsTest.getText().split(", ");
                for (int i = 0; i < tmp.length; i++) {
                    try {
                        dx.add(Double.parseDouble(tmp[i]));
                    } catch (NumberFormatException f) {
                        System.out.print("Zczytano nieprawidłową wartość na pozycji " + (i + 1) + "\n");
                    }
                }
            }
        });
    }
}
