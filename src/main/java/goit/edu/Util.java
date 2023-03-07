package goit.edu;

import com.google.gson.Gson;

public class Util {
    public static String parseToJson(MyName myName) {
        return new Gson().toJson(myName);
    }
}
