package application.unit;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.util.Comparator;
import java.util.List;
import application.entity.Appliance;
import application.entity.criteria.Criteria;
import application.entity.criteria.SearchCriteria;
import application.service.ApplianceService;
import application.service.ServiceFactory;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
    /**
     * Service factory
     */
    private ServiceFactory serviceFactory;

    /**
     * Appliance service
     */
    private ApplianceService applianceService;

    /**
     * Kettle criteria
     */
    private Criteria kettleCriteria;

    /**
     * Create the test case
     *
     * @param testName - name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return Test - the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Before tests
     */
    public void setUp() {
        serviceFactory = ServiceFactory.getInstance();
        applianceService = serviceFactory.getApplianceService();
        kettleCriteria = new Criteria(SearchCriteria.Kettle.getGroupName());
    }

    /**
     * Test appliance service getAll method
     */
    public void testGetAllMethod() {
        List<Appliance> result = applianceService.getAll();

        assertNotNull(result);
        assertEquals(15, result.size());
        for (Appliance appliance: result) {
            assertNotNull(appliance);
        }
    }

    /**
     * Test appliance service getByCriteria method
     */
    public void testGetByCriteriaMethod() {
        List<Appliance> result = applianceService.getByCriteria(kettleCriteria);

        assertNotNull(result);
        assertEquals(3, result.size());
        for (Appliance appliance: result) {
            assertNotNull(appliance);
        }
    }

    /**
     * Test appliance service getByMinPrice method
     */
    public void testGetByMinPriceMethod() {
        List<Appliance> result = applianceService.getByMinPrice(Comparator.comparing(Appliance::getPrice));

        assertNotNull(result);
        assertEquals(2, result.size());
        for (Appliance appliance: result) {
            assertNotNull(appliance);
        }
    }
}
