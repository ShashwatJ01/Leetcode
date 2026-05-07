import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeAndDecodeStrings {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder(); 
        for(String s : strs){
            sb.append(s); 
            sb.append("##");
        }

        return sb.toString(); 
        
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        String[] outputArr = s.split("##", -1); 

        return new ArrayList<>(Arrays.asList(outputArr).subList(0, outputArr.length - 1));
    }
}