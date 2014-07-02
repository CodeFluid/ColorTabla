package Source;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Unknown
 */
public class Renderer extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        
        if(row % 2 == 0){                   //Checamos el número de la fila para aplicar un color
            setBackground(Color.red);
            setForeground(Color.white);
        }else{                              //En caso de que la condición resulte diferente aplicara otro color a la fila
            setBackground(Color.white);
            setForeground(Color.red);
        }
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.
    }
}
