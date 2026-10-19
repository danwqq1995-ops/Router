public class Router {

    private String nombre;
    private String direccionIp;
    private int cantidadPuertos;
    private boolean activo;

    public Router(String nombre, String direccionIp, int cantidadPuertos, boolean activo) {
        setNombre(nombre);
        setDireccionIp(direccionIp);
        setCantidadPuertos(cantidadPuertos);
        setActivo(activo);
    }

    public void mostrarInformacion(){
        System.out.println("El nombre es:" + getNombre());
        System.out.println("La direccion ip es:" + getDireccionIp());
        System.out.println("La cantidad de puertos es:" + getCantidadPuertos());
        System.out.println("Activo:" + isActivo());
    }

    public void encender(){
        this.activo = true;
        System.out.println("El sistema pasa a :" + activo);

    }

    public void apagar(){
        this.activo = false;
        System.out.println("El sistema pasa a :" + activo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank())
            nombre = "indef";
        this.nombre = nombre;
    }

    public String getDireccionIp() {
        return direccionIp;
    }

    public void setDireccionIp(String direccionIp) {
        if (direccionIp == null || direccionIp.isBlank())
            direccionIp = "indef";
        this.direccionIp = direccionIp;
    }

    public int getCantidadPuertos() {
        return cantidadPuertos;
    }

    public void setCantidadPuertos(int cantidadPuertos) {
        if (cantidadPuertos < 0){
            cantidadPuertos = 0;
        }
        this.cantidadPuertos = cantidadPuertos;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
