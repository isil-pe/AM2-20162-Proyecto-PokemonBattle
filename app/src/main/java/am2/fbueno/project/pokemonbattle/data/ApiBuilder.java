package am2.fbueno.project.pokemonbattle.data;

import am2.fbueno.project.pokemonbattle.data.service.BattleService;
import am2.fbueno.project.pokemonbattle.data.service.DataService;
import am2.fbueno.project.pokemonbattle.data.service.SecurityService;
import am2.fbueno.project.pokemonbattle.data.service.UserService;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by FBueno on 11/11/2016.
 */

public class ApiBuilder {
    private static final String API_BASE_URL = "http://api.backendless.com";
    private static OkHttpClient.Builder httpClient;

    private static SecurityService securityApi;
    private static DataService dataApi;
    private static UserService userApi;
    private static BattleService battleApi;

    public static BattleService getBattleClient() {
        if(battleApi == null){
            Retrofit.Builder builder = new Retrofit.Builder()
                    .baseUrl(API_BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create());
            httpClient = new OkHttpClient.Builder();
            httpClient.addInterceptor(interceptor());

            Retrofit retrofit = builder.client(httpClient.build()).build();
            battleApi = retrofit.create(BattleService.class);
        }
        return battleApi;
    }

    public static SecurityService getSecurityClient() {
        if (securityApi == null) {
            Retrofit.Builder builder = new Retrofit.Builder()
                    .baseUrl(API_BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create());
            httpClient = new OkHttpClient.Builder();
            httpClient.addInterceptor(interceptor());

            Retrofit retrofit = builder.client(httpClient.build()).build();
            securityApi = retrofit.create(SecurityService.class);
        }
        return securityApi;
    }

    public static UserService getUserClient(){
        if(userApi == null){
            //Retrofit retrofit = new Retrofit.Builder().baseUrl(API_BASE_URL).build();
            Retrofit.Builder builder = new Retrofit.Builder()
                    .baseUrl(API_BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create());
            httpClient = new OkHttpClient.Builder();
            httpClient.addInterceptor(interceptor());

            Retrofit retrofit = builder.client(httpClient.build()).build();
            userApi = retrofit.create(UserService.class);
        }
        return userApi;
    }

    public static DataService getDataClient() {
        if (dataApi == null) {
            //Retrofit retrofit = new Retrofit.Builder().baseUrl(API_BASE_URL).build();
            Retrofit.Builder builder = new Retrofit.Builder()
                    .baseUrl(API_BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create());
            httpClient = new OkHttpClient.Builder();
            httpClient.addInterceptor(interceptor());

            Retrofit retrofit = builder.client(httpClient.build()).build();
            dataApi = retrofit.create(DataService.class);
        }
        return dataApi;
    }

    private static HttpLoggingInterceptor interceptor() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        return httpLoggingInterceptor;
    }
}
