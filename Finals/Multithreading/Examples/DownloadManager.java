package Examples;

class FileDownloader implements Runnable{
    private String fileName;
    private int fileSize;

    public FileDownloader(String filename, int fileSize) {
        this.fileName = filename;
        this.fileSize = fileSize;
    }

    public void run() {
        System.out.println("Starting: download: " + fileName);

        for (int i = 1; i <= fileSize; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
            int percentage = (i * 100) / fileSize;
            System.out.println(fileName + ": " + percentage + "% complete");
        }
        System.out.println(fileName + " download completed!\n");
    }
}

public class DownloadManager {
    public static void main(String[] args) {
        Thread d1 = new Thread(new FileDownloader("Document.pdf", 3));
        Thread d2 = new Thread(new FileDownloader("Video.mp4", 5));
        Thread d3 = new Thread(new FileDownloader("Music.mp3", 2));

        System.out.println("=== Download Manager Started ===\n");
        d1.start();
        d2.start();
        d3.start();
    }
}
