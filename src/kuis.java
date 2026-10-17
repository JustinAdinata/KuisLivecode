import java.util.Scanner;
public class kuis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int jumlahFaktor = 0;

        for(int i = 1; i <=n; i++){
            if(n % i ==0){
                jumlahFaktor++;
            }
        }
        if(jumlahFaktor == 2){
            System.out.println("Bilangan Prima");
        } else{
            System.out.println("Bukan Bilangan Prima");
        }

        input.close();
    }

}
