public class AnimalTerrestre extends Animal{
public int patas;

public AnimalTerrestre(){}

public void correr(){
  System.out.println("Estoy corriendo");
}
public void setPatas(int patas){
    this.patas=patas;
  }
  public int getPatas(){
    return patas;
  }
@Override
public void comer(){
  System.out.println("Estoy comiendo conejos");
}
 public String toString(){
    return super.toString()+"Animal terrestre={Numero de patas= "+patas+"}";
    
  }
}