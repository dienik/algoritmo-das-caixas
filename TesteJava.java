package teste.java;
import java.util.Scanner;
public class TesteJava {

    public static void main(String[] args) {
        Scanner ent= new Scanner (System.in);
        boolean continuar = true;
        double opcao=0;
        int caixas;
        double largura;
        double altura;
        double perimetro;
        double comprimento;
       
            
        System.out.println("Digite a largura do produto: ");
        largura = ent.nextDouble();
        System.out.println("Digite a altura: ");
        altura = ent.nextDouble();
        System.out.println("Digite o comprimento");
        comprimento = ent.nextDouble();
        perimetro = (altura *2)+(largura*2);
        /*perimetro caixa 1 30*2 +40*2 = 
                             60+ 80 = 140
        perimetro caixa 2 80 *2 + 50*2
                             160 + 100 =260
        perimetro caixa 3 50*2 + 80*@
                            100 +160 =260
        dobro da largura + dobro da altura)
        */
       
        
      
        if (perimetro <= 70){
            System.out.println("Você pode enviar até dois objetos dessa medida"
                    + " na sua caixa pronta de 30 x 40 x 80");
        }
        if (perimetro<= 140 && perimetro > 70){
            System.out.println("Pode usar a caixa pronta com  30 x40 x80 ");
        }

        if (perimetro <=260 && perimetro > 140){
            System.out.println("Pode usar a caixa pronta de 80 x 50 x 40");
        }
        if (perimetro > 260){
            System.out.println("Você terá que usar uma caixa de  "+altura+" x "
                    +comprimento +" x " +largura);
              
        }
        
      
        }
       }




      
            
                
            
    
    

