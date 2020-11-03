public class Song {
    private String title;
    private String artist;
    private String genre;
    private String year;
    private String filePath;

    public String getTitle() {
        return title;
    }
    public void setTitle(String value) {
        title = value;
    }
    public String getArtist() {
        return artist;
    }
    public void setArtist(String value) {
        artist = value;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String value){
        genre = value;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String value){
        year = value;
    }
    public String getFilePath(){
        return filePath;
    }
    public void setFilePath(String value){
        filePath = value;
    }
	public static void main(String[] args) {
	     
	    
	    Song s = new Song();
	    s.setArtist("Alesso");
	    s.setTitle("We Could Be Heroes feat. Tove Lo");
	    s.setYear("2017");
	    s.setGenre("Dance Music");
	    s.setFilePath("./Wav_Files/Alesso-Heroes-we-could-be-Tove-lo-164138555.wav");
	
	    s = new Song();
	    s.setArtist("Calvin Harris");
	    s.setTitle("Summer (Extended Edition)");
	    s.setYear("2016");
	    s.setGenre("Disco");
	    s.setFilePath("./Wav_Files/Calvin-Harris-Extended-143553285.wav");
	
	    s = new Song();
	    s.setArtist("Dimitri Vages, Martin Garrix, Like Mike Tremor");
	    s.setTitle("Beatport");
	    s.setYear("2015");
	    s.setGenre("Dance");
	    s.setFilePath("./Wav_Files/Dimitri-Vegas-Martin-Garrix-like-Mike-Tremor-OUT-NOW-BEATPORT-1-139678132.wav");
	
	    s = new Song();
	    s.setArtist("Flosstradamus");
	    s.setTitle("Prison Riot feat. Lil Jon");
	    s.setYear("2018");
	    s.setGenre("Rap Hip-Hop");
	    s.setFilePath("./Wav_Files/FLOSSTRADAMUS-GTA-LIL-JON-PRISON-RIOT-201105629.wav");
	
	    s.setArtist("Hardwell");
	    s.setTitle("Dare You (Radio Edit) feat. Matthew Kona");
	    s.setYear("2015");
	    s.setGenre("Dance");
	    s.setFilePath("./Wav_Files/Hardwell-feat-Matthew-Kona-Dare-You-Radio-Edit-128147532.wav");
	
	    s = new Song();
	    s.setArtist("Jungle Bae");
	    s.setTitle("MX Prime feat. Bunji Garlin");
	    s.setYear("2018");
	    s.setGenre("Dance Mix");
	    s.setFilePath("./Wav_Files/Jungle-Bae-feat-Bunji-Garlin-MX-Prime-193270667.wav");
	
	    s = new Song();
	    s.setArtist("Martin Garrix");
	    s.setTitle("The Only Way Is Up feat. Tiesto");
	    s.setYear("2016");
	    s.setGenre("EDM");
	    s.setFilePath("./Wav_Files/Martin-Garrix-Tiesto-The-Only-way-Is-Up-OUT-NOW-200843678.wav");
	
	    s = new Song();
	    s.setArtist("Skrillex feat. Alvn Risk");
	    s.setTitle("Try It Out (Neon Mix)");
	    s.setYear("2015");
	    s.setGenre("EDM");
	    s.setFilePath("./WavFiles/SKRILLEX-ALVIN-RISK-TRY-IT-OUT-NEON-MIX-115102159.wav");
	}
}







    

