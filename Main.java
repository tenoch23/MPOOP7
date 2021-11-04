class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Gerente ger=new Gerente();
    System.out.println(ger);

    ger.setNombre("Romina Pérez");
    ger.setNumEmpleado(205);
    ger.setSueldo(20000);
    ger.setPresupuesto(100000);
    System.out.println(ger);
//ballena1
  Gerente ger2=new Gerente("Jose Luis", 207, 30000, 70000);
  Ballena ballena1=new Ballena();
  ballena1.setNombre("Moby dick");
  ballena1.setLugarOrigen("Oceano Pacífico");
  ballena1.setColor("Azul");
  ballena1.setAletas(3);
  ballena1.setLargo(20);
//perro1
Perro perro1=new Perro();
perro1.setNombre("Milla");
perro1.setColor("Dorado");
perro1.setLugarOrigen("La calle");
perro1.setPatas(4);
perro1.setColorCollar("Rosa");
//pajaro1
Pajaro pajaro1=new Pajaro();
pajaro1.setNombre("Blue");
pajaro1.setColor("Azul");
pajaro1.setLugarOrigen("Amazonas");
pajaro1.setAlas(2);
pajaro1.setTipoPico("Tradicional");


  System.out.println(perro1);
  System.out.println(ballena1);
  System.out.println(pajaro1);
}
  }