
public class GenericClassPrintMessage<T> {

	T i;
	
	GenericClassPrintMessage(T constructorValue){
		this.i = constructorValue;
	}
	
	public void msg() {
		System.out.println(this.i);
	}
}