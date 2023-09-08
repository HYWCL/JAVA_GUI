import javax.swing.*;

public class GUI {
    public static void main(String[] args) {
        // 프레임 생성
        JFrame frame = new JFrame("간단한 GUI 예제");

        // 레이블 생성
        JLabel label = new JLabel("Hello, World!");

        // 레이블을 프레임에 추가
        frame.add(label);

        // 프레임 크기 설정
        frame.setSize(300, 100);

        // 프레임을 화면 중앙에 표시
        frame.setLocationRelativeTo(null);

        // 프레임 종료 동작 설정
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 프레임 표시
        frame.setVisible(true);
    }
}
