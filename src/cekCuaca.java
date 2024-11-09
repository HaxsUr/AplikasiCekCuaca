import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class cekCuaca {

    // API Key dan Base URL untuk layanan cuaca
    private static final String API_KEY = "637cc1034fb648f297c280628877a151"; // Ganti dengan API key Anda
    private static final String BASE_URL = "http://api.openweathermap.org/data/2.5/weather";

    public static String getWeather(String city) {
        try {
            // Membentuk URL request
            String urlString = BASE_URL + "?q=" + city + "&appid=" + API_KEY + "&units=metric";
            URL url = new URL(urlString);

            // Membuka koneksi HTTP
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();

            // Membaca respon dari API
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            // Mengolah JSON respons
            JSONObject jsonResponse = new JSONObject(response.toString());
            JSONObject main = jsonResponse.getJSONObject("main");
            double temperature = main.getDouble("temp");
            String weather = jsonResponse.getJSONArray("weather").getJSONObject(0).getString("description");

            return "Kota: " + city + "\nSuhu: " + temperature + "°C\nKondisi: " + weather;

        } catch (Exception e) {
            return "Gagal mendapatkan data cuaca: " + e.getMessage();
        }
    }
}
