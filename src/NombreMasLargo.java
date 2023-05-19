import javax.swing.JOptionPane;

public class NombreMasLargo {
    public static void main(String[] args) {
        
        String nombreMasLargo = "", comparar = "";
        comparar = JOptionPane.showInputDialog(null, "Por favor ingrese el primer nombre:");

        nombreMasLargo = comparar;
        comparar = JOptionPane.showInputDialog(null, "Por favor ingrese el segundo nombre:");

        if(comparar.length()>nombreMasLargo.length()){
            nombreMasLargo = comparar;
        }
        comparar = JOptionPane.showInputDialog(null, "Por favor ingrese el tercer nombre:");

        if(comparar.length()>nombreMasLargo.length()){
            nombreMasLargo = comparar;
        }

        JOptionPane.showMessageDialog(null, nombreMasLargo +" tiene el nombre mas largo.");


    }
}
