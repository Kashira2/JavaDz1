package egoroff;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Save {
    void Time_writer(String text) {
        try {
            FileWriter fw = new FileWriter("time.txt", true);
            fw.write(text);
            PrintWriter out = new PrintWriter(fw);
            DateFormat dateF = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss\n");

            Calendar cal = Calendar.getInstance();
            String time = dateF.format(cal.getTime());
            out.print(time);
            out.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
