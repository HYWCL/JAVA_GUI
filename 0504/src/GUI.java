import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.filechooser.FileNameExtensionFilter;

public class GUI {
    public static void main(String[] args) {
        // ������ ����
        JFrame frame = new JFrame("������ GUI ����");
        
        // ���� ���� ����
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("�̹��� ����", "jpg", "png", "gif"));

        // ���̺� ����
        JLabel label = new JLabel();
        
        frame.add(label);
        
        JButton chooseButton = new JButton("�̹��� ����");
        chooseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    ImageIcon icon = new ImageIcon(selectedFile.getPath());
                    label.setIcon(icon);
                    frame.pack(); // �̹��� ũ�⿡ �°� â ũ�� ����
                }
            }
        });
        
        // ���� ���� ��ư�� �����ӿ� �߰�
        frame.add(chooseButton, BorderLayout.SOUTH);

        // ������ ũ�� ����
        frame.setSize(400, 400);

        // �������� ȭ�� �߾ӿ� ǥ��
        frame.setLocationRelativeTo(null);

        // ������ ���� ���� ����
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ������ ǥ��
        frame.setVisible(true);
        
        
    }
}
