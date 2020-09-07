package com.huang.util;

import java.io.*;

public class FileUtil {
    public static String readFile(String file) throws IOException {
        InputStream in = new BufferedInputStream(new FileInputStream(file));
        StringBuffer sb = new StringBuffer();
        byte[] tempbytes = new byte[1024];
        int byteread = 0;
        while ((byteread = in.read(tempbytes)) != -1) {
            String str = new String(tempbytes, 0, byteread);
            sb.append(str);
        }
        return sb.toString();
    }
}
