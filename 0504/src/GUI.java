import javax.swing.*;

public class GUI {
    public static void main(String[] args) {
        // ������ ����
        JFrame frame = new JFrame("������ GUI ����");

        // ���̺� ����
        JLabel label = new JLabel("Hello, World!");

        // ���̺��� �����ӿ� �߰�
        frame.add(label);

        // ������ ũ�� ����
        frame.setSize(300, 100);

        // �������� ȭ�� �߾ӿ� ǥ��
        frame.setLocationRelativeTo(null);

        // ������ ���� ���� ����
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ������ ǥ��
        frame.setVisible(true);
    }
}
