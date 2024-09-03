package EjercicioEmpleado;

public class EmpleadoTemporada extends Empleado {
    private String fechaInicio;
    private String fechaFinal;

    public EmpleadoTemporada(String nombre, String fechaNacimiento, long nss, String curp, String ine, String sucursal, char sexo, float sueldoBase, String fechaInicio, String fechaFinal) {
        super(nombre, fechaNacimiento, nss, curp, ine, sucursal, sexo, sueldoBase);
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
    }

    public EmpleadoTemporada() {
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nSueldo: " + getSueldoBase() +
                "\nISR aplicado:" + isr() +
                "\nFecha de inicio: " + fechaInicio +
                "\nFecha de cierre: " + fechaFinal;
    }

    @Override
    public double sueldoBruto() {
        return getSueldoBase()-isr();
    }
}
