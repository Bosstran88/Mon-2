package lambda;
//functional interface: la cac interface co duy nhat mot method truu tuong
//De su dung no ta them annotation @functionalInterface
@FunctionalInterface
public interface AddNumber {
    public int sum(int numb1,int num2);
}
