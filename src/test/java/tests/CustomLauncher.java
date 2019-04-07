package tests;

import static org.junit.platform.engine.discovery.ClassNameFilter.includeClassNamePatterns;
import static org.junit.platform.engine.discovery.DiscoverySelectors.selectClass;
import static org.junit.platform.engine.discovery.DiscoverySelectors.selectPackage;
import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;


/**
 *
 * @author mathiasjepsen
 */
public class CustomLauncher {

    public static void main(String[] args) {
        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
                .selectors(
                        selectPackage("tests"),
                        selectClass(UnitTests.class)
                )
                .filters(
                        includeClassNamePatterns(".*Tests")
                )
                .build();

        Launcher launcher = LauncherFactory.create();

        BankSummaryGenerator listener = new BankSummaryGenerator();
        launcher.registerTestExecutionListeners(listener);

        launcher.execute(request);
        
    }

}
