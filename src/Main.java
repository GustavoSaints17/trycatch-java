import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int tentativas = 0;
        while(tentativas <3) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite sua senha numérica:");
            try{
                int senha = scanner.nextInt();
                if(senha!=123){
                    throw new IllegalArgumentException("Senha Incorreta");
                }
                break;
            }catch (IllegalArgumentException e){
                System.out.println("Senha incorreta");
            }catch (InputMismatchException e){
                System.out.println("Senha precisa ser numérica");
            }finally {
                tentativas += 1;
                System.out.println("Você possui " + (3-tentativas) + " tentativas restantes.");
            }
        }
    }}