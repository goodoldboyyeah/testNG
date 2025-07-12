package http.testcases;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import javafx.scene.Group;
import org.json.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.Request;
import utils.Response;

import java.io.IOException;

import static org.testng.AssertJUnit.assertEquals;
import static utils.HttpUtils.*;
import static utils.JsonFileUtil.readRequest;
import static utils.JsonFileUtil.transferJsonObject;

/**
 * @Author: liuchao22
 * @CreateTime: 2025-07-12
 */

public class AutoApiTest {
//    @DataProvider(name = "AutoApiTest")
    @DataProvider(name = "AutoApiTest.json")
    @Test(priority = 1,groups = "P1")
    public void test2() throws IOException {
       Request request =  readRequest("src/test/java/http/data/AutoApiTest.json");
       Response response = send(request);
       JsonObject obj = transferJsonObject(response);
       assertEquals(200, obj.get("code").getAsInt());
        System.out.println(response);
// request [
//    "{\"username\":\"testuser\",\"password\":\"mypassword\"}"
//  ]
//        Request request = new Request();
//        request.setProtocol("https");
//        request.setUrl("https://www.baidu.com");
//        request.setRequestType("post");
//        System.out.println(request);
//        Response a = send(request);
//        System.out.println(a);
    }
//    @Test
//    public void test3(){
//        Request request = new Request();
//        request.setRequest(null);
//        request.setUrl("http://localhost:8080/api/hello");
//        request.setRequestType("get");
////        Response a = sendPost1(request);
//       Response a= send(request);
//        System.out.println(a);
//        System.out.println("1111");
//    }
//    @Test(dataProvider = "AutoApiTest")
//    public void test() {
//        apitest.main(null);
//    }
}
