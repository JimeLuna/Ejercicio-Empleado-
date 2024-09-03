package EjercicioEmpleado;

public class EmpleadoExterno extends Empleado{
    private float honorarios;

    public EmpleadoExterno(String nombre, String fechaNacimiento, long nss, String curp, String ine, String sucursal, char sexo, float sueldoBase, float honorarios) {
        super(nombre, fechaNacimiento, nss, curp, ine, sucursal, sexo, sueldoBase);
        this.honorarios = honorarios;
    }

    public EmpleadoExterno() {
    }

    public float getHonorarios() {
        return honorarios;
    }

    public void setHonorarios(float honorarios) {
        if (honorarios > 0){
            this.honorarios = honorarios;
            setSueldoBase(0);
        } else {
            honorarios = 0;
            setSueldoBase(0);
        }
    }

    public double isr() {
        return honorarios*0.30;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nHonorarios: " + honorarios +
                "\nISR aplicado:" + isr();

    }
    @Override
    public double sueldoBruto() {
        return honorarios-isr();
    }
}
