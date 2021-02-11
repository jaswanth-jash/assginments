package february;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Test {
    public static void main(String[] args) {
        Test obtainDate = new Test();
        TimeZone timeZone = TimeZone.getTimeZone("Asia/Calcutta");
        String dateFormat = "yyyy-MM-dd'T'HH:mm:ss.'Z'";
        System.out.println("Todays Date:" + obtainDate.getTodaysDay(dateFormat, timeZone));
    }

    public Instant getTodaysDay(String dayFormat, TimeZone timeZone) {
        Date date = new Date();
        // Specifying the format /
        DateFormat requiredFormat = new SimpleDateFormat(dayFormat);
        // Setting the Timezone /
        requiredFormat.setTimeZone(timeZone);
        // Picking the day value in the required Format /
        String strCurrentDay = requiredFormat.format(date).toUpperCase();
        Instant currentTime = Instant.parse(strCurrentDay);
        return currentTime;
    }

}


