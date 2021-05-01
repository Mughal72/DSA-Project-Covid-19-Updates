package dsaproject;


import java.util.Hashtable;
import java.util.Iterator;

public class COVID {
      Hashtable<String, Record> hashTable;
       public COVID() {
       this.hashTable = new Hashtable<>(10);
  }
    public void addNewRecord(String date, long newCases, long recoveredCase, long deasedCase) {
    Record rec = new Record(date, newCases, recoveredCase, deasedCase);
       hashTable.put(date, rec);
}
   public void printTable() {
         System.out.println("Index"+" "+"Date"+" "+"New Cases"+" "+"Recovered"+" "+"Discesed");
          Iterator<String> itr = hashTable.keySet().iterator();
        int index = 0;
        while( itr.hasNext() ){
        String str = itr.next();
   System.out.println(index+" "+str+" "+hashTable.get(str).getNewCases()+" "+hashTable.get(str).getRecoveredCases()+" "
   		+ " "+hashTable.get(str).getDescesedCases());
       index++;
   }
   }
       public void printSpecificDatewise(String date) {
         if(null != hashTable.get(date)) {
           System.out.println("New Cases"+" "+"Recovered"+" "+"Discesed");
        System.out.println(" "+hashTable.get(date).getNewCases()+" "+hashTable.get(date).getRecoveredCases()+
        		" "+hashTable.get(date).getDescesedCases());
}
    else {
         System.out.println("No Records found for given date.");
}
}
        public void compareNewCasesVsRecoveredCases(String date) {
      Record rec = hashTable.get(date);
      if(rec.getNewCases() > rec.getRecoveredCases())
{
         System.out.println("New Cases("+rec.getNewCases()+")> Recovered Cases("+rec.getRecoveredCases()+")");
}
     else if(rec.getNewCases() < rec.getRecoveredCases())
{
         System.out.println("New Cases("+rec.getNewCases()+")< Recovered Cases("+rec.getRecoveredCases()+")");
}
   else
 {
      System.out.println("New Cases("+rec.getNewCases()+") is Equals to Recovered Cases("+rec.getRecoveredCases()+")");
}
   }
     }