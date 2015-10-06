
public class admission {
	int date;
	int medicareNumber;
	int eid;
	String reason;
	int dateAdm;
	int dateRel;
	
	public admission(int d,int mn, int id, String r,int da, int dr){
		this.date = d;
		this.medicareNumber = mn;
		this.eid = id;
		this.reason = r;
		this.dateAdm = da;
		this.dateRel = dr;
	}
}
