package main.love.cong.Gui;

import main.love.cong.LineSQL.ClassSQL;
import main.love.cong.LineSQL.LoginSQL;
import main.love.cong.LineSQL.UserInfo;

import javax.swing.*;
import javax.swing.border.MatteBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import static main.love.cong.Gui.interfaceGui.username;


public class AdminGUI {
    public static JButton Class = new JButton("班级管理");
    public static JButton course = new JButton("课程管理");
    public static JButton grades = new JButton("成绩管理");
    public static JButton School = new JButton("学籍管理");
    public static JButton SystemAdmin = new JButton("系统管理");
    public static JButton exit = new JButton("退出系统");

    public static JLabel universalPenel = new JLabel();


    public static JFrame Admininterface = new JFrame("学生管理系统(教师端)" + "\t" + "尊敬的:" + username.getText());

    public static void AdminGUI() {

        Admininterface.setSize(1280, 800);
        Admininterface.setResizable(false);
        //加载图片资源
        ClassLoader classLoader = interfaceGui.class.getClassLoader();
        java.net.URL logo = classLoader.getResource("Photo/MIFlogo.png");
        //创建学校Title
        JLabel Title = new JLabel("麻省理工");
        Title.setBounds(30, 28, 200, 50);
        Title.setFont(new Font("飞波正点体", Font.ITALIC, 50));
        Title.setForeground(Color.RED);


        //第一个面板
        JPanel Panel1 = new JPanel();
        Panel1.setBounds(0, 0, 230, 100);
        Panel1.setBorder(BorderFactory.createMatteBorder(200, 200, 200, 200, Color.BLUE));
        Panel1.setLayout(null);
        Panel1.add(Title);

        //创建第一个功能--班级管理
        Class.setBounds(0, 0, 230, 100);
        Class.setFont(new Font("微软雅黑", Font.BOLD, 24));
        Class.setForeground(Color.LIGHT_GRAY);
        //第二个面板
        JPanel Panel2 = new JPanel();
        Panel2.setBounds(0, 100, 230, 100);
        Panel2.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
        Panel2.setLayout(null);
        Panel2.add(Class);

        //创建第二个功能--课程管理
        course.setBounds(0, 0, 230, 100);
        course.setFont(new Font("微软雅黑", Font.BOLD, 24));
        course.setForeground(Color.LIGHT_GRAY);
        //第三个面板
        JPanel Panel3 = new JPanel();
        Panel3.setBounds(0, 200, 230, 100);
        Panel3.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
        Panel3.setLayout(null);
        Panel3.add(course);

        //创建第三个功能--成绩管理
        grades.setBounds(0, 0, 230, 100);
        grades.setFont(new Font("微软雅黑", Font.BOLD, 24));
        grades.setForeground(Color.LIGHT_GRAY);
        //第四个面板
        JPanel Panel4 = new JPanel();
        Panel4.setBounds(0, 300, 230, 100);
        Panel4.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
        Panel4.setLayout(null);
        Panel4.add(grades);

        //创建第四个功能--学籍管理
        School.setBounds(0, 0, 230, 100);
        School.setFont(new Font("微软雅黑", Font.BOLD, 24));
        School.setForeground(Color.LIGHT_GRAY);
        //第五个面板
        JPanel Panel5 = new JPanel();
        Panel5.setBounds(0, 400, 230, 100);
        Panel5.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
        Panel5.setLayout(null);
        Panel5.add(School);

        //创建第五个功能--系统管理
        SystemAdmin.setBounds(0, 0, 230, 100);
        SystemAdmin.setFont(new Font("微软雅黑", Font.BOLD, 24));
        SystemAdmin.setForeground(Color.LIGHT_GRAY);
        //第六个面板
        JPanel Panel6 = new JPanel();
        Panel6.setBounds(0, 500, 230, 100);
        Panel6.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
        Panel6.setLayout(null);
        Panel6.add(SystemAdmin);
        //创建第五个功能--系统管理
        exit.setBounds(0, 0, 230, 100);
        exit.setFont(new Font("微软雅黑", Font.BOLD, 24));
        exit.setForeground(Color.RED);
        //第六个面板
        JPanel Panel7 = new JPanel();
        Panel7.setBounds(0, 600, 230, 100);
        Panel7.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
        Panel7.setLayout(null);
        Panel7.add(exit);


        universalPenel.setBounds(230, 0, 1050, 600);//通用面板参数

        JLabel Text1 = new JLabel("-----------------------------------------------------------------------------------------------------------------------");
        Text1.setBounds(250, 60, 600, 10);

        JLabel Text2 = new JLabel("麻省理工学院学生管理系统");
        Text2.setBounds(275, 15, 450, 60);
        Text2.setFont(new Font("微软雅黑", Font.BOLD, 35));
        Text2.setForeground(Color.BLACK);
        //供调整的组件
        JTextArea Text3 = new JTextArea();
        Text3.setBounds(10, 80, 1000, 500);
        Text3.setOpaque(false);
        Text3.setFont(new Font("宋体", Font.PLAIN, 20));
        Text3.setText("麻省理工学院（Massachusetts Institute of Technology，简称MIT）\n" +
                "是一所位于美国马萨诸塞州剑桥市的著名私立研究型大学。以下是其简介：\n" +
                "\n" +
                "麻省理工学院简介\n" +
                "麻省理工学院成立于1861年，因应当时美国工业化的需求，旨在推进科学、工程、技术和相关领域的教育与研究。MIT以其卓越的学术水平、创新的科研成果和培养出众多杰出人才而闻名世界。\n" +
                "\n" +
                "学术与研究\n" +
                "MIT设有五个学院：\n" +
                "\n" +
                "1.理学院\n" +
                "2.工程学院\n" +
                "3.建筑与规划学院\n" +
                "4.斯隆管理学院\n" +
                "5.人文、艺术与社会科学学院\n" +
                "这些学院涵盖了从基础科学到工程技术、人文学科、管理学等多个学术领域。\n" +
                "MIT的研究机构包括林肯实验室、计算机科学与人工智能实验室、媒体实验室等，在全球范围内具有重要影响力。\n" +
                "\n" +
                "卓越贡献\n" +
                "技术创新：MIT在人工智能、机器人技术、生物技术、纳米技术等多个前沿领域处于领先地位。\n" +
                "创业精神：MIT培养了大量的企业家，许多知名企业如Intel、Qualcomm、Dropbox等均由MIT校友创立。\n" +
                "诺贝尔奖：MIT的教授和校友中有多位诺贝尔奖得主，涵盖物理学、化学、经济学等多个领域。");
        universalPenel.add(Text3);
        universalPenel.add(Text1);
        universalPenel.add(Text2);

        //面板创建区域---------------------------------------------------------------------------------------------------------------------------
        //Class面板-----------------------------------------------------------------------------------------------------------------------------
        JPanel ClassPenel = new JPanel();
        ClassPenel.setBounds(245, 80, 1000, 520);
        ClassPenel.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
        ClassPenel.setLayout(null);

        JPanel classPanel = new JPanel();
        classPanel.setBounds(245, 80, 1000, 520);
        classPanel.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
        classPanel.setLayout(new BorderLayout());
        // 创建并添加标题面板

        JPanel headerPanel = new JPanel();
        headerPanel.setLayout(new GridLayout(1, 6, 20, 20)); // 使用GridLayout设置固定的间距

        JLabel classLabel1 = new JLabel("学生学号");
        classLabel1.setForeground(Color.RED);
        classLabel1.setFont(new Font("微软雅黑", Font.BOLD, 20));
        headerPanel.add(classLabel1);

        JLabel classLabel2 = new JLabel("学生姓名");
        classLabel2.setForeground(Color.RED);
        classLabel2.setFont(new Font("微软雅黑", Font.BOLD, 20));
        headerPanel.add(classLabel2);

        JLabel classLabel3 = new JLabel("学生年龄");
        classLabel3.setForeground(Color.RED);
        classLabel3.setFont(new Font("微软雅黑", Font.BOLD, 20));
        headerPanel.add(classLabel3);

        JLabel classLabel4 = new JLabel("学生性别");
        classLabel4.setForeground(Color.RED);
        classLabel4.setFont(new Font("微软雅黑", Font.BOLD, 20));
        headerPanel.add(classLabel4);

        JLabel classLabel5 = new JLabel("学生专业");
        classLabel5.setForeground(Color.RED);
        classLabel5.setFont(new Font("微软雅黑", Font.BOLD, 20));
        headerPanel.add(classLabel5);

        JLabel classLabel6 = new JLabel("学生户籍");
        classLabel6.setForeground(Color.RED);
        classLabel6.setFont(new Font("微软雅黑", Font.BOLD, 20));
        headerPanel.add(classLabel6);

        classPanel.add(headerPanel, BorderLayout.NORTH);

        // 创建并添加内容面板
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));

        List<UserInfo> students = ClassSQL.getAllStudents();

        for (UserInfo student : students) {
            JPanel studentPanel = new JPanel();
            studentPanel.setLayout(new GridLayout(1, 6, 10, 10)); // 设置固定的间距

            JLabel studentIDLabel = new JLabel(student.getId());
            studentIDLabel.setFont(new Font("微软雅黑", Font.BOLD, 20));
            studentPanel.add(studentIDLabel);

            JLabel studentNameLabel = new JLabel(student.getName());
            studentNameLabel.setFont(new Font("微软雅黑", Font.BOLD, 20));
            studentPanel.add(studentNameLabel);

            JLabel studentAgeLabel = new JLabel(student.getAge());
            studentAgeLabel.setFont(new Font("微软雅黑", Font.BOLD, 20));
            studentPanel.add(studentAgeLabel);

            JLabel studentGenderLabel = new JLabel(student.getGender());
            studentGenderLabel.setFont(new Font("微软雅黑", Font.BOLD, 20));
            studentPanel.add(studentGenderLabel);

            JLabel studentDomicileLabel = new JLabel(student.getDomicile());
            studentDomicileLabel.setFont(new Font("微软雅黑", Font.BOLD, 20));
            studentPanel.add(studentDomicileLabel);

            JLabel studentSpecializedLabel = new JLabel(student.getSpecialized());
            studentSpecializedLabel.setFont(new Font("微软雅黑", Font.BOLD, 20));
            studentPanel.add(studentSpecializedLabel);

            contentPanel.add(studentPanel);
            contentPanel.add(Box.createRigidArea(new Dimension(0, 10))); // 行之间的固定间距
        }

        JScrollPane scrollPane = new JScrollPane(contentPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        classPanel.add(scrollPane, BorderLayout.CENTER);


            //Class面板结束-------------------------------------------------------------------------------------------------------------------------
            //Course面板---------------------------------------------------------------------------------------------------------------------------
            JPanel coursePenel = new JPanel();
            coursePenel.setBounds(230, 200, 1050, 600);
            coursePenel.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
            coursePenel.setLayout(null);
            //Course面板结束-------------------------------------------------------------------------------------------------------------------------
            //grades面板
            JPanel gradesPenel = new JPanel();
            gradesPenel.setBounds(230, 200, 1050, 600);
            gradesPenel.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
            gradesPenel.setLayout(null);
            //grades面板结束-------------------------------------------------------------------------------------------------------------------------
            //School面板----------------------------------------------------------------------------------------------------------------------------
            JPanel schoolPenel = new JPanel();
            schoolPenel.setBounds(230, 200, 1050, 600);
            schoolPenel.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
            schoolPenel.setLayout(null);
            //School面板结束-------------------------------------------------------------------------------------------------------------------------
            //SystemAdmin面板-----------------------------------------------------------------------------------------------------------------------
            JPanel systemadminPenel = new JPanel();
            systemadminPenel.setBounds(245, 80, 1000, 520);
            systemadminPenel.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.darkGray));
            systemadminPenel.setLayout(null);

            JLabel SystemText1 = new JLabel();
            SystemText1.setText("修改密码：");
            SystemText1.setBounds(250, 130, 200, 50);
            SystemText1.setFont(new Font("微软雅黑", Font.BOLD, 30));
            SystemText1.setForeground(Color.RED);

            JTextField SystemText2 = new JTextField();//修改密码文本框
            SystemText2.setBounds(400, 132, 300, 50);
            SystemText2.setFont(new Font("微软雅黑", Font.BOLD, 20));
            SystemText2.setBackground(new Color(255, 255, 255));
            SystemText2.setPreferredSize(new Dimension(150, 28));

            JLabel SystemText3 = new JLabel();
            SystemText3.setText("重复密码：");
            SystemText3.setBounds(250, 230, 200, 50);
            SystemText3.setFont(new Font("微软雅黑", Font.BOLD, 30));
            SystemText3.setForeground(Color.RED);

            JTextField SystemText4 = new JTextField();//重复密码文本框
            SystemText4.setBounds(400, 232, 300, 50);
            SystemText4.setFont(new Font("微软雅黑", Font.BOLD, 20));
            SystemText4.setBackground(new Color(255, 255, 255));
            SystemText4.setPreferredSize(new Dimension(150, 28));

            JButton systemButton1 = new JButton();
            systemButton1.setText("确认修改");
            systemButton1.setFont(new Font("微软雅黑", Font.BOLD, 15));
            systemButton1.setBounds(420, 300, 100, 50);
            systemButton1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (SystemText2.getText().length() >= 10) {
                        ;
                        if (SystemText4.getText().equals(SystemText2.getText()) || SystemText2.getText().equals(SystemText4.getText())) {
                            LoginSQL.updateUserPassword(username.getText(), SystemText2.getText());
                        } else {
                            JOptionPane.showMessageDialog(null, "两次密码不一致，请重试");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "新密码不符合要求(10位及以上(支持中文))");
                    }
                }
            });
            systemadminPenel.add(SystemText1);
            systemadminPenel.add(SystemText2);
            systemadminPenel.add(SystemText3);
            systemadminPenel.add(SystemText4);
            systemadminPenel.add(systemButton1);
            systemadminPenel.setVisible(false);
            //systemAdmin面板结束--------------------------------------------------------------------------------------------------------------------------
            //监听Class按钮
            Class.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //隐藏面板
                    systemadminPenel.setVisible(false);
                    coursePenel.setVisible(false);
                    schoolPenel.setVisible(false);
                    gradesPenel.setVisible(false);
                    //设置自己的按钮为蓝色
                    Class.setForeground(Color.BLUE);
                    //设置其他按钮为默认
                    course.setForeground(Color.LIGHT_GRAY);
                    grades.setForeground(Color.LIGHT_GRAY);
                    School.setForeground(Color.LIGHT_GRAY);
                    SystemAdmin.setForeground(Color.LIGHT_GRAY);
                    //设置通用模板的中参数
                    Text2.setText("班级管理");
                    Text2.setBounds(410, 20, 200, 50);
                    Text2.setFont(new Font("微软雅黑", Font.BOLD, 40));
                    Text3.setText("");
                    Text3.setBounds(0, 0, 0, 0);

                    //功能在此写
                    classPanel.setVisible(true);
                }
            });

            course.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //隐藏面板
                    classPanel.setVisible(false);
                    schoolPenel.setVisible(false);
                    gradesPenel.setVisible(false);
                    systemadminPenel.setVisible(false);
                    //设置自己的按钮为蓝色
                    course.setForeground(Color.BLUE);
                    //设置其他按钮为默认
                    Class.setForeground(Color.LIGHT_GRAY);
                    grades.setForeground(Color.LIGHT_GRAY);
                    School.setForeground(Color.LIGHT_GRAY);
                    SystemAdmin.setForeground(Color.LIGHT_GRAY);

                    Text2.setText("课程管理");
                    Text2.setBounds(410, 20, 200, 50);
                    Text2.setFont(new Font("微软雅黑", Font.BOLD, 40));
                    Text3.setText("未开放");
                    //功能在此写

                }
            });//监听course组件;

            //监听grades按钮
            grades.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //隐藏面板
                    classPanel.setVisible(false);
                    coursePenel.setVisible(false);
                    schoolPenel.setVisible(false);
                    systemadminPenel.setVisible(false);
                    grades.setForeground(Color.BLUE);//设置自己的按钮为蓝色
                    //设置其他按钮为默认
                    Class.setForeground(Color.LIGHT_GRAY);
                    course.setForeground(Color.LIGHT_GRAY);
                    School.setForeground(Color.LIGHT_GRAY);
                    SystemAdmin.setForeground(Color.LIGHT_GRAY);

                    Text2.setText("成绩管理");
                    Text2.setBounds(410, 20, 200, 50);
                    Text2.setFont(new Font("微软雅黑", Font.BOLD, 40));
                    Text3.setText("未开放");
                    //功能在此写
                }
            });
            //监听Schooldata按钮
            School.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //隐藏面板
                    gradesPenel.setVisible(false);
                    classPanel.setVisible(false);
                    coursePenel.setVisible(false);
                    systemadminPenel.setVisible(false);
                    School.setForeground(Color.BLUE);//设置自己的按钮为蓝色
                    //设置其他按钮为默认
                    Class.setForeground(Color.LIGHT_GRAY);
                    course.setForeground(Color.LIGHT_GRAY);
                    grades.setForeground(Color.LIGHT_GRAY);
                    SystemAdmin.setForeground(Color.LIGHT_GRAY);

                    Text2.setText("学籍管理");
                    Text2.setBounds(410, 20, 200, 50);
                    Text2.setFont(new Font("微软雅黑", Font.BOLD, 40));
                    Text3.setText("未开放");
                    //功能在此写
                }
            });
            //监听SystemAdmin按钮
            SystemAdmin.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //隐藏其他面板
                    ClassPenel.setVisible(false);
                    coursePenel.setVisible(false);
                    schoolPenel.setVisible(false);
                    gradesPenel.setVisible(false);
                    SystemAdmin.setForeground(Color.BLUE);//设置自己的按钮为蓝色
                    //设置其他按钮为默认
                    Class.setForeground(Color.LIGHT_GRAY);
                    course.setForeground(Color.LIGHT_GRAY);
                    grades.setForeground(Color.LIGHT_GRAY);
                    School.setForeground(Color.LIGHT_GRAY);

                    Text2.setText("系统管理");
                    Text2.setBounds(410, 20, 200, 50);
                    Text2.setFont(new Font("微软雅黑", Font.BOLD, 40));
                    Text3.setText("");
                    Text3.setBounds(0, 0, 0, 0);
                    //显示面板
                    systemadminPenel.setVisible(true);
                }
            });

            //监听退出系统
            exit.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Admininterface.dispose();
                }
            });

            Admininterface.add(universalPenel);
            Admininterface.add(systemadminPenel);
            Admininterface.add(classPanel);
            Admininterface.add(coursePenel);
            Admininterface.add(gradesPenel);
            Admininterface.add(schoolPenel);

            //监听系统中的班级管理
            Admininterface.add(Panel7);//退出系统
            Admininterface.add(Panel6);//系统管理
            Admininterface.add(Panel5);//学籍管理
            Admininterface.add(Panel4);//成绩管理
            Admininterface.add(Panel3);//课程管理
            Admininterface.add(Panel2);//班级管理
            Admininterface.add(Panel1);
            Admininterface.setLayout(null);
            Admininterface.setVisible(true);
            // 初始先隐藏全部面板
            classPanel.setVisible(false);
            coursePenel.setVisible(false);
            schoolPenel.setVisible(false);
            gradesPenel.setVisible(false);
            systemadminPenel.setVisible(false);
        }
    }

