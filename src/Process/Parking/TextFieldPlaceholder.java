package Process.Parking;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.border.AbstractBorder;

public class TextFieldPlaceholder {

    public TextFieldPlaceholder(JTextField textField, String placeholder) {
        textField.setText(placeholder);
        textField.setForeground(Color.GRAY);

        // 👉 Viền bo góc tròn (chỉ viền, không tô màu nền)
//        textField.setBorder(new RoundLineBorder(20, Color.LIGHT_GRAY, 2));
        textField.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 2));

        textField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (textField.getText().equals(placeholder)) {
                    textField.setText("");
                    textField.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (textField.getText().isEmpty()) {
                    textField.setText(placeholder);
                    textField.setForeground(Color.GRAY);
                }
            }
        });
    }
}

    // 👉 Custom border có viền bo góc, không tô nền
//    class RoundLineBorder extends AbstractBorder {
//        private final int radius;
//        private final Color color;
//        private final int thickness;
//
//        public RoundLineBorder(int radius, Color color, int thickness) {
//            this.radius = radius;
//            this.color = color;
//            this.thickness = thickness;
//        }
//
//        @Override
//        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
//            Graphics2D g2 = (Graphics2D) g;
//            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//            g2.setColor(color);
//            g2.setStroke(new BasicStroke(thickness));
//            g2.drawRoundRect(x + thickness / 2, y + thickness / 2,
//                    width - thickness, height - thickness,
//                    radius, radius);
//        }
//
//        @Override
//        public Insets getBorderInsets(Component c) {
//            return new Insets(5, 10, 5, 10);
//        }
//
//        @Override
//        public Insets getBorderInsets(Component c, Insets insets) {
//            insets.set(5, 10, 5, 10);
//            return insets;
//        }
//    }
//}
