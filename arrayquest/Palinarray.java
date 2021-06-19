package arrayquest;

public class Palinarray {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	int PalinArray(int a[], int n){
	    int dec = 0;
	    int length = n;
	for(int i=0;i<length;i++){
	int result= 0;
	int num = a[i];
	while (num/10!=0){
	    result = result*10 + (num%10);
	    num/=10;}
	    result = result*10 + num%10;
	    if (result==a[i])
	       dec=1;
	       else
	       {dec =0; 
	       return dec;} 
	       if (dec==0)break;
	       
	} return dec;}

}
