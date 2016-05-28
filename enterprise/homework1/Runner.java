package enterprise.homework1;

import javax.swing.*;
import java.util.*;
import static enterprise.homework1.Window.createGUI;

public class Runner {
    static double[] resultsForArrayListFor10KElements;
    static double[] resultsForArrayListFor100KElements;
    static double[] resultsForArrayListFor1000KElements;

    static double[] resultsForLinkedListFor10KElements;
    static double[] resultsForLinkedListFor100KElements;
    static double[] resultsForLinkedListFor1000KElements;

    static double[] resultsForHashSetFor10KElements;
    static double[] resultsForHashSetFor100KElements;
    static double[] resultsForHashSetFor1000KElements;

    static double[] resultsForTreeSetFor10KElements;
    static double[] resultsForTreeSetFor100KElements;
    static double[] resultsForTreeSetFor1000KElements;

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();

        resultsForArrayListFor10KElements =
                CompareEfficiencyOfLists.getAverageTimeForEachOperations(arrayList, 10000);
        arrayList.clear();
        resultsForArrayListFor100KElements =
                CompareEfficiencyOfLists.getAverageTimeForEachOperations(arrayList, 100000);
        arrayList.clear();
        resultsForArrayListFor1000KElements =
                CompareEfficiencyOfLists.getAverageTimeForEachOperations(arrayList, 1000000);


        List<Integer> linkedList = new LinkedList<>();

        resultsForLinkedListFor10KElements =
                CompareEfficiencyOfLists.getAverageTimeForEachOperations(linkedList, 10000);
        linkedList.clear();
        resultsForLinkedListFor100KElements =
                CompareEfficiencyOfLists.getAverageTimeForEachOperations(linkedList, 100000);
        linkedList.clear();
        resultsForLinkedListFor1000KElements =
                CompareEfficiencyOfLists.getAverageTimeForEachOperations(linkedList, 1000000);


        Set<Integer> hashSet = new HashSet<>();

        resultsForHashSetFor10KElements =
                CompareEfficiencyOfSets.getAverageTimeForEachOperations(hashSet, 10000);
        linkedList.clear();
        resultsForHashSetFor100KElements =
                CompareEfficiencyOfSets.getAverageTimeForEachOperations(hashSet, 100000);
        linkedList.clear();
        resultsForHashSetFor1000KElements =
                CompareEfficiencyOfSets.getAverageTimeForEachOperations(hashSet, 1000000);


        Set<Integer> treeSet = new TreeSet<>();

        resultsForTreeSetFor10KElements =
                CompareEfficiencyOfSets.getAverageTimeForEachOperations(treeSet, 10000);
        linkedList.clear();
        resultsForTreeSetFor100KElements =
                CompareEfficiencyOfSets.getAverageTimeForEachOperations(treeSet, 100000);
        linkedList.clear();
        resultsForTreeSetFor1000KElements =
                CompareEfficiencyOfSets.getAverageTimeForEachOperations(treeSet, 1000000);

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                createGUI();
            }
        });
    }
}

