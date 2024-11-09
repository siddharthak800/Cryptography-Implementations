import java.util.*;
import java.math.*;
class RSAB
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter prime no p ");
BigInteger p=sc.nextBigInteger();
 System.out.println("Enter prime no q ");
BigInteger q=sc.nextBigInteger();
BigInteger n=p.multiply(q);;
BigInteger pn=p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));

BigInteger a,b;
System.out.println("e values...");
for(int i=1;i<pn.intValue();i++)
{
 a=BigInteger.valueOf(i);
 b=pn;

 if(a.gcd(b).intValue()==1)
 System.out.print(" "+a);
}
System.out.println("\n select any e value from above list:");
BigInteger e=sc.nextBigInteger();

BigInteger d=e.modInverse(pn);
System.out.println("Public Key PU{e,n}:"+"{"+e+","+n+"}");
System.out.println("Private Key PR{d,n}:"+"{"+d+","+n+"}");
System.out.println("Enter Plain text M <"+n);
BigInteger M=sc.nextBigInteger();

BigInteger C=M.modPow(e,n);
System.out.println("Your Plain Text M is:"+M);
 System.out.println("Your Cipher Text C is:"+C);

 BigInteger M1=C.modPow(d,n);

System.out.println("Your Decryptrd Plain Text M is:"+M1);
 System.out.println("Prime number p="+p);
 System.out.println("Prime number q="+q);
 System.out.println("product of p,q is n="+n);
 System.out.println("product of p-1,q-1 is pn="+pn);
 System.out.println("value of e="+e);
 System.out.println("value of d="+d);
 System.out.println("Public Key PU{e,n}:"+"{"+e+","+n+"}");
 System.out.println("Private Key PR{d,n}:"+"{"+d+","+n+"}");
 System.out.println("Your Plain Text M is:"+M);
 System.out.println("Your Cipher Text C is:"+C);
 System.out.println("Your Decryptrd Plain Text M is:"+M1);
}
}