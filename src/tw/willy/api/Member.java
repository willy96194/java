package tw.willy.api;

import java.util.Objects;

public class Member {
	private int id;
	private String name;
	
	public  Member(int id, String name){
		this.id = id; this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) return false;
		Member other = (Member)obj;
		
		return this.id == other.id;
	}
	
	@Override
	public int hashCode() {
		System.out.println("hashcode()");
		return Objects.hash(id);
	}
	
	public String toString() {
		return String.format("%d:%s",id,name );
	}

}
