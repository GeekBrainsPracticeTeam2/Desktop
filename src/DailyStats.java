import javax.swing.*;

public class DailyStats extends JPanel{
    JLabel siteLabel = new JLabel("Сайт:");
    JLabel personLabel = new JLabel("Личность:");
    JComboBox<String> listOfSites = new JComboBox<String>();
    JComboBox<String> listOfPersons = new JComboBox<String>();
    JLabel periodLabel1 = new JLabel("Период с:");

    JLabel periodLabel2 = new JLabel("по:");
    JButton getButton = new JButton("Получить");

    public DailyStats() {
        setLayout(null);
        siteLabel.setBounds(20, -10, 60, 60);
        listOfSites.setBounds(100, 10, 120, 20);
        personLabel.setBounds(20, 30, 60, 60);
        listOfPersons.setBounds(100, 50, 120, 20);
        getButton.setBounds(260, 90, 140, 20);
        listOfSites.addItem("lenta.ru");
        listOfSites.addItem("meduza.ru");
        listOfSites.addItem("ria.ru");
        periodLabel1.setBounds(20, 70, 60, 60);
        periodLabel2.setBounds(160, 70, 60, 60);

        add(siteLabel);
        add(listOfSites);
        add(personLabel);
        add(listOfPersons);
        add(periodLabel1);
        add(periodLabel2);
        add(getButton);
    }
}
