class  Person 
{
		private String name ;
		private int age ;
/*
		public Person () { }
		public Person (String n) {
			this.setName(n) ;
		}
*/
		public Person (String n , int a) {
			this.setName(n) ;
			this.setAge(a) ;
		}
		public void tell (){
		System.out.println("������ " + name+ " " + "���䣺" + age);
		}
		public void setAge(int a){
			if(a>0) age = a;
			else return ;
		}
		public void setName(String n){
			name = n;
		}
		public int getAge(){
			return age;
		}
		public String getName(){
			return name;
		}
}

public class TestDome
{
		public static void main(String args[]){
			Person per = new Person("����",-20);// new person("����,-20").tell ;
			per.setName ("����" );
			per.setAge (-20);
			per.tell();
			system.out.println ("hello world") ;
			return ;
		}
}
