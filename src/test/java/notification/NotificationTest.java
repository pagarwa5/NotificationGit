package notification;

import org.json.JSONException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.skyscreamer.jsonassert.JSONAssert;

@RunWith(MockitoJUnitRunner.class)
public class NotificationTest {

	@Test
	public void dummyTestCase() throws JSONException {
		String expectedStr  =  "{id:course1}";
		String actualStr  =  "{id:course11}";
		JSONAssert.assertNotEquals(expectedStr, actualStr, false);
	}
	
}
