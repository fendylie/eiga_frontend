package com.example.eiga_frontend.networking;

public class ApiEndpoint {

    public static String BASEURL = "https://api.themoviedb.org/3/";
    public static String APIKEY = "api_key=9abae1f946a1d5c366574b616c1bc906";
    public static String LANGUAGE = "&language=en-US";
    public static String SEARCH_MOVIE = "search/movie?";
    public static String SEARCH_TV = "search/tv?";
    public static String QUERY = "&query=";
    public static String MOVIE_PLAYNOW = "movie/now_playing?";
    public static String MOVIE_POPULAR = "discover/movie?";
    public static String TV_PLAYNOW = "tv/on_the_air?";
    public static String TV_POPULAR = "discover/tv?";
    public static String URLIMAGE = "https://image.tmdb.org/t/p/w780/";
    public static String URLFILM = "https://www.themoviedb.org/movie/";
    public static String NOTIF_DATE = "&primary_release_date.gte=";
    public static String REALESE_DATE = "&primary_release_date.lte=";
    public static String MOVIE_VIDEO = "movie/{id}/videos?";
    public static String TV_VIDEO = "tv/{id}/videos?";

}
