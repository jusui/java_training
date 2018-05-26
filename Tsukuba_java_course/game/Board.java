package othello;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Board implements ActionListener{
    
    Piece[][] pButton;
    
    JFrame frame = new JFrame("Othello");
    JPanel panel = new JPanel();
    JButton[][] b = new JButton[8][8];
    
    public Board(){
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(680,700);
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);        
        frame.add(panel);
        
        pButton = new Piece[8][8];
        
        for(int i=0; i<64; i++)
        {
            int x = i/8;
            int y = i%8;
            
            pButton[x][y] = new Piece();
            pButton[x][y].setSize(80,80);
            pButton[x][y].setBounds(x*80+10, y*80+10, 80, 80);
            pButton[x][y].setMargin(new Insets(0,0,0,0));
            pButton[x][y].setBackground(Color.GRAY);
            pButton[x][y].setFont(new Font("ＭＳゴシック", Font.PLAIN, 60));
            pButton[x][y].setActionCommand(String.valueOf(i));            //ボタン判別に利用
            pButton[x][y].addActionListener(this);
            panel.add(pButton[x][y]);
        }
        
    }
    
    public void actionPerformed(ActionEvent e) {
        
        String str = e.getActionCommand();
        System.out.println(str);
        int data = Integer.parseInt(str);
        
        int x = data/8;
        int y = data%8;
        
        if (Piece.p[X+1][y+1] == 0) {            
            Piece.p[x+1][y+1] = Piece.turn;
            Piece.checkRev(x+1,y+1);
            putPiece();
        
            if(Piece.turn == Piece.BLACK){
                Piece.turn = Piece.WHITE;
            }else{
                Piece.turn = Piece.BLACK;
            }
        }
    }

    
    public void putPiece(){
        
        for(int i=0; i<100; i++)
        {
            int x = i/10;
            int y = i%10;
            
            if(Piece.p[x][y] == Piece.BLACK)
            {
                pButton[x-1][y-1].setText("●");                
            }
            else if(Piece.p[x][y] == Piece.WHITE)
            {
                pButton[x-1][y-1].setText("○");
            }
        }
        
    }

} // public class Board implements ActionListener
