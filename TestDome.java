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
		System.out.println("姓名： " + name+ " " + "年龄：" + age);
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
			Person per = new Person("张三",-20);// new person("张三,-20").tell ;
			per.setName ("张三" );
			per.setAge (-20);
			per.tell();
			system.out.println ("hello world") ;
			return ;
		}
}
