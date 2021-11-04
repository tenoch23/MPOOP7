public class Perro extends AnimalTerrestre{
public String colorCollar;
public Perro(){}
public void hacerTrucos(){
  System.out.println("Estoy haciendo trucos");
}
public void setColorCollar(String colorCollar){
  this.colorCollar=colorCollar;
}
public String getColorCollar(){
  return colorCollar;
}
@Override
public String toString(){
    return super.toString()+"Perro={Color del collar= "+colorCollar+"}";
    
  }

}