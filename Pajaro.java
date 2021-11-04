public class Pajaro extends AnimalAereo{
  public String tipoPico;
  public Pajaro(){}
  public void recolectarRamas(){
    System.out.println("Estoy recolectando ramas");
  }
  public void setTipoPico(String tipoPico){
    this.tipoPico=tipoPico;
  }
  public String getTipoPico(){
    return tipoPico;
  }
  @Override
public String toString(){
    return super.toString()+"Pajaro={Tipo de pico= "+tipoPico+"}";
    
  }
}