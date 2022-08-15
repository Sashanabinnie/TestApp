 package testimonials.business.manager;

import business.manager.AttractionsManager;
import domain.Attractions;
import service.reviewsservice.IReviewsService;
import domain.Reviews;
import junit.framework.TestCase;

public class AttractionsManagerTest extends TestCase {

		private AttractionsManager attractionsManager;
		private Attractions attractions;
		private Reviews reviews;
		
		
		protected void setUp() throws Exception {
			super.setUp();
			
			
			attractionsManager = AttractionsManager.getInstance();
			reviews = new Reviews (65656564l, "Best hiking trail ever", "Sashana Binnie", "July-24-2022", "07:30AM", 5);
			attractions = new Attractions();
			attractions.setReviews(reviews);
		}

		
	
		public final void testPerformActionOnValidateReviews()
		{
			boolean action = attractionsManager.performAction("ValidateReviews", attractions);
			assertTrue(action);
		}
		


		 // Test to Validate Reviews
		public final void testValidateReviews() {
			boolean isValidated = attractionsManager.validateReviews(IReviewsService.NAME, attractions);			
			assertTrue(isValidated); 
	}
	
}
