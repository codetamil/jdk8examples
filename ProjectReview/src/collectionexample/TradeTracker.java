package collectionexample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class TradeTracker {
	
	public static void main(String args[]) {
		
		
		Trade tt= new Trade();
		
		Trade oo= new Trade();
		
		Trade pp= new Trade();
		
		tt.setStatus("NEW");
		
		oo.setStatus("Old");
		
		pp.setStatus("Very Old");
		
		tt.setQuantity(100);
		
		oo.setQuantity(200);
		
		pp.setQuantity(105);
		
		
		ITrade newTradeTracker=(t)->t.getStatus().equals("NEW");
		
		
		List<Trade> tradeList= new ArrayList<Trade>();
		
		tradeList.add(tt);
		tradeList.add(oo);
		tradeList.add(pp);
		
		
		System.out.println(newTradeTracker.check(tt));
		System.out.println(newTradeTracker.check(oo));
		
		Predicate<String> emptyStrinChecker = s-> s.isEmpty();
		
		System.out.println(emptyStrinChecker.test(""));
		
		
		Function<Integer,Double> ctf=x -> new Double((x*9/5)+32);
		
		
		Function<String,Integer> stringtoInt=x ->Integer.valueOf(x);
		
		
		//tests
		System.out.println(ctf.apply(12));
		
		System.out.println(stringtoInt.apply("23"));
		
		
		System.out.println(getAggregateQuantity());
		
		
		
	}
	
		
	static Integer getAggregateQuantity()
	{
		 
		Function<List<Trade>,Integer> aggregatedQuantity= t -> {
			
			int aggregateQuantity=0;
			
			for(Trade tt: t)
			{
				
				aggregateQuantity+=tt.getQuantity();
				
			}
			return aggregateQuantity;
			
		};	
		
		return 0;
	}
	

}
