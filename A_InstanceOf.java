class A_InstanceOf{
	int i,j;
}

class B_InstanceOf{
	int i,j;
}

class C_InstanceOf extends A_InstanceOf{
	int k;
}

class D_InstanceOf extends A_InstanceOf{
	int k;
}

class InstanceOf{
	public static void main(String args[]){
		A_InstanceOf a = new A_InstanceOf();
		B_InstanceOf b = new B_InstanceOf();
		C_InstanceOf c = new C_InstanceOf();
		D_InstanceOf d = new D_InstanceOf();
		
		if(a instanceof A_InstanceOf){
			System.out.println("a is instance of A");
		}
		
		if(b instanceof B_InstanceOf){
			System.out.println("b is instance of B");
		}
		
		if(c instanceof C_InstanceOf){
			System.out.println("c is instance of C");
		}
		
		if(c instanceof A_InstanceOf){
			System.out.println("c can be cast to A");
		}
		
		if(A instanceof C_InstanceOf){
			System.out.println("a can be cast to C");
		}
	}
}