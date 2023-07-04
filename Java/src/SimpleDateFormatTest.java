import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class SimpleDateFormatTest {
    public static void main(String[] args) {
        DateFormat df  = new SimpleDateFormat("yyyy년 MM월 dd일");
        DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");

        try {
            Date d = df.parse("2023년 7월 4일");
            System.out.println(df2.format(d));
        } catch(Exception e) {}
    } // main
}
