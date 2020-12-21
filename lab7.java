package второе;
import java.util.ArrayList;
import java.io.*;
public class lab7 {
    public static void main(String[] args) {
        ArrayList<String> FIO = new ArrayList<String>();
        String[] fio = new String[7];
        FIO.add("Иванов Иван Иванович");
        FIO.add("Никитин Никита Никитьевич");
        FIO.add("Дмитриев Дмитрий Дмитриевич");
        FIO.add("Николаев Николай Николаевич");
        FIO.add(1,"Валерьев Валиерий Валерьевич");
        FIO.add("Андреев Андрей Андреевич");
        System.out.println(FIO.get(1));
        FIO.remove("Андреев Андрей Андреевич");
        for(int i = 0;i<FIO.size();i++)System.out.println(FIO.get(i));
        System.out.println("////////////////////////");
        Object[] fiol = FIO.toArray();
        for(Object count : fiol){

            System.out.println(count);
        }
        System.out.println("////////////////////////");
        try{
            FileWriter writer = new FileWriter("C:\\Users\\79163\\IdeaProjects\\lab78\\src\\второе\\список.txt", true);

            // запись всей строки
            writer.append("\n");
            writer.append("Сходить в:");
            String text = "кино, театр, поход";
            writer.write(text);
            // запись по символам
            writer.append('.');
            writer.append('\n');
            writer.append("Список закончен.");
            writer.append("\n");
            writer.write("ещё на рынок");




            writer.flush();
            FileReader reader = new FileReader("C:\\Users\\79163\\IdeaProjects\\lab78\\src\\второе\\список.txt");
            System.out.println("////////////////////////");
            // читаемпосимвольно
            int c;
            while((c=reader.read())!=-1){

                //System.out.print(" c= "+c);// Если добавить данну строчку мы увидим Unicode символов
                System.out.print((char)c);

            }

        }
        catch(IOException ex){

            System.out.println(ex.getMessage());


        }

    }
}
