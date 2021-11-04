public class AnimalAcuatico extends Animal{
  private int aletas;
  
  public AnimalAcuatico(){}

  public void nadar(){
    System.out.println("Estoy nadando");
  }
  public void setAletas(int aletas){
    this.aletas=aletas;
  }
  public int getAletas(){
    return aletas;
  }

  @Override
  public void comer(){
    System.out.println("Estoy comiendo peces");
  }
  public String toString(){
    return super.toString()+"Animal acuatico= Numero de aletas= "+aletas+"}";
    
  }
}