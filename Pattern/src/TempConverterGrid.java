import java.awt.*;
import java.awt.event.*;

public class TempConverterGrid {
    public static void main(String[] args) {
        Frame f = new Frame("Temperature Converter");
        f.setLayout(new GridLayout(4, 2, 5, 5)); // fewer rows, smaller gaps

        Label l1 = new Label("Celsius:");
        Label l2 = new Label("Fahrenheit:");
        TextField tCelsius = new TextField();
        TextField tFahrenheit = new TextField();
        TextField tResult = new TextField();

        Button toFahrenheit = new Button("To Fahrenheit");
        Button toCelsius = new Button("To Celsius");

        // Add components row-wise
        f.add(l1); f.add(tCelsius);
        f.add(l2); f.add(tFahrenheit);
        f.add(toFahrenheit); f.add(toCelsius);
        f.add(new Label("Result:")); f.add(tResult);

        f.setSize(400, 300);
        f.setVisible(true);

        // Action Listeners
        toFahrenheit.addActionListener(e -> {
            int c = Integer.parseInt(tCelsius.getText());
            int fTemp = (c * 9 / 5) + 32;
            tResult.setText("Fahrenheit: " + fTemp);
        });

        toCelsius.addActionListener(e -> {
            int fVal = Integer.parseInt(tFahrenheit.getText());
            double cTemp = (fVal - 32) * 5.0 / 9;
            tResult.setText("Celsius: " + cTemp);
        });
    }
}
