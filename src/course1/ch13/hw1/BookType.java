package course1.ch13.hw1;

public enum BookType {
	FICTION("Kurgu") , NON_FICTION("Kurgusal olmayan") , SCIENTIFIC("Bilim Kurgu") , CLASSICS("Klasik") , FANTASY("Fantastik");

	private  String description;
	
	

	private BookType( String description){
		
		this.description= description;
		
	}
	
	

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
	 
	 
}
