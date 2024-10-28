package java8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamToMap {

	 private int userId;
	    private String name;
	    private String city;
	    
	    
	    
	@Override
		public String toString() {
			return "StreamToMap [userId=" + userId + ", name=" + name + ", city=" + city + "]";
		}



	public StreamToMap(int userId, String name, String city) {
			super();
			this.userId = userId;
			this.name = name;
			this.city = city;
		}



	public int getUserId() {
			return userId;
		}



		public void setUserId(int userId) {
			this.userId = userId;
		}



		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}



		public String getCity() {
			return city;
		}



		public void setCity(String city) {
			this.city = city;
		}



	public static void main(String[] args) {

		String input = "Hi! hello world";
		Map<String, Integer> lengthMap = Arrays.stream(input.split(" "))
				.collect(Collectors.toMap(value->value, value->value.length()));
		System.out.println(lengthMap);
		
		
		StreamToMap stm = new StreamToMap(1, "user1", "pune");
		StreamToMap stm1 = new StreamToMap(2, "user2", "delhi");
		StreamToMap stm2 = new StreamToMap(3, "user3", "chennai");

		
		
		Map<String,Long> cityUserListMap = Arrays.asList(stm,stm1,stm2)
														.stream().collect(Collectors.groupingBy(StreamToMap::getName,Collectors.counting()));
		System.out.println(cityUserListMap);
	}

}
