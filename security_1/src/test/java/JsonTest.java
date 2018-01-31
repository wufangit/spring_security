import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.ArrayList;

public class JsonTest {


    @Test
    public void test01() {

        ArrayList<String> list = new ArrayList<String>();
        list.add("b");
        list.add("a");
        list.add("c");

        String string = JSON.toJSONString(list);
        System.out.println(string);
    }

}
