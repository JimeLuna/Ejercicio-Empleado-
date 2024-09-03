package EjercicioEmpleado;

public class EmpleadoBase extends Empleado{
    private byte antiguedad;

    public EmpleadoBase(String nombre, String fechaNacimiento, long nss, String curp, String ine, String sucursal, char sexo, float sueldoBase, byte antiguedad) {
        super(nombre, fechaNacimiento, nss, curp, ine, sucursal, sexo, sueldoBase);
        this.antiguedad = antiguedad;
    }

    public EmpleadoBase() {
    }

    public byte getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(byte antiguedad) {
        if (antiguedad > 0){
            this.antiguedad = antiguedad;
        } else {
            antiguedad = 0;
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nSueldo: " + getSueldoBase() +
                "\nISR aplicado:" + isr() +
                "\nAntiguedad: " + antiguedad;
    }

    @Override
    public double sueldoBruto() {
        return getSueldoBase()-isr();
    }
}
