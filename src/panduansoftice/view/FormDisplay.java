/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package panduansoftice.view;

import javax.swing.ImageIcon;

/**
 *
 * @author zword
 */
public class FormDisplay extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormDisplay
     */
    public FormDisplay(int text,String content) {
        initComponents();
        
        contentChoice(content,text);
        
               
        this.setRootPaneCheckingEnabled(false);
        javax.swing.plaf.InternalFrameUI ifu= this.getUI();
        ((javax.swing.plaf.basic.BasicInternalFrameUI)ifu).setNorthPane(null);

    }
    
    private void contentChoice(String content,int text){
        if(content =="SoftInst"){
            pictureSel(text);

        }
        else if(content == "musVid"){
            pictureMus(text);
        }
        else if(content == "instApp"){
            pictureInstApp(text);
        }
        else if(content == "office"){
            pictureOffice(text);
        }
        else if(content == "modem"){
            pictureModem(text);
        }
        
    }
    
    private void pictureInstApp(int text){
        if(text==1)
            buttonImage1.setImage(new ImageIcon(getClass().getResource("/panduansoftice/picture/TentangSoftice.jpg")).getImage());
        else if(text==2)
            buttonImage1.setImage(new ImageIcon(getClass().getResource("/panduansoftice/picture/Install1.png")).getImage());
        else if(text==3)
            buttonImage1.setImage(new ImageIcon(getClass().getResource("/panduansoftice/picture/Install2.png")).getImage());
        else if(text==4)
            buttonImage1.setImage(new ImageIcon(getClass().getResource("/panduansoftice/picture/Install3.png")).getImage());
        else if(text==5)
            buttonImage1.setImage(new ImageIcon(getClass().getResource("/panduansoftice/picture/Install4.png")).getImage());
        
    }
    
    private void pictureSel(int text){
if(text==1)
            buttonImage1.setImage(new ImageIcon(getClass().getResource("/panduansoftice/picture/Soft1.png")).getImage());
        else if(text==2)
            buttonImage1.setImage(new ImageIcon(getClass().getResource("/panduansoftice/picture/Soft2.png")).getImage());
        else if(text==3)
            buttonImage1.setImage(new ImageIcon(getClass().getResource("/panduansoftice/picture/Soft3.png")).getImage());
        else if(text==4)
            buttonImage1.setImage(new ImageIcon(getClass().getResource("/panduansoftice/picture/Soft4.png")).getImage());
        else if(text==5)
            buttonImage1.setImage(new ImageIcon(getClass().getResource("/panduansoftice/picture/Soft5.png")).getImage());
        else if(text==6)
            buttonImage1.setImage(new ImageIcon(getClass().getResource("/panduansoftice/picture/Soft6.png")).getImage());
        else if(text==7)
            buttonImage1.setImage(new ImageIcon(getClass().getResource("/panduansoftice/picture/Soft7.png")).getImage());
        else if(text==8)
            buttonImage1.setImage(new ImageIcon(getClass().getResource("/panduansoftice/picture/Soft8.png")).getImage());
        else if(text==9)
            buttonImage1.setImage(new ImageIcon(getClass().getResource("/panduansoftice/picture/Soft9.png")).getImage());
          
    }
    
    private void pictureMus(int text){
        if(text==1)
            buttonImage1.setImage(new ImageIcon(getClass().getResource("/panduansoftice/picture/mp3.png")).getImage());
        else if(text==2)
            buttonImage1.setImage(new ImageIcon(getClass().getResource("/panduansoftice/picture/video.png")).getImage());
        
    }
    
    private void pictureOffice(int text){
        if(text==1)
            buttonImage1.setImage(new ImageIcon(getClass().getResource("/panduansoftice/picture/Office1.png")).getImage());
        else if(text==2)
            buttonImage1.setImage(new ImageIcon(getClass().getResource("/panduansoftice/picture/Office2.png")).getImage());
        else if(text==3)
            buttonImage1.setImage(new ImageIcon(getClass().getResource("/panduansoftice/picture/Office3.png")).getImage());
        else if(text==4)
            buttonImage1.setImage(new ImageIcon(getClass().getResource("/panduansoftice/picture/Office4.png")).getImage());
        
    }
    
    private void pictureModem(int text){
        if(text==1)
            buttonImage1.setImage(new ImageIcon(getClass().getResource("/panduansoftice/picture/Modem1.png")).getImage());
        else if(text==2)
            buttonImage1.setImage(new ImageIcon(getClass().getResource("/panduansoftice/picture/Modem2.png")).getImage());
        else if(text==3)
            buttonImage1.setImage(new ImageIcon(getClass().getResource("/panduansoftice/picture/Modem3.png")).getImage());
        else if(text==4)
            buttonImage1.setImage(new ImageIcon(getClass().getResource("/panduansoftice/picture/Modem4.png")).getImage());
        else if(text==5)
            buttonImage1.setImage(new ImageIcon(getClass().getResource("/panduansoftice/picture/Modem5.png")).getImage());
        else if(text==6)
            buttonImage1.setImage(new ImageIcon(getClass().getResource("/panduansoftice/picture/Modem6.png")).getImage());
        else if(text==7)
            buttonImage1.setImage(new ImageIcon(getClass().getResource("/panduansoftice/picture/Modem7.png")).getImage());
        else if(text==8)
            buttonImage1.setImage(new ImageIcon(getClass().getResource("/panduansoftice/picture/Modem8.png")).getImage());
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonImage1 = new panduansoftice.template.ButtonImage();

        setPreferredSize(new java.awt.Dimension(450, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonImage1, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonImage1, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private panduansoftice.template.ButtonImage buttonImage1;
    // End of variables declaration//GEN-END:variables
}
