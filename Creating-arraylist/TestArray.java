import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestArray{
	@Test
	public void testThatArrayLengthFunctionExist(){
		 CreateArray array = new  CreateArray();
		 Object actual = array.size() ;
		 assertEquals(actual, 0);
	}

}
