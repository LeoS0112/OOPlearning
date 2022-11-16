import org.example.FunctionalArray;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)

public class FunctionalArrayTester {

    @Test
    public void createArray(){
        FunctionalArray fArray = new FunctionalArray(5);
        System.out.println(fArray);
    }

    @Test
    public void setElement(){
        FunctionalArray fArray = new FunctionalArray(5);
        fArray.set(0,3);
        fArray.set(1,2);
        fArray.set(2,5);
        System.out.println(fArray);
    }

    @Test
    public void getElement(){
        FunctionalArray fArray = new FunctionalArray(5);
        fArray.set(0,3);
        fArray.set(1,2);
        fArray.set(2,5);
        System.out.println(fArray.get(0));
        System.out.println(fArray.get(1));
        System.out.println(fArray.get(2));
    }


}
