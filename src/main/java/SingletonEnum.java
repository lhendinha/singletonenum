public class SingletonEnum {
    public static final SingletonEnum EnumInstance = new SingletonEnum();

    private SingletonEnum() {
    }

    public static SingletonEnum GetEnumInstance() {
        return EnumInstance;
    }
}
