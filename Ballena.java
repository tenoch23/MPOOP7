public class Ballena extends AnimalAcuatico{
  private int largo;

  public Ballena(){}
  public void setLargo(int largo){
    this.largo=largo;
  }
  public int getLargo(){
    return largo;
  }
  public void pelearConPinocho(){
    System.out.println("Estoy peleando con Pinocho");
  }
  @Override
public String toString(){
    return super.toString()+"Ballena={Largo= "+largo+"}";
    
  }
}