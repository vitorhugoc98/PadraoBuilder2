 package padrão.builder;
 public class Cliente {
     public static void main(String[] args) {    
         String modelo = "intermediario"; 
         
         BuilderCarro carro;
         
         if(modelo.equals("basico")){
             carro = new CarroBasico(); 
         }else if(modelo.equals("intermediario")){
             carro = new CarroIntermediario(); 
         }else{
             carro = new CarroCompleto(); 
         }
         
         Director diretor = new Director(carro);
        
        diretor.montarCarro(modelo);
    }
    
   
}
