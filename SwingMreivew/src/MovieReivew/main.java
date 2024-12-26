package MovieReivew;

import java.awt.*;
import javax.swing.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf = new JFrame();
		jf.setSize(1000,800);
		
		jf.setVisible(true);	//창을 눈에 보이도록 함
		jf.setResizable(false);	//사이즈 재조정 불가능
		jf.setLocationRelativeTo(null);	//창이 가운데에 뜨도록 함
		jf.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);	//창을 끄면 프로그램을 종료
		
	}

}
