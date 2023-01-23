package royal.cloud.core.apis.codebases;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class RoyalCloudCommonHelper {

    private static RoyalCloudCommonHelper _instance = new RoyalCloudCommonHelper();

    public static Gson gson = new GsonBuilder().create();

    private RoyalCloudCommonHelper() {

    }

    public static RoyalCloudCommonHelper getInstance() {
        return _instance;
    }

    public String getJsonStringFromObject(Object dtoInstance) {
        return gson.toJson(dtoInstance);
    }
}
