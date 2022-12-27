/**
 * Task1
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class Task1 {

    public static void main(String[] args) {
        float a;
        boolean flag=false;
        
        
        while (!flag){
            try{
                Scanner in = new Scanner(System.in);
                System.out.print("Введите значение переменной:   ");
                a=in.nextFloat();
                flag=true;
                System.out.println("Вы ввели значение: "+a);
            
            }
            catch (InputMismatchException e){
                System.out.println("ошибка "+e);
                System.out.println("Введите значение еще раз");
                flag=false;


            }
            finally {System.out.println("Спасибо за внимание");}
        }
        
        // System.out.println(a);
        
    }
}