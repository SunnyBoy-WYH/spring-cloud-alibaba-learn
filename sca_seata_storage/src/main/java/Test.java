public class Test {
    public static void main(String[] args) {
        ThreadLocal<String> threadLocal = new ThreadLocal<>();
        threadLocal.set("Hello SunnyBoy");
        String resultGet = threadLocal.get();
        System.out.println(resultGet);
        threadLocal.remove();

        ThreadLocal threadLocal1 = new InheritableThreadLocal();
        threadLocal1.set("Hello SunnyBoy");
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+":"+threadLocal1.get());
            }
        }).start();
    }

}
