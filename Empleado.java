package EjercicioEmpleado;

public class Empleado {
    private String nombre;
    private String fechaNacimiento;
    private long nss;
    private String curp;
    private String ine;
    private String sucursal;
    private char sexo;
    private float sueldoBase;

    public Empleado(String nombre, String fechaNacimiento, long nss, String curp, String ine, String sucursal, char sexo, float sueldoBase) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.nss = nss;
        this.curp = curp;
        this.ine = ine;
        this.sucursal = sucursal;
        this.sexo = sexo;
        this.sueldoBase = sueldoBase;
    }

    public Empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public long getNss() {
        return nss;
    }

    public void setNss(long nss) {
        if (nss >0){
            this.nss = nss;
        }else {
            nss = 0;
        }
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getIne() {
        return ine;
    }

    public void setIne(String ine) {
        this.ine = ine;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        if (sexo == 'M' || sexo == 'H'){
            this.sexo = sexo;
        } else {
            sexo= 'M';
        }
    }
    public float getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(float sueldoBase) {
        if (sueldoBase > 0){
            this.sueldoBase = sueldoBase;
        } else {
            sueldoBase = 0;
        }
    }

    public double isr(){
        return sueldoBase*0.30;
    }

    @Override
    public String toString() {
        return "Empleado" +
                "\nNombre completo: " + nombre +
                "\nFecha de nacimiento: " + fechaNacimiento +
                "\nSexo: " + sexo +
                "\nNSS: " + nss +
                "\nCURP: " + curp +
                "\nINE: " + ine +
                "\nSucursal: " + sucursal;
    }

    public double sueldoBruto() {
        return 0;
    }
}
