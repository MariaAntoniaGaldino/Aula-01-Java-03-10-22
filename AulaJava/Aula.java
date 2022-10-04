Import java.util.Scanner;

public class Aula{
    public static void main(String [] args){

        Sacnner scan = new Scanner(System.In);
        
        
        System.out.println("Digite o seu sexo: 1 para masculino, 2 para feminino");
        // stirng sexo = (scan.nextInt() == i ? "masculino" : "feminino.");   operador ternario 1
         
         Int inputsexo = scan.next();
         String sexo;

         Swich (inputsexo) {
             case 1 : {
             sexo = " masculino";
             break; 
             }
             case 2 : {
             sexo + "feminino";
               break; 
            }

             default : sexo = "outros" ;
         }
         
         System.out.println("O sexo escolhido e: "+sexo);


    
        System.out.println("Digite o seu nome:");
        String nome = scan.nextLine();

        System.out.println("Digite sua idade:");
        int idade = scan.nextLine();



        
        System.out.println("Digite a N1");
        double n1 = scan.nextDouble();
        System.out.println("Digite a N2");
        double n2 = scan.nextDouble();
        System.out.println("Digite a N3");
        double n3 = scan.nextDouble();
       
       double n1 - 80;
       double n2 - 70;
       double n3 - 50;

       double total = n1 + n2 + n3;
       double media = total / 3;

    //    if (media == 70) {} igual
    //    if (media >= 70) {} maior ou igual
    //    if (media <= 70) {}  
    //    if (media < 70) {} 
    //    if (media > 70) {} 
    //    if (media != 70) {} 



       if (media >-70 {
           System.out.println("voce esta aprovado!");
     } else {
           System.out.println("voce esta reprovado!");

           double exame = 100 - media;
           System.out.println("voce precisa tirar")

          
       })
       
        // String nome = "Maria";
        // Let idade = 23;
        
        // System.out.println("nome")
        // System.out.println("Ola Mundo!");

        // double valorA = 10.5;
        // double valorB = 10.8;

        // double soma = valorA + valorB; 
        // System.out.printiln(soma);

        // double multiplicacao = valorA * valorB; 
        // System.out.printiln(multiplicacao);

        

    }
}