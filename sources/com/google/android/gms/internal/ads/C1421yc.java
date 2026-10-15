package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.yc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1421yc {
    public static boolean c;
    public static boolean d;

    /* renamed from: a, reason: collision with root package name */
    public final List f11359a;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f11357b = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final HashSet f11358e = new HashSet(Arrays.asList(new String[0]));

    public C1421yc() {
        this.f11359a = !c() ? new ArrayList() : Arrays.asList("network_request_".concat(String.valueOf(UUID.randomUUID().toString())));
    }

    public static boolean c() {
        boolean z4;
        synchronized (f11357b) {
            try {
                z4 = false;
                if (c && d) {
                    z4 = true;
                }
            } finally {
            }
        }
        return z4;
    }

    public static void e(JsonWriter jsonWriter, Map map) {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            if (!f11358e.contains(str)) {
                if (!(entry.getValue() instanceof List)) {
                    if (!(entry.getValue() instanceof String)) {
                        Y9.p("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                        break;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("name").value(str);
                    jsonWriter.name("value").value((String) entry.getValue());
                    jsonWriter.endObject();
                } else {
                    for (String str2 : (List) entry.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(str);
                        jsonWriter.name("value").value(str2);
                        jsonWriter.endObject();
                    }
                }
            }
        }
        jsonWriter.endArray();
    }

    public final void a(HttpURLConnection httpURLConnection, byte[] bArr) {
        if (c()) {
            d("onNetworkRequest", new u0.g(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr, 6));
        }
    }

    public final void b(HttpURLConnection httpURLConnection, int i4) {
        if (c()) {
            String str = null;
            d("onNetworkResponse", new B0.r(i4, (Map) (httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()))));
            if (i4 < 200 || i4 >= 300) {
                try {
                    str = httpURLConnection.getResponseMessage();
                } catch (IOException e4) {
                    Y9.s("Can not get error message from error HttpURLConnection\n".concat(String.valueOf(e4.getMessage())));
                }
                d("onNetworkRequestError", new Iv(str, 7));
            }
        }
    }

    public final void d(String str, InterfaceC1378xc interfaceC1378xc) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(System.currentTimeMillis());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            Iterator it = this.f11359a.iterator();
            while (it.hasNext()) {
                jsonWriter.value((String) it.next());
            }
            jsonWriter.endArray();
            interfaceC1378xc.d(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e4) {
            Y9.q("unable to log", e4);
        }
        String stringWriter2 = stringWriter.toString();
        synchronized (C1421yc.class) {
            try {
                Y9.r("GMA Debug BEGIN");
                int i4 = 0;
                while (i4 < stringWriter2.length()) {
                    int i5 = i4 + 4000;
                    Y9.r("GMA Debug CONTENT ".concat(String.valueOf(stringWriter2.substring(i4, Math.min(i5, stringWriter2.length())))));
                    i4 = i5;
                }
                Y9.r("GMA Debug FINISH");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
