package com.company.design.facade;

public class Main {
    public static void main(String[] args) {
        SftpClient sftpClient =new SftpClient("www.google.com", 22, "/home/content", "content.tmp");
        sftpClient.connect();
        sftpClient.write();
        sftpClient.read();
        sftpClient.disconnect();
    }
}
