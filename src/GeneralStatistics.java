import javax.swing.*;

public class GeneralStatistics extends JPanel{
    JLabel siteLabel = new JLabel("Сайт:");
    JComboBox<String> listOfSites = new JComboBox<String>();
    JButton getButton = new JButton("Получить");

    public GeneralStatistics() {
        setLayout(null);
        siteLabel.setBounds(20, -10, 60, 60);
        listOfSites.setBounds(60, 10, 120,20);
        getButton.setBounds(200,10,140,20);
        listOfSites.addItem("lenta.ru");
        listOfSites.addItem("meduza.ru");
        listOfSites.addItem("ria.ru");

        add(getButton);
        add(siteLabel);
        add(listOfSites);
    }
}
