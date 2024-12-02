import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindLinkElements {

    public void findBrookeLinks(List<String> linksArray){
        List brokenLinks = new ArrayList<String>();
        for(String currentLink : linksArray){
            boolean linkHasSpaces = currentLink.matches(".*\\s+.*");
            if (linkHasSpaces){
                brokenLinks.add(currentLink);
            }
        }
        if(!brokenLinks.isEmpty()){
            throw new RuntimeException("There are at least one broken link" + brokenLinks.toString());
        }
    }
}
