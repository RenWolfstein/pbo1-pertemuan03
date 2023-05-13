package PercabanganIfElse;
//If dengan condition true sehingga statement 1 jalan
public class IfelseTrue {
    public static void main(String[] args) {
        double tBelanja = 53000;
        double tUang = 25000;
        
        if(tUang<tBelanja){
            System.out.println("Uang kurang, kurangi belanjaan anda"); //Statment 1
        }else{
            System.out.println("Uang cukup, Happy Shopping");//Statmen 2
        }
    }
    
}
