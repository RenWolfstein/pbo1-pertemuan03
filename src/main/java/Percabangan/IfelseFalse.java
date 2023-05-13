package Percabangan;
//If dengan condition false sehingga statement 2 jalan
public class IfelseFalse {
    public static void main(String[] args) {
        double tBelanja = 53000;
        double tUang = 55000;
        
        if(tUang<tBelanja){
            System.out.println("Uang kurang, kurangi belanjaan anda"); //statement 1
        }else{
            System.out.println("Uang cukup, Happy Shopping"); //Statement 2
        }
    }
}
