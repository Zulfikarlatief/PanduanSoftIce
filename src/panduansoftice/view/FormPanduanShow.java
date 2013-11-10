/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package panduansoftice.view;

import javax.management.StringValueExp;
import javax.swing.ImageIcon;
import panduansoftice.template.ButtonImage;

/**
 *
 * @author zword
 */
public class FormPanduanShow extends javax.swing.JInternalFrame {
    FormDisplay display;
    FormUtama fu;
    String content;
    static int cuPage;
    static int maxPage;

    
   
    /**
     * Creates new form FormInstalasi
     */
    
    public  void setContent(String content){
        this.content = content;
        setDisplay();
        setDescription();
        checkContent(content);
    }
    
    private void checkContent(String content){
        if(content.equals("musVid")){
            maxPage = 2;
            jLabel3.setText("of 2");
        }
        else if(content.equals("instApp")){
            maxPage = 5;
            jLabel3.setText("of 5");
        }
        else if(content.equals("office")){
            maxPage = 4;
            jLabel3.setText("of 4");
        }
        else if(content.equals("modem")){
            maxPage = 8;
            jLabel3.setText("of 8");
        }
    }
    
    public FormPanduanShow(FormUtama fu) {
        initComponents();
        this.fu = fu;
        setDisplay();
        cuPage = Integer.parseInt(jLabel1.getText());
                
        this.setRootPaneCheckingEnabled(false);
        javax.swing.plaf.InternalFrameUI ifu= this.getUI();
((javax.swing.plaf.basic.BasicInternalFrameUI)ifu).setNorthPane(null);
        

    }
    
    public void setDisplay(){
        if(null!=display)
            display.dispose();
        
        display = new FormDisplay(cuPage,content);
        jDesktopPane1.add(display);
        display.setVisible(true);
    }
    
