package tests;

import org.junit.platform.engine.TestExecutionResult;
import org.junit.platform.launcher.TestExecutionListener;
import org.junit.platform.launcher.TestIdentifier;

/**
 *
 * @author mathiasjepsen
 */
public class BankSummaryGenerator implements TestExecutionListener {
    
    @Override
    public void executionFinished(TestIdentifier testIdentifier, TestExecutionResult testExecutionResult) {
        System.out.println(testIdentifier.getDisplayName() + " finished with status code: " + testExecutionResult.getStatus() + "\n");
    }
    
}
