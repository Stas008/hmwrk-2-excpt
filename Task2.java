import java.util.Scanner;
public class Task2{
    public static void main(String[] args) {
        String a=null;
        int len;
        boolean flag=false;
        while (!flag){ 
            try {
                Scanner in = new Scanner(System.in);
                System.out.print("Введите строку:   ");
                a=in.nextLine();
                if (a==""){
                    a=null;
                    len=a.length();
                }
                else {
                    flag=true;
                }
            }
            catch (NullPointerException e){
                System.out.println("Введеная строка пустая");
            }
            finally{
                System.out.println("Ваша строка - "+a);
            }
        }
                

        

    }
}

