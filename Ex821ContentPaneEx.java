import javax.swing.*;
import java.awt.*;

public class Ex821ContentPaneEx extends JFrame {
    public Ex821ContentPaneEx() {
        setTitle("ContentPane과 JFrame 예제"); // 프레임의 타이틀 달기
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // getContentPane()을 사용하지 않고 JFrame에 직접 설정
        getContentPane().setBackground(Color.ORANGE); // JFrame 배경색 설정 (실제로는 ContentPane에 적용됨)
        getContentPane().setLayout(new FlowLayout()); // JFrame에 직접 레이아웃 설정

        add(new JButton("OK"));      // OK 버튼 달기
        add(new JButton("Cancel"));  // Cancel 버튼 달기
        add(new JButton("Ignore"));  // Ignore 버튼 달기

        setSize(300, 150); // 프레임 크기 300x150 설정
        setVisible(true);  // 화면에 프레임 출력
    }

    public static void main(String[] args) {
        new Ex821ContentPaneEx();
    }
}