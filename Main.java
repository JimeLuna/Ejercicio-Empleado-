package EjercicioEmpleado;

import javax.swing.*;

public class Main {
    public static void main (String[]args){
        boolean bandera;
        byte opc=0;
        Empleado empleado;

        do {
            do {
                bandera = true;
                try {
                    opc= Byte.parseByte(JOptionPane.showInputDialog("Seleccione una Opción: \n1.Empleado Base\n2.Empleado Temporal\n3.Empleado Externo\n0.Salir"));
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Ingrese un Dato valido: ");
                    bandera = false;
                }
            } while (bandera == false);

            switch (opc){
                case 1:
                    empleado = new EmpleadoBase();
                    datos(empleado);
                    ((EmpleadoBase)empleado).setAntiguedad(Byte.parseByte(JOptionPane.showInputDialog("Ingrese una Antiguedad: ")));
                    empleado.setSueldoBase(Float.parseFloat(JOptionPane.showInputDialog("Ingrese la sueldo base: ")));

                    desplegar(empleado);
                    break;

                case 2:
                    empleado = new EmpleadoTemporada();
                    datos(empleado);
                    ((EmpleadoTemporada)empleado).setFechaInicio(JOptionPane.showInputDialog("Ingrese la fecha de inicio: "));
                    ((EmpleadoTemporada)empleado).setFechaFinal(JOptionPane.showInputDialog("Ingrese la fecha de cierre: "));
                    empleado.setSueldoBase(Float.parseFloat(JOptionPane.showInputDialog("Ingrese la sueldo base: ")));

                    desplegar(empleado);
                    break;

                case 3:
                    empleado = new EmpleadoExterno();
                    datos(empleado);
                    ((EmpleadoExterno)empleado).setHonorarios(Float.parseFloat(JOptionPane.showInputDialog("Ingrese sus honorarios: ")));

                    desplegar(empleado);
                    break;
            }
        } while (opc != 0);

    }

    public static void datos (Empleado e){
        boolean bandera;
        do {
            bandera = true;
            try {
                e.setNombre(JOptionPane.showInputDialog("Nombre: ").toUpperCase());
                e.setFechaNacimiento(JOptionPane.showInputDialog("Fecha de nacimiento"));
                e.setNss(Long.parseLong(JOptionPane.showInputDialog("Ingrese su NSS: ")));
                e.setCurp(JOptionPane.showInputDialog("Ingrese el CURP: ").toUpperCase());
                e.setIne(JOptionPane.showInputDialog("Ingrese el INE: ").toUpperCase());
                e.setSucursal(JOptionPane.showInputDialog("Sucursal: "));
                e.setSexo(JOptionPane.showInputDialog("Sexo: ").toUpperCase().charAt(0));
            } catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Ingresa un dato Valido");
                bandera = false;
            }
        } while (!bandera);
    }

    public static void desplegar (Empleado d){
        JOptionPane.showMessageDialog(null, d.toString());
        JOptionPane.showMessageDialog(null, d.sueldoBruto(), "Sueldo Bruto", JOptionPane.INFORMATION_MESSAGE);
    }
}
