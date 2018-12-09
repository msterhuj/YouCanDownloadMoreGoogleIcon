package io.MsterHuj.YouCanDownloadMoreGoogleIcon;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class Main {
    public static void main(String[] args) throws IOException {
        for (int i = 0; i >= 0; i++) {
            URL website = new URL("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png");
            ReadableByteChannel rbc = Channels.newChannel(website.openStream());
            FileOutputStream fos = new FileOutputStream("google_"+i+".png");
            System.out.println("[YCDMGI] Write => google_"+i+".png");
            fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
        }
    }
}
