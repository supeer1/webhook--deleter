package me.supeer.webhook.deleter;
/*
 *
 * @Author supeer
 *
 *
 * - 2022 -
 *
 */


import org.apache.http.HttpResponse;
import org.toilelibre.libe.curl.Curl;

public class Deleter {


    public static void delete(String webhook){
        Curl.curl("-X DELETE " + webhook);
    }


}
