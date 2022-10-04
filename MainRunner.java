package Project0;

public class MainRunner {
			public static void main(String[] args) {
				
				
				Accountant accountant=new Accountant("Anisha", 2000, "TaxFile");
				accountant.worksOnTaxFile();
				
				Project faceBook=new Project("FaceBook Advertisents", 15);
				Developer developer=new Developer(faceBook, "Meta", "Rakesh",1500);
				developer.worksOnProject();
				
			}
			}



