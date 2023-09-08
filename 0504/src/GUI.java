import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.filechooser.FileNameExtensionFilter;

public class GUI {
    public static void main(String[] args) {
        // 프레임 생성
        JFrame frame = new JFrame("간단한 GUI 예제");
        
        // 파일 선택 생성
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("이미지 파일", "jpg", "png", "gif"));

        // 레이블 생성
        JLabel label = new JLabel();
        
        frame.add(label);
        
        JButton chooseButton = new JButton("이미지 선택");
        chooseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    ImageIcon icon = new ImageIcon(selectedFile.getPath());
                    label.setIcon(icon);
                    frame.pack(); // 이미지 크기에 맞게 창 크기 조정
                }
            }
        });
        
        // 파일 선택 버튼을 프레임에 추가
        frame.add(chooseButton, BorderLayout.SOUTH);

        // 프레임 크기 설정
        frame.setSize(400, 400);

        // 프레임을 화면 중앙에 표시
        frame.setLocationRelativeTo(null);

        // 프레임 종료 동작 설정
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 프레임 표시
        frame.setVisible(true);
        
        
    }
}
