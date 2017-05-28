package learning.com.learningandroidfeatures;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Ankit on 5/27/2017.
 */

public interface RestService {

    //weather?q=Pune&APPID=88f5136154b95c85b1be429283bb0b89

    @GET("weather/")
    Call<WeatherData> getCityWeather(@Query("q") String city, @Query("APPID") String appID);

}

