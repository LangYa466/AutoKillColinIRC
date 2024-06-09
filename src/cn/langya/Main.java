package cn.langya;

import java.io.*;
import java.net.Socket;

/**
 * @author LangYa
 * @since 2024/6/9
 */

public class Main {
    public static void main(String[] args) {

        String hostName = "38.55.232.192";
        int portNumber = 81;

        try (Socket echoSocket = new Socket(hostName, portNumber);
             PrintWriter out = new PrintWriter(new OutputStreamWriter(echoSocket.getOutputStream(), "UTF-8"), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream(), "UTF-8")))
        {

            // 必须先初始化
            out.println(".serverusernames LangYaGod");

            while (true) {
                out.println("§c§b§l[Server] §r§f§lColin服务器已被狼牙神入侵? 狼牙 development CHAT");
                out.println("§c§b§l群友还敢开着录屏？？");
                // out.println("§c§b§l自定义消息");
                System.out.println("收到的消息: " + in.readLine());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
