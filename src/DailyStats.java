import com.michaelbaranov.microba.calendar.DatePicker;

import java.util.Date;
import javax.swing.*;


public class DailyStats extends JPanel {
    JLabel siteLabel = new JLabel("Сайт:");
    JLabel personLabel = new JLabel("Личность:");
    JComboBox<String> listOfSites = new JComboBox<String>();
    JComboBox<String> listOfPersons = new JComboBox<String>();
    JLabel periodLabel1 = new JLabel("Период с:");
    final DatePicker startDate = new DatePicker(new Date());
    JLabel periodLabel2 = new JLabel("по:");
    final DatePicker finishDate = new DatePicker(new Date());
    JButton getButton = new JButton("Получить");

    public DailyStats() {
        setLayout(null);
        siteLabel.setBounds(20, -10, 60, 60);
        listOfSites.setBounds(100, 10, 120, 20);
        personLabel.setBounds(20, 30, 60, 60);
        listOfPersons.setBounds(100, 50, 120, 20);
        getButton.setBounds(360, 90, 140, 20);
        listOfSites.addItem("lenta.ru");
        listOfSites.addItem("meduza.ru");
        listOfSites.addItem("ria.ru");
        listOfPersons.addItem("Путин");
        listOfPersons.addItem("Медведев");
        listOfPersons.addItem("Навальный");
        periodLabel1.setBounds(20, 70, 60, 60);
        startDate.setBounds(100, 90, 100, 20);
        periodLabel2.setBounds(210, 70, 60, 60);
        finishDate.setBounds(240, 90, 100, 20);

        add(siteLabel);
        add(listOfSites);
        add(personLabel);
        add(listOfPersons);
        add(periodLabel1);
        add(startDate);
        add(periodLabel2);
        add(finishDate);
        add(getButton);
    }

}