    private void setDescription(){
        if(content=="musVid" && cuPage==2){
            jTextArea1.setText("LinuxSoftice menyediakan \naplikasi yang bisa "
                    + "langsung \ndigunakan untuk memainkan \nfile-file video "
                    + "berjenis \nflv,mpg,mpeg4 dan file \nfile video lainnya. "
                    + "\nYaitu dengan menggunakan \nVLC (Video Lan Client). "
                    + "\nKelebihannya adalah, \npengguna tidak perlu lagi "
                    + "\nmenginstall aplikasi-aplikasi \ntambahan untuk dapat "
                    + "\nmemutar file-file jenis ini. \nPengguna cukup membuka "
                    + "\naplikasi ini dan pilih video \nyang akan dimainkan. "
                    + "\nUntuk mengakses aplikasi ini, \npengguna masuk ke Menu "
                    + "\nUtama->Multimedia->VLC");
        }
        else if(content=="musVid" && cuPage == 1){
            jTextArea1.setText("LinuxSoftice menyediakan \naplikasi yang bisa "
                    + "langsung \ndigunakan untuk memutar \nfile-file musik "
                    + "berjenis \nmp3,ogg dan file \nfile audio lainnya. "
                    + "\nYaitu dengan menggunakan \nAudacious. Kelebihannya \nadalah, "
                    + "penguna tidak \nperlu lagi menginstall \naplikasi-aplikasi "
                    + "tambahan \nuntuk dapat memainkan \nfile-file berjenis ini. "
                    + "\nPengguna cukup membuka \naplikasi ini dan pilih musik \nyang "
                    + "akan dimainkan. \nUntuk mengakses aplikasi \nini pengguna "
                    + "masuk \nke Menu Utama->Multimedia\n->Audacious");
        }
        else if(content=="instApp" && cuPage==1){
            jTextArea1.setText("Didalam softice versi \nkedua ini, pengembang "
                    + "telah \nmenyediakan software baru \nyang dapat pengguna "
                    + "\ngunakan untuk menginstall \naplikasi aplikasi tambahan "
                    + "\nyang dibutuhkan.Yaitu dengan\nmenggunakan aplikasi "
                    + "\nSoftIce software center \nyang akan secara otomatis "
                    + "\nterpasang ketika LinuxSoftice \nselesai terinstall. "
                    + "\nUntuk dapat menginstall \naplikasi-aplikasi tambahan "
                    + "\nmenggunakan software ini. \nPengguna harus \nmengkoneksikan "
                    + "komputer/ \nnotebooknya dengan internet.\nKarena semua data "
                    + "\nyang dibutuhkan untuk \nmenginstall sebuah \naplikasi berada "
                    + "di pusat \ndimana aplikasi tersebut \ndibuat. "
                    + "Untuk mengetahui \ncara penginstalan \naplikasi menggunakan "
                    + "SoftIce \nsoftware center, klik \nnext page untuk melakukan "
                    + "\nproses intalasi aplikasikasi.");
        }
        else if(content=="instApp" && cuPage==2){
            jTextArea1.setText("1. Buka aplikasi \nSoftIce software center \nyang "
                    + "terletak pada \nmenu seperti gambar \ndisamping kiri.");
        }
        else if(content=="instApp" && cuPage==3){
            jTextArea1.setText("2. Berikut adalah \ntampilan SoftIce software "
                    + "\ncenter, dari beberapa \nkategori yang ada,pengguna \nbisa "
                    + "menentukan sendiri \naplikasi apa yang mau \ndi install. ");
        }
        else if(content=="instApp" && cuPage==5){
            jTextArea1.setText("3. Setelah memilih aplikasi \nmana yang akan "
                    + "diinstall. \nKlik install seperti gambar \ndisamping dan "
                    + "tunggu sampai \nproses instalasi selesai. \nKetika aplikasi "
                    + "sudah terinstall, \nakan secara otomatis muncul \npada "
                    + "kategori aplikasi \ntersebut diinstall.");
        }
        else if(content=="office" && cuPage==1){
            jTextArea1.setText("Aplikasi office atau \nperkantoran hampir menjadi "
                    + "\naplikasi wajib yg harus \nada dalam sistem operasi. \nDi "
                    + "dalam sistem operasi \nwindows, ada aplikasi office \nyang "
                    + "sudah populer. \nMicrosoft office, hampir \nseluruh pengguna "
                    + "komputer \nyang bersistem operasi \nwindows menggunakan "
                    + "\naplikasi ini untuk mengerjakan pekerjan perkantoran. "
                    + "\nSeperti mengetik membuat \npresentasi,melakukan "
                    + "\nperhitungan,membuat laporan dll. Di dalam LinuxSoftice "
                    + "\nkami menyediakan aplikasi \nyang bersifat open source "
                    + "\nyaitu libre office. Libre office \nbebas digunakan dan "
                    + "bebas \ndimodifikasi. Karena berlisensi GNU/GPL. "
                    + "Di LinuxSoftice kami memberikan 3 aplikasi penting yg "
                    + "sering digunakan di dalam perkantoran. Yaitu aplikasi "
                    + "\nuntuk mengetik(libre office \nwriter),membuat "
                    + "presentasi\n(libre office impress), \ndan melakukan "
                    + "perhitungan \nkompleks(libre ocfice calc). \nKlik Next untuk "
                    + "mengetahui \nlebih lanjut.");
        }
        else if(content=="office" && cuPage==2){
            jTextArea1.setText("1. Libre office writer, aplikasi \nyang bersifat "
                    + "free and open \nsource. Digunakan untuk \nmelakukan berbagai "
                    + "aktifitas \nseperti membuat surat,\nmengetik dokumen dll. "
                    + "\nWalaupun sifatnya yang free and open source, akan tetapi "
                    + "\nLibreOffice Writer sangat \npowerfull dan handal untuk "
                    + "\ndigunakan. Jika pengguna sudah tidak asing menggunakan "
                    + "\nmicrosft excel 2003,tidak akan\nmembutuhkan waktu yang lama "
                    + "untuk bisa beradaptasi \nmenggunakan libre office \nwriter.");
        }
        else if(content=="office" && cuPage==3){
            jTextArea1.setText("2. Libre office calc, aplikasi yang bersifat "
                    + "free and open source. \nDigunakan untuk melakukan \nberbagai "
                    + "aktifitas seperti \nmelakukan perhitungan \nsederhana, "
                    + "membuat laporan \nkeuangan, dll. Walaupun sifatnya yang "
                    + "free and open source, \nakan tetapi LibreOffice Calc "
                    + "\nsangat powerfull dan handal \nuntuk digunakan. Jika "
                    + "pengguna sudah tidak asing menggunakan microsft excel "
                    + "2003,tidak akan \nmembutuhkan waktu yang lama untuk bisa "
                    + "beradaptasi \nmenggunakan libre office calc");
        }
        else if(content=="office" && cuPage==4){
            jTextArea1.setText("3. Libre office impress, aplikasi \nyang bersifat "
                    + "free and \nopen source. Digunakan untuk \nmelakukan berbagai "
                    + "aktifitas \nseperti membuat presentasi, bahan ajaran dll. "
                    + "Walaupun sifatnya yang free and open source, akan tetapi "
                    + "LibreOffice Impress \nsangat powerfull dan handal \nuntuk "
                    + "digunakan. Jika pengguna sudah tidak asing menggunakan "
                    + "microsft Powerpoint 2003,tidak \nakan membutuhkan waktu yang "
                    + "\nlama untuk bisa beradaptasi \nmenggunakan libre office \nImpress.");
        }
        else if(content=="modem" && cuPage==1){
            jTextArea1.setText("Melakukan instalasi modem \nsangatlah mudah "
                    + "dilakukan \npada LinuxSoftice versi 2 ini. \nTeruma untuk "
                    + "jenis-jenis \nmodem tipe baru, seperti \nHUAWEI dan lain. "
                    + "Pada buku \nmanual ini, kami \nmencontohkan menggunakan "
                    + "modem jenis HUAWEI- E220. \nAda beberapa langkah yang "
                    + "\nharus dilakukan agar modem bisa digunakan secara "
                    + "\nnormal.Setelah modem \ndipasang pada komputer/ \nnotebook, "
                    + "tunggu beberapa \nsaat agar perangkat \nmengenali adanya "
                    + "device \nbaru. Seperti yang telihat \npada gambar disamping "
                    + "kiri. \nLinuxSoftice akan \nmemberikan notifikasi bahwa "
                    + "ditemukannya perangkat baru yang menggunakan GSM \nsebagai "
                    + "akses jaringannya. \nKlik next untuk melanjutkan");
        }
        else if(content=="modem" && cuPage==2){
            jTextArea1.setText("Kita arahkan kursor kita pada \nicon network-"
                    + "monitor seperti \ngambar disamping kiri. Kemudian pilihlah "
                    + "“New Mobile Broadband\n(GSM) connection...”. Klik next "
                    + "\nuntuk melanjutkan");
        }
        else if(content=="modem" && cuPage==3){
            jTextArea1.setText("Munculah window baru yang \nmenunjukkan kepada "
                    + "pengguna untuk bisa melanjutkan proses \ninstalasi modem "
                    + "seperti gambar disamping kiri. Pada window ini \nkita "
                    + "diberikan arahan, terhadap \nlangkah-langkah instalasi "
                    + "modemnya akan seperti apa. Klik saja \ncontinue.Klik next "
                    + "untuk \nmelanjutkan");
        }
        else if(content=="modem" && cuPage==4){
            jTextArea1.setText("Akan diberikan pilihan, dimana \npengguna harus "
                    + "memilih negara mana yang sedang ditempati. \nPada tahap "
                    + "ini, pengguna tidak \nboleh melakukan sembarang \npilihan "
                    + "terhadap negara. Karena setiap negara mewakili beberapa "
                    + "jasa penyedia telekomunikasi \nyang telah developer "
                    + "siapakan \npada network-manager ini.");
        }
        else if(content=="modem" && cuPage==5){
            jTextArea1.setText("Akan diberikan berbagai macam pilihan jenis "
                    + "jasa penyedia \nlayanan telekomunikasi yang \nsaat ini "
                    + "pengguna gunakan pada modem. Tentukan pilihan sesuai "
                    + "dengan jenis layanan \ntelekomunikasi yang saat ini "
                    + "\npengguna gunakan pada modem. Klik next untuk melanjutkan");
        }
        else if(content=="modem" && cuPage==6){
            jTextArea1.setText("Akan diberikan tampilan dimana pengguna harus "
                    + "mengisikan APN yang sesuai dengan jenis \nlayanan "
                    + "telekomunikasi yang \nsedang digunakan. Biasanya \nuntuk "
                    + "langkah ini akan diset \nsecara otomatis ketika \npengguna "
                    + "telah memilih jenis \nprovide/jenis penyedia layanan "
                    + "\ntelekomunikasinya.");
        }
        else if(content=="modem" && cuPage==7){
            jTextArea1.setText("Pastikan data yang dimasukkan dalam proses "
                    + "instalasi modem \ntelah benar. Jika sudah yakin \ndata itu "
                    + "valid. Klik Apply. Jika \nlangkah ini sukses, maka proses "
                    + "instalasi telah selesai. Klik next \nuntuk melanjutkan");
        }
        else if(content=="modem" && cuPage==8){
            jTextArea1.setText("Tampilan proses instalasi akan \nhilang dan hal "
                    + "ini menunjukkan \nbahwa proses insatlasi telah \nsukses "
                    + "dilakukan. Untuk melihat hasil dari instalasi, pengguna "
                    + "\nkembali mengarhakan cursor \npada Network Manager, maka "
                    + "\nakan muncul nama dial up yang \ntadi pengguna lakukan "
                    + "dalam \npenginstalan. Disini kami contoh dengan nama 3gprs.");
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        prevBtn = new javax.swing.JButton();
        nextBtn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(750, 420));

        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        prevBtn.setText("<");
        prevBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevBtnActionPerformed(evt);
            }
        });

        nextBtn.setText(">");
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        jButton3.setText("Kembali");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("1");

        jLabel2.setText("Page ");

        jLabel3.setText("of 5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(prevBtn)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(25, 25, 25)
                        .addComponent(nextBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 23, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDesktopPane1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(prevBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        // TODO add your handling code here:
        if(cuPage!=maxPage)
        cuPage = cuPage + 1;
      
        jLabel1.setText(String.valueOf(cuPage));
        
        setDisplay();
        setDescription();
    }//GEN-LAST:event_nextBtnActionPerformed

    private void prevBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevBtnActionPerformed
        // TODO add your handling code here:
        if(cuPage!=1)
        cuPage = cuPage - 1;
      
        jLabel1.setText(String.valueOf(cuPage));        
        setDisplay();
        setDescription();
    }//GEN-LAST:event_prevBtnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        fu.toPanduan();
        jLabel1.setText("1");
        cuPage = 1;
        setDisplay();
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton nextBtn;
    private javax.swing.JButton prevBtn;
    // End of variables declaration//GEN-END:variables

}
