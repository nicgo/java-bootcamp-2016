import builder.Location_Builder;
import domain.Location;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Nico on 7/10/2016.
 */
public class Location_Test {

    @Test
    public void test_Location_dataCreationByDefault(){

            Location_Builder builder=new Location_Builder().with_City("Vcp").with_Region("Cba").with_Country("Arg");
            Location location=builder.create();

            Assert.assertThat(location.getCity(), Is.is("Vcp"));
            Assert.assertThat(location.getRegion(), Is.is("Cba"));
            Assert.assertThat(location.getCountry(), Is.is("Arg"));

    }
}
