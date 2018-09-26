class hospital
{
int getnoofpatients()
{
return 0;
}
}
class Apollo extends hospital {
int getnofpatients()
{
return 500;
}
}
class Baptist extends hospital {
int getnoofpatients ()
{
return 1000;
}
}
class Jain extends hospital {
int getnoofpatients ()
{
return 2000;
}
}
class hos {
public static void main (String args[])
{
Apollo s=new Apollo();
Baptist i=new Baptist();
Jain a= new Jain();
System.out.println("Apollo patient number"+s.getnoofpatients ());
System.out.println("Baptist patient number"+i.getnoofpatients());
System.out.println("Jain patient number"+a.getnoofpatients());
}
}

