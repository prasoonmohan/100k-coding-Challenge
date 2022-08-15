public class ObjectThree
{
    public static void main(String[] args)
    {
        ClassThree ob1=new ClassThree();
        ClassThree ob2=new ClassThree();

        ob1.number1=100;
        ob1.number2=200;
        ob2.number1=1008;
        ob2.number2=143453400;

        ob1.Sum();
        ob2.Sum();
        ob1.Output();
        ob2.Output();
    }
}