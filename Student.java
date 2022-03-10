package myWebApp.CrudApplication.model;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ID;
import java.sql.Date;

@Entity
@Table(name ="Student")
public class Student {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY )
		private int id;
		private String name ;
		private Date dob;
		private Date doj;
		
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public Date getDob() {
			return dob;
		}
		public void setDob(Date dob) {
			this.dob = dob;
		}
		public Date getDoj() {
			return doj;
		}
		public void setDoj(Date doj) {
			this.doj = doj;
		}
		

		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", dob=" + dob + ", doj=" + doj + "]";
		}
		
}

