package m.i.n;

import android.content.Context;
import android.widget.TextView;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* loaded from: classes2.dex */
public class i {
    static {
        System.loadLibrary("a");
    }

    public static native void onCreate(Context context);

    public static void unzipFile(Context context, String assetName, File targetDirectory) throws IOException {
        InputStream open = context.getAssets().open(assetName);
        ZipInputStream zipInputStream = new ZipInputStream(open);
        byte[] bArr = new byte[32768];
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry == null) {
                zipInputStream.close();
                open.close();
                return;
            }
            File file = new File(targetDirectory, nextEntry.getName());
            if (nextEntry.isDirectory()) {
                file.mkdirs();
            } else {
                File parentFile = file.getParentFile();
                if (!parentFile.exists()) {
                    parentFile.mkdirs();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                while (true) {
                    int read = zipInputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    } else {
                        fileOutputStream.write(bArr, 0, read);
                    }
                }
                fileOutputStream.close();
            }
            zipInputStream.closeEntry();
        }
    }

    public static native void updateIgnore(Context context);

    public static native void updateOpen(Context context, String str);

    public native String getIcon();

    public native void getInit(Context context, TextView textView, TextView textView2);
}
