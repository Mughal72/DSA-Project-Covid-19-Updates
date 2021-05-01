package dsaproject;

public class Record {
  String date;
   long newCases;
  long recoveredCases;
    long descesedCases;
  public Record(String date, long newCases, long recoveredCases, long descesedCases) {
     super();
      
     this.date = date;

      this.newCases = newCases;
    
      this.recoveredCases = recoveredCases;

      this.descesedCases = descesedCases;
}
  
  public long getNewCases() {
     return newCases;
}
  
      public void setNewCases(long newCases) {
    	  
      this.newCases = newCases;
}
  public long getRecoveredCases() {
    return recoveredCases;
}
   public void setRecoveredCases(long recoveredCases) {
   this.recoveredCases = recoveredCases;
}
   public long getDescesedCases() {
     return descesedCases;
}
  public void setDescesedCases(long descesedCases) {
   this.descesedCases = descesedCases;
}
    public String getDate() {
    return date;
}
public void setDate(String date) {
 this.date = date;
}
}