import javax.swing.*;

public class UserInterfaceWindows extends JFrame{
    public UserInterfaceWindows() {
        super("Статистический анализ информационных сайтов");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 50, 700, 600);
        setResizable(false);

        JTabbedPane userTabPan = new JTabbedPane(2);
        userTabPan.addTab("Общая статистика", new GeneralStatistics());
        userTabPan.addTab("Ежедневная статистика", new DailyStats());
        add(userTabPan);

        setVisible(true);
    }
}
