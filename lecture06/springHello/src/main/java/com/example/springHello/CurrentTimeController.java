package com.example.springHello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

@RestController
public class CurrentTimeController {
    @GetMapping("/current-time")
    public String currentTime(@RequestParam(value = "area", defaultValue = "japan") String area) {
        Date date = new Date();
        TimeZone timezone;
        SimpleDateFormat fmt = new SimpleDateFormat();

        // クエリパラメータに合わせてタイムゾーンを設定
        switch(area.toLowerCase()) {
            case "europe":
                timezone = TimeZone.getTimeZone("Europe/London");
                break;
            case "los_angeles":
                timezone = TimeZone.getTimeZone("America/Los_Angeles");
                break;
            case "new_york":
                timezone = TimeZone.getTimeZone("America/New_York");
                break;
            case "hawai":
                timezone = TimeZone.getTimeZone("Pacific/Honolulu");
                break;
            case "japan":
            default:
                // サポート外の地域が入力された場合は日本にまとめる
                timezone = TimeZone.getTimeZone("Asia/Tokyo");
                break;
        }

        //タイムゾーンに合わせたフォーマットに変換
        fmt.setTimeZone(timezone);
        // YYYY/MM/DD HH:MM に変換して返却。また、クエリパラメータをそのまま表示させる。
        return ("現在の" + area + "の日時は" + fmt.format(date));
    }
}
