import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import org.json.JSONObject;

public class AplikasiCekCuaca1 extends javax.swing.JFrame {
       private DefaultTableModel tableModel;
        private Map<String, ImageIcon> weatherIcons;

    public AplikasiCekCuaca1() {
        initComponents();
        tableModel = new DefaultTableModel(new String[]{"Kota", "Temperatur", "Kelembapan", "Cuaca"}, 0);
        tableWeather.setModel(tableModel);
        
        // Menyiapkan ikon cuaca
        weatherIcons = new HashMap<>();
        weatherIcons.put("clear", new ImageIcon(getClass().getResource("/icons/clear.jpg")));
        weatherIcons.put("cloudy", new ImageIcon(getClass().getResource("/icons/cloudy.png")));
        weatherIcons.put("rain", new ImageIcon(getClass().getResource("/icons/rain.png")));

    
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonCheckWeather = new javax.swing.JButton();
        favorit = new javax.swing.JButton();
        export = new javax.swing.JButton();
        favoriteComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        iconLabel = new javax.swing.JLabel();
        iconLabel2 = new javax.swing.JLabel();
        textFieldLocation = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableWeather = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));

        buttonCheckWeather.setText("Cek Cuaca");
        buttonCheckWeather.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCheckWeatherActionPerformed(evt);
            }
        });

        favorit.setText("Tambah Favorit");
        favorit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                favoritActionPerformed(evt);
            }
        });

        export.setText("Export");
        export.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportActionPerformed(evt);
            }
        });

        jLabel3.setText("Favorit");

        jLabel4.setText("Pilih Lokasi");

        iconLabel2.setText("Gambar");

        tableWeather.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableWeather);

        jButton1.setText("Import");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(85, 85, 85)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(textFieldLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(favoriteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(buttonCheckWeather)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(favorit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(export)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(iconLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(iconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(favoriteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(iconLabel2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonCheckWeather)
                            .addComponent(favorit)
                            .addComponent(export)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(iconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jLabel5.setText("APLIKASI CEK CUACA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
    private void buttonCheckWeatherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCheckWeatherActionPerformed
     String city = textFieldLocation.getText().trim();
        if (city.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Masukkan nama kota!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            // Membentuk URL request ke OpenWeatherMap API
            String apiKey = "f8c8065a006c5d592e17df7597d64f75"; // Ganti dengan API key Anda
            String urlString = "http://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey + "&units=metric";
            URL url = new URL(urlString);
            
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();

            // Periksa apakah respon adalah HTTP 200 (OK)
            if (connection.getResponseCode() != 200) {
                JOptionPane.showMessageDialog(this, "Gagal mendapatkan data cuaca. HTTP Error Code: " + connection.getResponseCode(), "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Membaca respons dari API
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            // Parsing JSON respons
            JSONObject jsonResponse = new JSONObject(response.toString());
            JSONObject main = jsonResponse.getJSONObject("main");
            double temperature = main.getDouble("temp");
            int humidity = main.getInt("humidity");
            String condition = jsonResponse.getJSONArray("weather").getJSONObject(0).getString("description");

            // Tambahkan data ke tabel
            tableModel.addRow(new Object[]{city, temperature, humidity, condition});
              
            

            // Menentukan ikon cuaca berdasarkan kondisi
            if (condition.toLowerCase().contains("clear")) {
                iconLabel.setIcon(weatherIcons.get("clear"));
            } else if (condition.toLowerCase().contains("cloud")) {
                iconLabel.setIcon(weatherIcons.get("cloudy"));
            } else if (condition.toLowerCase().contains("rain")) {
                iconLabel.setIcon(weatherIcons.get("rain"));
            } else {
                iconLabel.setIcon(null);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Data tidak valid atau tidak tersedia: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonCheckWeatherActionPerformed

    private void favoritActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_favoritActionPerformed
         String selectedCity = textFieldLocation.getText().trim();
        if (!selectedCity.equals("Pilih Kota") && !selectedCity.isEmpty()) {
            if (((DefaultComboBoxModel<String>) favoriteComboBox.getModel()).getIndexOf(selectedCity) == -1) {
                favoriteComboBox.addItem(selectedCity);
                JOptionPane.showMessageDialog(this, "Kota " + selectedCity + " ditambahkan ke favorit.");
            } else {
                JOptionPane.showMessageDialog(this, "Kota sudah ada di daftar favorit.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Silakan pilih kota terlebih dahulu.");
        }
    }//GEN-LAST:event_favoritActionPerformed

    private void exportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int userSelection = fileChooser.showSaveDialog(this);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
                // Tulis header tabel
                for (int i = 0; i < tableModel.getColumnCount(); i++) {
                    writer.print(tableModel.getColumnName(i) + ",");
                }
                writer.println();

                // Tulis data tabel
                for (int i = 0; i < tableModel.getRowCount(); i++) {
                    for (int j = 0; j < tableModel.getColumnCount(); j++) {
                        writer.print(tableModel.getValueAt(i, j) + ",");
                    }
                    writer.println();
                }
                JOptionPane.showMessageDialog(this, "Data cuaca berhasil diekspor!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Gagal menyimpan file: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_exportActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
    int userSelection = fileChooser.showOpenDialog(this);
    if (userSelection == JFileChooser.APPROVE_OPTION) {
        File file = fileChooser.getSelectedFile();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Mengabaikan header
                if (line.contains("Kota")) {
                    continue;
                }
                // Memecah data berdasarkan koma
                String[] data = line.split(",");
                if (data.length == 4) {
                    String city = data[0];
                    double temperature = Double.parseDouble(data[1]);
                    int humidity = Integer.parseInt(data[2]);
                    String condition = data[3];

                    // Menambahkan data ke dalam tabel
                    tableModel.addRow(new Object[]{city, temperature, humidity, condition});
                }
            }
            JOptionPane.showMessageDialog(this, "Data berhasil diimpor!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Gagal membuka file: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AplikasiCekCuaca1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplikasiCekCuaca1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplikasiCekCuaca1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplikasiCekCuaca1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplikasiCekCuaca1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCheckWeather;
    private javax.swing.JButton export;
    private javax.swing.JButton favorit;
    private javax.swing.JComboBox<String> favoriteComboBox;
    private javax.swing.JLabel iconLabel;
    private javax.swing.JLabel iconLabel2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableWeather;
    private javax.swing.JTextField textFieldLocation;
    // End of variables declaration//GEN-END:variables
}
