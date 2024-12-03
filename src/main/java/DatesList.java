import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class DatesList {

    private final List<LocalDate> dates = new ArrayList<>();
    private final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public List<LocalDate> fillDateList(){
        dates.add(LocalDate.parse("01/01/2023", dateFormatter));
        dates.add(LocalDate.parse("02/01/2023", dateFormatter));
        dates.add(LocalDate.parse("11/10/2024", dateFormatter));
        return this.dates;
    }

    public boolean isCurrentTimeDateInList(List<LocalDate> dateList){
        return dateList.contains(LocalDate.now());
    }
}
