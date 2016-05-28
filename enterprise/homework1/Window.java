package enterprise.homework1;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Window extends JFrame {

    public static void createGUI() {
        JFrame frame = new JFrame("Average time for performance collection operations");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] columnNames = {
                "10K",
                "populate, ns",
                "get, ns",
                "contains, ns",
                "add, ns",
                "remove, ns",
                "iterator.add, ns",
                "iterator.remove, ns"
        };

        String[][] data = {
                {"ArrayList", String.valueOf(Runner.resultsForArrayListFor10KElements[0]), String.valueOf(Runner.resultsForArrayListFor10KElements[1]), String.valueOf(Runner.resultsForArrayListFor10KElements[2]), String.valueOf(Runner.resultsForArrayListFor10KElements[3]), String.valueOf(Runner.resultsForArrayListFor10KElements[4]), String.valueOf(Runner.resultsForArrayListFor10KElements[5]), String.valueOf(Runner.resultsForArrayListFor10KElements[6])},
                {"LinkedList", String.valueOf(Runner.resultsForLinkedListFor10KElements[0]), String.valueOf(Runner.resultsForLinkedListFor10KElements[1]), String.valueOf(Runner.resultsForLinkedListFor10KElements[2]), String.valueOf(Runner.resultsForLinkedListFor10KElements[3]), String.valueOf(Runner.resultsForLinkedListFor10KElements[4]), String.valueOf(Runner.resultsForLinkedListFor10KElements[5]), String.valueOf(Runner.resultsForLinkedListFor10KElements[6]),},
                {"HashSet", String.valueOf(Runner.resultsForHashSetFor10KElements[0]), String.valueOf(Runner.resultsForHashSetFor10KElements[1]), String.valueOf(Runner.resultsForHashSetFor10KElements[2]), String.valueOf(Runner.resultsForHashSetFor10KElements[3]), "", "", ""},
                {"TreeSet", String.valueOf(Runner.resultsForTreeSetFor10KElements[0]), String.valueOf(Runner.resultsForTreeSetFor10KElements[1]), String.valueOf(Runner.resultsForTreeSetFor10KElements[2]), String.valueOf(Runner.resultsForTreeSetFor10KElements[3]), "", "", ""}
        };

        JTable table = new JTable(data, columnNames);

        JScrollPane scrollPane = new JScrollPane(table);

        frame.getContentPane().add(scrollPane);
        frame.setPreferredSize(new Dimension(800, 150));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        JFrame frame2 = new JFrame("Average time for performance collection operations");
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] columnNames2 = {
                "100K",
                "populate, ns",
                "get, ns",
                "contains, ns",
                "add, ns",
                "remove, ns",
                "iterator.add, ns",
                "iterator.remove, ns"
        };

        String[][] data2 = {
                {"ArrayList", String.valueOf(Runner.resultsForArrayListFor100KElements[0]), String.valueOf(Runner.resultsForArrayListFor100KElements[1]), String.valueOf(Runner.resultsForArrayListFor100KElements[2]), String.valueOf(Runner.resultsForArrayListFor100KElements[3]), String.valueOf(Runner.resultsForArrayListFor100KElements[4]), String.valueOf(Runner.resultsForArrayListFor100KElements[5]), String.valueOf(Runner.resultsForArrayListFor100KElements[6])},
                {"LinkedList", String.valueOf(Runner.resultsForLinkedListFor100KElements[0]), String.valueOf(Runner.resultsForLinkedListFor100KElements[1]), String.valueOf(Runner.resultsForLinkedListFor100KElements[2]), String.valueOf(Runner.resultsForLinkedListFor100KElements[3]), String.valueOf(Runner.resultsForLinkedListFor100KElements[4]), String.valueOf(Runner.resultsForLinkedListFor100KElements[5]), String.valueOf(Runner.resultsForLinkedListFor100KElements[6]),},
                {"HashSet", String.valueOf(Runner.resultsForHashSetFor100KElements[0]), String.valueOf(Runner.resultsForHashSetFor100KElements[1]), String.valueOf(Runner.resultsForHashSetFor100KElements[2]), String.valueOf(Runner.resultsForHashSetFor100KElements[3]), "", "", ""},
                {"TreeSet", String.valueOf(Runner.resultsForTreeSetFor100KElements[0]), String.valueOf(Runner.resultsForTreeSetFor100KElements[1]), String.valueOf(Runner.resultsForTreeSetFor100KElements[2]), String.valueOf(Runner.resultsForTreeSetFor100KElements[3]), "", "", ""}
        };

        JTable table2 = new JTable(data2, columnNames2);

        JScrollPane scrollPane2 = new JScrollPane(table2);

        frame2.getContentPane().add(scrollPane2);
        frame2.setPreferredSize(new Dimension(800, 150));
        frame2.pack();
        frame2.setLocationRelativeTo(null);
        frame2.setVisible(true);

        JFrame frame3 = new JFrame("Average time for performance collection operations");
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] columnNames3 = {
                "1000K",
                "populate, ns",
                "get, ns",
                "contains, ns",
                "add, ns",
                "remove, ns",
                "iterator.add, ns",
                "iterator.remove, ns"
        };

        String[][] data3 = {
                {"ArrayList", String.valueOf(Runner.resultsForArrayListFor1000KElements[0]), String.valueOf(Runner.resultsForArrayListFor1000KElements[1]), String.valueOf(Runner.resultsForArrayListFor1000KElements[2]), String.valueOf(Runner.resultsForArrayListFor1000KElements[3]), String.valueOf(Runner.resultsForArrayListFor1000KElements[4]), String.valueOf(Runner.resultsForArrayListFor1000KElements[5]), String.valueOf(Runner.resultsForArrayListFor1000KElements[6])},
                {"LinkedList", String.valueOf(Runner.resultsForLinkedListFor1000KElements[0]), String.valueOf(Runner.resultsForLinkedListFor1000KElements[1]), String.valueOf(Runner.resultsForLinkedListFor1000KElements[2]), String.valueOf(Runner.resultsForLinkedListFor1000KElements[3]), String.valueOf(Runner.resultsForLinkedListFor1000KElements[4]), String.valueOf(Runner.resultsForLinkedListFor1000KElements[5]), String.valueOf(Runner.resultsForLinkedListFor1000KElements[6]),},
                {"HashSet", String.valueOf(Runner.resultsForHashSetFor1000KElements[0]), String.valueOf(Runner.resultsForHashSetFor1000KElements[1]), String.valueOf(Runner.resultsForHashSetFor1000KElements[2]), String.valueOf(Runner.resultsForHashSetFor1000KElements[3]), "", "", ""},
                {"TreeSet", String.valueOf(Runner.resultsForTreeSetFor1000KElements[0]), String.valueOf(Runner.resultsForTreeSetFor1000KElements[1]), String.valueOf(Runner.resultsForTreeSetFor1000KElements[2]), String.valueOf(Runner.resultsForTreeSetFor1000KElements[3]), "", "", ""}
        };

        JTable table3 = new JTable(data3, columnNames3);

        JScrollPane scrollPane3 = new JScrollPane(table3);

        frame3.getContentPane().add(scrollPane3);
        frame3.setPreferredSize(new Dimension(800, 150));
        frame3.pack();
        frame3.setLocationRelativeTo(null);
        frame3.setVisible(true);
    }
}