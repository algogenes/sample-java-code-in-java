import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ValidationForJSONString {
	
	public  boolean isJSONValid(String jsonInString ) {
	    try {
	       final ObjectMapper mapper = new ObjectMapper();
	       mapper.readTree(jsonInString);
	       return true;
	    } catch (IOException e) {
	       return false;
	    }

}
	
}

/*<dependency>
    <groupId>com.fasterxml.jackson.core</groupId>
    <artifactId>jackson-databind</artifactId>
    <version>2.12.3</version>
        </dependency> */