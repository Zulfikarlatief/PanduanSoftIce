/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package panduansoftice.view;

import javax.swing.ImageIcon;
import panduansoftice.template.ButtonImage;

/**
 *
 * @author zword
 */
public class FormInstalasi extends javax.swing.JInternalFrame {
    FormDisplay display;
    FormUtama fu;
    static int cuPage;
    /**
     * Creates new form FormInstalasi
     */
    public FormInstalasi(FormUtama fu) {
        initComponents();
        this.fu = fu;
        setDisplay();
        cuPage = Integer.parseInt(jLabel1.getText());

        setDescription();
                
        this.setRootPaneCheckingEnabled(false);
        javax.swing.plaf.InternalFrameUI ifu= this.getUI();
((javax.swing.plaf.basic.BasicInternalFrameUI)ifu).setNorthPane(null);
        

    }
    
    private void setDisplay(){
        if(null!=display)
            display.dispose();
        
        display = new FormDisplay(Integer.parseInt(jLabel1.getText()),"SoftInst");
        jDesktopPane1.add(display);
        display.setVisible(true);
    }
    
    private void setDescription(){
        if(cuPage==1){
            jTextArea1.setText("Pastikan proses booting awal sudah diset melaui "
                    + "BIOS atau Removable Disk. Setelah \nbooting dari "
                    + "CD/Removable \nDisk selesai, maka akan \nkeluar pilihan "
                    + "apakah anda \nakan install SoftIce atau \nmencoba "
                    + "(try SoftIce).\n1. Silahkan pilih try SoftIce jika ingin "
                    + "mencoba LinuxSoftIce \natau pilih install jika pengguna "
                    + "sudah yakin untuk melakukan instalasi LinuxSoftIce. "
                    + "Jika \nmemilih try SoftIce, pengguna pengguna akan "
                    + "sampai pada \ntampilan tatap muka \nLinuxSoftIce. Dan bisa "
                    + "\nmelakukan instlasi melalui \nicon install yang ada pada "
                    + "\ndesktop. \n2. Tahap selanjutkan ketika \nsudah melakukan "
                    + "instalasi. \nPengguna akan sampai pada \njendela Welcome dan "
                    + "klik \ncontinue untuk melanjutkan. ");
        }
        else if(cuPage==2){
            jTextArea1.setText("3. Di jendela preparing, pastikan \nHardisk "
                    + "tersedia lebih dari 5 GB \ndan daya listrik stabil yang "
                    + "\nditandai dengan adanya tanda \ncheck di 2 baris pertama. "
                    + "\nKemudian klik next. ");
        }
        else if(cuPage==3){
            jTextArea1.setText("4. Kemudian muncul installation \ntype. Ada "
                    + "beberapa pilihan yang ada, tetapi kami merekomendasikan "
                    + "untuk memilih 'something \nelse'. Hal ini dikarenakan agar "
                    + "\npengguna bisa mengatur partisi sesuai dengan kebutuhan. "
                    + "Klik \ncontinue. ");
        }
        else if(cuPage==4){
            jTextArea1.setText("5. Tahap selanjutnya adalah \nmembuat partisi "
                    + "hardisk. Ada minimal 2 partisi yang harus \nkita buat di "
                    + "linux.  \na. Partisi swap yang nantinya menjadi tambahan "
                    + "memory \nRAM yang akan digunakan \nketika RAM penuh.  \nb. "
                    + "Partisi / (dibaca root). \nMerupakan partisi paling "
                    + "\npenting karena digunakan \nuntuk menyimpan sistem \noperasi "
                    + "LinuxSoftIce. Cara \nmembuat partisi jika anda \nmenggunakan "
                    + "hardisk yang \nmasih kosong. Anda harus \nmemilih menu New "
                    + "Partition \nTable, kemudian pilih free \nspace disk yang "
                    + "ada. \nkemudian klik + (dibaca add) pertama kita buat "
                    + "partisi swap, setelah klik + akan muncul \njendela Create "
                    + "Partition \nsilahkan isi size kurang lebih \n1 GB, type "
                    + "primary, location \nbegining, use as swap area, \nklik OK. "
                    + "Buat partisi / dengan \nklik free space lagi dan klik +. "
                    + "Isi size yang diinginkan untuk menyimpan sistem dan data "
                    + "\nuser minimal 5 GB. type logical, location begining, use "
                    + "as \next4, mount point / . Klik OK");
        }
        else if(cuPage==5){
            jTextArea1.setText("6. Sembari menunggu proses \npengkopian dan "
                    + "konfigurasi \nselesai, pengguna dapat \nmelakukan pengisian "
                    + "time zone, untuk menentukan waktu sesuai dengan tempat "
                    + "dan Negara \nbagian. Kemudian klik continue.");
        }
        else if(cuPage==6){
            jTextArea1.setText("7. Langsung saja klik continue \npada langkah "
                    + "ini. karena jenis \nkeyboard kita adalah QWERTY, \nsama "
                    + "dengan standar USA.");
        }
        else if(cuPage==7){
            jTextArea1.setText("8. Pada tahap ini pengguna \nharus mengisikan "
                    + "identitas dan \npassword. Hal ini diperlukan agar dalam "
                    + "penggunaan LinuxSoftice, tujuannya adalah untuk \nkeamanan "
                    + "data dan sistem \npengguna ketika sudah \nmelakukan "
                    + "instalasi LinuxSoftIce. - 'Automatically' untuk login "
                    + "\notomatis tanpa memasukan \npasword \n- 'Require my password "
                    + "to login' mengharuskan pengguna ketika akan menggunakan "
                    + "LinuxSoftIce harus mengisikan password \nterlebih dahulu. ");
        }
        else if(cuPage==8){
            jTextArea1.setText("9. Pada tahap ini. Pengguna \nhanya perlu "
                    + "menunggu proses \ncopy selesai. Sembari menunggu "
                    + "LinuxSoftIce selesai terinstall, \nPengguna akan "
                    + "ditampilkan \njendela panduan dan informasi \nmengenai "
                    + "softice linux yang \nmemberikan informasi tentang "
                    + "\nfitur-fitur yang ada pada \nLinuxSoftIce versi 2.0.");
        }
        else if(cuPage==9){
            jTextArea1.setText("10. Setelah proses copy \nselesai, maka akan "
                    + "muncul \njendela yang memerintahkan untuk restart "
                    + "komputer. \nSampai langkah ini, proses \ninstalasi "
                    + "LinuxSoftIce 2.0 \nsudah berhsil dilakukan. \nKemudian "
                    + "klik restart. \nNB :\n1.Pada waktu memilih restart pada "
                    + "langkah terakhir tadi. \nDVD instalasi LinuxSoftIce \nakan "
                    + "keluar. Pengguna bisa \nmenggambil DVD dan tunggu sampai "
                    + "proses restart selesai. 2. Ketika pengguna \nmenggunakan "
                    + "Flash Disk pada waktu instalasi, ketika \nmemilih restart "
                    + "maka akan \nmuncul pesan untuk \nmencopot/unplug Removable "
                    + "Disk. Pengguna bisa \nmencabut Flash Disk, dan \nTunggu "
                    + "sampai proses restart selesai.Instalasi selesai, "
                    + "\nselamat bekerja dengan \nsoftice linux.");
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

        jLabel3.setText("of 9");

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
        if(cuPage!=9)
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
        fu.toHome();
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
