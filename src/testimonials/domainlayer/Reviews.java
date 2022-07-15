package testimonials.domainlayer;

import java.util.Objects;
import java.time.LocalTime;
import java.time.LocalDate;

 
public class Reviews {
		
		private Long reviewID;
		private String reviewDescription;
		private String reviewer;
		private LocalDate reviewDate;
		private LocalTime reviewTime;
		private int reviewStars;
		
		
		
public Reviews(Long reviewID, String reviewDescription, String reviewer, 
				LocalDate reviewDate, LocalTime reviewTime, int reviewStars) {
			
			this.reviewID = reviewID;
			this.reviewDescription = reviewDescription;
			this.reviewer = reviewer;
			this.reviewDate = reviewDate;
			this.reviewTime = reviewTime;
			this.reviewStars = reviewStars;
			
		}

//Getters and Setters
			
				
		public Long getReviewID() {
			return reviewID;
		}
		
		public void setReviewID(Long reviewID) {
			this.reviewID = reviewID;
		}
		
		public String getReviewDescription() {
			return reviewDescription;
		}
		
		public void setReviewDescription(String reviewDescription) {
			this.reviewDescription = reviewDescription;
		}
		
		public String getReviewer() {
			return reviewer;
		}
		
		public void setReviewer(String reviewer) {
			this.reviewer = reviewer;
		}
		
		public LocalDate getReviewDate() {
			return reviewDate;
		}
		
		public void setReviewDate(LocalDate reviewDate) {
			this.reviewDate = reviewDate;
		}
		
		public LocalTime getReviewTime() {
			return reviewTime;
		}
		
		public void setReviewTime(LocalTime reviewTime) {
			this.reviewTime = reviewTime;
		}
		
		public int getReviewStars() {
			return reviewStars;
		
		}
		
		public void setReviewStars(int reviewStars) {
			this.reviewStars = reviewStars;
		}


//Validation

		public boolean validation() {
			
		
		if (this.reviewID <= 0) {
			return false;
			
		} if (this.reviewDescription == null || this.reviewDescription.isEmpty() || this.reviewDescription.isBlank()) {
			return false;
			
		} if (this.reviewer == null) {
			return false;
		}
		  if (this.reviewDate == null) {
			return false;
		}
		  if (this.reviewTime == null) {
				return false;
		}
		  if (this.reviewStars <= 0 ) {
				return false;
		}
		return false;
		  
		}
		
		
		
//Generate Hashcode
		
		@Override
		public int hashCode() {
			return Objects.hash(reviewDate, reviewDescription, reviewID, reviewStars, reviewTime, reviewer);
		}

		
//Equals Method
		
@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Reviews other = (Reviews) obj;
			return Objects.equals(reviewDate, other.reviewDate)
					&& Objects.equals(reviewDescription, other.reviewDescription)
					&& Objects.equals(reviewID, other.reviewID) && reviewStars == other.reviewStars
					&& Objects.equals(reviewTime, other.reviewTime) && Objects.equals(reviewer, other.reviewer);
		}
		
		

@Override
public String toString() {
	return "Reviews [reviewID=" + reviewID + ", reviewDescription=" + reviewDescription + ", reviewer=" + reviewer
			+ ", reviewDate=" + reviewDate + ", reviewTime=" + reviewTime + ", reviewStars=" + reviewStars + "]";
}

}

// Reviews myReviews = new Reviews("bs12", "This attraction is 5 stars");
