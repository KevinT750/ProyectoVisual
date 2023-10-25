package Persona;

public class Persona {
    private String kstmNombre;
    private String kstmApellido;
    private String kstmDireccion;
    private int kstmTelefonoF;
    private int kstmTelefonoC;
    private String kstmCorreoE;

    public Persona() {
    }

    public Persona(String kstmNombre, String kstmApellido, String kstmDireccion, int kstmTelefonoF, int kstmTelefonoC, String kstmCorreoE) {
        this.kstmNombre = kstmNombre;
        this.kstmApellido = kstmApellido;
        this.kstmDireccion = kstmDireccion;
        this.kstmTelefonoF = kstmTelefonoF;
        this.kstmTelefonoC = kstmTelefonoC;
        this.kstmCorreoE = kstmCorreoE;
    }

    public String getKstmNombre() {
        return kstmNombre;
    }

    public void setKstmNombre(String kstmNombre) {
        this.kstmNombre = kstmNombre;
    }

    public String getKstmApellido() {
        return kstmApellido;
    }

    public void setKstmApellido(String kstmApellido) {
        this.kstmApellido = kstmApellido;
    }

    public String getKstmDireccion() {
        return kstmDireccion;
    }

    public void setKstmDireccion(String kstmDireccion) {
        this.kstmDireccion = kstmDireccion;
    }

    public int getKstmTelefonoF() {
        return kstmTelefonoF;
    }

    public void setKstmTelefonoF(int kstmTelefonoF) {
        this.kstmTelefonoF = kstmTelefonoF;
    }

    public int getKstmTelefonoC() {
        return kstmTelefonoC;
    }

    public void setKstmTelefonoC(int kstmTelefonoC) {
        this.kstmTelefonoC = kstmTelefonoC;
    }

    public String getKstmCorreoE() {
        return kstmCorreoE;
    }

    public void setKstmCorreoE(String kstmCorreoE) {
        this.kstmCorreoE = kstmCorreoE;
    }
}
