import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.ImageIcon;
import org.json.JSONObject;

public class CekCuaca {

    // API Key dan Base URL untuk layanan cuaca Weatherbit
    private static final String API_KEY = "637cc1034fb648f297c280628877a151"; // Ganti dengan API key Anda
    private static final String BASE_URL = "https://api.weatherbit.io/v2.0/current";

    public static String getWeather(String city) {
        try {
            // Membentuk URL request
            String urlString = BASE_URL + "?city=" + city + "&key=" + API_KEY + "&units=M";
            URL url = new URL(urlString);

            // Membuka koneksi HTTP
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();

            // Cek apakah respon adalah HTTP 200 (OK)
            if (connection.getResponseCode() != 200) {
                return "Gagal mendapatkan data cuaca: HTTP error code: " + connection.getResponseCode();
            }

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
            JSONObject data = jsonResponse.getJSONArray("data").getJSONObject(0);
            double temperature = data.getDouble("temp");
            String weather = data.getJSONObject("weather").getString("description");

            return "Kota: " + city + "\nSuhu: " + temperature + "°C\nKondisi: " + weather;

        } catch (Exception e) {
            return "Gagal mendapatkan data cuaca: " + e.getMessage();
        }
    }

    ImageIcon getWeatherIcon(String toLowerCase) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
