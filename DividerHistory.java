package eu.afea.training.mockito.exercise;

import java.util.ArrayList;
import java.util.List;

public class DividerHistory {

    private static final DividerHistory instance = new DividerHistory();
    private List<DivisionResult> results;
    private static boolean started = false;

    private DividerHistory() {
        reset();
    }

    public static DividerHistory getInstance() {
        if (!started) {
            throw new UnsupportedOperationException("DividerHistory system must be started first.");
        }
        return instance;
    }

    public static void start() {
        doExpensiveOperation();
        started = true;
    }

    private static void doExpensiveOperation() {
        System.out.println("Doing expensive operation. Please wait...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void stop() {
        doExpensiveOperation();
        started = false;
    }

    public List<DivisionResult> getResults() {
        return results;
    }

    public void registerResult(DivisionResult result) {
        results.add(result);
    }

    public void reset() {
        results = new ArrayList<DivisionResult>();
    }

}