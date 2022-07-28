package testimonials.service.factory;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import service.attractionsservice.AttractionsServiceImpl;
import service.attractionsservice.IAttractionsService;
import service.customerservice.CustomerServiceImpl;
import service.customerservice.ICustomerService;
import service.exceptions.ServiceLoadException;
import service.factory.ServiceFactory;
import service.reviewsservice.IReviewsService;
import service.reviewsservice.ReviewsServiceImpl;

public class ServiceFactoryTest {

	ServiceFactory serviceFactory;
	
	@Before
	public void setUp() throws Exception {
		serviceFactory = ServiceFactory.getInstance();		
	}
	
	@Test
	public void testGetCustomerService() {
 		ICustomerService customerService;
		try {
			customerService = (ICustomerService)serviceFactory.getService(ICustomerService.NAME);
	  	    assertTrue(customerService instanceof CustomerServiceImpl);
	        System.out.println("testCustomerService PASSED");	  	    
		} catch (ServiceLoadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("ServiceLoadException");
		}
	}
	
	@Test
	public void testGetAttrcationsService() {
 		IAttractionsService attractionsService;
		try {
			attractionsService = (IAttractionsService)serviceFactory.getService(ICustomerService.NAME);
	  	    assertTrue(attractionsService instanceof AttractionsServiceImpl);
	        System.out.println("testAttractionsService PASSED");	  	    
		} catch (ServiceLoadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("ServiceLoadException");
		}
	}
	
	@Test
	public void testGetReviewsService() {
 		IReviewsService reviewsService;
		try {
			reviewsService = (IReviewsService)serviceFactory.getService(IReviewsService.NAME);
	  	    assertTrue(reviewsService instanceof ReviewsServiceImpl);
	        System.out.println("testReviewsService PASSED");	  	    
		} catch (ServiceLoadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("ServiceLoadException");
		}
	}
	
}
