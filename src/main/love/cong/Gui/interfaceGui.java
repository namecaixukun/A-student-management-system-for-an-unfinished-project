package main.love.cong.Gui;

import main.love.cong.LineSQL.LoginSQL;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class interfaceGui {
    //创建全局登录面板
    public static JFrame Login = new JFrame("学生管理系统(教师端)");
    //创建全局姓名
    public static JTextField username = new JTextField();
    public static void interfaceGUI(){
        Login.setSize(1280,800);
        Login.setResizable(false);

        //加载图片资源
        ClassLoader classLoader = interfaceGui.class.getClassLoader();
        java.net.URL login1 = classLoader.getResource("login/login2.jpg");
        java.net.URL login2 = classLoader.getResource("login/login.png");


        //创建登录面板
        JLabel LoginData = new JLabel();
        LoginData.setBounds(0,0,1280,800);
        LoginData.setIcon(new ImageIcon(login2));
        LoginData.setOpaque(false);
        JLabel LoginTitle = new JLabel();
        LoginTitle.setBounds(0,0,1280,800);
        LoginTitle.setIcon(new ImageIcon(login1));

        //创建登陆姓名
        JLabel user = new JLabel("登陆账号:");
        user.setBounds(490,270,92,45);
        user.setFont(new Font("微软雅黑", Font.BOLD,20));
        //创建登陆密码
        JLabel pass = new JLabel("登陆密码:");
        pass.setBounds(490,330,92,45);
        pass.setFont(new Font("微软雅黑", Font.BOLD,20));
        //创建登录账户文本框
        username.setBounds(580,270,200,45);
        username.setFont(new Font("微软雅黑", Font.BOLD,20));
        username.setBackground(new Color(255, 255, 255));
        username.setPreferredSize(new Dimension(150, 28));
        MatteBorder username1 = new MatteBorder(0, 0, 3, 0, new Color(192, 192, 192));
        username.setBorder(username1);
        //创建登录密码文本框
        JTextField password = new JTextField();
        password.setBounds(580,330,200,45);
        password.setFont(new Font("微软雅黑", Font.BOLD,20));
        password.setBackground(new Color(255, 255, 255));
        password.setPreferredSize(new Dimension(150, 28));
        MatteBorder passworld1 = new MatteBorder(0, 0, 3, 0, new Color(192, 192, 192));
        password.setBorder(passworld1);
        //创建登录按钮
        JButton loginButton = new JButton("登陆");
        loginButton.setBounds(590,400,90,35);
        loginButton.setFont(new Font("微软雅黑", Font.BOLD,20));
        loginButton.setForeground(Color.lightGray);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(new LoginSQL().LoginSQL(username.getText(), password.getText()) == null){
                    JOptionPane.showMessageDialog(null, "账号或密码不正确");
                }else{
                    AdminGUI.AdminGUI();
                    Login.dispose();
                }
            }
        });


        Login.add(user);
        Login.add(username);
        Login.add(pass);
        Login.add(password);
        Login.add(loginButton);

        Login.add(LoginData);
        Login.add(LoginTitle);

        Login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Login.setLayout(null);
        Login.setVisible(true);
    }
}
