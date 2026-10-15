package v3;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import k.C1748e;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: v3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC2031b implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15093a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2032c f15094b;

    public /* synthetic */ CallableC2031b(C2032c c2032c, int i4) {
        this.f15093a = i4;
        this.f15094b = c2032c;
    }

    private final Object a() {
        String byteArrayOutputStream;
        C2032c c2032c = this.f15094b;
        synchronized (c2032c) {
            try {
                C1748e c1748e = (C1748e) c2032c.f15095a.get();
                ArrayList n4 = c1748e.n();
                c1748e.m();
                JSONArray jSONArray = new JSONArray();
                for (int i4 = 0; i4 < n4.size(); i4++) {
                    C2030a c2030a = (C2030a) n4.get(i4);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", c2030a.f15091a);
                    jSONObject.put("dates", new JSONArray((Collection) c2030a.f15092b));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        base64OutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return byteArrayOutputStream;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f15093a) {
            case 0:
                return a();
            default:
                C2032c c2032c = this.f15094b;
                synchronized (c2032c) {
                    C1748e c1748e = (C1748e) c2032c.f15095a.get();
                    long currentTimeMillis = System.currentTimeMillis();
                    D3.c cVar = (D3.c) c2032c.c.get();
                    String str = cVar.f673a;
                    D3.d dVar = cVar.f674b;
                    if (!dVar.r().isEmpty()) {
                        str = str + ' ' + D3.c.a(dVar.r());
                    }
                    c1748e.s(str, currentTimeMillis);
                }
                return null;
        }
    }
}
