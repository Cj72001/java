import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class MenuIterativo {

    public static void main(String[] args) {

        int opcionIndice = 0;

        Map<String, Integer> opciones = new HashMap();
        opciones.put("Actualizar", 1);
        opciones.put("Eliminar", 2);
        opciones.put("Agregar", 3);
        opciones.put("Listar", 4);
        opciones.put("Salir", 5);

        // Arreglo con cada key del hashMap
        Object[] opArreglo = opciones.keySet().toArray();

        Object opcion = JOptionPane.showInputDialog(null,
                "Seleccione un Opción",
                "Mantenedor de Productos",
                JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

        // Obteniendo el value de una key en especifico "opcion.toString()" del hashMap
        // "opciones"
        opcionIndice = opciones.get(opcion.toString());

        // Evaluando el value
        while (!(opcionIndice == 5)) {

            if (opcion == null) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
            } else {

                // aca un if o switch para las distintas opciones (values).
                if (opcionIndice == 1) {
                    JOptionPane.showMessageDialog(null, "Usuario actualizado correctamente");
                } else if (opcionIndice == 2) {
                    JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente");
                } else if (opcionIndice == 3) {
                    JOptionPane.showMessageDialog(null, "Usuario agregado correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario listado correctamente");
                }
            }

            opcion = JOptionPane.showInputDialog(null,
                    "Seleccione un Opción",
                    "Mantenedor de Productos",
                    JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

            opcionIndice = opciones.get(opcion.toString());

        }
        // Cuando el value == 5
        JOptionPane.showMessageDialog(null, "Haz salido con exito!");

    }
}
