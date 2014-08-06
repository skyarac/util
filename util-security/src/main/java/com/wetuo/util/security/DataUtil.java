package com.wetuo.util.security;
 
import java.security.MessageDigest;
 
/**
 * 数据加密工具类
 * @author wzp
 *
 */
public class DataUtil {
    public static String md5(String str) {
        StringBuffer buffer = new StringBuffer();
        char[] chars = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A',
                'B', 'C', 'D', 'E', 'F' };
        byte[] input = str.getBytes();
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] bytes = md.digest(input);
            for (byte b : bytes) {
                // 高四位后移 按位与 0000 1111
                buffer.append(chars[(b >> 4) & 0x0F]); 
                // 低四位直接 按位与 0000 1111
                buffer.append(chars[b & 0x0f]); 
            }
            return buffer.toString();
        } catch (Exception e) {
            // TODO: handle exception
        }
        return null;
    }
 
 
}