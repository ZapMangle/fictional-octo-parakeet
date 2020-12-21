package первое;
import java.util.ArrayList;
import java.util.LinkedList;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> states = new ArrayList<String>();
        String[] st = new String[5];
        states.add("Германия");
        states.add("Франция");
        states.add(1,"Великобритания");
        states.add("Испания");
        System.out.println(states.get(1));
        for(int i = 0;i<states.size();i++)System.out.println(states.get(i));

        /////////////////////////////////////
        System.out.println("////////////////////////");
        Object[] countries = states.toArray();
        for(Object count : countries){

            System.out.println(count);
        }
        System.out.println("////////////////////////");
////////////////////////////////////////////////////////
        for (String it: states) System.out.println(it);
        LinkedList<String> vaze = new LinkedList<String>();
        vaze.add("Штрудель");
        vaze.addFirst("Круасан");
        vaze.addLast("Пиво");
        vaze.add(1,"Сальса");
        for(String it:vaze){
            System.out.println(it);
        }
        String tmp = vaze.getFirst();
        System.out.println("first elem of list "+tmp);
        vaze.remove("Круасан");
        for(String it:vaze){
            System.out.println(it);
        }
        ///////////////////////////////////////////////
        System.out.println("////////////////////////");
        /*
        try{
            FileWriter writer = new FileWriter("C:\\Users\\79163\\IdeaProjects\\lab78\\src\\123.txt", false);

                // запись всей строки
                writer.append("йцкуйцукцкйц");
                String text = "Мама мыла раму, раму мыла мама";
                writer.write(text);
                // запись по символам
                writer.append('\n');
                writer.append('E');



                writer.flush();
            }
        catch(IOException ex){

                System.out.println(ex.getMessage());


            }
            */
        try{
            FileReader reader = new FileReader("C:\\Users\\79163\\IdeaProjects\\lab78\\src\\123.txt");

            // читаемпосимвольно
            int c;
            while((c=reader.read())!=-1){

                System.out.print(" c= "+c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }





    }
}
