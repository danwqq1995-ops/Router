void main() {

    Router r1 = new Router("Netlife", "1.12", 2,true);
    Router r2 = new Router("CNT", "1.13", -3,false);

    System.out.println("--ROUTER 1--");
    r1.mostrarInformacion();
    System.out.println("--ROUTER 2--");
    r2.mostrarInformacion();

    System.out.println("--ENCENDIDO--");
    r2.encender();

    System.out.println("--APAGAR--");
    r1.apagar();

    System.out.println("--ROUTER 1--");
    r1.mostrarInformacion();
    System.out.println("--ROUTER 2--");
    r2.mostrarInformacion();

}