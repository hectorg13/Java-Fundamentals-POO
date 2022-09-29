class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido al servicio de Uber");
        UberBlack uberAuto = new UberBlack("LJEW132", 
        new Account("Juan Hernandez", "RFC", "juan.hernan@gmail.com", "pass12345"));
        uberAuto.setPassenger(6);
        uberAuto.printDataCar();

        Card pago = new Card(13,1231456789,"100522","123");
        System.out.println(pago.numberCard);
    }
}