import org.example.SearchSet;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)

public class SearchSetTester {
    @Test
    public void insertWhenSetIsEmpty(){
        SearchSet empty = new SearchSet();
        empty.insert(1);
        empty.insert(2);
        empty.insert(4);
        empty.insert(3);
        System.out.println(empty);
    }
    @Test
    public void lengthTest() {
        SearchSet empty = new SearchSet();
        empty.insert(1);
        empty.insert(2);
        empty.insert(4);
        empty.insert(3);
        System.out.println(empty.getNumberElements());
    }
    @Test
    public void containsTest(){
        SearchSet empty = new SearchSet();
        empty.insert(1);
        empty.insert(2);
        empty.insert(4);
        empty.insert(7);
        System.out.println(empty.contains(4));
        System.out.println(empty.contains(6));

    }

}
