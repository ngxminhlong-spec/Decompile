package i1;

import C0.l0;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.util.Xml;
import com.duracodefactory.logiccircuitsimulatorpro.MainActivity;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import d3.AbstractC1654b;
import f.AbstractActivityC1671f;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import l1.f;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static AsyncTaskC1716b f13257a;

    /* renamed from: b, reason: collision with root package name */
    public static AsyncTaskC1716b f13258b;
    public static final ArrayList c = new ArrayList();

    public static void a(Context context, d dVar) {
        new File(g(context) + "/" + dVar.f13259a).delete();
        ArrayList arrayList = c;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((l0) obj).c(2, dVar);
        }
        int i5 = dVar.f13267k;
        if (i5 != 0) {
            f.f13951e.f13956b.remove(Integer.valueOf(i5));
        }
    }

    public static d b(File file, String str) {
        FileReader fileReader = new FileReader(file);
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setInput(fileReader);
        d d = d(newPullParser);
        fileReader.close();
        d.f13259a = str;
        return d;
    }

    public static d c(InputStream inputStream, String str) {
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setInput(inputStream, null);
        d d = d(newPullParser);
        inputStream.close();
        d.f13259a = str;
        return d;
    }

    public static d d(XmlPullParser xmlPullParser) {
        d dVar = new d();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("project_info")) {
                    dVar.f13260b = xmlPullParser.getAttributeValue(null, "name");
                    dVar.c = Integer.parseInt(xmlPullParser.getAttributeValue(null, "version"));
                    dVar.d = Integer.parseInt(xmlPullParser.getAttributeValue(null, "elements_count"));
                    dVar.f13261e = Integer.parseInt(xmlPullParser.getAttributeValue(null, "connections_count"));
                    dVar.f13262f = new Date(Long.parseLong(xmlPullParser.getAttributeValue(null, "modified")));
                    dVar.f13265i = Float.parseFloat(xmlPullParser.getAttributeValue(null, "scrollX"));
                    dVar.f13266j = Float.parseFloat(xmlPullParser.getAttributeValue(null, "scrollY"));
                    dVar.f13264h = Float.parseFloat(xmlPullParser.getAttributeValue(null, "zoom"));
                    String attributeValue = xmlPullParser.getAttributeValue(null, "share_id");
                    if (attributeValue != null) {
                        dVar.f13267k = Integer.parseInt(attributeValue);
                    }
                } else if (xmlPullParser.getName().equals("circuit")) {
                    xmlPullParser.next();
                    W0.a q4 = AbstractC1654b.q(xmlPullParser);
                    if (!(q4 instanceof P0.a)) {
                        throw new RuntimeException("Error loading project");
                    }
                    dVar.f13263g = (P0.a) q4;
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (dVar.f13260b == null || dVar.f13263g == null) {
            throw new RuntimeException("Error loading project");
        }
        return dVar;
    }

    public static d e(Context context, String str) {
        String g4 = g(context);
        File file = new File(n0.a.i(g4, "/.", str));
        File file2 = new File(n0.a.i(g4, "/", str));
        if (file.exists()) {
            try {
                b(file, "");
                if (!file2.exists() || file2.delete()) {
                    file.renameTo(file2);
                }
            } catch (Throwable unused) {
                file.delete();
            }
        }
        return b(file2, str);
    }

    public static String f(AbstractActivityC1671f abstractActivityC1671f) {
        SharedPreferences preferences = abstractActivityC1671f.getPreferences(0);
        long j4 = preferences.getLong("next_project_num", 0L);
        SharedPreferences.Editor edit = preferences.edit();
        edit.putLong("next_project_num", 1 + j4);
        edit.apply();
        return abstractActivityC1671f.getString(R.string.project) + " " + j4;
    }

    public static String g(Context context) {
        return context.getFilesDir() + "/projects";
    }

    public static void h(MainActivity mainActivity) {
        d c2 = c(mainActivity.getResources().openRawResource(R.raw.button_demo), mainActivity.getString(R.string.button_demo_project_title));
        c2.f13260b = mainActivity.getString(R.string.button_demo_project_title);
        new AsyncTaskC1716b(null, c2, new File(g(mainActivity)), null).a();
        d c4 = c(mainActivity.getResources().openRawResource(R.raw.led_matrix_demo), mainActivity.getString(R.string.led_matrix_demo_project_title));
        c4.f13260b = mainActivity.getString(R.string.led_matrix_demo_project_title);
        new AsyncTaskC1716b(null, c4, new File(g(mainActivity)), null).a();
        d c5 = c(mainActivity.getResources().openRawResource(R.raw.rgb_demo), mainActivity.getString(R.string.rgb_demo_project_title));
        c5.f13260b = mainActivity.getString(R.string.rgb_demo_project_title);
        new AsyncTaskC1716b(null, c5, new File(g(mainActivity)), null).a();
        d c6 = c(mainActivity.getResources().openRawResource(R.raw.counter_demo), mainActivity.getString(R.string.zero_f_counter_demo_project_title));
        c6.f13260b = mainActivity.getString(R.string.zero_f_counter_demo_project_title);
        new AsyncTaskC1716b(null, c6, new File(g(mainActivity)), null).a();
        d c7 = c(mainActivity.getResources().openRawResource(R.raw.explore_devices), mainActivity.getString(R.string.explore_devices_demo));
        c7.f13260b = mainActivity.getString(R.string.explore_devices_demo);
        new AsyncTaskC1716b(null, c7, new File(g(mainActivity)), null).a();
    }

    public static boolean i(Context context, String str) {
        return Objects.equals(context.getString(R.string.button_demo_project_title), str) || Objects.equals(context.getString(R.string.led_matrix_demo_project_title), str) || Objects.equals(context.getString(R.string.rgb_demo_project_title), str) || Objects.equals(context.getString(R.string.zero_f_counter_demo_project_title), str) || Objects.equals(context.getString(R.string.explore_devices_demo), str);
    }

    public static void j(InterfaceC1715a interfaceC1715a, d dVar, File file, FileDescriptor fileDescriptor) {
        AsyncTaskC1716b asyncTaskC1716b = new AsyncTaskC1716b(interfaceC1715a, dVar, file, fileDescriptor);
        if (f13257a != null) {
            f13258b = asyncTaskC1716b;
        } else {
            f13257a = asyncTaskC1716b;
            asyncTaskC1716b.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }
    }
}
