class Tv{
  String marca;
  int polegadas;
  int volume=5;
  int voltagem;
  int canal=11;
  
  void ligar(){
    int consumo=voltagem*polegadas;
    System.out.println("TV ligada");
    System.out.println("Consumo: " + consumo +"kwh");
  }
  void desligar(){
    System.out.println("TV desligada!");
  }
  void Aumentarvolume(){
    if(volume<10){
      volume++;
    }
  }
  void Diminuirvolume(){
    if(volume>5){
      volume--;
    }
  }
  void passarcanal(){
    canal++;
  }
  void voltarcanal(){
    canal--;
  }
  
  
}

public class TvFucionamento{
  public static void main(String [] args){
    Tv T1 = new Tv();
    
    T1.marca = "TCL";
    T1.voltagem = 220;
    T1.polegadas = 60;
  
    T1.ligar();
    
    T1.Aumentarvolume();
    T1.Diminuirvolume();
    
    T1.passarcanal();
    T1.voltarcanal();
    
    System.out.println("Marca: "+ T1.marca);
    System.out.println("Voltagem: "+ T1.voltagem);
    System.out.println("Polegadas: "+ T1.polegadas);
    System.out.println("Volume: "+ T1.volume);
    System.out.println("canal: "+ T1.canal);
    
    T1.desligar();
  }
}

