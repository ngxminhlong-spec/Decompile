package x3;

import A2.i;
import A2.r;
import android.content.SharedPreferences;
import android.net.TrafficStats;
import android.util.Log;
import com.google.android.gms.internal.ads.C0470c9;
import com.google.android.gms.internal.ads.C0831kn;
import com.google.android.gms.internal.ads.Z8;
import h2.y;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import m.ThreadFactoryC1802b;
import o2.AbstractC1895f;
import org.json.JSONException;
import org.json.JSONObject;
import v3.C2033d;
import w3.InterfaceC2053a;
import y3.C2120a;
import y3.C2121b;
import z3.C2134a;
import z3.C2135b;
import z3.C2136c;
import z3.C2137d;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: x3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2113b implements InterfaceC2114c {

    /* renamed from: m, reason: collision with root package name */
    public static final Object f15867m = new Object();

    /* renamed from: n, reason: collision with root package name */
    public static final ThreadFactoryC1802b f15868n = new ThreadFactoryC1802b(1);

    /* renamed from: a, reason: collision with root package name */
    public final d3.g f15869a;

    /* renamed from: b, reason: collision with root package name */
    public final C2136c f15870b;
    public final C2121b c;
    public final g d;

    /* renamed from: e, reason: collision with root package name */
    public final C2121b f15871e;

    /* renamed from: f, reason: collision with root package name */
    public final f f15872f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f15873g;

    /* renamed from: h, reason: collision with root package name */
    public final ThreadPoolExecutor f15874h;

    /* renamed from: i, reason: collision with root package name */
    public final ThreadPoolExecutor f15875i;

    /* renamed from: j, reason: collision with root package name */
    public String f15876j;

    /* renamed from: k, reason: collision with root package name */
    public final HashSet f15877k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f15878l;

    /* JADX WARN: Type inference failed for: r4v1, types: [x3.f, java.lang.Object] */
    public C2113b(d3.g gVar, InterfaceC2053a interfaceC2053a) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        ThreadFactoryC1802b threadFactoryC1802b = f15868n;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, timeUnit, linkedBlockingQueue, threadFactoryC1802b);
        gVar.a();
        C2136c c2136c = new C2136c(gVar.f12617a, interfaceC2053a);
        C2121b c2121b = new C2121b(gVar, 1);
        if (C2033d.f15098p == null) {
            C2033d.f15098p = new C2033d(1);
        }
        C2033d c2033d = C2033d.f15098p;
        if (g.d == null) {
            g.d = new g(c2033d);
        }
        g gVar2 = g.d;
        C2121b c2121b2 = new C2121b(gVar, 0);
        ?? obj = new Object();
        this.f15873g = new Object();
        this.f15877k = new HashSet();
        this.f15878l = new ArrayList();
        this.f15869a = gVar;
        this.f15870b = c2136c;
        this.c = c2121b;
        this.d = gVar2;
        this.f15871e = c2121b2;
        this.f15872f = obj;
        this.f15874h = threadPoolExecutor;
        this.f15875i = new ThreadPoolExecutor(0, 1, 30L, timeUnit, new LinkedBlockingQueue(), threadFactoryC1802b);
    }

    public static C2113b d() {
        d3.g b4 = d3.g.b();
        b4.a();
        return (C2113b) b4.d.a(InterfaceC2114c.class);
    }

    public final r a() {
        i iVar = new i();
        e eVar = new e(iVar);
        synchronized (this.f15873g) {
            this.f15878l.add(eVar);
        }
        return iVar.f26a;
    }

    public final C2120a b(C2120a c2120a) {
        int responseCode;
        C2135b f4;
        d3.g gVar = this.f15869a;
        gVar.a();
        String str = gVar.c.f12629a;
        String str2 = c2120a.f15913a;
        gVar.a();
        String str3 = gVar.c.f12633g;
        String str4 = c2120a.d;
        C2136c c2136c = this.f15870b;
        C2137d c2137d = c2136c.c;
        if (!c2137d.b()) {
            throw new C0470c9("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL a4 = C2136c.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        for (int i4 = 0; i4 <= 1; i4++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection c = c2136c.c(a4, str);
            try {
                try {
                    c.setRequestMethod("POST");
                    c.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    c.setDoOutput(true);
                    C2136c.h(c);
                    responseCode = c.getResponseCode();
                    c2137d.d(responseCode);
                } finally {
                    c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused) {
            }
            if (responseCode >= 200 && responseCode < 300) {
                f4 = C2136c.f(c);
            } else {
                C2136c.b(c, null, str, str3);
                if (responseCode == 401 || responseCode == 404) {
                    androidx.activity.result.c a5 = C2135b.a();
                    a5.f2431a = 3;
                    f4 = a5.a();
                } else {
                    if (responseCode == 429) {
                        throw new C0470c9("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        androidx.activity.result.c a6 = C2135b.a();
                        a6.f2431a = 2;
                        f4 = a6.a();
                    }
                }
            }
            int b4 = Z.e.b(f4.c);
            if (b4 != 0) {
                if (b4 == 1) {
                    Z8 a7 = c2120a.a();
                    a7.f7968g = "BAD CONFIG";
                    a7.f7965b = 5;
                    return a7.a();
                }
                if (b4 != 2) {
                    throw new C0470c9("Firebase Installations Service is unavailable. Please try again later.");
                }
                j(null);
                Z8 a8 = c2120a.a();
                a8.f7965b = 2;
                return a8.a();
            }
            String str5 = f4.f15981a;
            long j4 = f4.f15982b;
            g gVar2 = this.d;
            gVar2.getClass();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            gVar2.f15883a.getClass();
            long seconds = timeUnit.toSeconds(System.currentTimeMillis());
            Z8 a9 = c2120a.a();
            a9.c = str5;
            a9.f7966e = Long.valueOf(j4);
            a9.f7967f = Long.valueOf(seconds);
            return a9.a();
        }
        throw new C0470c9("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final r c() {
        String str;
        d3.g gVar = this.f15869a;
        gVar.a();
        y.f(gVar.c.f12630b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        d3.g gVar2 = this.f15869a;
        gVar2.a();
        y.f(gVar2.c.f12633g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        d3.g gVar3 = this.f15869a;
        gVar3.a();
        y.f(gVar3.c.f12629a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        d3.g gVar4 = this.f15869a;
        gVar4.a();
        String str2 = gVar4.c.f12630b;
        Pattern pattern = g.c;
        y.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str2.contains(":"));
        d3.g gVar5 = this.f15869a;
        gVar5.a();
        y.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", g.c.matcher(gVar5.c.f12629a).matches());
        synchronized (this) {
            str = this.f15876j;
        }
        if (str != null) {
            return AbstractC1895f.l(str);
        }
        r a4 = a();
        this.f15874h.execute(new RunnableC2112a(this, 0));
        return a4;
    }

    /* JADX WARN: Finally extract failed */
    public final void e(C2120a c2120a) {
        synchronized (f15867m) {
            try {
                d3.g gVar = this.f15869a;
                gVar.a();
                C0831kn l4 = C0831kn.l(gVar.f12617a);
                try {
                    this.c.b(c2120a);
                    if (l4 != null) {
                        l4.v();
                    }
                } catch (Throwable th) {
                    if (l4 != null) {
                        l4.v();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if ("[DEFAULT]".equals(r0.f12618b) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String f(y3.C2120a r3) {
        /*
            r2 = this;
            d3.g r0 = r2.f15869a
            r0.a()
            java.lang.String r0 = r0.f12618b
            java.lang.String r1 = "CHIME_ANDROID_SDK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            d3.g r0 = r2.f15869a
            java.lang.String r1 = "[DEFAULT]"
            r0.a()
            java.lang.String r0 = r0.f12618b
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L4c
        L1e:
            int r3 = r3.f15914b
            r0 = 1
            if (r3 != r0) goto L4c
            y3.b r3 = r2.f15871e
            java.lang.Object r0 = r3.f15918a
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            monitor-enter(r0)
            java.lang.String r1 = r3.c()     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L34
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            goto L39
        L32:
            r3 = move-exception
            goto L4a
        L34:
            java.lang.String r1 = r3.e()     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
        L39:
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 == 0) goto L49
            x3.f r3 = r2.f15872f
            r3.getClass()
            java.lang.String r3 = x3.f.a()
            return r3
        L49:
            return r1
        L4a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r3
        L4c:
            x3.f r3 = r2.f15872f
            r3.getClass()
            java.lang.String r3 = x3.f.a()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.C2113b.f(y3.a):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [z3.c] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [z3.a] */
    public final C2120a g(C2120a c2120a) {
        int responseCode;
        String str = c2120a.f15913a;
        String str2 = null;
        if (str != null && str.length() == 11) {
            C2121b c2121b = this.f15871e;
            synchronized (((SharedPreferences) c2121b.f15918a)) {
                try {
                    String[] strArr = C2121b.c;
                    int i4 = 0;
                    while (true) {
                        if (i4 < 4) {
                            String str3 = strArr[i4];
                            String string = ((SharedPreferences) c2121b.f15918a).getString("|T|" + ((String) c2121b.f15919b) + "|" + str3, null);
                            if (string == null || string.isEmpty()) {
                                i4++;
                            } else if (string.startsWith("{")) {
                                try {
                                    str2 = new JSONObject(string).getString("token");
                                } catch (JSONException unused) {
                                }
                            } else {
                                str2 = string;
                            }
                        }
                    }
                } finally {
                }
            }
        }
        C2136c c2136c = this.f15870b;
        d3.g gVar = this.f15869a;
        gVar.a();
        String str4 = gVar.c.f12629a;
        String str5 = c2120a.f15913a;
        d3.g gVar2 = this.f15869a;
        gVar2.a();
        String str6 = gVar2.c.f12633g;
        d3.g gVar3 = this.f15869a;
        gVar3.a();
        String str7 = gVar3.c.f12630b;
        C2137d c2137d = c2136c.c;
        if (!c2137d.b()) {
            throw new C0470c9("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL a4 = C2136c.a("projects/" + str6 + "/installations");
        int i5 = 0;
        C2134a c2134a = c2136c;
        while (i5 <= 1) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection c = c2134a.c(a4, str4);
            try {
                try {
                    c.setRequestMethod("POST");
                    c.setDoOutput(true);
                    if (str2 != null) {
                        c.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                    }
                    C2136c.g(c, str5, str7);
                    responseCode = c.getResponseCode();
                    c2137d.d(responseCode);
                } catch (IOException | AssertionError unused2) {
                }
                if (!(responseCode >= 200 && responseCode < 300)) {
                    try {
                        C2136c.b(c, str7, str4, str6);
                    } catch (IOException | AssertionError unused3) {
                        c.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i5++;
                        c2134a = c2134a;
                    }
                    if (responseCode == 429) {
                        throw new C0470c9("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        break;
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        C2134a c2134a2 = new C2134a(null, null, null, null, 2);
                        c.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        c2134a = c2134a2;
                    } else {
                        c.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i5++;
                        c2134a = c2134a;
                    }
                } else {
                    C2134a e4 = C2136c.e(c);
                    c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    c2134a = e4;
                }
                int b4 = Z.e.b(c2134a.f15980e);
                if (b4 != 0) {
                    if (b4 != 1) {
                        throw new C0470c9("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    Z8 a5 = c2120a.a();
                    a5.f7968g = "BAD CONFIG";
                    a5.f7965b = 5;
                    return a5.a();
                }
                String str8 = c2134a.f15979b;
                String str9 = c2134a.c;
                g gVar4 = this.d;
                gVar4.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                gVar4.f15883a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                C2135b c2135b = c2134a.d;
                String str10 = c2135b.f15981a;
                long j4 = c2135b.f15982b;
                Z8 a6 = c2120a.a();
                a6.f7964a = str8;
                a6.f7965b = 4;
                a6.c = str10;
                a6.d = str9;
                a6.f7966e = Long.valueOf(j4);
                a6.f7967f = Long.valueOf(seconds);
                return a6.a();
            } finally {
                c.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        throw new C0470c9("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void h() {
        synchronized (this.f15873g) {
            try {
                ArrayList arrayList = this.f15878l;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    ((e) obj).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(C2120a c2120a) {
        synchronized (this.f15873g) {
            try {
                Iterator it = this.f15878l.iterator();
                while (it.hasNext()) {
                    e eVar = (e) it.next();
                    eVar.getClass();
                    int i4 = c2120a.f15914b;
                    if (!(i4 == 3)) {
                        if (!(i4 == 4)) {
                            if (i4 == 5) {
                            }
                        }
                    }
                    eVar.f15879a.f26a.n(c2120a.f15913a);
                    it.remove();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void j(String str) {
        this.f15876j = str;
    }

    public final synchronized void k(C2120a c2120a, C2120a c2120a2) {
        try {
            if (this.f15877k.size() != 0 && !c2120a.f15913a.equals(c2120a2.f15913a)) {
                Iterator it = this.f15877k.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
        } finally {
        }
    }
}
